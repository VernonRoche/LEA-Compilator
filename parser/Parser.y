%language "Java"

%define api.package {fr.ubordeaux.deptinfo.compilation.lea.parser}
%define api.parser.public
%define api.parser.class {Parser}
%define throws {EnvironmentException, TypeException, StreeException}
 
%define lr.type ielr

%define parse.error custom
%define parse.trace

%verbose

%locations

%code imports {
	import fr.ubordeaux.deptinfo.compilation.lea.type.*;
	import fr.ubordeaux.deptinfo.compilation.lea.environment.*;
	import fr.ubordeaux.deptinfo.compilation.lea.stree.*;
}

%code {
	private Environment<Type> typeEnvironment = new MapEnvironment<Type>("TYPES", true);
	private Environment<Type> varEnvironment = new MapEnvironment<Type>("VARIABLES", true);
	private Environment<Type> interfaceEnvironment = new MapEnvironment<Type>("INTERFACE", true);
	private Environment<Type> classEnvironment = new MapEnvironment<Type>("CLASSE", true);
	private StackEnvironment<Type> localVarEnvironment = new StackEnvironment<Type>("STACK", true);
	private Type type;
}

// operators
%token ASSIGN ":="
	PLUSE "+="
	MINUSE "-="
	TIMESE "*="
	DIVE "/="
	PERCE "%="
	ORE "||="
	ANDE "&&="
	AMPE "&="
	PIPEE "|="
	LSHIFTE "<<="
	RSHIFTE ">>="
	SUCC "++"
	DEC "--"
	AND "&&"
	OR "||"
	LSHIFT "<<"
	RSHIFT ">>"
	DOTS ".."
	EQ "=="
	LE "<="
	GE ">="
	NE "!=";

//keywords
%token 
	BOOLEAN "boolean"
	BREAK "break"
	CASE "case"
	CHAR "char"
	CLASS "class"
	COMPARABLE "comparable"
	CONST "const"
	CONTINUE "continue"
	DEFAULT "default"
	DO "do"
	ELSE "else"
	ENUM "enum"
	EQUIVALENT "equivalent"
	EXTENDS "extends"
	FINAL "final"
	FLOAT "float"
	FOR "for"
	FOREACH "foreach"
	FUNCTION "function"
	IF "if"
	IMPLEMENTS "implements"
	IMPORT "import"
	IN "in"
	INTEGER "integer"
	INTERFACE "interface"
	LIST "list"
	MAP "map"
	MAIN "main"
	NEW "new"
	NULL "null"
	PRIVATE "private"
	PROTECTED "protected"
	PUBLIC "public"
	PROCEDURE "procedure"
	RANGE "range"
	READLN "readln"
	RETURN "return"
	SET "set"
	STRING "string"
	SWITCH "switch"
	THIS "this"
	TYPE "type"
	VIRTUAL "virtual"
	WRITE "write"
	WRITELN "writeln"
	WHILE "while";

// constants
%token<String> 
	IDENTIFIER 
	CONSTANT_STRING;

%token<Integer> 
	CONSTANT_INTEGER
	CONSTANT_CHAR;

%token<Float> 
	CONSTANT_FLOAT;

%nterm<Type> type_expressions type_expression type_expression_class type_names 
type_name args_definition arg_definition 
interface_definition interface_definition_head class_definition class_definition_head
const_definition attribute_definition method_definition;

%nterm<Stree> const_expression expression assigned_variable args args_opt
method_name block stms stm simple_stm assignment_stm 
case_stms case_stm default_stm;

%precedence ASSIGNED_VARIABLE
%precedence ':'

%precedence WITHOUT_ELSE
%precedence ELSE

%precedence DETERMINER
%precedence SPECIFIER

%left "||"
%left "&&"
%nonassoc '!'
%nonassoc '<' "<=" '>' ">=" "!=" "=="
%left '+' '-'
%left '*' '/' '%'
%left "++" "--"
%right LEFTPLUSPLUS LEFTMINUSMINUS
%nonassoc UMINUS
%left '|'
%left '&'
%right "<<" ">>"

%%

S: 	imports  
	declarations
	;

imports:
	%empty
	| imports import
	;

import:
	"import" CONSTANT_STRING
	;
	
declarations:
	declarations declaration
	| declaration
	;
	
declaration:
	"class" IDENTIFIER implements extends '{' push_environment class_definition pop_environment '}' { classEnvironment.put($2, $7); }
	| "class" "main" '{' push_environment class_definition pop_environment '}' { classEnvironment.put("main", $5); }
	| "interface" IDENTIFIER extends_public '{' push_environment interface_definition pop_environment '}' { interfaceEnvironment.put($2, $6); }
	;
	
implements:
	%empty
	| "implements" class_names
	;
	
extends:
	%empty
	| "extends" determiner class_name
	;
	
extends_public:
	%empty
	| "extends" class_name
	;
	
class_names:
	class_names ',' class_name
	| class_name
	;
	
class_name:
	IDENTIFIER
	| IDENTIFIER '<' class_names '>'
	;
	
class_definition:
	%empty {$$ = null;}
	| class_definition_head class_definition 
	{
		if ($1 == null)
			$$ = $2;
		else {
			if ($2 == null) 
				$$ = $1; 
			else 
				$$ = new TypeExpression(Tag.PRODUCT, $1, $2); 
		}
	}
	;
	
class_definition_head:
	type_definition {$$ = null;}
	| const_definition {$$ = $1;}
	| attribute_definition {$$ = $1;}
	| method_definition {$$ = $1;}
	;
	
type_definition:
	"type" IDENTIFIER ":=" type_expression 	
	{
		typeEnvironment.put($2, $4);
	}
	;
	
const_definition:
	"const" IDENTIFIER ":=" const_expression 
	{
	}
	;
	
attribute_definition:
	determiner IDENTIFIER ':' type_expression ';' 	
	{
		localVarEnvironment.put($2, $4);
		$$ = new TypeExpression(Tag.FIELD, $4, $2);
	}
	;
	
push_environment:
	%empty { 
		localVarEnvironment.push(new MapEnvironment<Type>(localVarEnvironment.getName() + '(' + localVarEnvironment.size() + ')', true)); }
	;
	
pop_environment:
	%empty { localVarEnvironment.pop(); }
	;
	
 method_definition:
 	// main definition i.e.: main(args:list<string>) {...}
 	"main" '(' args_definition ')'
	{ 
		type = new TypeExpression(Tag.FUNCTION, $3, new TypeExpression(Tag.VOID));
		localVarEnvironment.put("main", type);
	}
	push_environment {localVarEnvironment.put($3);} block pop_environment
	{ 
		$$ = new TypeExpression(Tag.FIELD, type, "main"); 
		try {
			System.out.println($8.getStm());
			$8.getStm().toDotFile("data/" + @1.toString() + "_main.dot");
		}
		catch (StreeException e) {
			yyerror(@1, e.getMessage());
		}
		//yyerror(@8, $8.toString());
	}
	
 	// constructor definition i.e.: public X(n: integer) {...}
	| determiner IDENTIFIER '(' args_definition ')'
	{
		type = new TypeExpression(Tag.FUNCTION, $4, new TypeExpression(Tag.VOID));
		localVarEnvironment.put($2, type);
	}
	push_environment {localVarEnvironment.put($4);} block pop_environment
	{ 
		$$ = new TypeExpression(Tag.FIELD, type, $2); 
		try {
			System.out.println($9.getStm());
			$9.getStm().toDotFile("data/" + @2.toString() + '_' + $2 + ".dot");
		}
		catch (StreeException e) {
			yyerror(@1, e.getMessage());
		}
		//yyerror(@9, $9.toString());
	}
	
 	// constructor declaration i.e.: public X(n: integer);
 	| determiner IDENTIFIER '(' args_definition ')'
	{
		type = new TypeExpression(Tag.FUNCTION, $4, new TypeExpression(Tag.VOID));
		localVarEnvironment.put($2, type);
	}
	push_environment {} ';' pop_environment
	{ 
		$$ = new TypeExpression(Tag.FIELD, type, $2); 
	}
	
	// procedure method definition i.e.: public procedure final fib(n: integer) {...}
 	| determiner specifier "procedure" IDENTIFIER '(' args_definition ')' 	
	{
		type = new TypeExpression(Tag.FUNCTION, $6, new TypeExpression(Tag.VOID));
		localVarEnvironment.put($4, type);
	}
	push_environment {localVarEnvironment.put($6);} block pop_environment
	{ 
		$$ = new TypeExpression(Tag.PRODUCT, type, $4); 
		try {
			System.out.println($11.getStm());
			$11.getStm().toDotFile("data/" + @4.toString() + '_' + $4 + ".dot");
		}
		catch (StreeException e) {
			yyerror(@1, e.getMessage());
		}
		//yyerror(@11, $11.toString());
	}
	
	// procedure method declaration i.e.: public procedure virtual fib(n: integer);
	| determiner specifier "procedure" IDENTIFIER '(' args_definition ')' 	
	{
		type = new TypeExpression(Tag.FUNCTION, $6, new TypeExpression(Tag.VOID));
		localVarEnvironment.put($4, type);
	}
	push_environment {} ';' pop_environment
	{ 
		$$ = new TypeExpression(Tag.FIELD, type, $4); 
	}
	
	// function method definition i.e.: public procedure final fib(n: integer) {...}
 	| determiner specifier "function" IDENTIFIER '(' args_definition ')' ':' type_expression  	
	{
		type = new TypeExpression(Tag.FUNCTION, $6, $9);
		localVarEnvironment.put($4, type);
	}
	push_environment {localVarEnvironment.put($6);} block pop_environment
	{ 
		$$ = new TypeExpression(Tag.FIELD, type, $4); 
		try {
			System.out.println($13.getStm());
			$13.getStm().toDotFile("data/" + @4.toString() + '_' + $4 + ".dot");
		}
		catch (StreeException e) {
			yyerror(@1, e.getMessage());
		}
		//yyerror(@13, $13.toString());
	}
	
	// function method declaration i.e.: public procedure virtual fib(n: integer);
	| determiner specifier "function" IDENTIFIER '(' args_definition ')' ':' type_expression  	
	{
		type = new TypeExpression(Tag.FUNCTION, $6, $9);
		localVarEnvironment.put($4, type);
	}
	push_environment {} ';' pop_environment
	{ 
		$$ = new TypeExpression(Tag.FIELD, type, $4); 
	}
	;

determiner:
	%empty %prec DETERMINER
	| "private"
	| "public"
	| "protected"
	;
	
specifier:
	%empty %prec SPECIFIER
	| "virtual"
	| "final"
	;
	
interface_definition:
	%empty {$$ = null;}
	| interface_definition_head interface_definition 
	{
		if ($2 == null) 
			$$ = $1; 
		else 
			$$ = new TypeExpression(Tag.PRODUCT, $1, $2); }
	;
	
interface_definition_head:
	"procedure" IDENTIFIER '(' args_definition ')' ';' { $$ = new TypeExpression(Tag.FUNCTION); }
	| "function" IDENTIFIER '(' args_definition ')' ':' type_expression ';' { $$ = new TypeExpression(Tag.FUNCTION); }
	;

type_expression:
	"char"											{$$ = new TypeExpression(Tag.CHAR);}
	| "integer"									{$$ = new TypeExpression(Tag.INTEGER);}
	| "float"										{$$ = new TypeExpression(Tag.FLOAT);}
	| "boolean"									{$$ = new TypeExpression(Tag.BOOLEAN);}
	| "string"										{$$ = new TypeExpression(Tag.STRING);}
	| "enum" '<' type_names '>'						{$$ = new TypeExpression(Tag.ENUM, $3);}
	| "range" '<' type_expression '>'						{$$ = new TypeExpression(Tag.RANGE, $3);}
	| "list" '<' type_expression '>'				{$$ = new TypeExpression(Tag.LIST, $3);}
	| "set" '<' type_expression '>'				{$$ = new TypeExpression(Tag.SET, $3);}
	| "map" '<' type_expression ',' type_expression '>'	{$$ = new TypeExpression(Tag.MAP, $3, $5);}
	| type_expression_class								{$$ = $1;}
	;
	
type_expression_class:
	IDENTIFIER '<' type_expressions '>'		{$$ = new TypeExpression(Tag.CLASS, $3, $1);}
	| IDENTIFIER	 						{$$ = new TypeExpression(Tag.CLASS, $1);}
	;
	
type_expressions:
	type_expressions ',' type_expression						{$$ = new TypeExpression(Tag.PRODUCT, $1, $3);}
	| type_expression									{$$ = $1;}
	;
	
type_names:
	type_names ',' type_name						{$$ = new TypeExpression(Tag.PRODUCT, $1, $3);}
	| type_name									{$$ = $1;}
	;
	
type_name:
	IDENTIFIER									{$$ = new TypeExpression(Tag.NAME, $1);}
	;
	
args_definition:
	args_definition ',' arg_definition {$$ = new TypeExpression(Tag.PRODUCT, $1, $3);}
	| arg_definition {$$ = $1;}
	;	
	
arg_definition:
	IDENTIFIER ':' type_expression 
	{
		$$ = new TypeExpression(Tag.FIELD, $3, $1);
	}
	;	
	
block:
	'{' var_definitions stms '}' { $$ = $3; }
	;
	
var_definitions:
	%empty
	| var_definitions var_definition
	;
	
var_definition:
	IDENTIFIER ':' type_expression ';' { localVarEnvironment.put($1, $3); }
	;
	
stms:
	stms stm { $$ = new StreeSEQ($1, $2); }
	| stm { $$ = $1; }
	;
	
stm:
	simple_stm ';' { $$ = $1; }
	| "if" '(' expression ')' stm %prec WITHOUT_ELSE { $$ = new StreeIF($3, new StreeTHENELSE($5)); }
	| "if" '(' expression ')' stm "else" stm { $$ = new StreeIF($3, new StreeTHENELSE($5, $7)); }
	| "while" '(' expression ')' stm { $$ = new StreeWHILE($3, $5); }
	| "do" stm WHILE '(' expression ')' ';' { $$ = new StreeDO($2, $5); }
	| "for" '(' assigned_variable ':' expression ')' stm { $$ = new StreeFOR($3, new StreeFORCONT($5, $7)); }
	| "for" '(' assignment_stm ';' expression ';' simple_stm ')' stm { $$ = new StreeFOR($3, new StreeFORCONT($5, new StreeFORCONT($7, $9))); }
	| "foreach" assigned_variable "in" expression stm { $$ = new StreeFOREACH($2, new StreeFOREACHCONT($4, $5)); }
	| "switch" '(' expression ')' '{' case_stms '}' { $$ = new StreeSWITCH($3, $6); }
	| block { $$ = $1; }
	;

case_stms:
	case_stm case_stms  { $$ = new StreePRODUCT($1, $2); }
	| case_stm { $$ = $1; }
	| default_stm { $$ = $1; }
	;
	
case_stm:
	"case" expression ':' stm  { $$ = new StreeCASE($2, $4);  }
	;
	
default_stm:
	"default" ':' stm  { $$ = new StreeDEFAULT($3);  }
	;
	
assignment_stm:
	assigned_variable ":=" expression { $$ = new StreeAFF($1, $3); }
	| IDENTIFIER ':' type_expression ":=" expression { localVarEnvironment.put($1, $3); $$ = new StreeAFF(new StreeVARIABLE($1, $3), $5); }
	;

simple_stm:
	assignment_stm { $$ = $1; }
	| assigned_variable "++" { $$ = new StreeSUCC($1, StreeSUCC.RIGHT); }
	| assigned_variable "--" { $$ = new StreeDEC($1, StreeDEC.RIGHT); }
	| assigned_variable "+=" expression { $$ = new StreePLUSAFF($1, $3); }
	| assigned_variable "-=" expression { $$ = new StreeMINUSAFF($1, $3); }
	| assigned_variable "*=" expression { $$ = new StreeTIMESAFF($1, $3); }
	| assigned_variable "/=" expression { $$ = new StreeDIVAFF($1, $3); }
	| assigned_variable "||=" expression { $$ = new StreeORAFF($1, $3); }
	| assigned_variable "&&=" expression { $$ = new StreeANDAFF($1, $3); }
	| assigned_variable "&=" expression { $$ = new StreeBANDAFF($1, $3); }
	| assigned_variable "|=" expression { $$ = new StreeBORAFF($1, $3); }
	| assigned_variable "<<=" expression { $$ = new StreeLSHIFTAFF($1, $3); }
	| assigned_variable ">>=" expression { $$ = new StreeRSHIFTAFF($1, $3); }
	| method_name '(' args ')' { $$ = new StreeCALL($1, $3); }
	| "readln" '(' expression ')' { $$ = new StreeCALL(new StreeMETHOD("readln"), new StreeARGS($3)); }
	| "write" '(' expression ')' { $$ = new StreeCALL(new StreeMETHOD("write"), new StreeARGS($3)); }
	| "writeln" '(' expression ')' { $$ = new StreeCALL(new StreeMETHOD("writeln"), new StreeARGS($3)); }
	| "break" { $$ = new StreeBREAK(); }
	| "continue" { $$ = new StreeCONTINUE(); }
	| "return" expression { $$ = new StreeRETURN($2); }
	//| error ';'
	//| error YYEOF
	;

assigned_variable:
	IDENTIFIER %prec ASSIGNED_VARIABLE 
	{
		try {
			Type localType = localVarEnvironment.get($1);
			if (localType == null)
				localType = varEnvironment.get($1);
			if (localType == null)
				throw new EnvironmentException("unknown variable " + $1);
			$$ = new StreeVARIABLE($1, localType);
		}
		catch (EnvironmentException environmentException) {
			yyerror ("*** unknown variable: " + $1 + " " + environmentException.getMessage());
			$$ = null;
		}
	} 
	
	| IDENTIFIER '[' args ']' 
	{
		$$ = null;
		yyerror(@1, "not yet implemented");
	}
	
	| assigned_variable '.' IDENTIFIER 
	{
		$$ = new StreeSLOT($1, $3);
		yyerror(@1, "not yet implemented");
	}
	
	| "this" 
	{
		$$ = new StreeTHIS();
		yyerror(@1, "not yet implemented");
	}
	;

method_name:
	IDENTIFIER
	{
		type = localVarEnvironment.get($1);
		if (type == null)
			type = varEnvironment.get($1);
		if (type == null)
			throw new EnvironmentException("unknown variable " + $1);
		$$ = new StreeMETHOD($1, type);
	}
	| assigned_variable '.' IDENTIFIER { $$ = new StreeSLOT($1, $3); }
	;

args:
	args ',' expression {$$ = new StreeARGS($1, $3);}
	| expression { $$ = $$ = new StreeARGS($1, null);}
	;
	
const_expression:
	"null" {$$ = new StreeNULL(); }
	| CONSTANT_INTEGER {$$ = new StreeINTEGER($1); }
	| CONSTANT_FLOAT {$$ = new StreeFLOAT($1); }
	| CONSTANT_CHAR  {$$ = new StreeCHAR($1); }
	| CONSTANT_STRING  {$$ = new StreeSTRING($1); }
	| '[' const_expression DOTS const_expression ']' {$$ = new StreeRANGE($2, $4); }
	;
	
expression:
	const_expression 					{ $$ = $1; }
	| assigned_variable			{ $$ = $1; }
	| method_name '(' args ')'	{ $$ = new StreeCALL($1, $3); }
	| "new" type_expression_class '(' args_opt ')'			{ $$ = new StreeNEW($2, $4); }
	| expression "&&" expression				{ $$ = new StreeAND($1, $3); }
	| expression "||" expression				{ $$ = new StreeOR($1, $3); }
	| '!' expression					{ $$ = new StreeNOT($2); }
	| expression '<' expression				{ $$ = new StreeLT($1, $3); }
	| expression "<=" expression			{ $$ = new StreeLE($1, $3); }
	| expression '>' expression				{ $$ = new StreeGT($1, $3); }
	| expression ">=" expression			{ $$ = new StreeGE($1, $3); }
	| expression "==" expression			{ $$ = new StreeEQ($1, $3); }
	| expression "!=" expression			{ $$ = new StreeNE($1, $3); }
	| expression '+' expression 			{ $$ = new StreePLUS($1, $3); }
	| expression '-' expression			    { $$ = new StreeMINUS($1, $3); }
	| '-' expression %prec UMINUS		{ $$ = new StreeMINUS($2); }
	| expression '*' expression 			{ $$ = new StreeTIMES($1, $3); }
	| expression '/' expression			    { $$ = new StreeDIV($1, $3); }
	| expression "++" 				{ $$ = new StreeSUCC($1, StreeSUCC.RIGHT); }
	| expression "--"					{ $$ = new StreeDEC($1, StreeDEC.RIGHT); }
	| "++" expression %prec LEFTPLUSPLUS			{ $$ = new StreeSUCC($2, StreeSUCC.LEFT); }
	| "--" expression %prec LEFTMINUSMINUS		{ $$ = new StreeDEC($2, StreeDEC.LEFT); }
	| expression '&' expression			{ $$ = new StreeAND($1, $3); }
	| expression '|' expression			{ $$ = new StreeOR($1, $3); }
	| expression "<<" expression		{ $$ = new StreeLSHIFT($1, $3); }
	| expression ">>" expression		{ $$ = new StreeRSHIFT($1, $3); }
	| '(' expression ')'			{$$ = $2;}
	;

args_opt:
	%empty {$$ = null;}
	| args {$$ = $1;}
	;

	
%%
