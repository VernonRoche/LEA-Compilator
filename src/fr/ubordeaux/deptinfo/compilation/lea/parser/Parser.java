/* A Bison parser, made by GNU Bison 3.7.5.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java

   Copyright (C) 2007-2015, 2018-2021 Free Software Foundation, Inc.

   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.

   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* DO NOT RELY ON FEATURES THAT ARE NOT DOCUMENTED in the manual,
   especially those whose name start with YY_ or yy_.  They are
   private implementation details that can be changed or removed.  */

package fr.ubordeaux.deptinfo.compilation.lea.parser;



import java.text.MessageFormat;
/* "%code imports" blocks.  */
/* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":18  */

	import fr.ubordeaux.deptinfo.compilation.lea.type.TType;
	import fr.ubordeaux.deptinfo.compilation.lea.type.Type;
	import fr.ubordeaux.deptinfo.compilation.lea.type.TypeExpr;
	import fr.ubordeaux.deptinfo.compilation.lea.type.TypeException;
	import fr.ubordeaux.deptinfo.compilation.lea.environment.Environment;
	import fr.ubordeaux.deptinfo.compilation.lea.environment.MapEnvironment;
	import fr.ubordeaux.deptinfo.compilation.lea.environment.EnvironmentException;

/* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/src/fr/ubordeaux/deptinfo/compilation/lea/parser/Parser.java":54  */

/**
 * A Bison parser, automatically generated from <tt>/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
public class Parser
{
  /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "3.7.5";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";





  /**
   * A class defining a pair of positions.  Positions, defined by the
   * <code>Position</code> class, denote a point in the input.
   * Locations represent a part of the input through the beginning
   * and ending positions.
   */
  public static class Location {
    /**
     * The first, inclusive, position in the range.
     */
    public Position begin;

    /**
     * The first position beyond the range.
     */
    public Position end;

    /**
     * Create a <code>Location</code> denoting an empty range located at
     * a given point.
     * @param loc The position at which the range is anchored.
     */
    public Location (Position loc) {
      this.begin = this.end = loc;
    }

    /**
     * Create a <code>Location</code> from the endpoints of the range.
     * @param begin The first position included in the range.
     * @param end   The first position beyond the range.
     */
    public Location (Position begin, Position end) {
      this.begin = begin;
      this.end = end;
    }

    /**
     * Print a representation of the location.  For this to be correct,
     * <code>Position</code> should override the <code>equals</code>
     * method.
     */
    public String toString () {
      if (begin.equals (end))
        return begin.toString ();
      else
        return begin.toString () + "-" + end.toString ();
    }
  }

  private Location yylloc(YYStack rhs, int n)
  {
    if (0 < n)
      return new Location(rhs.locationAt(n-1).begin, rhs.locationAt(0).end);
    else
      return new Location(rhs.locationAt(0).end);
  }

  public enum SymbolKind
  {
    S_YYEOF(0),                    /* "end of file"  */
    S_YYerror(1),                  /* error  */
    S_YYUNDEF(2),                  /* "invalid token"  */
    S_ASSIGN(3),                   /* ":="  */
    S_PLUS_ASSIGN(4),              /* "+="  */
    S_MINUS_ASSIGN(5),             /* "-="  */
    S_TIMES_ASSIGN(6),             /* "*="  */
    S_DIV_ASSIGN(7),               /* "/="  */
    S_PERC_ASSIGN(8),              /* "%="  */
    S_PIPE_PIPE_ASSIGN(9),         /* "||="  */
    S_AMP_AMP_ASSIGN(10),          /* "&&="  */
    S_AMP_ASSIGN(11),              /* "&="  */
    S_PIPE_ASSIGN(12),             /* "|="  */
    S_LT_LT_ASSIGN(13),            /* "<<="  */
    S_GT_GT_ASSIGN(14),            /* ">>="  */
    S_PLUS_PLUS(15),               /* "++"  */
    S_MINUS_MINUS(16),             /* "--"  */
    S_AMP_AMP(17),                 /* "&&"  */
    S_PIPE_PIPE(18),               /* "||"  */
    S_LT_LT(19),                   /* "<<"  */
    S_GT_GT(20),                   /* ">>"  */
    S_DOTS(21),                    /* ".."  */
    S_EQ_EQ(22),                   /* "=="  */
    S_LT_EQ(23),                   /* "<="  */
    S_GT_EQ(24),                   /* ">="  */
    S_BANG_EQ(25),                 /* "!="  */
    S_BOOLEAN(26),                 /* "boolean"  */
    S_BREAK(27),                   /* "break"  */
    S_CHAR(28),                    /* "char"  */
    S_CLASS(29),                   /* "class"  */
    S_COMPARABLE(30),              /* "comparable"  */
    S_CONST(31),                   /* "const"  */
    S_CONTINUE(32),                /* "continue"  */
    S_DO(33),                      /* "do"  */
    S_ELSE(34),                    /* "else"  */
    S_ENUM(35),                    /* "enum"  */
    S_EQUIVALENT(36),              /* "equivalent"  */
    S_EXTENDS(37),                 /* "extends"  */
    S_FINAL(38),                   /* "final"  */
    S_FLOAT(39),                   /* "float"  */
    S_FOR(40),                     /* "for"  */
    S_FOREACH(41),                 /* "foreach"  */
    S_FUNCTION(42),                /* "function"  */
    S_IF(43),                      /* "if"  */
    S_IMPLEMENTS(44),              /* "implements"  */
    S_IMPORT(45),                  /* "import"  */
    S_IN(46),                      /* "in"  */
    S_INTEGER(47),                 /* "integer"  */
    S_INTERFACE(48),               /* "interface"  */
    S_LIST(49),                    /* "list"  */
    S_MAP(50),                     /* "map"  */
    S_MAIN(51),                    /* "main"  */
    S_NEW(52),                     /* "new"  */
    S_NULL(53),                    /* "null"  */
    S_OPERATOR(54),                /* "operator"  */
    S_PRIVATE(55),                 /* "private"  */
    S_PROTECTED(56),               /* "protected"  */
    S_PUBLIC(57),                  /* "public"  */
    S_PROCEDURE(58),               /* "procedure"  */
    S_RANGE(59),                   /* "range"  */
    S_READLN(60),                  /* "readln"  */
    S_RETURN(61),                  /* "return"  */
    S_SET(62),                     /* "set"  */
    S_STRING(63),                  /* "string"  */
    S_THIS(64),                    /* "this"  */
    S_TYPE(65),                    /* "type"  */
    S_VIRTUAL(66),                 /* "virtual"  */
    S_WRITE(67),                   /* "write"  */
    S_WRITELN(68),                 /* "writeln"  */
    S_WHILE(69),                   /* "while"  */
    S_IDENTIFIER(70),              /* IDENTIFIER  */
    S_LITTERAL_STRING(71),         /* LITTERAL_STRING  */
    S_NUMBER_INTEGER(72),          /* NUMBER_INTEGER  */
    S_LITTERAL_CHAR(73),           /* LITTERAL_CHAR  */
    S_NUMBER_FLOAT(74),            /* NUMBER_FLOAT  */
    S_WITHOUT_ELSE(75),            /* WITHOUT_ELSE  */
    S_DETERMINER(76),              /* DETERMINER  */
    S_SPECIFIER(77),               /* SPECIFIER  */
    S_78_(78),                     /* '!'  */
    S_79_(79),                     /* '<'  */
    S_80_(80),                     /* '>'  */
    S_81_(81),                     /* '+'  */
    S_82_(82),                     /* '-'  */
    S_83_(83),                     /* '*'  */
    S_84_(84),                     /* '/'  */
    S_85_(85),                     /* '%'  */
    S_LEFTPLUSPLUS(86),            /* LEFTPLUSPLUS  */
    S_LEFTMINUSMINUS(87),          /* LEFTMINUSMINUS  */
    S_UMINUS(88),                  /* UMINUS  */
    S_89_(89),                     /* '|'  */
    S_90_(90),                     /* '&'  */
    S_91_(91),                     /* '{'  */
    S_92_(92),                     /* '}'  */
    S_93_(93),                     /* ','  */
    S_94_(94),                     /* ':'  */
    S_95_(95),                     /* ';'  */
    S_96_(96),                     /* '('  */
    S_97_(97),                     /* ')'  */
    S_98_(98),                     /* "[]"  */
    S_99_(99),                     /* '['  */
    S_100_(100),                   /* ']'  */
    S_101_(101),                   /* '.'  */
    S_YYACCEPT(102),               /* $accept  */
    S_S(103),                      /* S  */
    S_imports(104),                /* imports  */
    S_import(105),                 /* import  */
    S_declarations(106),           /* declarations  */
    S_declaration(107),            /* declaration  */
    S_implements(108),             /* implements  */
    S_extends(109),                /* extends  */
    S_extends_public(110),         /* extends_public  */
    S_classNames(111),             /* classNames  */
    S_className(112),              /* className  */
    S_classDefinition(113),        /* classDefinition  */
    S_classDefinitionContent(114), /* classDefinitionContent  */
    S_typeDefinition(115),         /* typeDefinition  */
    S_constDefinition(116),        /* constDefinition  */
    S_attributeDefinition(117),    /* attributeDefinition  */
    S_methodDefinition(118),       /* methodDefinition  */
    S_119_1(119),                  /* $@1  */
    S_120_2(120),                  /* $@2  */
    S_121_3(121),                  /* $@3  */
    S_122_4(122),                  /* $@4  */
    S_123_5(123),                  /* $@5  */
    S_124_6(124),                  /* $@6  */
    S_125_7(125),                  /* $@7  */
    S_126_8(126),                  /* $@8  */
    S_determiner(127),             /* determiner  */
    S_specifier(128),              /* specifier  */
    S_user_defined_operators(129), /* user_defined_operators  */
    S_interfaceDefinition(130),    /* interfaceDefinition  */
    S_typeExpr(131),               /* typeExpr  */
    S_typePtrExpr(132),            /* typePtrExpr  */
    S_typeExprs(133),              /* typeExprs  */
    S_typeNames(134),              /* typeNames  */
    S_typeName(135),               /* typeName  */
    S_argsDefinition(136),         /* argsDefinition  */
    S_argDefinition(137),          /* argDefinition  */
    S_block(138),                  /* block  */
    S_varDefinitions(139),         /* varDefinitions  */
    S_varDefinition(140),          /* varDefinition  */
    S_stms(141),                   /* stms  */
    S_stm(142),                    /* stm  */
    S_for_stm(143),                /* for_stm  */
    S_simple_stm(144),             /* simple_stm  */
    S_assignedVariable(145),       /* assignedVariable  */
    S_methodName(146),             /* methodName  */
    S_args(147),                   /* args  */
    S_constExpr(148),              /* constExpr  */
    S_expr(149),                   /* expr  */
    S_args_opt(150);               /* args_opt  */


    private final int yycode_;

    SymbolKind (int n) {
      this.yycode_ = n;
    }

    private static final SymbolKind[] values_ = {
      SymbolKind.S_YYEOF,
      SymbolKind.S_YYerror,
      SymbolKind.S_YYUNDEF,
      SymbolKind.S_ASSIGN,
      SymbolKind.S_PLUS_ASSIGN,
      SymbolKind.S_MINUS_ASSIGN,
      SymbolKind.S_TIMES_ASSIGN,
      SymbolKind.S_DIV_ASSIGN,
      SymbolKind.S_PERC_ASSIGN,
      SymbolKind.S_PIPE_PIPE_ASSIGN,
      SymbolKind.S_AMP_AMP_ASSIGN,
      SymbolKind.S_AMP_ASSIGN,
      SymbolKind.S_PIPE_ASSIGN,
      SymbolKind.S_LT_LT_ASSIGN,
      SymbolKind.S_GT_GT_ASSIGN,
      SymbolKind.S_PLUS_PLUS,
      SymbolKind.S_MINUS_MINUS,
      SymbolKind.S_AMP_AMP,
      SymbolKind.S_PIPE_PIPE,
      SymbolKind.S_LT_LT,
      SymbolKind.S_GT_GT,
      SymbolKind.S_DOTS,
      SymbolKind.S_EQ_EQ,
      SymbolKind.S_LT_EQ,
      SymbolKind.S_GT_EQ,
      SymbolKind.S_BANG_EQ,
      SymbolKind.S_BOOLEAN,
      SymbolKind.S_BREAK,
      SymbolKind.S_CHAR,
      SymbolKind.S_CLASS,
      SymbolKind.S_COMPARABLE,
      SymbolKind.S_CONST,
      SymbolKind.S_CONTINUE,
      SymbolKind.S_DO,
      SymbolKind.S_ELSE,
      SymbolKind.S_ENUM,
      SymbolKind.S_EQUIVALENT,
      SymbolKind.S_EXTENDS,
      SymbolKind.S_FINAL,
      SymbolKind.S_FLOAT,
      SymbolKind.S_FOR,
      SymbolKind.S_FOREACH,
      SymbolKind.S_FUNCTION,
      SymbolKind.S_IF,
      SymbolKind.S_IMPLEMENTS,
      SymbolKind.S_IMPORT,
      SymbolKind.S_IN,
      SymbolKind.S_INTEGER,
      SymbolKind.S_INTERFACE,
      SymbolKind.S_LIST,
      SymbolKind.S_MAP,
      SymbolKind.S_MAIN,
      SymbolKind.S_NEW,
      SymbolKind.S_NULL,
      SymbolKind.S_OPERATOR,
      SymbolKind.S_PRIVATE,
      SymbolKind.S_PROTECTED,
      SymbolKind.S_PUBLIC,
      SymbolKind.S_PROCEDURE,
      SymbolKind.S_RANGE,
      SymbolKind.S_READLN,
      SymbolKind.S_RETURN,
      SymbolKind.S_SET,
      SymbolKind.S_STRING,
      SymbolKind.S_THIS,
      SymbolKind.S_TYPE,
      SymbolKind.S_VIRTUAL,
      SymbolKind.S_WRITE,
      SymbolKind.S_WRITELN,
      SymbolKind.S_WHILE,
      SymbolKind.S_IDENTIFIER,
      SymbolKind.S_LITTERAL_STRING,
      SymbolKind.S_NUMBER_INTEGER,
      SymbolKind.S_LITTERAL_CHAR,
      SymbolKind.S_NUMBER_FLOAT,
      SymbolKind.S_WITHOUT_ELSE,
      SymbolKind.S_DETERMINER,
      SymbolKind.S_SPECIFIER,
      SymbolKind.S_78_,
      SymbolKind.S_79_,
      SymbolKind.S_80_,
      SymbolKind.S_81_,
      SymbolKind.S_82_,
      SymbolKind.S_83_,
      SymbolKind.S_84_,
      SymbolKind.S_85_,
      SymbolKind.S_LEFTPLUSPLUS,
      SymbolKind.S_LEFTMINUSMINUS,
      SymbolKind.S_UMINUS,
      SymbolKind.S_89_,
      SymbolKind.S_90_,
      SymbolKind.S_91_,
      SymbolKind.S_92_,
      SymbolKind.S_93_,
      SymbolKind.S_94_,
      SymbolKind.S_95_,
      SymbolKind.S_96_,
      SymbolKind.S_97_,
      SymbolKind.S_98_,
      SymbolKind.S_99_,
      SymbolKind.S_100_,
      SymbolKind.S_101_,
      SymbolKind.S_YYACCEPT,
      SymbolKind.S_S,
      SymbolKind.S_imports,
      SymbolKind.S_import,
      SymbolKind.S_declarations,
      SymbolKind.S_declaration,
      SymbolKind.S_implements,
      SymbolKind.S_extends,
      SymbolKind.S_extends_public,
      SymbolKind.S_classNames,
      SymbolKind.S_className,
      SymbolKind.S_classDefinition,
      SymbolKind.S_classDefinitionContent,
      SymbolKind.S_typeDefinition,
      SymbolKind.S_constDefinition,
      SymbolKind.S_attributeDefinition,
      SymbolKind.S_methodDefinition,
      SymbolKind.S_119_1,
      SymbolKind.S_120_2,
      SymbolKind.S_121_3,
      SymbolKind.S_122_4,
      SymbolKind.S_123_5,
      SymbolKind.S_124_6,
      SymbolKind.S_125_7,
      SymbolKind.S_126_8,
      SymbolKind.S_determiner,
      SymbolKind.S_specifier,
      SymbolKind.S_user_defined_operators,
      SymbolKind.S_interfaceDefinition,
      SymbolKind.S_typeExpr,
      SymbolKind.S_typePtrExpr,
      SymbolKind.S_typeExprs,
      SymbolKind.S_typeNames,
      SymbolKind.S_typeName,
      SymbolKind.S_argsDefinition,
      SymbolKind.S_argDefinition,
      SymbolKind.S_block,
      SymbolKind.S_varDefinitions,
      SymbolKind.S_varDefinition,
      SymbolKind.S_stms,
      SymbolKind.S_stm,
      SymbolKind.S_for_stm,
      SymbolKind.S_simple_stm,
      SymbolKind.S_assignedVariable,
      SymbolKind.S_methodName,
      SymbolKind.S_args,
      SymbolKind.S_constExpr,
      SymbolKind.S_expr,
      SymbolKind.S_args_opt
    };

    static final SymbolKind get(int code) {
      return values_[code];
    }

    public final int getCode() {
      return this.yycode_;
    }

    /* YYNAMES_[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
       First, the terminals, then, starting at \a YYNTOKENS_, nonterminals.  */
    private static final String[] yynames_ = yynames_init();
  private static final String[] yynames_init()
  {
    return new String[]
    {
  "end of file", "error", "invalid token", ":=", "+=", "-=", "*=", "/=",
  "%=", "||=", "&&=", "&=", "|=", "<<=", ">>=", "++", "--", "&&", "||",
  "<<", ">>", "..", "==", "<=", ">=", "!=", "boolean", "break", "char",
  "class", "comparable", "const", "continue", "do", "else", "enum",
  "equivalent", "extends", "final", "float", "for", "foreach", "function",
  "if", "implements", "import", "in", "integer", "interface", "list",
  "map", "main", "new", "null", "operator", "private", "protected",
  "public", "procedure", "range", "readln", "return", "set", "string",
  "this", "type", "virtual", "write", "writeln", "while", "IDENTIFIER",
  "LITTERAL_STRING", "NUMBER_INTEGER", "LITTERAL_CHAR", "NUMBER_FLOAT",
  "WITHOUT_ELSE", "DETERMINER", "SPECIFIER", "'!'", "'<'", "'>'", "'+'",
  "'-'", "'*'", "'/'", "'%'", "LEFTPLUSPLUS", "LEFTMINUSMINUS", "UMINUS",
  "'|'", "'&'", "'{'", "'}'", "','", "':'", "';'", "'('", "')'", "[]",
  "'['", "']'", "'.'", "$accept", "S", "imports", "import", "declarations",
  "declaration", "implements", "extends", "extends_public", "classNames",
  "className", "classDefinition", "classDefinitionContent",
  "typeDefinition", "constDefinition", "attributeDefinition",
  "methodDefinition", "$@1", "$@2", "$@3", "$@4", "$@5", "$@6", "$@7",
  "$@8", "determiner", "specifier", "user_defined_operators",
  "interfaceDefinition", "typeExpr", "typePtrExpr", "typeExprs",
  "typeNames", "typeName", "argsDefinition", "argDefinition", "block",
  "varDefinitions", "varDefinition", "stms", "stm", "for_stm",
  "simple_stm", "assignedVariable", "methodName", "args", "constExpr",
  "expr", "args_opt", null
    };
  }

    /* The user-facing name of this symbol.  */
    public final String getName() {
      return yynames_[yycode_];
    }
  };


  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>Parser</tt>.
   */
  public interface Lexer {
    /* Token kinds.  */
    /** Token "end of file", to be returned by the scanner.  */
    static final int YYEOF = 0;
    /** Token error, to be returned by the scanner.  */
    static final int YYerror = 256;
    /** Token "invalid token", to be returned by the scanner.  */
    static final int YYUNDEF = 257;
    /** Token ":=", to be returned by the scanner.  */
    static final int ASSIGN = 258;
    /** Token "+=", to be returned by the scanner.  */
    static final int PLUS_ASSIGN = 259;
    /** Token "-=", to be returned by the scanner.  */
    static final int MINUS_ASSIGN = 260;
    /** Token "*=", to be returned by the scanner.  */
    static final int TIMES_ASSIGN = 261;
    /** Token "/=", to be returned by the scanner.  */
    static final int DIV_ASSIGN = 262;
    /** Token "%=", to be returned by the scanner.  */
    static final int PERC_ASSIGN = 263;
    /** Token "||=", to be returned by the scanner.  */
    static final int PIPE_PIPE_ASSIGN = 264;
    /** Token "&&=", to be returned by the scanner.  */
    static final int AMP_AMP_ASSIGN = 265;
    /** Token "&=", to be returned by the scanner.  */
    static final int AMP_ASSIGN = 266;
    /** Token "|=", to be returned by the scanner.  */
    static final int PIPE_ASSIGN = 267;
    /** Token "<<=", to be returned by the scanner.  */
    static final int LT_LT_ASSIGN = 268;
    /** Token ">>=", to be returned by the scanner.  */
    static final int GT_GT_ASSIGN = 269;
    /** Token "++", to be returned by the scanner.  */
    static final int PLUS_PLUS = 270;
    /** Token "--", to be returned by the scanner.  */
    static final int MINUS_MINUS = 271;
    /** Token "&&", to be returned by the scanner.  */
    static final int AMP_AMP = 272;
    /** Token "||", to be returned by the scanner.  */
    static final int PIPE_PIPE = 273;
    /** Token "<<", to be returned by the scanner.  */
    static final int LT_LT = 274;
    /** Token ">>", to be returned by the scanner.  */
    static final int GT_GT = 275;
    /** Token "..", to be returned by the scanner.  */
    static final int DOTS = 276;
    /** Token "==", to be returned by the scanner.  */
    static final int EQ_EQ = 277;
    /** Token "<=", to be returned by the scanner.  */
    static final int LT_EQ = 278;
    /** Token ">=", to be returned by the scanner.  */
    static final int GT_EQ = 279;
    /** Token "!=", to be returned by the scanner.  */
    static final int BANG_EQ = 280;
    /** Token "boolean", to be returned by the scanner.  */
    static final int BOOLEAN = 281;
    /** Token "break", to be returned by the scanner.  */
    static final int BREAK = 282;
    /** Token "char", to be returned by the scanner.  */
    static final int CHAR = 283;
    /** Token "class", to be returned by the scanner.  */
    static final int CLASS = 284;
    /** Token "comparable", to be returned by the scanner.  */
    static final int COMPARABLE = 285;
    /** Token "const", to be returned by the scanner.  */
    static final int CONST = 286;
    /** Token "continue", to be returned by the scanner.  */
    static final int CONTINUE = 287;
    /** Token "do", to be returned by the scanner.  */
    static final int DO = 288;
    /** Token "else", to be returned by the scanner.  */
    static final int ELSE = 289;
    /** Token "enum", to be returned by the scanner.  */
    static final int ENUM = 290;
    /** Token "equivalent", to be returned by the scanner.  */
    static final int EQUIVALENT = 291;
    /** Token "extends", to be returned by the scanner.  */
    static final int EXTENDS = 292;
    /** Token "final", to be returned by the scanner.  */
    static final int FINAL = 293;
    /** Token "float", to be returned by the scanner.  */
    static final int FLOAT = 294;
    /** Token "for", to be returned by the scanner.  */
    static final int FOR = 295;
    /** Token "foreach", to be returned by the scanner.  */
    static final int FOREACH = 296;
    /** Token "function", to be returned by the scanner.  */
    static final int FUNCTION = 297;
    /** Token "if", to be returned by the scanner.  */
    static final int IF = 298;
    /** Token "implements", to be returned by the scanner.  */
    static final int IMPLEMENTS = 299;
    /** Token "import", to be returned by the scanner.  */
    static final int IMPORT = 300;
    /** Token "in", to be returned by the scanner.  */
    static final int IN = 301;
    /** Token "integer", to be returned by the scanner.  */
    static final int INTEGER = 302;
    /** Token "interface", to be returned by the scanner.  */
    static final int INTERFACE = 303;
    /** Token "list", to be returned by the scanner.  */
    static final int LIST = 304;
    /** Token "map", to be returned by the scanner.  */
    static final int MAP = 305;
    /** Token "main", to be returned by the scanner.  */
    static final int MAIN = 306;
    /** Token "new", to be returned by the scanner.  */
    static final int NEW = 307;
    /** Token "null", to be returned by the scanner.  */
    static final int NULL = 308;
    /** Token "operator", to be returned by the scanner.  */
    static final int OPERATOR = 309;
    /** Token "private", to be returned by the scanner.  */
    static final int PRIVATE = 310;
    /** Token "protected", to be returned by the scanner.  */
    static final int PROTECTED = 311;
    /** Token "public", to be returned by the scanner.  */
    static final int PUBLIC = 312;
    /** Token "procedure", to be returned by the scanner.  */
    static final int PROCEDURE = 313;
    /** Token "range", to be returned by the scanner.  */
    static final int RANGE = 314;
    /** Token "readln", to be returned by the scanner.  */
    static final int READLN = 315;
    /** Token "return", to be returned by the scanner.  */
    static final int RETURN = 316;
    /** Token "set", to be returned by the scanner.  */
    static final int SET = 317;
    /** Token "string", to be returned by the scanner.  */
    static final int STRING = 318;
    /** Token "this", to be returned by the scanner.  */
    static final int THIS = 319;
    /** Token "type", to be returned by the scanner.  */
    static final int TYPE = 320;
    /** Token "virtual", to be returned by the scanner.  */
    static final int VIRTUAL = 321;
    /** Token "write", to be returned by the scanner.  */
    static final int WRITE = 322;
    /** Token "writeln", to be returned by the scanner.  */
    static final int WRITELN = 323;
    /** Token "while", to be returned by the scanner.  */
    static final int WHILE = 324;
    /** Token IDENTIFIER, to be returned by the scanner.  */
    static final int IDENTIFIER = 325;
    /** Token LITTERAL_STRING, to be returned by the scanner.  */
    static final int LITTERAL_STRING = 326;
    /** Token NUMBER_INTEGER, to be returned by the scanner.  */
    static final int NUMBER_INTEGER = 327;
    /** Token LITTERAL_CHAR, to be returned by the scanner.  */
    static final int LITTERAL_CHAR = 328;
    /** Token NUMBER_FLOAT, to be returned by the scanner.  */
    static final int NUMBER_FLOAT = 329;
    /** Token WITHOUT_ELSE, to be returned by the scanner.  */
    static final int WITHOUT_ELSE = 330;
    /** Token DETERMINER, to be returned by the scanner.  */
    static final int DETERMINER = 331;
    /** Token SPECIFIER, to be returned by the scanner.  */
    static final int SPECIFIER = 332;
    /** Token LEFTPLUSPLUS, to be returned by the scanner.  */
    static final int LEFTPLUSPLUS = 333;
    /** Token LEFTMINUSMINUS, to be returned by the scanner.  */
    static final int LEFTMINUSMINUS = 334;
    /** Token UMINUS, to be returned by the scanner.  */
    static final int UMINUS = 335;

    /** Deprecated, use YYEOF instead.  */
    public static final int EOF = YYEOF;

    /**
     * Method to retrieve the beginning position of the last scanned token.
     * @return the position at which the last scanned token starts.
     */
    Position getStartPos();

    /**
     * Method to retrieve the ending position of the last scanned token.
     * @return the first position beyond the last scanned token.
     */
    Position getEndPos();

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.
     */
    Object getLVal();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * and beginning/ending positions of the token.
     * @return the token identifier corresponding to the next token.
     */
    int yylex() throws java.io.IOException;

    /**
     * Emit an error referring to the given locationin a user-defined way.
     *
     * @param loc The location of the element to which the
     *                error message is related.
     * @param msg The string for the error message.
     */
     void yyerror(Location loc, String msg);


    /**
     * Build and emit a "syntax error" message in a user-defined way.
     *
     * @param ctx  The context of the error.
     */
     void reportSyntaxError (Context ctx);

  }


  /**
   * The object doing lexical analysis for us.
   */
  private Lexer yylexer;





  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public Parser (Lexer yylexer)
  {

    this.yylexer = yylexer;

  }


  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * The <tt>PrintStream</tt> on which the debugging output is printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream (java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel () { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel (int level) { yydebug = level; }


  private int yynerrs = 0;

  /**
   * The number of syntax errors so far.
   */
  public final int getNumberOfErrors () { return yynerrs; }

  /**
   * Print an error message via the lexer.
   * Use a <code>null</code> location.
   * @param msg The error message.
   */
  public final void yyerror(String msg) {
      yylexer.yyerror((Location)null, msg);
  }

  /**
   * Print an error message via the lexer.
   * @param loc The location associated with the message.
   * @param msg The error message.
   */
  public final void yyerror(Location loc, String msg) {
      yylexer.yyerror(loc, msg);
  }

  /**
   * Print an error message via the lexer.
   * @param pos The position associated with the message.
   * @param msg The error message.
   */
  public final void yyerror(Position pos, String msg) {
      yylexer.yyerror(new Location (pos), msg);
  }

  protected final void yycdebug (String s) {
    if (0 < yydebug)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    private Location[] locStack = new Location[16];
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;

    public final void push (int state, Object value, Location loc) {
      height++;
      if (size == height)
        {
          int[] newStateStack = new int[size * 2];
          System.arraycopy (stateStack, 0, newStateStack, 0, height);
          stateStack = newStateStack;
          Location[] newLocStack = new Location[size * 2];
          System.arraycopy (locStack, 0, newLocStack, 0, height);
          locStack = newLocStack;

          Object[] newValueStack = new Object[size * 2];
          System.arraycopy (valueStack, 0, newValueStack, 0, height);
          valueStack = newValueStack;

          size *= 2;
        }

      stateStack[height] = state;
      locStack[height] = loc;
      valueStack[height] = value;
    }

    public final void pop () {
      pop (1);
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (0 < num) {
        java.util.Arrays.fill (valueStack, height - num + 1, height + 1, null);
        java.util.Arrays.fill (locStack, height - num + 1, height + 1, null);
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }


    public final Location locationAt (int i) {
      return locStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out) {
      out.print ("Stack now");

      for (int i = 0; i <= height; i++)
        {
          out.print (' ');
          out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).
   */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).
   */
  public static final int YYABORT = 1;



  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.
   */
  public static final int YYERROR = 2;

  /**
   * Internal return codes that are not supported for user semantic
   * actions.
   */
  private static final int YYERRLAB = 3;
  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;


  private int yyerrstatus_ = 0;


  /**
   * Whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.
   */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  /** Compute post-reduction state.
   * @param yystate   the current state
   * @param yysym     the nonterminal to push on the stack
   */
  private int yyLRGotoState (int yystate, int yysym)
  {
    int yyr = yypgoto_[yysym - YYNTOKENS_] + yystate;
    if (0 <= yyr && yyr <= YYLAST_ && yycheck_[yyr] == yystate)
      return yytable_[yyr];
    else
      return yydefgoto_[yysym - YYNTOKENS_];
  }

  private int yyaction(int yyn, YYStack yystack, int yylen) throws EnvironmentException, TypeException
  {
    /* If YYLEN is nonzero, implement the default value of the action:
       '$$ = $1'.  Otherwise, use the top of the stack.

       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    Object yyval = (0 < yylen) ? yystack.valueAt(yylen - 1) : yystack.valueAt(0);
    Location yyloc = yylloc(yystack, yylen);

    yyReducePrint(yyn, yystack);

    switch (yyn)
      {
          case 28: /* typeDefinition: "type" IDENTIFIER ":=" typeExpr  */
  if (yyn == 28)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":211  */
        {
		typeEnvironment.put(((String)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));
	};
  break;


  case 29: /* constDefinition: "const" IDENTIFIER ":=" constExpr  */
  if (yyn == 29)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":218  */
        {
		constEnvironment.put(((String)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));
	};
  break;


  case 30: /* attributeDefinition: determiner IDENTIFIER ':' typeExpr ';'  */
  if (yyn == 30)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":225  */
        {
		varEnvironment.put(((String)(yystack.valueAt (3))), ((Type)(yystack.valueAt (1))));
	};
  break;


  case 32: /* $@1: %empty  */
  if (yyn == 32)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":233  */
        {
		varEnvironment.put(((String)(yystack.valueAt (3))), new TypeExpr(TType.FUNCTION, ((Type)(yystack.valueAt (1))), new TypeExpr(TType.VOID)));
	};
  break;


  case 34: /* $@2: %empty  */
  if (yyn == 34)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":238  */
        {
		varEnvironment.put(((String)(yystack.valueAt (3))), new TypeExpr(TType.FUNCTION, ((Type)(yystack.valueAt (1))), new TypeExpr(TType.VOID)));
	};
  break;


  case 36: /* $@3: %empty  */
  if (yyn == 36)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":243  */
        {
		varEnvironment.put(((String)(yystack.valueAt (3))), new TypeExpr(TType.FUNCTION, ((Type)(yystack.valueAt (1))), new TypeExpr(TType.VOID)));
	};
  break;


  case 38: /* $@4: %empty  */
  if (yyn == 38)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":248  */
        {
		varEnvironment.put(((String)(yystack.valueAt (3))), new TypeExpr(TType.FUNCTION, ((Type)(yystack.valueAt (1))), new TypeExpr(TType.VOID)));
	};
  break;


  case 40: /* $@5: %empty  */
  if (yyn == 40)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":253  */
        {
		varEnvironment.put(((String)(yystack.valueAt (5))), new TypeExpr(TType.FUNCTION, ((Type)(yystack.valueAt (3))), ((Type)(yystack.valueAt (0)))));
	};
  break;


  case 42: /* $@6: %empty  */
  if (yyn == 42)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":258  */
        {
		varEnvironment.put(((String)(yystack.valueAt (5))), new TypeExpr(TType.FUNCTION, ((Type)(yystack.valueAt (3))), ((Type)(yystack.valueAt (0)))));
	};
  break;


  case 44: /* $@7: %empty  */
  if (yyn == 44)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":263  */
        {
		varEnvironment.put(((String)(yystack.valueAt (5))), new TypeExpr(TType.FUNCTION, ((Type)(yystack.valueAt (3))), ((Type)(yystack.valueAt (0)))));
	};
  break;


  case 46: /* $@8: %empty  */
  if (yyn == 46)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":268  */
        {
		varEnvironment.put(((String)(yystack.valueAt (5))), new TypeExpr(TType.FUNCTION, ((Type)(yystack.valueAt (3))), ((Type)(yystack.valueAt (0)))));
	};
  break;


  case 55: /* user_defined_operators: "&&"  */
  if (yyn == 55)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":288  */
                                {yyval = "&&";};
  break;


  case 56: /* user_defined_operators: "||"  */
  if (yyn == 56)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":289  */
                                {yyval = "||";};
  break;


  case 57: /* user_defined_operators: '!'  */
  if (yyn == 57)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":290  */
                                {yyval = "!";};
  break;


  case 58: /* user_defined_operators: '<'  */
  if (yyn == 58)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":291  */
                                {yyval = "<";};
  break;


  case 59: /* user_defined_operators: "<="  */
  if (yyn == 59)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":292  */
                                {yyval = "<=";};
  break;


  case 60: /* user_defined_operators: '>'  */
  if (yyn == 60)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":293  */
                                {yyval = ">";};
  break;


  case 61: /* user_defined_operators: ">="  */
  if (yyn == 61)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":294  */
                                {yyval = ">=";};
  break;


  case 62: /* user_defined_operators: "=="  */
  if (yyn == 62)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":295  */
                                {yyval = "==";};
  break;


  case 63: /* user_defined_operators: "!="  */
  if (yyn == 63)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":296  */
                                {yyval = "!=";};
  break;


  case 64: /* user_defined_operators: '+'  */
  if (yyn == 64)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":297  */
                                {yyval = "+";};
  break;


  case 65: /* user_defined_operators: '-'  */
  if (yyn == 65)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":298  */
                                {yyval = "-";};
  break;


  case 66: /* user_defined_operators: '*'  */
  if (yyn == 66)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":299  */
                                {yyval = "*";};
  break;


  case 67: /* user_defined_operators: '/'  */
  if (yyn == 67)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":300  */
                                {yyval = "/";};
  break;


  case 68: /* user_defined_operators: '%'  */
  if (yyn == 68)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":301  */
                                {yyval = "%";};
  break;


  case 69: /* user_defined_operators: "++"  */
  if (yyn == 69)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":302  */
                                {yyval = "++";};
  break;


  case 70: /* user_defined_operators: "--"  */
  if (yyn == 70)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":303  */
                                {yyval = "--";};
  break;


  case 71: /* user_defined_operators: '&'  */
  if (yyn == 71)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":304  */
                                {yyval = "&";};
  break;


  case 72: /* user_defined_operators: '|'  */
  if (yyn == 72)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":305  */
                                {yyval = "|";};
  break;


  case 73: /* user_defined_operators: "<<"  */
  if (yyn == 73)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":306  */
                                {yyval = "<<";};
  break;


  case 74: /* user_defined_operators: ">>"  */
  if (yyn == 74)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":307  */
                                {yyval = ">>";};
  break;


  case 75: /* user_defined_operators: ":="  */
  if (yyn == 75)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":308  */
                                {yyval = ":=";};
  break;


  case 76: /* user_defined_operators: "+="  */
  if (yyn == 76)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":309  */
                                {yyval = "+=";};
  break;


  case 77: /* user_defined_operators: "-="  */
  if (yyn == 77)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":310  */
                                {yyval = "-=";};
  break;


  case 78: /* user_defined_operators: "*="  */
  if (yyn == 78)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":311  */
                                {yyval = "*=";};
  break;


  case 79: /* user_defined_operators: "/="  */
  if (yyn == 79)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":312  */
                                {yyval = "/=";};
  break;


  case 80: /* user_defined_operators: "%="  */
  if (yyn == 80)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":313  */
                                {yyval = "%=";};
  break;


  case 81: /* user_defined_operators: "||="  */
  if (yyn == 81)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":314  */
                                        {yyval = "||=";};
  break;


  case 82: /* user_defined_operators: "&&="  */
  if (yyn == 82)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":315  */
                                        {yyval = "&&=";};
  break;


  case 83: /* user_defined_operators: "&="  */
  if (yyn == 83)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":316  */
                                {yyval = "&=";};
  break;


  case 84: /* user_defined_operators: "|="  */
  if (yyn == 84)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":317  */
                                {yyval = "|=";};
  break;


  case 85: /* user_defined_operators: "<<="  */
  if (yyn == 85)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":318  */
                                        {yyval = "<<=";};
  break;


  case 86: /* user_defined_operators: ">>="  */
  if (yyn == 86)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":319  */
                                        {yyval = ">>=";};
  break;


  case 87: /* user_defined_operators: "[]"  */
  if (yyn == 87)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":320  */
                                {yyval = "[]";};
  break;


  case 90: /* typeExpr: "char"  */
  if (yyn == 90)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":329  */
                                                                                                {yyval = new TypeExpr(TType.CHAR);};
  break;


  case 91: /* typeExpr: "integer"  */
  if (yyn == 91)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":330  */
                                                                                        {yyval = new TypeExpr(TType.INTEGER);};
  break;


  case 92: /* typeExpr: "float"  */
  if (yyn == 92)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":331  */
                                                                                                {yyval = new TypeExpr(TType.FLOAT);};
  break;


  case 93: /* typeExpr: "boolean"  */
  if (yyn == 93)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":332  */
                                                                                        {yyval = new TypeExpr(TType.BOOLEAN);};
  break;


  case 94: /* typeExpr: "string"  */
  if (yyn == 94)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":333  */
                                                                                                {yyval = new TypeExpr(TType.STRING);};
  break;


  case 95: /* typeExpr: "enum" '<' typeNames '>'  */
  if (yyn == 95)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":334  */
                                                                                {yyval = new TypeExpr(TType.ENUM, ((Type)(yystack.valueAt (1))));};
  break;


  case 96: /* typeExpr: "range" '<' typeExpr '>'  */
  if (yyn == 96)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":335  */
                                                                                {yyval = new TypeExpr(TType.RANGE, ((Type)(yystack.valueAt (1))));};
  break;


  case 97: /* typeExpr: "list" '<' typeExpr '>'  */
  if (yyn == 97)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":336  */
                                                                {yyval = new TypeExpr(TType.LIST, ((Type)(yystack.valueAt (1))));};
  break;


  case 98: /* typeExpr: "set" '<' typeExpr '>'  */
  if (yyn == 98)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":337  */
                                                                {yyval = new TypeExpr(TType.SET, ((Type)(yystack.valueAt (1))));};
  break;


  case 99: /* typeExpr: "map" '<' typeExpr ',' typeExpr '>'  */
  if (yyn == 99)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":338  */
                                                {yyval = new TypeExpr(TType.MAP, ((Type)(yystack.valueAt (3))), ((Type)(yystack.valueAt (1))));};
  break;


  case 100: /* typeExpr: typePtrExpr  */
  if (yyn == 100)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":339  */
                                                                                {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 101: /* typePtrExpr: IDENTIFIER '<' typeExprs '>'  */
  if (yyn == 101)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":343  */
                                                {yyval = new TypeExpr(TType.CLASS, ((String)(yystack.valueAt (3))), ((Type)(yystack.valueAt (1))));};
  break;


  case 102: /* typePtrExpr: IDENTIFIER  */
  if (yyn == 102)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":344  */
                                                                        {yyval = new TypeExpr(TType.CLASS, ((String)(yystack.valueAt (0))), null);};
  break;


  case 103: /* typeExprs: typeExprs ',' typeExpr  */
  if (yyn == 103)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":348  */
                                                                        {yyval = new TypeExpr(TType.PRODUCT, ((Type)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));};
  break;


  case 104: /* typeExprs: typeExpr  */
  if (yyn == 104)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":349  */
                                                                                        {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 105: /* typeNames: typeNames ',' typeName  */
  if (yyn == 105)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":353  */
                                                                        {yyval = new TypeExpr(TType.PRODUCT, ((Type)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));};
  break;


  case 106: /* typeNames: typeName  */
  if (yyn == 106)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":354  */
                                                                                        {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 107: /* typeName: IDENTIFIER  */
  if (yyn == 107)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":358  */
                                                                                        {yyval = new TypeExpr(TType.NAME, ((String)(yystack.valueAt (0))));};
  break;


  case 108: /* argsDefinition: argsDefinition ',' argDefinition  */
  if (yyn == 108)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":362  */
                                         {yyval = new TypeExpr(TType.PRODUCT, ((Type)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));};
  break;


  case 109: /* argsDefinition: argDefinition  */
  if (yyn == 109)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":363  */
                        {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 110: /* argDefinition: IDENTIFIER ':' typeExpr  */
  if (yyn == 110)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":368  */
        {
		localVarEnvironment.put(((String)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));
		yyval = new TypeExpr(TType.FEATURE, ((String)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));
	};
  break;


  case 114: /* varDefinition: IDENTIFIER ':' typeExpr ';'  */
  if (yyn == 114)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":384  */
                                    {localVarEnvironment.put(((String)(yystack.valueAt (3))), ((Type)(yystack.valueAt (1))));};
  break;


  case 126: /* for_stm: "for" '(' assignedVariable ';' expr ';' expr ')' block  */
  if (yyn == 126)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":405  */
                                                              {
		try{
			Type type=((Type)(yystack.valueAt (4)));
			Type booltype=new TypeExpr(TType.BOOLEAN);
			type.assertEqual(booltype);
		}catch(TypeException e){
			yyerror(yystack.locationAt (8),e.getMessage());
		}
	};
  break;


  case 127: /* for_stm: "for" '(' assignedVariable ":=" constExpr ';' expr ';' expr ')' block  */
  if (yyn == 127)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":414  */
                                                                               {
		try{
        		Type type=((Type)(yystack.valueAt (4)));
        		Type booltype=new TypeExpr(TType.BOOLEAN);
        		type.assertEqual(booltype);
        	}catch(TypeException e){
        		yyerror(yystack.locationAt (10),e.getMessage());
        	}
	};
  break;


  case 128: /* for_stm: "for" '(' IDENTIFIER ':' typeExpr ';' expr ';' expr ')' block  */
  if (yyn == 128)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":423  */
                                                                       {
		try{
                        		Type type=((Type)(yystack.valueAt (4)));
                        		Type booltype=new TypeExpr(TType.BOOLEAN);
                        		type.assertEqual(booltype);
                        		Environment<Type> forVarEnvironment = new MapEnvironment<Type>("for", true);
                        		forVarEnvironment.put(((String)(yystack.valueAt (8))), ((Type)(yystack.valueAt (6))));
                        	}catch(TypeException e){
                        		yyerror(yystack.locationAt (10),e.getMessage());
                        	}
	};
  break;


  case 131: /* simple_stm: assignedVariable ":=" expr  */
  if (yyn == 131)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":439  */
                                   {((Type)(yystack.valueAt (2))).assertEqual(((Type)(yystack.valueAt (0))));};
  break;


  case 152: /* assignedVariable: IDENTIFIER  */
  if (yyn == 152)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":464  */
        {
		yyval = forVarEnvironment.get(((String)(yystack.valueAt (0))));
		if (yyval == null)
			yyval = localVarEnvironment.get(((String)(yystack.valueAt (0))));
		if (yyval == null)
			yyval = varEnvironment.get(((String)(yystack.valueAt (0))));
		if (yyval == null){
			yyerror(yystack.locationAt (0),"unknown variable");
			throw new EnvironmentException("unknown variable " + yyval);
		}
	};
  break;


  case 153: /* assignedVariable: IDENTIFIER '[' args ']'  */
  if (yyn == 153)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":475  */
                                  {yyval = null;};
  break;


  case 154: /* assignedVariable: assignedVariable '.' IDENTIFIER  */
  if (yyn == 154)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":476  */
                                          {yyval = null;};
  break;


  case 155: /* assignedVariable: "this"  */
  if (yyn == 155)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":477  */
                 {yyval = null;};
  break;


  case 156: /* methodName: IDENTIFIER  */
  if (yyn == 156)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":482  */
        {
		yyval = localVarEnvironment.get(((String)(yystack.valueAt (0))));
		if (yyval == null)
			yyval = varEnvironment.get(((String)(yystack.valueAt (0))));
		if (yyval == null){
			yyerror(yystack.locationAt (0),"unknown method name");
			throw new EnvironmentException("unknown method name " + yyval);
		}
	};
  break;


  case 157: /* methodName: assignedVariable '.' IDENTIFIER  */
  if (yyn == 157)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":491  */
                                          {Type type = ((Type)(yystack.valueAt (2))); yyval = null; /*to be completed*/};
  break;


  case 158: /* args: args ',' expr  */
  if (yyn == 158)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":495  */
                      {yyval = new TypeExpr(TType.PRODUCT, ((Type)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));};
  break;


  case 159: /* args: expr  */
  if (yyn == 159)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":496  */
               {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 160: /* constExpr: "null"  */
  if (yyn == 160)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":500  */
                                                                                        {yyval = new TypeExpr(TType.INTEGER);};
  break;


  case 161: /* constExpr: NUMBER_INTEGER  */
  if (yyn == 161)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":501  */
                                                                                {yyval = new TypeExpr(TType.INTEGER);};
  break;


  case 162: /* constExpr: NUMBER_FLOAT  */
  if (yyn == 162)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":502  */
                                                                                {yyval = new TypeExpr(TType.FLOAT);};
  break;


  case 163: /* constExpr: LITTERAL_CHAR  */
  if (yyn == 163)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":503  */
                                                                                {yyval = new TypeExpr(TType.CHAR);};
  break;


  case 164: /* constExpr: LITTERAL_STRING  */
  if (yyn == 164)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":504  */
                                                                                {yyval = new TypeExpr(TType.STRING);};
  break;


  case 165: /* constExpr: '[' NUMBER_INTEGER ".." NUMBER_INTEGER ']'  */
  if (yyn == 165)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":505  */
                                                        {yyval = new TypeExpr(TType.RANGE);};
  break;


  case 166: /* expr: constExpr  */
  if (yyn == 166)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":509  */
                                                        {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 167: /* expr: assignedVariable  */
  if (yyn == 167)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":510  */
                                                {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 168: /* expr: methodName '(' args ')'  */
  if (yyn == 168)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":511  */
                                        {Type type = ((Type)(yystack.valueAt (3))); if (type != null) yyval = type.getRight(); else yyval = null;};
  break;


  case 169: /* expr: "new" typePtrExpr '(' args_opt ')'  */
  if (yyn == 169)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":512  */
                                                                {yyval = ((Type)(yystack.valueAt (3)));};
  break;


  case 170: /* expr: expr "&&" expr  */
  if (yyn == 170)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":513  */
                                                        {yyval = ((Type)(yystack.valueAt (2)));};
  break;


  case 171: /* expr: expr "||" expr  */
  if (yyn == 171)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":514  */
                                                        {yyval = ((Type)(yystack.valueAt (2)));};
  break;


  case 172: /* expr: '!' expr  */
  if (yyn == 172)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":515  */
                                                        {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 173: /* expr: expr '<' expr  */
  if (yyn == 173)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":516  */
                                                {yyval = new TypeExpr(TType.BOOLEAN);};
  break;


  case 174: /* expr: expr "<=" expr  */
  if (yyn == 174)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":517  */
                                                        {yyval = new TypeExpr(TType.BOOLEAN);};
  break;


  case 175: /* expr: expr '>' expr  */
  if (yyn == 175)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":518  */
                                                {yyval = new TypeExpr(TType.BOOLEAN);};
  break;


  case 176: /* expr: expr ">=" expr  */
  if (yyn == 176)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":519  */
                                                        {yyval = new TypeExpr(TType.BOOLEAN);};
  break;


  case 177: /* expr: expr "==" expr  */
  if (yyn == 177)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":520  */
                                                        {yyval = new TypeExpr(TType.BOOLEAN);};
  break;


  case 178: /* expr: expr "!=" expr  */
  if (yyn == 178)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":521  */
                                                        {yyval = new TypeExpr(TType.BOOLEAN);};
  break;


  case 179: /* expr: expr '+' expr  */
  if (yyn == 179)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":522  */
                                                {yyval = ((Type)(yystack.valueAt (2)));};
  break;


  case 180: /* expr: expr '-' expr  */
  if (yyn == 180)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":523  */
                                        {yyval = ((Type)(yystack.valueAt (2)));};
  break;


  case 181: /* expr: '-' expr  */
  if (yyn == 181)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":524  */
                                                {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 182: /* expr: expr '*' expr  */
  if (yyn == 182)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":525  */
                                                {yyval = ((Type)(yystack.valueAt (2)));};
  break;


  case 183: /* expr: expr '/' expr  */
  if (yyn == 183)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":526  */
                                        {yyval = ((Type)(yystack.valueAt (2)));};
  break;


  case 184: /* expr: expr '%' expr  */
  if (yyn == 184)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":527  */
                                        {yyval = ((Type)(yystack.valueAt (2)));};
  break;


  case 185: /* expr: expr "++"  */
  if (yyn == 185)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":528  */
                                        {yyval = ((Type)(yystack.valueAt (1)));};
  break;


  case 186: /* expr: expr "--"  */
  if (yyn == 186)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":529  */
                                        {yyval = ((Type)(yystack.valueAt (1)));};
  break;


  case 187: /* expr: "++" expr  */
  if (yyn == 187)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":530  */
                                                        {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 188: /* expr: "--" expr  */
  if (yyn == 188)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":531  */
                                                                {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 189: /* expr: expr '&' expr  */
  if (yyn == 189)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":532  */
                                        {yyval = ((Type)(yystack.valueAt (2)));};
  break;


  case 190: /* expr: expr '|' expr  */
  if (yyn == 190)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":533  */
                                        {yyval = ((Type)(yystack.valueAt (2)));};
  break;


  case 191: /* expr: expr "<<" expr  */
  if (yyn == 191)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":534  */
                                                {yyval = ((Type)(yystack.valueAt (2)));};
  break;


  case 192: /* expr: expr ">>" expr  */
  if (yyn == 192)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":535  */
                                                {yyval = ((Type)(yystack.valueAt (2)));};
  break;


  case 193: /* expr: '(' expr ')'  */
  if (yyn == 193)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":536  */
                                        {yyval = ((Type)(yystack.valueAt (1)));};
  break;


  case 194: /* args_opt: %empty  */
  if (yyn == 194)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":540  */
               {yyval = null;};
  break;


  case 195: /* args_opt: args  */
  if (yyn == 195)
    /* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":541  */
               {yyval = ((Type)(yystack.valueAt (0)));};
  break;



/* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/src/fr/ubordeaux/deptinfo/compilation/lea/parser/Parser.java":1812  */

        default: break;
      }

    yySymbolPrint("-> $$ =", SymbolKind.get(yyr1_[yyn]), yyval, yyloc);

    yystack.pop(yylen);
    yylen = 0;
    /* Shift the result of the reduction.  */
    int yystate = yyLRGotoState(yystack.stateAt(0), yyr1_[yyn]);
    yystack.push(yystate, yyval, yyloc);
    return YYNEWSTATE;
  }


  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yySymbolPrint(String s, SymbolKind yykind,
                             Object yyvalue, Location yylocation) {
      if (0 < yydebug) {
          yycdebug(s
                   + (yykind.getCode() < YYNTOKENS_ ? " token " : " nterm ")
                   + yykind.getName() + " ("
                   + yylocation + ": "
                   + (yyvalue == null ? "(null)" : yyvalue.toString()) + ")");
      }
  }


  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse() throws java.io.IOException, EnvironmentException, TypeException

  {
    /* @$.  */
    Location yyloc;


    /* Lookahead token kind.  */
    int yychar = YYEMPTY_;
    /* Lookahead symbol kind.  */
    SymbolKind yytoken = null;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;
    YYStack yystack = new YYStack ();
    int label = YYNEWSTATE;


    /* The location where the error started.  */
    Location yyerrloc = null;

    /* Location. */
    Location yylloc = new Location (null, null);

    /* Semantic value of the lookahead.  */
    Object yylval = null;

    yycdebug ("Starting parse");
    yyerrstatus_ = 0;
    yynerrs = 0;

    /* Initialize the stack.  */
    yystack.push (yystate, yylval, yylloc);



    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
           pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate);
        if (0 < yydebug)
          yystack.print (yyDebugStream);

        /* Accept?  */
        if (yystate == YYFINAL_)
          return true;

        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyPactValueIsDefault (yyn))
          {
            label = YYDEFAULT;
            break;
          }

        /* Read a lookahead token.  */
        if (yychar == YYEMPTY_)
          {

            yycdebug ("Reading a token");
            yychar = yylexer.yylex ();
            yylval = yylexer.getLVal();
            yylloc = new Location(yylexer.getStartPos(),
                                          yylexer.getEndPos());

          }

        /* Convert token to internal form.  */
        yytoken = yytranslate_ (yychar);
        yySymbolPrint("Next token is", yytoken,
                      yylval, yylloc);

        if (yytoken == SymbolKind.S_YYerror)
          {
            // The scanner already issued an error message, process directly
            // to error recovery.  But do not keep the error token as
            // lookahead, it is too special and may lead us to an endless
            // loop in error recovery. */
            yychar = Lexer.YYUNDEF;
            yytoken = SymbolKind.S_YYUNDEF;
            yyerrloc = yylloc;
            label = YYERRLAB1;
          }
        else
          {
            /* If the proper action on seeing token YYTOKEN is to reduce or to
               detect an error, take that action.  */
            yyn += yytoken.getCode();
            if (yyn < 0 || YYLAST_ < yyn || yycheck_[yyn] != yytoken.getCode())
              label = YYDEFAULT;

            /* <= 0 means reduce or error.  */
            else if ((yyn = yytable_[yyn]) <= 0)
              {
                if (yyTableValueIsError (yyn))
                  label = YYERRLAB;
                else
                  {
                    yyn = -yyn;
                    label = YYREDUCE;
                  }
              }

            else
              {
                /* Shift the lookahead token.  */
                yySymbolPrint("Shifting", yytoken,
                              yylval, yylloc);

                /* Discard the token being shifted.  */
                yychar = YYEMPTY_;

                /* Count tokens shifted since error; after three, turn off error
                   status.  */
                if (yyerrstatus_ > 0)
                  --yyerrstatus_;

                yystate = yyn;
                yystack.push (yystate, yylval, yylloc);
                label = YYNEWSTATE;
              }
          }
        break;

      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYERRLAB;
        else
          label = YYREDUCE;
        break;

      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction(yyn, yystack, yylen);
        yystate = yystack.stateAt (0);
        break;

      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYERRLAB:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
            ++yynerrs;
            if (yychar == YYEMPTY_)
              yytoken = null;
            yyreportSyntaxError (new Context (yystack, yytoken, yylloc));
          }

        yyerrloc = yylloc;
        if (yyerrstatus_ == 3)
          {
            /* If just tried and failed to reuse lookahead token after an
               error, discard it.  */

            if (yychar <= Lexer.YYEOF)
              {
                /* Return failure if at end of input.  */
                if (yychar == Lexer.YYEOF)
                  return false;
              }
            else
              yychar = YYEMPTY_;
          }

        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `-------------------------------------------------*/
      case YYERROR:
        yyerrloc = yystack.locationAt (yylen - 1);
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;

      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;       /* Each real token shifted decrements this.  */

        // Pop stack until we find a state that shifts the error token.
        for (;;)
          {
            yyn = yypact_[yystate];
            if (!yyPactValueIsDefault (yyn))
              {
                yyn += SymbolKind.S_YYerror.getCode();
                if (0 <= yyn && yyn <= YYLAST_
                    && yycheck_[yyn] == SymbolKind.S_YYerror.getCode())
                  {
                    yyn = yytable_[yyn];
                    if (0 < yyn)
                      break;
                  }
              }

            /* Pop the current state because it cannot handle the
             * error token.  */
            if (yystack.height == 0)
              return false;


            yyerrloc = yystack.locationAt (0);
            yystack.pop ();
            yystate = yystack.stateAt (0);
            if (0 < yydebug)
              yystack.print (yyDebugStream);
          }

        if (label == YYABORT)
          /* Leave the switch.  */
          break;


        /* Muck with the stack to setup for yylloc.  */
        yystack.push (0, null, yylloc);
        yystack.push (0, null, yyerrloc);
        yyloc = yylloc (yystack, 2);
        yystack.pop (2);

        /* Shift the error token.  */
        yySymbolPrint("Shifting", SymbolKind.get(yystos_[yyn]),
                      yylval, yyloc);

        yystate = yyn;
        yystack.push (yyn, yylval, yyloc);
        label = YYNEWSTATE;
        break;

        /* Accept.  */
      case YYACCEPT:
        return true;

        /* Abort.  */
      case YYABORT:
        return false;
      }
}




  /**
   * Information needed to get the list of expected tokens and to forge
   * a syntax error diagnostic.
   */
  public static final class Context
  {
    Context (YYStack stack, SymbolKind token, Location loc)
    {
      yystack = stack;
      yytoken = token;
      yylocation = loc;
    }

    private YYStack yystack;


    /**
     * The symbol kind of the lookahead token.
     */
    public final SymbolKind getToken ()
    {
      return yytoken;
    }

    private SymbolKind yytoken;

    /**
     * The location of the lookahead.
     */
    public final Location getLocation ()
    {
      return yylocation;
    }

    private Location yylocation;
    static final int NTOKENS = Parser.YYNTOKENS_;

    /**
     * Put in YYARG at most YYARGN of the expected tokens given the
     * current YYCTX, and return the number of tokens stored in YYARG.  If
     * YYARG is null, return the number of expected tokens (guaranteed to
     * be less than YYNTOKENS).
     */
    int getExpectedTokens (SymbolKind yyarg[], int yyargn)
    {
      return getExpectedTokens (yyarg, 0, yyargn);
    }

    int getExpectedTokens (SymbolKind yyarg[], int yyoffset, int yyargn)
    {
      int yycount = yyoffset;
      int yyn = yypact_[this.yystack.stateAt (0)];
      if (!yyPactValueIsDefault (yyn))
        {
          /* Start YYX at -YYN if negative to avoid negative
             indexes in YYCHECK.  In other words, skip the first
             -YYN actions for this state because they are default
             actions.  */
          int yyxbegin = yyn < 0 ? -yyn : 0;
          /* Stay within bounds of both yycheck and yytname.  */
          int yychecklim = YYLAST_ - yyn + 1;
          int yyxend = yychecklim < NTOKENS ? yychecklim : NTOKENS;
          for (int yyx = yyxbegin; yyx < yyxend; ++yyx)
            if (yycheck_[yyx + yyn] == yyx && yyx != SymbolKind.S_YYerror.getCode()
                && !yyTableValueIsError(yytable_[yyx + yyn]))
              {
                if (yyarg == null)
                  yycount += 1;
                else if (yycount == yyargn)
                  return 0; // FIXME: this is incorrect.
                else
                  yyarg[yycount++] = SymbolKind.get(yyx);
              }
        }
      if (yyarg != null && yycount == yyoffset && yyoffset < yyargn)
        yyarg[yycount] = null;
      return yycount - yyoffset;
    }
  }



  /**
   * Build and emit a "syntax error" message in a user-defined way.
   *
   * @param ctx  The context of the error.
   */
  private void yyreportSyntaxError(Context yyctx) {
      yylexer.reportSyntaxError(yyctx);
  }

  /**
   * Whether the given <code>yypact_</code> value indicates a defaulted state.
   * @param yyvalue   the value to check
   */
  private static boolean yyPactValueIsDefault (int yyvalue)
  {
    return yyvalue == yypact_ninf_;
  }

  /**
   * Whether the given <code>yytable_</code>
   * value indicates a syntax error.
   * @param yyvalue the value to check
   */
  private static boolean yyTableValueIsError (int yyvalue)
  {
    return yyvalue == yytable_ninf_;
  }

  private static final short yypact_ninf_ = -249;
  private static final short yytable_ninf_ = -158;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short[] yypact_ = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
      17,    27,    60,   -15,  -249,  -249,   -23,    -8,    26,  -249,
       3,  -249,    31,    85,  -249,   130,  -249,    70,   100,   135,
     100,    43,   105,    89,   295,  -249,  -249,  -249,   126,   111,
      70,  -249,  -249,  -249,  -249,   -28,   141,   131,  -249,   108,
     113,  -249,   -27,   220,   155,  -249,  -249,  -249,  -249,  -249,
    -249,  -249,  -249,  -249,  -249,  -249,  -249,  -249,  -249,  -249,
    -249,  -249,  -249,  -249,  -249,  -249,  -249,  -249,  -249,  -249,
    -249,  -249,  -249,  -249,  -249,  -249,  -249,  -249,   134,   224,
    -249,  -249,  -249,  -249,   -77,    78,   100,   100,   100,    70,
     162,   164,   145,    75,   139,     2,  -249,   155,   982,   982,
     155,   168,   170,   -56,  -249,  -249,   149,   146,   147,  -249,
    -249,  -249,  -249,  -249,  -249,   172,  -249,   982,   155,   154,
      58,  -249,  -249,   169,  -249,  -249,   193,   199,   200,   201,
    -249,   204,  -249,  -249,   152,    63,   189,   190,  -249,  -249,
     155,   155,   267,  -249,  -249,  -249,  -249,   195,   221,   982,
     982,   982,   982,   982,  -249,   197,   155,   155,    64,    80,
     218,   935,   982,  -249,   -45,  -249,   214,   202,   236,   241,
    -249,    39,   154,   227,    87,    97,   229,   230,   237,  -249,
    -249,   979,     6,    53,   228,   233,    34,  -249,   242,   243,
     246,    44,  -249,  -249,   923,  -249,  -249,   250,    65,   254,
     256,  -249,   221,  -249,   982,  -249,  -249,  -249,   982,  -249,
    -249,   258,   259,   982,  -249,  -249,    45,   284,     8,    67,
     257,   -35,    34,    34,    34,    34,   285,    34,    34,    34,
     265,   261,  -249,   828,    34,    34,    34,   982,    34,  -249,
    -249,  -249,    34,    34,    34,    34,    34,    34,    34,    34,
      34,    34,    34,    34,  -249,  -249,   301,    34,   154,   277,
    -249,   302,  -249,   982,   154,   286,   288,   290,  -249,  -249,
      -2,    -1,    34,   328,   251,   345,    -7,    -7,   303,   852,
      -7,   372,    34,  -249,  -249,    34,    34,    34,    34,    34,
      34,    34,    34,    34,    34,    34,    34,    34,    34,    34,
      34,    34,   391,   421,   467,   305,   -41,   828,   828,   828,
     828,   828,   828,   828,   828,   828,   828,   828,   828,   828,
     306,   104,  -249,  -249,  -249,   308,  -249,  -249,  -249,    34,
     982,    75,    34,    34,   751,  -249,   979,  -249,    34,  -249,
     125,   852,   840,   163,   163,   864,   864,   864,   864,   864,
     864,    69,    69,    25,    25,    25,     1,   163,  -249,  -249,
     979,  -249,    34,  -249,  -249,   154,   309,   497,   310,   317,
     516,   638,  -249,   367,   324,   321,  -249,  -249,   828,  -249,
    -249,   325,    34,    34,   979,    34,   979,  -249,  -249,   668,
     719,  -249,   543,  -249,    34,    34,   154,   592,   619,  -249,
     154,   154,  -249,  -249
    };
  }

/* YYDEFACT[STATE-NUM] -- Default reduction number in state STATE-NUM.
   Performed when YYTABLE does not specify something else to do.  Zero
   means the default is an error.  */
  private static final short[] yydefact_ = yydefact_init();
  private static final short[] yydefact_init()
  {
    return new short[]
    {
       0,     0,     0,     0,     3,     1,     0,     0,     0,     5,
       2,     8,     0,    12,     6,    16,     7,    48,     0,    14,
       0,     0,     0,     0,     0,    49,    51,    50,     0,     0,
      48,    24,    25,    26,    27,    52,    20,    13,    19,    48,
       0,    17,     0,     0,     0,    75,    76,    77,    78,    79,
      80,    81,    82,    83,    84,    85,    86,    69,    70,    55,
      56,    73,    74,    62,    59,    61,    63,    57,    58,    60,
      64,    65,    66,    67,    68,    72,    71,    87,     0,     0,
      10,    23,    54,    53,     0,     0,     0,     0,     0,    48,
       0,     0,     0,     0,     0,     0,   109,     0,     0,     0,
       0,     0,     0,     0,    18,    15,     0,     0,     0,    11,
     160,   164,   161,   163,   162,     0,    29,     0,     0,     0,
       0,    93,    90,     0,    92,    91,     0,     0,     0,     0,
      94,   102,    28,   100,     0,     0,     0,     0,    21,     9,
       0,     0,     0,   110,   108,   112,    31,     0,     0,     0,
       0,     0,     0,     0,    30,    32,     0,     0,     0,     0,
       0,     0,     0,   107,     0,   106,     0,     0,     0,     0,
     104,     0,     0,     0,     0,     0,     0,     0,     0,   149,
     150,     0,     0,     0,     0,     0,     0,   155,     0,     0,
       0,   152,   125,   113,     0,   116,   118,     0,     0,     0,
      44,    95,     0,    97,     0,    96,    98,   101,     0,    33,
      35,     0,    36,     0,    88,   165,   152,     0,     0,     0,
     152,     0,     0,     0,     0,     0,     0,     0,     0,     0,
     167,     0,   166,   151,     0,     0,     0,     0,     0,   111,
     115,   117,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,   132,   133,     0,     0,     0,     0,
     105,     0,   103,     0,     0,     0,     0,     0,   130,   129,
     152,     0,     0,     0,     0,     0,   187,   188,     0,   172,
     181,     0,     0,   185,   186,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   159,   131,   134,
     135,   136,   137,   138,   139,   140,   141,   142,   143,   144,
     154,     0,    45,    47,    99,    40,    37,    39,    89,     0,
       0,     0,     0,     0,     0,   154,     0,   146,   194,   193,
       0,   170,   171,   191,   192,   177,   174,   176,   178,   173,
     175,   179,   180,   182,   183,   184,   190,   189,   147,   148,
       0,   114,     0,   153,   145,     0,     0,     0,     0,     0,
       0,     0,   124,   119,   195,     0,   168,   121,   158,    41,
      43,     0,     0,     0,     0,     0,     0,   169,   122,     0,
       0,   123,     0,   120,     0,     0,     0,     0,     0,   126,
       0,     0,   128,   127
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short[] yypgoto_ = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
    -249,  -249,  -249,  -249,  -249,   409,  -249,  -249,  -249,   335,
      23,   -25,  -249,  -249,  -249,  -249,  -249,  -249,  -249,  -249,
    -249,  -249,  -249,  -249,  -249,   383,  -249,  -249,  -249,   -95,
     205,  -249,  -249,   231,   187,   314,  -119,  -249,  -249,  -249,
    -165,  -249,  -249,  -158,  -155,  -248,   -92,   -36,  -249
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final short[] yydefgoto_ = yydefgoto_init();
  private static final short[] yydefgoto_init()
  {
    return new short[]
    {
       0,     2,     3,     9,    10,    11,    19,    40,    21,    37,
      38,    29,    30,    31,    32,    33,    34,   172,   173,   264,
     265,   365,   366,   258,   259,    35,    85,    78,    92,   132,
     133,   171,   164,   165,    95,    96,   192,   161,   193,   194,
     195,   196,   197,   230,   231,   306,   232,   307,   375
    };
  }

/* YYTABLE[YYPACT[STATE-NUM]] -- What to do in state STATE-NUM.  If
   positive, shift that token.  If negative, reduce the rule whose
   number is the opposite.  If YYTABLE_NINF, syntax error.  */
  private static final short[] yytable_ = yytable_init();
  private static final short[] yytable_init()
  {
    return new short[]
    {
     146,   116,   331,   198,   134,    81,   199,   218,   268,   321,
      82,   272,   287,   288,     6,    90,   217,    99,     1,   100,
     287,   288,   143,   198,   138,   221,   199,     4,    12,   240,
       7,    91,     6,     8,   340,   201,   198,    87,    83,   199,
     283,   284,    84,    41,   287,   288,    -4,    13,   202,   224,
     225,     8,   362,   209,   166,   167,   168,   169,   170,   363,
       5,   271,    -4,    14,   106,    -4,   273,   200,   242,   243,
     244,   245,   246,   247,   248,   249,   250,   251,   252,   253,
     254,   255,   300,   301,   283,   284,   226,   110,   287,   288,
     374,   301,   330,   332,   333,   118,    15,   238,   187,   119,
     273,    22,   219,   269,   216,   111,   112,   113,   114,   261,
     104,   105,   227,   262,   300,   301,   228,   187,   266,   207,
     101,    23,    17,   220,    24,    25,    26,    27,   110,    18,
     229,   187,   208,   115,    42,    28,   102,   270,   237,   322,
    -156,  -156,   305,   238,   238,   326,   111,   112,   113,   114,
     233,   118,   297,   298,   299,   147,   118,   118,   300,   301,
     155,   176,   -22,    25,    26,    27,   256,    20,   325,   372,
      36,   373,    39,   118,   115,    43,   198,   177,   198,   199,
     118,   199,   287,   288,   211,    44,   274,   275,   276,   277,
     118,   279,   280,   281,   212,   377,    79,   362,   302,   303,
     304,   364,   198,    80,    89,   199,   308,   309,   310,   311,
     312,   313,   314,   315,   316,   317,   318,   319,   362,   391,
      86,   393,   376,    93,    87,    94,   198,    98,   198,   199,
      97,   199,   107,   117,   108,   368,   334,   109,   136,   369,
     137,   139,   140,   141,   142,   145,   379,   154,   148,   341,
     342,   343,   344,   345,   346,   347,   348,   349,   350,   351,
     352,   353,   354,   355,   356,   357,   283,   284,   285,   286,
     287,   288,   149,   289,   290,   291,   292,   399,   150,   151,
     152,   402,   403,   153,   120,   156,   157,   135,   160,   162,
     178,   163,   -34,   367,   203,   204,   370,   371,    45,    46,
      47,    48,    49,    50,    51,    52,    53,    54,    55,    56,
      57,    58,    59,    60,    61,    62,   205,    63,    64,    65,
      66,   206,   210,   213,   222,   214,   378,   158,   159,   223,
     293,   294,   295,   296,   297,   298,   299,   215,   234,   235,
     300,   301,   236,   174,   175,   241,   389,   390,   336,   392,
     257,   -46,   263,   267,   -38,   131,   238,   282,   397,   398,
     283,   284,   285,   286,   287,   288,   256,   289,   290,   291,
     292,   320,   323,    67,    68,    69,    70,    71,    72,    73,
      74,   327,   324,   328,    75,    76,   329,   283,   284,   285,
     286,   287,   288,    77,   289,   290,   291,   292,   335,   338,
     361,   386,  -157,   -42,   380,   382,   283,   284,   285,   286,
     287,   288,   383,   289,   290,   291,   292,   362,   387,    16,
     388,   103,    88,     0,   293,   294,   295,   296,   297,   298,
     299,   278,   144,   260,   300,   301,   283,   284,   285,   286,
     287,   288,   337,   289,   290,   291,   292,     0,     0,     0,
       0,   293,   294,   295,   296,   297,   298,   299,     0,     0,
       0,   300,   301,     0,     0,     0,     0,     0,     0,   339,
     293,   294,   295,   296,   297,   298,   299,     0,     0,     0,
     300,   301,   283,   284,   285,   286,   287,   288,   358,   289,
     290,   291,   292,     0,     0,     0,     0,     0,     0,     0,
     293,   294,   295,   296,   297,   298,   299,     0,     0,     0,
     300,   301,   283,   284,   285,   286,   287,   288,   359,   289,
     290,   291,   292,     0,     0,     0,     0,     0,     0,     0,
       0,   283,   284,   285,   286,   287,   288,     0,   289,   290,
     291,   292,     0,     0,     0,     0,   293,   294,   295,   296,
     297,   298,   299,     0,     0,     0,   300,   301,   283,   284,
     285,   286,   287,   288,   360,   289,   290,   291,   292,     0,
       0,     0,     0,     0,     0,     0,   293,   294,   295,   296,
     297,   298,   299,     0,     0,     0,   300,   301,     0,     0,
       0,     0,     0,     0,   381,   293,   294,   295,   296,   297,
     298,   299,     0,     0,     0,   300,   301,   283,   284,   285,
     286,   287,   288,   384,   289,   290,   291,   292,     0,     0,
       0,     0,   293,   294,   295,   296,   297,   298,   299,     0,
       0,     0,   300,   301,   283,   284,   285,   286,   287,   288,
     396,   289,   290,   291,   292,     0,     0,     0,     0,     0,
       0,     0,     0,   283,   284,   285,   286,   287,   288,     0,
     289,   290,   291,   292,     0,     0,     0,     0,     0,     0,
       0,   293,   294,   295,   296,   297,   298,   299,     0,     0,
       0,   300,   301,   283,   284,   285,   286,   287,   288,   400,
     289,   290,   291,   292,     0,     0,     0,     0,   293,   294,
     295,   296,   297,   298,   299,     0,     0,     0,   300,   301,
       0,     0,     0,     0,     0,     0,   401,   293,   294,   295,
     296,   297,   298,   299,     0,     0,     0,   300,   301,     0,
       0,     0,     0,   385,   283,   284,   285,   286,   287,   288,
       0,   289,   290,   291,   292,     0,     0,   293,   294,   295,
     296,   297,   298,   299,     0,     0,     0,   300,   301,     0,
       0,     0,     0,   394,     0,     0,   283,   284,   285,   286,
     287,   288,     0,   289,   290,   291,   292,     0,   179,     0,
       0,     0,     0,   180,   181,     0,     0,     0,     0,     0,
       0,   182,   183,     0,   184,     0,     0,     0,   293,   294,
     295,   296,   297,   298,   299,     0,     0,     0,   300,   301,
       0,   185,   186,     0,   395,   187,     0,     0,   188,   189,
     190,   216,     0,     0,     0,     0,     0,     0,     0,     0,
     293,   294,   295,   296,   297,   298,   299,     0,     0,     0,
     300,   301,   145,   283,   284,   285,   286,   287,   288,     0,
     289,   290,   291,   292,     0,   283,   284,   285,     0,   287,
     288,     0,   289,   290,   291,   292,     0,   283,   284,     0,
       0,   287,   288,     0,   289,   290,   291,   292,     0,   283,
     284,     0,     0,   287,   288,     0,  -158,  -158,  -158,  -158,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   293,   294,   295,
     296,   297,   298,   299,     0,     0,     0,   300,   301,   293,
     294,   295,   296,   297,   298,   299,     0,     0,     0,   300,
     301,   293,   294,   295,   296,   297,   298,   299,     0,     0,
       0,   300,   301,  -158,  -158,   295,   296,   297,   298,   299,
     179,     0,     0,   300,   301,   180,   181,     0,     0,     0,
       0,     0,   179,   182,   183,     0,   184,   180,   181,     0,
       0,     0,     0,     0,     0,   182,   183,     0,   184,     0,
       0,     0,     0,   185,   186,     0,     0,   187,     0,     0,
     188,   189,   190,   216,     0,   185,   186,     0,     0,   187,
       0,     0,   188,   189,   190,   191,   179,     0,   121,     0,
     122,   180,   181,     0,   145,   239,     0,   123,     0,   182,
     183,   124,   184,     0,     0,     0,   145,     0,     0,   125,
       0,   126,   127,     0,     0,     0,     0,     0,     0,   185,
     186,   128,     0,   187,   129,   130,   188,   189,   190,   216,
       0,     0,   131,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
     145
    };
  }

private static final short[] yycheck_ = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
    {
     119,    93,     3,   161,    99,    30,   161,     1,     0,   257,
      38,    46,    19,    20,    29,    42,   181,    94,     1,    96,
      19,    20,   117,   181,    80,   183,   181,     0,    51,   194,
      45,    58,    29,    48,   282,    80,   194,    93,    66,   194,
      15,    16,    70,    20,    19,    20,    29,    70,    93,    15,
      16,    48,    93,   172,   149,   150,   151,   152,   153,   100,
       0,   219,    45,    71,    89,    48,   101,   162,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    89,    90,    15,    16,    52,    53,    19,    20,
     338,    90,    94,    94,    95,    93,    70,    99,    64,    97,
     101,    31,    96,    95,    70,    71,    72,    73,    74,   204,
      87,    88,    78,   208,    89,    90,    82,    64,   213,    80,
      42,    51,    91,    70,    54,    55,    56,    57,    53,    44,
      96,    64,    93,    99,    91,    65,    58,    70,    94,   258,
      96,    96,   237,    99,    99,   264,    71,    72,    73,    74,
     186,    93,    83,    84,    85,    97,    93,    93,    89,    90,
      97,    97,    92,    55,    56,    57,   101,    37,   263,   334,
      70,   336,    37,    93,    99,    70,   334,    97,   336,   334,
      93,   336,    19,    20,    97,    96,   222,   223,   224,   225,
      93,   227,   228,   229,    97,   360,    70,    93,   234,   235,
     236,    97,   360,    92,    91,   360,   242,   243,   244,   245,
     246,   247,   248,   249,   250,   251,   252,   253,    93,   384,
      79,   386,    97,     3,    93,    70,   384,     3,   386,   384,
      96,   386,    70,    94,    70,   330,   272,    92,    70,   331,
      70,    92,    96,    96,    72,    91,   365,    95,    79,   285,
     286,   287,   288,   289,   290,   291,   292,   293,   294,   295,
     296,   297,   298,   299,   300,   301,    15,    16,    17,    18,
      19,    20,    79,    22,    23,    24,    25,   396,    79,    79,
      79,   400,   401,    79,    97,    96,    96,   100,    21,    94,
      72,    70,    95,   329,    80,    93,   332,   333,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    80,    22,    23,    24,
      25,    80,    95,    94,    96,    95,   362,   140,   141,    96,
      79,    80,    81,    82,    83,    84,    85,   100,    96,    96,
      89,    90,    96,   156,   157,    95,   382,   383,    97,   385,
      96,    95,    94,    69,    95,    70,    99,    96,   394,   395,
      15,    16,    17,    18,    19,    20,   101,    22,    23,    24,
      25,    70,    95,    78,    79,    80,    81,    82,    83,    84,
      85,    95,    80,    95,    89,    90,    96,    15,    16,    17,
      18,    19,    20,    98,    22,    23,    24,    25,    70,    96,
      95,    34,    96,    95,    95,    95,    15,    16,    17,    18,
      19,    20,    95,    22,    23,    24,    25,    93,    97,    10,
      95,    86,    39,    -1,    79,    80,    81,    82,    83,    84,
      85,   226,   118,   202,    89,    90,    15,    16,    17,    18,
      19,    20,    97,    22,    23,    24,    25,    -1,    -1,    -1,
      -1,    79,    80,    81,    82,    83,    84,    85,    -1,    -1,
      -1,    89,    90,    -1,    -1,    -1,    -1,    -1,    -1,    97,
      79,    80,    81,    82,    83,    84,    85,    -1,    -1,    -1,
      89,    90,    15,    16,    17,    18,    19,    20,    97,    22,
      23,    24,    25,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      79,    80,    81,    82,    83,    84,    85,    -1,    -1,    -1,
      89,    90,    15,    16,    17,    18,    19,    20,    97,    22,
      23,    24,    25,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    15,    16,    17,    18,    19,    20,    -1,    22,    23,
      24,    25,    -1,    -1,    -1,    -1,    79,    80,    81,    82,
      83,    84,    85,    -1,    -1,    -1,    89,    90,    15,    16,
      17,    18,    19,    20,    97,    22,    23,    24,    25,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    79,    80,    81,    82,
      83,    84,    85,    -1,    -1,    -1,    89,    90,    -1,    -1,
      -1,    -1,    -1,    -1,    97,    79,    80,    81,    82,    83,
      84,    85,    -1,    -1,    -1,    89,    90,    15,    16,    17,
      18,    19,    20,    97,    22,    23,    24,    25,    -1,    -1,
      -1,    -1,    79,    80,    81,    82,    83,    84,    85,    -1,
      -1,    -1,    89,    90,    15,    16,    17,    18,    19,    20,
      97,    22,    23,    24,    25,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    15,    16,    17,    18,    19,    20,    -1,
      22,    23,    24,    25,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    79,    80,    81,    82,    83,    84,    85,    -1,    -1,
      -1,    89,    90,    15,    16,    17,    18,    19,    20,    97,
      22,    23,    24,    25,    -1,    -1,    -1,    -1,    79,    80,
      81,    82,    83,    84,    85,    -1,    -1,    -1,    89,    90,
      -1,    -1,    -1,    -1,    -1,    -1,    97,    79,    80,    81,
      82,    83,    84,    85,    -1,    -1,    -1,    89,    90,    -1,
      -1,    -1,    -1,    95,    15,    16,    17,    18,    19,    20,
      -1,    22,    23,    24,    25,    -1,    -1,    79,    80,    81,
      82,    83,    84,    85,    -1,    -1,    -1,    89,    90,    -1,
      -1,    -1,    -1,    95,    -1,    -1,    15,    16,    17,    18,
      19,    20,    -1,    22,    23,    24,    25,    -1,    27,    -1,
      -1,    -1,    -1,    32,    33,    -1,    -1,    -1,    -1,    -1,
      -1,    40,    41,    -1,    43,    -1,    -1,    -1,    79,    80,
      81,    82,    83,    84,    85,    -1,    -1,    -1,    89,    90,
      -1,    60,    61,    -1,    95,    64,    -1,    -1,    67,    68,
      69,    70,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      79,    80,    81,    82,    83,    84,    85,    -1,    -1,    -1,
      89,    90,    91,    15,    16,    17,    18,    19,    20,    -1,
      22,    23,    24,    25,    -1,    15,    16,    17,    -1,    19,
      20,    -1,    22,    23,    24,    25,    -1,    15,    16,    -1,
      -1,    19,    20,    -1,    22,    23,    24,    25,    -1,    15,
      16,    -1,    -1,    19,    20,    -1,    22,    23,    24,    25,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    79,    80,    81,
      82,    83,    84,    85,    -1,    -1,    -1,    89,    90,    79,
      80,    81,    82,    83,    84,    85,    -1,    -1,    -1,    89,
      90,    79,    80,    81,    82,    83,    84,    85,    -1,    -1,
      -1,    89,    90,    79,    80,    81,    82,    83,    84,    85,
      27,    -1,    -1,    89,    90,    32,    33,    -1,    -1,    -1,
      -1,    -1,    27,    40,    41,    -1,    43,    32,    33,    -1,
      -1,    -1,    -1,    -1,    -1,    40,    41,    -1,    43,    -1,
      -1,    -1,    -1,    60,    61,    -1,    -1,    64,    -1,    -1,
      67,    68,    69,    70,    -1,    60,    61,    -1,    -1,    64,
      -1,    -1,    67,    68,    69,    70,    27,    -1,    26,    -1,
      28,    32,    33,    -1,    91,    92,    -1,    35,    -1,    40,
      41,    39,    43,    -1,    -1,    -1,    91,    -1,    -1,    47,
      -1,    49,    50,    -1,    -1,    -1,    -1,    -1,    -1,    60,
      61,    59,    -1,    64,    62,    63,    67,    68,    69,    70,
      -1,    -1,    70,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      91
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final short[] yystos_ = yystos_init();
  private static final short[] yystos_init()
  {
    return new short[]
    {
       0,     1,   103,   104,     0,     0,    29,    45,    48,   105,
     106,   107,    51,    70,    71,    70,   107,    91,    44,   108,
      37,   110,    31,    51,    54,    55,    56,    57,    65,   113,
     114,   115,   116,   117,   118,   127,    70,   111,   112,    37,
     109,   112,    91,    70,    96,     3,     4,     5,     6,     7,
       8,     9,    10,    11,    12,    13,    14,    15,    16,    17,
      18,    19,    20,    22,    23,    24,    25,    78,    79,    80,
      81,    82,    83,    84,    85,    89,    90,    98,   129,    70,
      92,   113,    38,    66,    70,   128,    79,    93,   127,    91,
      42,    58,   130,     3,    70,   136,   137,    96,     3,    94,
      96,    42,    58,   111,   112,   112,   113,    70,    70,    92,
      53,    71,    72,    73,    74,    99,   148,    94,    93,    97,
     136,    26,    28,    35,    39,    47,    49,    50,    59,    62,
      63,    70,   131,   132,   131,   136,    70,    70,    80,    92,
      96,    96,    72,   131,   137,    91,   138,    97,    79,    79,
      79,    79,    79,    79,    95,    97,    96,    96,   136,   136,
      21,   139,    94,    70,   134,   135,   131,   131,   131,   131,
     131,   133,   119,   120,   136,   136,    97,    97,    72,    27,
      32,    33,    40,    41,    43,    60,    61,    64,    67,    68,
      69,    70,   138,   140,   141,   142,   143,   144,   145,   146,
     131,    80,    93,    80,    93,    80,    80,    80,    93,   138,
      95,    97,    97,    94,    95,   100,    70,   142,     1,    96,
      70,   145,    96,    96,    15,    16,    52,    78,    82,    96,
     145,   146,   148,   149,    96,    96,    96,    94,    99,    92,
     142,    95,     3,     4,     5,     6,     7,     8,     9,    10,
      11,    12,    13,    14,    15,    16,   101,    96,   125,   126,
     135,   131,   131,    94,   121,   122,   131,    69,     0,    95,
      70,   145,    46,   101,   149,   149,   149,   149,   132,   149,
     149,   149,    96,    15,    16,    17,    18,    19,    20,    22,
      23,    24,    25,    79,    80,    81,    82,    83,    84,    85,
      89,    90,   149,   149,   149,   131,   147,   149,   149,   149,
     149,   149,   149,   149,   149,   149,   149,   149,   149,   149,
      70,   147,   138,    95,    80,   131,   138,    95,    95,    96,
      94,     3,    94,    95,   149,    70,    97,    97,    96,    97,
     147,   149,   149,   149,   149,   149,   149,   149,   149,   149,
     149,   149,   149,   149,   149,   149,   149,   149,    97,    97,
      97,    95,    93,   100,    97,   123,   124,   149,   131,   148,
     149,   149,   142,   142,   147,   150,    97,   142,   149,   138,
      95,    97,    95,    95,    97,    95,    34,    97,    95,   149,
     149,   142,   149,   142,    95,    95,    97,   149,   149,   138,
      97,    97,   138,   138
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final short[] yyr1_ = yyr1_init();
  private static final short[] yyr1_init()
  {
    return new short[]
    {
       0,   102,   103,   103,   104,   104,   105,   106,   106,   107,
     107,   107,   108,   108,   109,   109,   110,   110,   111,   111,
     112,   112,   113,   113,   114,   114,   114,   114,   115,   116,
     117,   118,   119,   118,   120,   118,   121,   118,   122,   118,
     123,   118,   124,   118,   125,   118,   126,   118,   127,   127,
     127,   127,   128,   128,   128,   129,   129,   129,   129,   129,
     129,   129,   129,   129,   129,   129,   129,   129,   129,   129,
     129,   129,   129,   129,   129,   129,   129,   129,   129,   129,
     129,   129,   129,   129,   129,   129,   129,   129,   130,   130,
     131,   131,   131,   131,   131,   131,   131,   131,   131,   131,
     131,   132,   132,   133,   133,   134,   134,   135,   136,   136,
     137,   138,   139,   139,   140,   141,   141,   142,   142,   142,
     142,   142,   142,   142,   142,   142,   143,   143,   143,   143,
     143,   144,   144,   144,   144,   144,   144,   144,   144,   144,
     144,   144,   144,   144,   144,   144,   144,   144,   144,   144,
     144,   144,   145,   145,   145,   145,   146,   146,   147,   147,
     148,   148,   148,   148,   148,   148,   149,   149,   149,   149,
     149,   149,   149,   149,   149,   149,   149,   149,   149,   149,
     149,   149,   149,   149,   149,   149,   149,   149,   149,   149,
     149,   149,   149,   149,   150,   150
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte[] yyr2_ = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     0,     2,     2,     2,     1,     7,
       5,     6,     0,     2,     0,     3,     0,     2,     3,     1,
       1,     4,     0,     2,     1,     1,     1,     1,     4,     4,
       5,     5,     0,     7,     0,     7,     0,     9,     0,     9,
       0,    11,     0,    11,     0,     9,     0,     9,     0,     1,
       1,     1,     0,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     1,
       1,     1,     1,     1,     1,     1,     1,     1,     6,     8,
       1,     1,     1,     1,     1,     4,     4,     4,     4,     6,
       1,     4,     1,     3,     1,     3,     1,     1,     3,     1,
       3,     4,     0,     2,     4,     2,     1,     2,     1,     5,
       7,     5,     7,     7,     5,     1,     9,    11,    11,     3,
       3,     3,     2,     2,     3,     3,     3,     3,     3,     3,
       3,     3,     3,     3,     3,     4,     4,     4,     4,     1,
       1,     2,     1,     4,     3,     1,     1,     3,     3,     1,
       1,     1,     1,     1,     1,     5,     1,     1,     4,     5,
       3,     3,     2,     3,     3,     3,     3,     3,     3,     3,
       3,     2,     3,     3,     3,     2,     2,     2,     2,     3,
       3,     3,     3,     3,     0,     1
    };
  }



  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short[] yyrline_ = yyrline_init();
  private static final short[] yyrline_init()
  {
    return new short[]
    {
       0,   147,   147,   149,   153,   154,   158,   162,   163,   167,
     168,   169,   173,   174,   178,   179,   183,   184,   188,   189,
     193,   194,   198,   199,   203,   204,   205,   206,   210,   217,
     224,   231,   233,   232,   238,   237,   243,   242,   248,   247,
     253,   252,   258,   257,   263,   262,   268,   267,   275,   276,
     277,   278,   282,   283,   284,   288,   289,   290,   291,   292,
     293,   294,   295,   296,   297,   298,   299,   300,   301,   302,
     303,   304,   305,   306,   307,   308,   309,   310,   311,   312,
     313,   314,   315,   316,   317,   318,   319,   320,   324,   325,
     329,   330,   331,   332,   333,   334,   335,   336,   337,   338,
     339,   343,   344,   348,   349,   353,   354,   358,   362,   363,
     367,   375,   379,   380,   384,   388,   389,   393,   394,   395,
     396,   397,   398,   399,   400,   401,   405,   414,   423,   434,
     435,   439,   440,   441,   442,   443,   444,   445,   446,   447,
     448,   449,   450,   451,   452,   453,   454,   455,   456,   457,
     458,   459,   463,   475,   476,   477,   481,   491,   495,   496,
     500,   501,   502,   503,   504,   505,   509,   510,   511,   512,
     513,   514,   515,   516,   517,   518,   519,   520,   521,   522,
     523,   524,   525,   526,   527,   528,   529,   530,   531,   532,
     533,   534,   535,   536,   540,   541
    };
  }


  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yyReducePrint (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
              + " (line " + yylno + "):");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yySymbolPrint("   $" + (yyi + 1) + " =",
                    SymbolKind.get(yystos_[yystack.stateAt (yynrhs - (yyi + 1))]),
                    yystack.valueAt ((yynrhs) - (yyi + 1)),
                    yystack.locationAt ((yynrhs) - (yyi + 1)));
  }

  /* YYTRANSLATE_(TOKEN-NUM) -- Symbol number corresponding to TOKEN-NUM
     as returned by yylex, with out-of-bounds checking.  */
  private static final SymbolKind yytranslate_(int t)
  {
    // Last valid token kind.
    int code_max = 336;
    if (t <= 0)
      return SymbolKind.S_YYEOF;
    else if (t <= code_max)
      return SymbolKind.get(yytranslate_table_[t]);
    else
      return SymbolKind.S_YYUNDEF;
  }
  private static final byte[] yytranslate_table_ = yytranslate_table_init();
  private static final byte[] yytranslate_table_init()
  {
    return new byte[]
    {
       0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    78,     2,     2,     2,    85,    90,     2,
      96,    97,    83,    81,    93,    82,   101,    84,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,    94,    95,
      79,     2,    80,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,    99,     2,   100,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    91,    89,    92,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54,
      55,    56,    57,    58,    59,    60,    61,    62,    63,    64,
      65,    66,    67,    68,    69,    70,    71,    72,    73,    74,
      75,    76,    77,    86,    87,    88,    98
    };
  }


  private static final int YYLAST_ = 1070;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 5;
  private static final int YYNTOKENS_ = 102;

/* Unqualified %code blocks.  */
/* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":28  */

	private Environment<Type> typeEnvironment = new MapEnvironment<Type>("types", true);
	private Environment<Type> varEnvironment = new MapEnvironment<Type>("var", true);
	private Environment<Type> localVarEnvironment = new MapEnvironment<Type>("local", true);
	private Environment<Type> constEnvironment = new MapEnvironment<Type>("const", true);

/* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/src/fr/ubordeaux/deptinfo/compilation/lea/parser/Parser.java":2824  */

}
/* "/home/altyriss/MEGAsync/Informatique/L3/Compilation/MiniProjet/miniprojet/parser/Parser.y":544  */


