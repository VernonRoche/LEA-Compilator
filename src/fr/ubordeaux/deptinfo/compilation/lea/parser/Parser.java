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
/* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":17  */

	import fr.ubordeaux.deptinfo.compilation.lea.type.*;
	import fr.ubordeaux.deptinfo.compilation.lea.environment.*;
	import fr.ubordeaux.deptinfo.compilation.lea.stree.*;

/* "/home/fnoury/L3/Compilation/projet-20210420/src/fr/ubordeaux/deptinfo/compilation/lea/parser/Parser.java":50  */

/**
 * A Bison parser, automatically generated from <tt>/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y</tt>.
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
    S_PLUSE(4),                    /* "+="  */
    S_MINUSE(5),                   /* "-="  */
    S_TIMESE(6),                   /* "*="  */
    S_DIVE(7),                     /* "/="  */
    S_PERCE(8),                    /* "%="  */
    S_ORE(9),                      /* "||="  */
    S_ANDE(10),                    /* "&&="  */
    S_AMPE(11),                    /* "&="  */
    S_PIPEE(12),                   /* "|="  */
    S_LSHIFTE(13),                 /* "<<="  */
    S_RSHIFTE(14),                 /* ">>="  */
    S_SUCC(15),                    /* "++"  */
    S_DEC(16),                     /* "--"  */
    S_AND(17),                     /* "&&"  */
    S_OR(18),                      /* "||"  */
    S_LSHIFT(19),                  /* "<<"  */
    S_RSHIFT(20),                  /* ">>"  */
    S_DOTS(21),                    /* ".."  */
    S_EQ(22),                      /* "=="  */
    S_LE(23),                      /* "<="  */
    S_GE(24),                      /* ">="  */
    S_NE(25),                      /* "!="  */
    S_BOOLEAN(26),                 /* "boolean"  */
    S_BREAK(27),                   /* "break"  */
    S_CASE(28),                    /* "case"  */
    S_CHAR(29),                    /* "char"  */
    S_CLASS(30),                   /* "class"  */
    S_COMPARABLE(31),              /* "comparable"  */
    S_CONST(32),                   /* "const"  */
    S_CONTINUE(33),                /* "continue"  */
    S_DEFAULT(34),                 /* "default"  */
    S_DO(35),                      /* "do"  */
    S_ELSE(36),                    /* "else"  */
    S_ENUM(37),                    /* "enum"  */
    S_EQUIVALENT(38),              /* "equivalent"  */
    S_EXTENDS(39),                 /* "extends"  */
    S_FINAL(40),                   /* "final"  */
    S_FLOAT(41),                   /* "float"  */
    S_FOR(42),                     /* "for"  */
    S_FOREACH(43),                 /* "foreach"  */
    S_FUNCTION(44),                /* "function"  */
    S_IF(45),                      /* "if"  */
    S_IMPLEMENTS(46),              /* "implements"  */
    S_IMPORT(47),                  /* "import"  */
    S_IN(48),                      /* "in"  */
    S_INTEGER(49),                 /* "integer"  */
    S_INTERFACE(50),               /* "interface"  */
    S_LIST(51),                    /* "list"  */
    S_MAP(52),                     /* "map"  */
    S_MAIN(53),                    /* "main"  */
    S_NEW(54),                     /* "new"  */
    S_NULL(55),                    /* "null"  */
    S_PRIVATE(56),                 /* "private"  */
    S_PROTECTED(57),               /* "protected"  */
    S_PUBLIC(58),                  /* "public"  */
    S_PROCEDURE(59),               /* "procedure"  */
    S_RANGE(60),                   /* "range"  */
    S_READLN(61),                  /* "readln"  */
    S_RETURN(62),                  /* "return"  */
    S_SET(63),                     /* "set"  */
    S_STRING(64),                  /* "string"  */
    S_SWITCH(65),                  /* "switch"  */
    S_THIS(66),                    /* "this"  */
    S_TYPE(67),                    /* "type"  */
    S_VIRTUAL(68),                 /* "virtual"  */
    S_WRITE(69),                   /* "write"  */
    S_WRITELN(70),                 /* "writeln"  */
    S_WHILE(71),                   /* "while"  */
    S_IDENTIFIER(72),              /* IDENTIFIER  */
    S_CONSTANT_STRING(73),         /* CONSTANT_STRING  */
    S_CONSTANT_INTEGER(74),        /* CONSTANT_INTEGER  */
    S_CONSTANT_CHAR(75),           /* CONSTANT_CHAR  */
    S_CONSTANT_FLOAT(76),          /* CONSTANT_FLOAT  */
    S_ASSIGNED_VARIABLE(77),       /* ASSIGNED_VARIABLE  */
    S_78_(78),                     /* ':'  */
    S_WITHOUT_ELSE(79),            /* WITHOUT_ELSE  */
    S_DETERMINER(80),              /* DETERMINER  */
    S_SPECIFIER(81),               /* SPECIFIER  */
    S_82_(82),                     /* '!'  */
    S_83_(83),                     /* '<'  */
    S_84_(84),                     /* '>'  */
    S_85_(85),                     /* '+'  */
    S_86_(86),                     /* '-'  */
    S_87_(87),                     /* '*'  */
    S_88_(88),                     /* '/'  */
    S_89_(89),                     /* '%'  */
    S_LEFTPLUSPLUS(90),            /* LEFTPLUSPLUS  */
    S_LEFTMINUSMINUS(91),          /* LEFTMINUSMINUS  */
    S_UMINUS(92),                  /* UMINUS  */
    S_93_(93),                     /* '|'  */
    S_94_(94),                     /* '&'  */
    S_95_(95),                     /* '{'  */
    S_96_(96),                     /* '}'  */
    S_97_(97),                     /* ','  */
    S_98_(98),                     /* ';'  */
    S_99_(99),                     /* '('  */
    S_100_(100),                   /* ')'  */
    S_101_(101),                   /* '['  */
    S_102_(102),                   /* ']'  */
    S_103_(103),                   /* '.'  */
    S_YYACCEPT(104),               /* $accept  */
    S_S(105),                      /* S  */
    S_imports(106),                /* imports  */
    S_import(107),                 /* import  */
    S_declarations(108),           /* declarations  */
    S_declaration(109),            /* declaration  */
    S_implements(110),             /* implements  */
    S_extends(111),                /* extends  */
    S_extends_public(112),         /* extends_public  */
    S_class_names(113),            /* class_names  */
    S_class_name(114),             /* class_name  */
    S_class_definition(115),       /* class_definition  */
    S_class_definition_head(116),  /* class_definition_head  */
    S_type_definition(117),        /* type_definition  */
    S_const_definition(118),       /* const_definition  */
    S_attribute_definition(119),   /* attribute_definition  */
    S_push_environment(120),       /* push_environment  */
    S_pop_environment(121),        /* pop_environment  */
    S_method_definition(122),      /* method_definition  */
    S_123_1(123),                  /* $@1  */
    S_124_2(124),                  /* $@2  */
    S_125_3(125),                  /* $@3  */
    S_126_4(126),                  /* $@4  */
    S_127_5(127),                  /* $@5  */
    S_128_6(128),                  /* $@6  */
    S_129_7(129),                  /* $@7  */
    S_130_8(130),                  /* $@8  */
    S_131_9(131),                  /* $@9  */
    S_132_10(132),                 /* $@10  */
    S_133_11(133),                 /* $@11  */
    S_134_12(134),                 /* $@12  */
    S_135_13(135),                 /* $@13  */
    S_136_14(136),                 /* $@14  */
    S_determiner(137),             /* determiner  */
    S_specifier(138),              /* specifier  */
    S_interface_definition(139),   /* interface_definition  */
    S_interface_definition_head(140), /* interface_definition_head  */
    S_type_expression(141),        /* type_expression  */
    S_type_expression_class(142),  /* type_expression_class  */
    S_type_expressions(143),       /* type_expressions  */
    S_type_names(144),             /* type_names  */
    S_type_name(145),              /* type_name  */
    S_args_definition(146),        /* args_definition  */
    S_arg_definition(147),         /* arg_definition  */
    S_block(148),                  /* block  */
    S_var_definitions(149),        /* var_definitions  */
    S_var_definition(150),         /* var_definition  */
    S_stms(151),                   /* stms  */
    S_stm(152),                    /* stm  */
    S_case_stms(153),              /* case_stms  */
    S_case_stm(154),               /* case_stm  */
    S_default_stm(155),            /* default_stm  */
    S_assignment_stm(156),         /* assignment_stm  */
    S_simple_stm(157),             /* simple_stm  */
    S_assigned_variable(158),      /* assigned_variable  */
    S_method_name(159),            /* method_name  */
    S_args(160),                   /* args  */
    S_const_expression(161),       /* const_expression  */
    S_expression(162),             /* expression  */
    S_args_opt(163);               /* args_opt  */


    private final int yycode_;

    SymbolKind (int n) {
      this.yycode_ = n;
    }

    private static final SymbolKind[] values_ = {
      SymbolKind.S_YYEOF,
      SymbolKind.S_YYerror,
      SymbolKind.S_YYUNDEF,
      SymbolKind.S_ASSIGN,
      SymbolKind.S_PLUSE,
      SymbolKind.S_MINUSE,
      SymbolKind.S_TIMESE,
      SymbolKind.S_DIVE,
      SymbolKind.S_PERCE,
      SymbolKind.S_ORE,
      SymbolKind.S_ANDE,
      SymbolKind.S_AMPE,
      SymbolKind.S_PIPEE,
      SymbolKind.S_LSHIFTE,
      SymbolKind.S_RSHIFTE,
      SymbolKind.S_SUCC,
      SymbolKind.S_DEC,
      SymbolKind.S_AND,
      SymbolKind.S_OR,
      SymbolKind.S_LSHIFT,
      SymbolKind.S_RSHIFT,
      SymbolKind.S_DOTS,
      SymbolKind.S_EQ,
      SymbolKind.S_LE,
      SymbolKind.S_GE,
      SymbolKind.S_NE,
      SymbolKind.S_BOOLEAN,
      SymbolKind.S_BREAK,
      SymbolKind.S_CASE,
      SymbolKind.S_CHAR,
      SymbolKind.S_CLASS,
      SymbolKind.S_COMPARABLE,
      SymbolKind.S_CONST,
      SymbolKind.S_CONTINUE,
      SymbolKind.S_DEFAULT,
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
      SymbolKind.S_PRIVATE,
      SymbolKind.S_PROTECTED,
      SymbolKind.S_PUBLIC,
      SymbolKind.S_PROCEDURE,
      SymbolKind.S_RANGE,
      SymbolKind.S_READLN,
      SymbolKind.S_RETURN,
      SymbolKind.S_SET,
      SymbolKind.S_STRING,
      SymbolKind.S_SWITCH,
      SymbolKind.S_THIS,
      SymbolKind.S_TYPE,
      SymbolKind.S_VIRTUAL,
      SymbolKind.S_WRITE,
      SymbolKind.S_WRITELN,
      SymbolKind.S_WHILE,
      SymbolKind.S_IDENTIFIER,
      SymbolKind.S_CONSTANT_STRING,
      SymbolKind.S_CONSTANT_INTEGER,
      SymbolKind.S_CONSTANT_CHAR,
      SymbolKind.S_CONSTANT_FLOAT,
      SymbolKind.S_ASSIGNED_VARIABLE,
      SymbolKind.S_78_,
      SymbolKind.S_WITHOUT_ELSE,
      SymbolKind.S_DETERMINER,
      SymbolKind.S_SPECIFIER,
      SymbolKind.S_82_,
      SymbolKind.S_83_,
      SymbolKind.S_84_,
      SymbolKind.S_85_,
      SymbolKind.S_86_,
      SymbolKind.S_87_,
      SymbolKind.S_88_,
      SymbolKind.S_89_,
      SymbolKind.S_LEFTPLUSPLUS,
      SymbolKind.S_LEFTMINUSMINUS,
      SymbolKind.S_UMINUS,
      SymbolKind.S_93_,
      SymbolKind.S_94_,
      SymbolKind.S_95_,
      SymbolKind.S_96_,
      SymbolKind.S_97_,
      SymbolKind.S_98_,
      SymbolKind.S_99_,
      SymbolKind.S_100_,
      SymbolKind.S_101_,
      SymbolKind.S_102_,
      SymbolKind.S_103_,
      SymbolKind.S_YYACCEPT,
      SymbolKind.S_S,
      SymbolKind.S_imports,
      SymbolKind.S_import,
      SymbolKind.S_declarations,
      SymbolKind.S_declaration,
      SymbolKind.S_implements,
      SymbolKind.S_extends,
      SymbolKind.S_extends_public,
      SymbolKind.S_class_names,
      SymbolKind.S_class_name,
      SymbolKind.S_class_definition,
      SymbolKind.S_class_definition_head,
      SymbolKind.S_type_definition,
      SymbolKind.S_const_definition,
      SymbolKind.S_attribute_definition,
      SymbolKind.S_push_environment,
      SymbolKind.S_pop_environment,
      SymbolKind.S_method_definition,
      SymbolKind.S_123_1,
      SymbolKind.S_124_2,
      SymbolKind.S_125_3,
      SymbolKind.S_126_4,
      SymbolKind.S_127_5,
      SymbolKind.S_128_6,
      SymbolKind.S_129_7,
      SymbolKind.S_130_8,
      SymbolKind.S_131_9,
      SymbolKind.S_132_10,
      SymbolKind.S_133_11,
      SymbolKind.S_134_12,
      SymbolKind.S_135_13,
      SymbolKind.S_136_14,
      SymbolKind.S_determiner,
      SymbolKind.S_specifier,
      SymbolKind.S_interface_definition,
      SymbolKind.S_interface_definition_head,
      SymbolKind.S_type_expression,
      SymbolKind.S_type_expression_class,
      SymbolKind.S_type_expressions,
      SymbolKind.S_type_names,
      SymbolKind.S_type_name,
      SymbolKind.S_args_definition,
      SymbolKind.S_arg_definition,
      SymbolKind.S_block,
      SymbolKind.S_var_definitions,
      SymbolKind.S_var_definition,
      SymbolKind.S_stms,
      SymbolKind.S_stm,
      SymbolKind.S_case_stms,
      SymbolKind.S_case_stm,
      SymbolKind.S_default_stm,
      SymbolKind.S_assignment_stm,
      SymbolKind.S_simple_stm,
      SymbolKind.S_assigned_variable,
      SymbolKind.S_method_name,
      SymbolKind.S_args,
      SymbolKind.S_const_expression,
      SymbolKind.S_expression,
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
  "<<", ">>", "..", "==", "<=", ">=", "!=", "boolean", "break", "case",
  "char", "class", "comparable", "const", "continue", "default", "do",
  "else", "enum", "equivalent", "extends", "final", "float", "for",
  "foreach", "function", "if", "implements", "import", "in", "integer",
  "interface", "list", "map", "main", "new", "null", "private",
  "protected", "public", "procedure", "range", "readln", "return", "set",
  "string", "switch", "this", "type", "virtual", "write", "writeln",
  "while", "IDENTIFIER", "CONSTANT_STRING", "CONSTANT_INTEGER",
  "CONSTANT_CHAR", "CONSTANT_FLOAT", "ASSIGNED_VARIABLE", "':'",
  "WITHOUT_ELSE", "DETERMINER", "SPECIFIER", "'!'", "'<'", "'>'", "'+'",
  "'-'", "'*'", "'/'", "'%'", "LEFTPLUSPLUS", "LEFTMINUSMINUS", "UMINUS",
  "'|'", "'&'", "'{'", "'}'", "','", "';'", "'('", "')'", "'['", "']'",
  "'.'", "$accept", "S", "imports", "import", "declarations",
  "declaration", "implements", "extends", "extends_public", "class_names",
  "class_name", "class_definition", "class_definition_head",
  "type_definition", "const_definition", "attribute_definition",
  "push_environment", "pop_environment", "method_definition", "$@1", "$@2",
  "$@3", "$@4", "$@5", "$@6", "$@7", "$@8", "$@9", "$@10", "$@11", "$@12",
  "$@13", "$@14", "determiner", "specifier", "interface_definition",
  "interface_definition_head", "type_expression", "type_expression_class",
  "type_expressions", "type_names", "type_name", "args_definition",
  "arg_definition", "block", "var_definitions", "var_definition", "stms",
  "stm", "case_stms", "case_stm", "default_stm", "assignment_stm",
  "simple_stm", "assigned_variable", "method_name", "args",
  "const_expression", "expression", "args_opt", null
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
    static final int PLUSE = 259;
    /** Token "-=", to be returned by the scanner.  */
    static final int MINUSE = 260;
    /** Token "*=", to be returned by the scanner.  */
    static final int TIMESE = 261;
    /** Token "/=", to be returned by the scanner.  */
    static final int DIVE = 262;
    /** Token "%=", to be returned by the scanner.  */
    static final int PERCE = 263;
    /** Token "||=", to be returned by the scanner.  */
    static final int ORE = 264;
    /** Token "&&=", to be returned by the scanner.  */
    static final int ANDE = 265;
    /** Token "&=", to be returned by the scanner.  */
    static final int AMPE = 266;
    /** Token "|=", to be returned by the scanner.  */
    static final int PIPEE = 267;
    /** Token "<<=", to be returned by the scanner.  */
    static final int LSHIFTE = 268;
    /** Token ">>=", to be returned by the scanner.  */
    static final int RSHIFTE = 269;
    /** Token "++", to be returned by the scanner.  */
    static final int SUCC = 270;
    /** Token "--", to be returned by the scanner.  */
    static final int DEC = 271;
    /** Token "&&", to be returned by the scanner.  */
    static final int AND = 272;
    /** Token "||", to be returned by the scanner.  */
    static final int OR = 273;
    /** Token "<<", to be returned by the scanner.  */
    static final int LSHIFT = 274;
    /** Token ">>", to be returned by the scanner.  */
    static final int RSHIFT = 275;
    /** Token "..", to be returned by the scanner.  */
    static final int DOTS = 276;
    /** Token "==", to be returned by the scanner.  */
    static final int EQ = 277;
    /** Token "<=", to be returned by the scanner.  */
    static final int LE = 278;
    /** Token ">=", to be returned by the scanner.  */
    static final int GE = 279;
    /** Token "!=", to be returned by the scanner.  */
    static final int NE = 280;
    /** Token "boolean", to be returned by the scanner.  */
    static final int BOOLEAN = 281;
    /** Token "break", to be returned by the scanner.  */
    static final int BREAK = 282;
    /** Token "case", to be returned by the scanner.  */
    static final int CASE = 283;
    /** Token "char", to be returned by the scanner.  */
    static final int CHAR = 284;
    /** Token "class", to be returned by the scanner.  */
    static final int CLASS = 285;
    /** Token "comparable", to be returned by the scanner.  */
    static final int COMPARABLE = 286;
    /** Token "const", to be returned by the scanner.  */
    static final int CONST = 287;
    /** Token "continue", to be returned by the scanner.  */
    static final int CONTINUE = 288;
    /** Token "default", to be returned by the scanner.  */
    static final int DEFAULT = 289;
    /** Token "do", to be returned by the scanner.  */
    static final int DO = 290;
    /** Token "else", to be returned by the scanner.  */
    static final int ELSE = 291;
    /** Token "enum", to be returned by the scanner.  */
    static final int ENUM = 292;
    /** Token "equivalent", to be returned by the scanner.  */
    static final int EQUIVALENT = 293;
    /** Token "extends", to be returned by the scanner.  */
    static final int EXTENDS = 294;
    /** Token "final", to be returned by the scanner.  */
    static final int FINAL = 295;
    /** Token "float", to be returned by the scanner.  */
    static final int FLOAT = 296;
    /** Token "for", to be returned by the scanner.  */
    static final int FOR = 297;
    /** Token "foreach", to be returned by the scanner.  */
    static final int FOREACH = 298;
    /** Token "function", to be returned by the scanner.  */
    static final int FUNCTION = 299;
    /** Token "if", to be returned by the scanner.  */
    static final int IF = 300;
    /** Token "implements", to be returned by the scanner.  */
    static final int IMPLEMENTS = 301;
    /** Token "import", to be returned by the scanner.  */
    static final int IMPORT = 302;
    /** Token "in", to be returned by the scanner.  */
    static final int IN = 303;
    /** Token "integer", to be returned by the scanner.  */
    static final int INTEGER = 304;
    /** Token "interface", to be returned by the scanner.  */
    static final int INTERFACE = 305;
    /** Token "list", to be returned by the scanner.  */
    static final int LIST = 306;
    /** Token "map", to be returned by the scanner.  */
    static final int MAP = 307;
    /** Token "main", to be returned by the scanner.  */
    static final int MAIN = 308;
    /** Token "new", to be returned by the scanner.  */
    static final int NEW = 309;
    /** Token "null", to be returned by the scanner.  */
    static final int NULL = 310;
    /** Token "private", to be returned by the scanner.  */
    static final int PRIVATE = 311;
    /** Token "protected", to be returned by the scanner.  */
    static final int PROTECTED = 312;
    /** Token "public", to be returned by the scanner.  */
    static final int PUBLIC = 313;
    /** Token "procedure", to be returned by the scanner.  */
    static final int PROCEDURE = 314;
    /** Token "range", to be returned by the scanner.  */
    static final int RANGE = 315;
    /** Token "readln", to be returned by the scanner.  */
    static final int READLN = 316;
    /** Token "return", to be returned by the scanner.  */
    static final int RETURN = 317;
    /** Token "set", to be returned by the scanner.  */
    static final int SET = 318;
    /** Token "string", to be returned by the scanner.  */
    static final int STRING = 319;
    /** Token "switch", to be returned by the scanner.  */
    static final int SWITCH = 320;
    /** Token "this", to be returned by the scanner.  */
    static final int THIS = 321;
    /** Token "type", to be returned by the scanner.  */
    static final int TYPE = 322;
    /** Token "virtual", to be returned by the scanner.  */
    static final int VIRTUAL = 323;
    /** Token "write", to be returned by the scanner.  */
    static final int WRITE = 324;
    /** Token "writeln", to be returned by the scanner.  */
    static final int WRITELN = 325;
    /** Token "while", to be returned by the scanner.  */
    static final int WHILE = 326;
    /** Token IDENTIFIER, to be returned by the scanner.  */
    static final int IDENTIFIER = 327;
    /** Token CONSTANT_STRING, to be returned by the scanner.  */
    static final int CONSTANT_STRING = 328;
    /** Token CONSTANT_INTEGER, to be returned by the scanner.  */
    static final int CONSTANT_INTEGER = 329;
    /** Token CONSTANT_CHAR, to be returned by the scanner.  */
    static final int CONSTANT_CHAR = 330;
    /** Token CONSTANT_FLOAT, to be returned by the scanner.  */
    static final int CONSTANT_FLOAT = 331;
    /** Token ASSIGNED_VARIABLE, to be returned by the scanner.  */
    static final int ASSIGNED_VARIABLE = 332;
    /** Token WITHOUT_ELSE, to be returned by the scanner.  */
    static final int WITHOUT_ELSE = 333;
    /** Token DETERMINER, to be returned by the scanner.  */
    static final int DETERMINER = 334;
    /** Token SPECIFIER, to be returned by the scanner.  */
    static final int SPECIFIER = 335;
    /** Token LEFTPLUSPLUS, to be returned by the scanner.  */
    static final int LEFTPLUSPLUS = 336;
    /** Token LEFTMINUSMINUS, to be returned by the scanner.  */
    static final int LEFTMINUSMINUS = 337;
    /** Token UMINUS, to be returned by the scanner.  */
    static final int UMINUS = 338;

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

  private int yyaction(int yyn, YYStack yystack, int yylen) throws EnvironmentException, TypeException, StreeException
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
          case 8: /* declaration: "class" IDENTIFIER implements extends '{' push_environment class_definition pop_environment '}'  */
  if (yyn == 8)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":170  */
                                                                                                        { classEnvironment.put(((String)(yystack.valueAt (7))), ((Type)(yystack.valueAt (2)))); };
  break;


  case 9: /* declaration: "class" "main" '{' push_environment class_definition pop_environment '}'  */
  if (yyn == 9)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":171  */
                                                                                   { classEnvironment.put("main", ((Type)(yystack.valueAt (2)))); };
  break;


  case 10: /* declaration: "interface" IDENTIFIER extends_public '{' push_environment interface_definition pop_environment '}'  */
  if (yyn == 10)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":172  */
                                                                                                              { interfaceEnvironment.put(((String)(yystack.valueAt (6))), ((Type)(yystack.valueAt (2)))); };
  break;


  case 21: /* class_definition: %empty  */
  if (yyn == 21)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":201  */
               {yyval = null;};
  break;


  case 22: /* class_definition: class_definition_head class_definition  */
  if (yyn == 22)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":203  */
        {
		if (((Type)(yystack.valueAt (1))) == null)
			yyval = ((Type)(yystack.valueAt (0)));
		else {
			if (((Type)(yystack.valueAt (0))) == null) 
				yyval = ((Type)(yystack.valueAt (1))); 
			else 
				yyval = new TypeExpression(Tag.PRODUCT, ((Type)(yystack.valueAt (1))), ((Type)(yystack.valueAt (0)))); 
		}
	};
  break;


  case 23: /* class_definition_head: type_definition  */
  if (yyn == 23)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":216  */
                        {yyval = null;};
  break;


  case 24: /* class_definition_head: const_definition  */
  if (yyn == 24)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":217  */
                           {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 25: /* class_definition_head: attribute_definition  */
  if (yyn == 25)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":218  */
                               {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 26: /* class_definition_head: method_definition  */
  if (yyn == 26)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":219  */
                            {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 27: /* type_definition: "type" IDENTIFIER ":=" type_expression  */
  if (yyn == 27)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":224  */
        {
		typeEnvironment.put(((String)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));
	};
  break;


  case 28: /* const_definition: "const" IDENTIFIER ":=" const_expression  */
  if (yyn == 28)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":231  */
        {
	};
  break;


  case 29: /* attribute_definition: determiner IDENTIFIER ':' type_expression ';'  */
  if (yyn == 29)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":237  */
        {
		localVarEnvironment.put(((String)(yystack.valueAt (3))), ((Type)(yystack.valueAt (1))));
		yyval = new TypeExpression(Tag.FIELD, ((Type)(yystack.valueAt (1))), ((String)(yystack.valueAt (3))));
	};
  break;


  case 30: /* push_environment: %empty  */
  if (yyn == 30)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":244  */
               { 
		localVarEnvironment.push(new MapEnvironment<Type>(localVarEnvironment.getName() + '(' + localVarEnvironment.size() + ')', true)); };
  break;


  case 31: /* pop_environment: %empty  */
  if (yyn == 31)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":249  */
               { localVarEnvironment.pop(); };
  break;


  case 32: /* $@1: %empty  */
  if (yyn == 32)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":255  */
        { 
		type = new TypeExpression(Tag.FUNCTION, ((Type)(yystack.valueAt (1))), new TypeExpression(Tag.VOID));
		localVarEnvironment.put("main", type);
	};
  break;


  case 33: /* $@2: %empty  */
  if (yyn == 33)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":259  */
                         {localVarEnvironment.put(((Type)(yystack.valueAt (3))));};
  break;


  case 34: /* method_definition: "main" '(' args_definition ')' $@1 push_environment $@2 block pop_environment  */
  if (yyn == 34)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":260  */
        { 
		yyval = new TypeExpression(Tag.FIELD, type, "main"); 
		try {
			System.out.println(((Stree)(yystack.valueAt (1))).getStm());
			((Stree)(yystack.valueAt (1))).getStm().toDotFile("data/" + yystack.locationAt (8).toString() + "_main.dot");
		}
		catch (StreeException e) {
			yyerror(yystack.locationAt (8), e.getMessage());
		}
		//yyerror(@8, $8.toString());
	};
  break;


  case 35: /* $@3: %empty  */
  if (yyn == 35)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":274  */
        {
		type = new TypeExpression(Tag.FUNCTION, ((Type)(yystack.valueAt (1))), new TypeExpression(Tag.VOID));
		localVarEnvironment.put(((String)(yystack.valueAt (3))), type);
	};
  break;


  case 36: /* $@4: %empty  */
  if (yyn == 36)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":278  */
                         {localVarEnvironment.put(((Type)(yystack.valueAt (3))));};
  break;


  case 37: /* method_definition: determiner IDENTIFIER '(' args_definition ')' $@3 push_environment $@4 block pop_environment  */
  if (yyn == 37)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":279  */
        { 
		yyval = new TypeExpression(Tag.FIELD, type, ((String)(yystack.valueAt (8)))); 
		try {
			System.out.println(((Stree)(yystack.valueAt (1))).getStm());
			((Stree)(yystack.valueAt (1))).getStm().toDotFile("data/" + yystack.locationAt (8).toString() + '_' + ((String)(yystack.valueAt (8))) + ".dot");
		}
		catch (StreeException e) {
			yyerror(yystack.locationAt (9), e.getMessage());
		}
		//yyerror(@9, $9.toString());
	};
  break;


  case 38: /* $@5: %empty  */
  if (yyn == 38)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":293  */
        {
		type = new TypeExpression(Tag.FUNCTION, ((Type)(yystack.valueAt (1))), new TypeExpression(Tag.VOID));
		localVarEnvironment.put(((String)(yystack.valueAt (3))), type);
	};
  break;


  case 39: /* $@6: %empty  */
  if (yyn == 39)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":297  */
                         {};
  break;


  case 40: /* method_definition: determiner IDENTIFIER '(' args_definition ')' $@5 push_environment $@6 ';' pop_environment  */
  if (yyn == 40)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":298  */
        { 
		yyval = new TypeExpression(Tag.FIELD, type, ((String)(yystack.valueAt (8)))); 
	};
  break;


  case 41: /* $@7: %empty  */
  if (yyn == 41)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":304  */
        {
		type = new TypeExpression(Tag.FUNCTION, ((Type)(yystack.valueAt (1))), new TypeExpression(Tag.VOID));
		localVarEnvironment.put(((String)(yystack.valueAt (3))), type);
	};
  break;


  case 42: /* $@8: %empty  */
  if (yyn == 42)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":308  */
                         {localVarEnvironment.put(((Type)(yystack.valueAt (3))));};
  break;


  case 43: /* method_definition: determiner specifier "procedure" IDENTIFIER '(' args_definition ')' $@7 push_environment $@8 block pop_environment  */
  if (yyn == 43)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":309  */
        { 
		yyval = new TypeExpression(Tag.PRODUCT, type, ((String)(yystack.valueAt (8)))); 
		try {
			System.out.println(((Stree)(yystack.valueAt (1))).getStm());
			((Stree)(yystack.valueAt (1))).getStm().toDotFile("data/" + yystack.locationAt (8).toString() + '_' + ((String)(yystack.valueAt (8))) + ".dot");
		}
		catch (StreeException e) {
			yyerror(yystack.locationAt (11), e.getMessage());
		}
		//yyerror(@11, $11.toString());
	};
  break;


  case 44: /* $@9: %empty  */
  if (yyn == 44)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":323  */
        {
		type = new TypeExpression(Tag.FUNCTION, ((Type)(yystack.valueAt (1))), new TypeExpression(Tag.VOID));
		localVarEnvironment.put(((String)(yystack.valueAt (3))), type);
	};
  break;


  case 45: /* $@10: %empty  */
  if (yyn == 45)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":327  */
                         {};
  break;


  case 46: /* method_definition: determiner specifier "procedure" IDENTIFIER '(' args_definition ')' $@9 push_environment $@10 ';' pop_environment  */
  if (yyn == 46)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":328  */
        { 
		yyval = new TypeExpression(Tag.FIELD, type, ((String)(yystack.valueAt (8)))); 
	};
  break;


  case 47: /* $@11: %empty  */
  if (yyn == 47)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":334  */
        {
		type = new TypeExpression(Tag.FUNCTION, ((Type)(yystack.valueAt (3))), ((Type)(yystack.valueAt (0))));
		localVarEnvironment.put(((String)(yystack.valueAt (5))), type);
	};
  break;


  case 48: /* $@12: %empty  */
  if (yyn == 48)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":338  */
                         {localVarEnvironment.put(((Type)(yystack.valueAt (5))));};
  break;


  case 49: /* method_definition: determiner specifier "function" IDENTIFIER '(' args_definition ')' ':' type_expression $@11 push_environment $@12 block pop_environment  */
  if (yyn == 49)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":339  */
        { 
		yyval = new TypeExpression(Tag.FIELD, type, ((String)(yystack.valueAt (10)))); 
		try {
			System.out.println(((Stree)(yystack.valueAt (1))).getStm());
			((Stree)(yystack.valueAt (1))).getStm().toDotFile("data/" + yystack.locationAt (10).toString() + '_' + ((String)(yystack.valueAt (10))) + ".dot");
		}
		catch (StreeException e) {
			yyerror(yystack.locationAt (13), e.getMessage());
		}
		//yyerror(@13, $13.toString());
	};
  break;


  case 50: /* $@13: %empty  */
  if (yyn == 50)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":353  */
        {
		type = new TypeExpression(Tag.FUNCTION, ((Type)(yystack.valueAt (3))), ((Type)(yystack.valueAt (0))));
		localVarEnvironment.put(((String)(yystack.valueAt (5))), type);
	};
  break;


  case 51: /* $@14: %empty  */
  if (yyn == 51)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":357  */
                         {};
  break;


  case 52: /* method_definition: determiner specifier "function" IDENTIFIER '(' args_definition ')' ':' type_expression $@13 push_environment $@14 ';' pop_environment  */
  if (yyn == 52)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":358  */
        { 
		yyval = new TypeExpression(Tag.FIELD, type, ((String)(yystack.valueAt (10)))); 
	};
  break;


  case 60: /* interface_definition: %empty  */
  if (yyn == 60)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":377  */
               {yyval = null;};
  break;


  case 61: /* interface_definition: interface_definition_head interface_definition  */
  if (yyn == 61)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":379  */
        {
		if (((Type)(yystack.valueAt (0))) == null) 
			yyval = ((Type)(yystack.valueAt (1))); 
		else 
			yyval = new TypeExpression(Tag.PRODUCT, ((Type)(yystack.valueAt (1))), ((Type)(yystack.valueAt (0)))); };
  break;


  case 62: /* interface_definition_head: "procedure" IDENTIFIER '(' args_definition ')' ';'  */
  if (yyn == 62)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":387  */
                                                           { yyval = new TypeExpression(Tag.FUNCTION); };
  break;


  case 63: /* interface_definition_head: "function" IDENTIFIER '(' args_definition ')' ':' type_expression ';'  */
  if (yyn == 63)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":388  */
                                                                                { yyval = new TypeExpression(Tag.FUNCTION); };
  break;


  case 64: /* type_expression: "char"  */
  if (yyn == 64)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":392  */
                                                                                                {yyval = new TypeExpression(Tag.CHAR);};
  break;


  case 65: /* type_expression: "integer"  */
  if (yyn == 65)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":393  */
                                                                                        {yyval = new TypeExpression(Tag.INTEGER);};
  break;


  case 66: /* type_expression: "float"  */
  if (yyn == 66)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":394  */
                                                                                                {yyval = new TypeExpression(Tag.FLOAT);};
  break;


  case 67: /* type_expression: "boolean"  */
  if (yyn == 67)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":395  */
                                                                                        {yyval = new TypeExpression(Tag.BOOLEAN);};
  break;


  case 68: /* type_expression: "string"  */
  if (yyn == 68)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":396  */
                                                                                                {yyval = new TypeExpression(Tag.STRING);};
  break;


  case 69: /* type_expression: "enum" '<' type_names '>'  */
  if (yyn == 69)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":397  */
                                                                                {yyval = new TypeExpression(Tag.ENUM, ((Type)(yystack.valueAt (1))));};
  break;


  case 70: /* type_expression: "range" '<' type_expression '>'  */
  if (yyn == 70)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":398  */
                                                                                        {yyval = new TypeExpression(Tag.RANGE, ((Type)(yystack.valueAt (1))));};
  break;


  case 71: /* type_expression: "list" '<' type_expression '>'  */
  if (yyn == 71)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":399  */
                                                                        {yyval = new TypeExpression(Tag.LIST, ((Type)(yystack.valueAt (1))));};
  break;


  case 72: /* type_expression: "set" '<' type_expression '>'  */
  if (yyn == 72)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":400  */
                                                                {yyval = new TypeExpression(Tag.SET, ((Type)(yystack.valueAt (1))));};
  break;


  case 73: /* type_expression: "map" '<' type_expression ',' type_expression '>'  */
  if (yyn == 73)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":401  */
                                                                {yyval = new TypeExpression(Tag.MAP, ((Type)(yystack.valueAt (3))), ((Type)(yystack.valueAt (1))));};
  break;


  case 74: /* type_expression: type_expression_class  */
  if (yyn == 74)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":402  */
                                                                                        {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 75: /* type_expression_class: IDENTIFIER '<' type_expressions '>'  */
  if (yyn == 75)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":406  */
                                                        {yyval = new TypeExpression(Tag.CLASS, ((Type)(yystack.valueAt (1))), ((String)(yystack.valueAt (3))));};
  break;


  case 76: /* type_expression_class: IDENTIFIER  */
  if (yyn == 76)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":407  */
                                                                        {yyval = new TypeExpression(Tag.CLASS, ((String)(yystack.valueAt (0))));};
  break;


  case 77: /* type_expressions: type_expressions ',' type_expression  */
  if (yyn == 77)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":411  */
                                                                                        {yyval = new TypeExpression(Tag.PRODUCT, ((Type)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));};
  break;


  case 78: /* type_expressions: type_expression  */
  if (yyn == 78)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":412  */
                                                                                                {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 79: /* type_names: type_names ',' type_name  */
  if (yyn == 79)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":416  */
                                                                                {yyval = new TypeExpression(Tag.PRODUCT, ((Type)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));};
  break;


  case 80: /* type_names: type_name  */
  if (yyn == 80)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":417  */
                                                                                        {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 81: /* type_name: IDENTIFIER  */
  if (yyn == 81)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":421  */
                                                                                        {yyval = new TypeExpression(Tag.NAME, ((String)(yystack.valueAt (0))));};
  break;


  case 82: /* args_definition: args_definition ',' arg_definition  */
  if (yyn == 82)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":425  */
                                           {yyval = new TypeExpression(Tag.PRODUCT, ((Type)(yystack.valueAt (2))), ((Type)(yystack.valueAt (0))));};
  break;


  case 83: /* args_definition: arg_definition  */
  if (yyn == 83)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":426  */
                         {yyval = ((Type)(yystack.valueAt (0)));};
  break;


  case 84: /* arg_definition: IDENTIFIER ':' type_expression  */
  if (yyn == 84)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":431  */
        {
		yyval = new TypeExpression(Tag.FIELD, ((Type)(yystack.valueAt (0))), ((String)(yystack.valueAt (2))));
	};
  break;


  case 85: /* block: '{' var_definitions stms '}'  */
  if (yyn == 85)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":437  */
                                     { yyval = ((Stree)(yystack.valueAt (1))); };
  break;


  case 88: /* var_definition: IDENTIFIER ':' type_expression ';'  */
  if (yyn == 88)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":446  */
                                           { localVarEnvironment.put(((String)(yystack.valueAt (3))), ((Type)(yystack.valueAt (1)))); };
  break;


  case 89: /* stms: stms stm  */
  if (yyn == 89)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":450  */
                 { yyval = new StreeSEQ(((Stree)(yystack.valueAt (1))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 90: /* stms: stm  */
  if (yyn == 90)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":451  */
              { yyval = ((Stree)(yystack.valueAt (0))); };
  break;


  case 91: /* stm: simple_stm ';'  */
  if (yyn == 91)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":455  */
                       { yyval = ((Stree)(yystack.valueAt (1))); };
  break;


  case 92: /* stm: "if" '(' expression ')' stm  */
  if (yyn == 92)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":456  */
                                                         { yyval = new StreeIF(((Stree)(yystack.valueAt (2))), new StreeTHENELSE(((Stree)(yystack.valueAt (0))))); };
  break;


  case 93: /* stm: "if" '(' expression ')' stm "else" stm  */
  if (yyn == 93)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":457  */
                                                 { yyval = new StreeIF(((Stree)(yystack.valueAt (4))), new StreeTHENELSE(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0))))); };
  break;


  case 94: /* stm: "while" '(' expression ')' stm  */
  if (yyn == 94)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":458  */
                                         { yyval = new StreeWHILE(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 95: /* stm: "do" stm "while" '(' expression ')' ';'  */
  if (yyn == 95)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":459  */
                                                { yyval = new StreeDO(((Stree)(yystack.valueAt (5))), ((Stree)(yystack.valueAt (2)))); };
  break;


  case 96: /* stm: "for" '(' assigned_variable ':' expression ')' stm  */
  if (yyn == 96)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":460  */
                                                             { yyval = new StreeFOR(((Stree)(yystack.valueAt (4))), ((Stree)(yystack.valueAt (2)))); };
  break;


  case 97: /* stm: "for" '(' assignment_stm ';' expression ';' simple_stm ')' stm  */
  if (yyn == 97)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":461  */
                                                                         { yyval = new StreeFOR(((Stree)(yystack.valueAt (6))), new StreeFORCONT(((Stree)(yystack.valueAt (4))), ((Stree)(yystack.valueAt (2))))); };
  break;


  case 98: /* stm: "foreach" assigned_variable "in" expression stm  */
  if (yyn == 98)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":462  */
                                                          { yyval = new StreeFOREACH(((Stree)(yystack.valueAt (3))), new StreeFOREACHCONT(((Stree)(yystack.valueAt (1))), ((Stree)(yystack.valueAt (0))))); };
  break;


  case 99: /* stm: "switch" '(' expression ')' '{' case_stms '}'  */
  if (yyn == 99)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":463  */
                                                        { yyval = new StreeSWITCH(((Stree)(yystack.valueAt (4))), ((Stree)(yystack.valueAt (1)))); };
  break;


  case 100: /* stm: block  */
  if (yyn == 100)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":464  */
                { yyval = ((Stree)(yystack.valueAt (0))); };
  break;


  case 101: /* case_stms: case_stm case_stms  */
  if (yyn == 101)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":468  */
                            { yyval = new StreePRODUCT(((Stree)(yystack.valueAt (1))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 102: /* case_stms: case_stm  */
  if (yyn == 102)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":469  */
                   { yyval = ((Stree)(yystack.valueAt (0))); };
  break;


  case 103: /* case_stms: default_stm  */
  if (yyn == 103)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":470  */
                      { yyval = ((Stree)(yystack.valueAt (0))); };
  break;


  case 104: /* case_stm: "case" expression ':' stm  */
  if (yyn == 104)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":474  */
                                   { yyval = new StreeCASE(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0))));  };
  break;


  case 105: /* default_stm: "default" ':' stm  */
  if (yyn == 105)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":478  */
                           { yyval = new StreeDEFAULT(((Stree)(yystack.valueAt (0))));  };
  break;


  case 106: /* assignment_stm: assigned_variable ":=" expression  */
  if (yyn == 106)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":482  */
                                          { yyval = new StreeAFF(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 107: /* assignment_stm: IDENTIFIER ':' type_expression ":=" expression  */
  if (yyn == 107)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":483  */
                                                         { localVarEnvironment.put(((String)(yystack.valueAt (4))), ((Type)(yystack.valueAt (2)))); yyval = new StreeAFF(new StreeVARIABLE(((String)(yystack.valueAt (4))), ((Type)(yystack.valueAt (2)))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 108: /* simple_stm: assignment_stm  */
  if (yyn == 108)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":487  */
                       { yyval = ((Stree)(yystack.valueAt (0))); };
  break;


  case 109: /* simple_stm: assigned_variable "++"  */
  if (yyn == 109)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":488  */
                                 { yyval = new StreeSUCC(((Stree)(yystack.valueAt (1))), StreeSUCC.RIGHT); };
  break;


  case 110: /* simple_stm: assigned_variable "--"  */
  if (yyn == 110)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":489  */
                                 { yyval = new StreeDEC(((Stree)(yystack.valueAt (1))), StreeDEC.RIGHT); };
  break;


  case 111: /* simple_stm: assigned_variable "+=" expression  */
  if (yyn == 111)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":490  */
                                            { yyval = new StreePLUSAFF(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 112: /* simple_stm: assigned_variable "-=" expression  */
  if (yyn == 112)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":491  */
                                            { yyval = new StreeMINUSAFF(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 113: /* simple_stm: assigned_variable "*=" expression  */
  if (yyn == 113)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":492  */
                                            { yyval = new StreeTIMESAFF(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 114: /* simple_stm: assigned_variable "/=" expression  */
  if (yyn == 114)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":493  */
                                            { yyval = new StreeDIVAFF(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 115: /* simple_stm: assigned_variable "||=" expression  */
  if (yyn == 115)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":494  */
                                             { yyval = new StreeORAFF(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 116: /* simple_stm: assigned_variable "&&=" expression  */
  if (yyn == 116)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":495  */
                                             { yyval = new StreeANDAFF(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 117: /* simple_stm: assigned_variable "&=" expression  */
  if (yyn == 117)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":496  */
                                            { yyval = new StreeBANDAFF(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 118: /* simple_stm: assigned_variable "|=" expression  */
  if (yyn == 118)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":497  */
                                            { yyval = new StreeBORAFF(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 119: /* simple_stm: assigned_variable "<<=" expression  */
  if (yyn == 119)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":498  */
                                             { yyval = new StreeLSHIFTAFF(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 120: /* simple_stm: assigned_variable ">>=" expression  */
  if (yyn == 120)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":499  */
                                             { yyval = new StreeRSHIFTAFF(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 121: /* simple_stm: method_name '(' args ')'  */
  if (yyn == 121)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":500  */
                                   { yyval = new StreeCALL(((Stree)(yystack.valueAt (3))), ((Stree)(yystack.valueAt (1)))); };
  break;


  case 122: /* simple_stm: "readln" '(' expression ')'  */
  if (yyn == 122)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":501  */
                                      { yyval = new StreeCALL(new StreeMETHOD("readln"), new StreeARGS(((Stree)(yystack.valueAt (1))))); };
  break;


  case 123: /* simple_stm: "write" '(' expression ')'  */
  if (yyn == 123)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":502  */
                                     { yyval = new StreeCALL(new StreeMETHOD("write"), new StreeARGS(((Stree)(yystack.valueAt (1))))); };
  break;


  case 124: /* simple_stm: "writeln" '(' expression ')'  */
  if (yyn == 124)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":503  */
                                       { yyval = new StreeCALL(new StreeMETHOD("writeln"), new StreeARGS(((Stree)(yystack.valueAt (1))))); };
  break;


  case 125: /* simple_stm: "break"  */
  if (yyn == 125)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":504  */
                  { yyval = new StreeBREAK(); };
  break;


  case 126: /* simple_stm: "continue"  */
  if (yyn == 126)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":505  */
                     { yyval = new StreeCONTINUE(); };
  break;


  case 127: /* simple_stm: "return" expression  */
  if (yyn == 127)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":506  */
                              { yyval = new StreeRETURN(((Stree)(yystack.valueAt (0)))); };
  break;


  case 128: /* assigned_variable: IDENTIFIER  */
  if (yyn == 128)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":513  */
        {
		try {
			Type localType = localVarEnvironment.get(((String)(yystack.valueAt (0))));
			if (localType == null)
				localType = varEnvironment.get(((String)(yystack.valueAt (0))));
			if (localType == null)
				throw new EnvironmentException("unknown variable " + ((String)(yystack.valueAt (0))));
			yyval = new StreeVARIABLE(((String)(yystack.valueAt (0))), localType);
		}
		catch (EnvironmentException environmentException) {
			yyerror ("*** unknown variable: " + ((String)(yystack.valueAt (0))) + " " + environmentException.getMessage());
			yyval = null;
		}
	};
  break;


  case 129: /* assigned_variable: IDENTIFIER '[' args ']'  */
  if (yyn == 129)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":529  */
        {
		yyval = null;
		yyerror(yystack.locationAt (3), "not yet implemented");
	};
  break;


  case 130: /* assigned_variable: assigned_variable '.' IDENTIFIER  */
  if (yyn == 130)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":535  */
        {
		yyval = new StreeSLOT(((Stree)(yystack.valueAt (2))), ((String)(yystack.valueAt (0))));
		yyerror(yystack.locationAt (2), "not yet implemented");
	};
  break;


  case 131: /* assigned_variable: "this"  */
  if (yyn == 131)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":541  */
        {
		yyval = new StreeTHIS();
		yyerror(yystack.locationAt (0), "not yet implemented");
	};
  break;


  case 132: /* method_name: IDENTIFIER  */
  if (yyn == 132)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":549  */
        {
		type = localVarEnvironment.get(((String)(yystack.valueAt (0))));
		if (type == null)
			type = varEnvironment.get(((String)(yystack.valueAt (0))));
		if (type == null)
			throw new EnvironmentException("unknown variable " + ((String)(yystack.valueAt (0))));
		yyval = new StreeMETHOD(((String)(yystack.valueAt (0))), type);
	};
  break;


  case 133: /* method_name: assigned_variable '.' IDENTIFIER  */
  if (yyn == 133)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":557  */
                                           { yyval = new StreeSLOT(((Stree)(yystack.valueAt (2))), ((String)(yystack.valueAt (0)))); };
  break;


  case 134: /* args: args ',' expression  */
  if (yyn == 134)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":561  */
                            {yyval = new StreeARGS(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0))));};
  break;


  case 135: /* args: expression  */
  if (yyn == 135)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":562  */
                     { yyval = yyval = new StreeARGS(((Stree)(yystack.valueAt (0))), null);};
  break;


  case 136: /* const_expression: "null"  */
  if (yyn == 136)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":566  */
               {yyval = new StreeNULL(); };
  break;


  case 137: /* const_expression: CONSTANT_INTEGER  */
  if (yyn == 137)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":567  */
                           {yyval = new StreeINTEGER(((Integer)(yystack.valueAt (0)))); };
  break;


  case 138: /* const_expression: CONSTANT_FLOAT  */
  if (yyn == 138)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":568  */
                         {yyval = new StreeFLOAT(((Float)(yystack.valueAt (0)))); };
  break;


  case 139: /* const_expression: CONSTANT_CHAR  */
  if (yyn == 139)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":569  */
                         {yyval = new StreeCHAR(((Integer)(yystack.valueAt (0)))); };
  break;


  case 140: /* const_expression: CONSTANT_STRING  */
  if (yyn == 140)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":570  */
                           {yyval = new StreeSTRING(((String)(yystack.valueAt (0)))); };
  break;


  case 141: /* const_expression: '[' const_expression ".." const_expression ']'  */
  if (yyn == 141)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":571  */
                                                         {yyval = new StreeRANGE(((Stree)(yystack.valueAt (3))), ((Stree)(yystack.valueAt (1)))); };
  break;


  case 142: /* expression: const_expression  */
  if (yyn == 142)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":575  */
                                                                { yyval = ((Stree)(yystack.valueAt (0))); };
  break;


  case 143: /* expression: assigned_variable  */
  if (yyn == 143)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":576  */
                                                { yyval = ((Stree)(yystack.valueAt (0))); };
  break;


  case 144: /* expression: method_name '(' args ')'  */
  if (yyn == 144)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":577  */
                                        { yyval = new StreeCALL(((Stree)(yystack.valueAt (3))), ((Stree)(yystack.valueAt (1)))); };
  break;


  case 145: /* expression: "new" type_expression_class '(' args_opt ')'  */
  if (yyn == 145)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":578  */
                                                                        { yyval = new StreeNEW(((Type)(yystack.valueAt (3))), ((Stree)(yystack.valueAt (1)))); };
  break;


  case 146: /* expression: expression "&&" expression  */
  if (yyn == 146)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":579  */
                                                                { yyval = new StreeAND(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 147: /* expression: expression "||" expression  */
  if (yyn == 147)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":580  */
                                                                { yyval = new StreeOR(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 148: /* expression: '!' expression  */
  if (yyn == 148)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":581  */
                                                                { yyval = new StreeNOT(((Stree)(yystack.valueAt (0)))); };
  break;


  case 149: /* expression: expression '<' expression  */
  if (yyn == 149)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":582  */
                                                                { yyval = new StreeLT(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 150: /* expression: expression "<=" expression  */
  if (yyn == 150)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":583  */
                                                        { yyval = new StreeLE(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 151: /* expression: expression '>' expression  */
  if (yyn == 151)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":584  */
                                                                { yyval = new StreeGT(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 152: /* expression: expression ">=" expression  */
  if (yyn == 152)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":585  */
                                                        { yyval = new StreeGE(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 153: /* expression: expression "==" expression  */
  if (yyn == 153)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":586  */
                                                        { yyval = new StreeEQ(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 154: /* expression: expression "!=" expression  */
  if (yyn == 154)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":587  */
                                                        { yyval = new StreeNE(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 155: /* expression: expression '+' expression  */
  if (yyn == 155)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":588  */
                                                        { yyval = new StreePLUS(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 156: /* expression: expression '-' expression  */
  if (yyn == 156)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":589  */
                                                            { yyval = new StreeMINUS(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 157: /* expression: '-' expression  */
  if (yyn == 157)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":590  */
                                                { yyval = new StreeMINUS(((Stree)(yystack.valueAt (0)))); };
  break;


  case 158: /* expression: expression '*' expression  */
  if (yyn == 158)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":591  */
                                                        { yyval = new StreeTIMES(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 159: /* expression: expression '/' expression  */
  if (yyn == 159)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":592  */
                                                            { yyval = new StreeDIV(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 160: /* expression: expression "++"  */
  if (yyn == 160)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":593  */
                                                        { yyval = new StreeSUCC(((Stree)(yystack.valueAt (1))), StreeSUCC.RIGHT); };
  break;


  case 161: /* expression: expression "--"  */
  if (yyn == 161)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":594  */
                                                                { yyval = new StreeDEC(((Stree)(yystack.valueAt (1))), StreeDEC.RIGHT); };
  break;


  case 162: /* expression: "++" expression  */
  if (yyn == 162)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":595  */
                                                                { yyval = new StreeSUCC(((Stree)(yystack.valueAt (0))), StreeSUCC.LEFT); };
  break;


  case 163: /* expression: "--" expression  */
  if (yyn == 163)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":596  */
                                                        { yyval = new StreeDEC(((Stree)(yystack.valueAt (0))), StreeDEC.LEFT); };
  break;


  case 164: /* expression: expression '&' expression  */
  if (yyn == 164)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":597  */
                                                        { yyval = new StreeAND(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 165: /* expression: expression '|' expression  */
  if (yyn == 165)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":598  */
                                                        { yyval = new StreeOR(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 166: /* expression: expression "<<" expression  */
  if (yyn == 166)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":599  */
                                                { yyval = new StreeLSHIFT(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 167: /* expression: expression ">>" expression  */
  if (yyn == 167)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":600  */
                                                { yyval = new StreeRSHIFT(((Stree)(yystack.valueAt (2))), ((Stree)(yystack.valueAt (0)))); };
  break;


  case 168: /* expression: '(' expression ')'  */
  if (yyn == 168)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":601  */
                                                {yyval = ((Stree)(yystack.valueAt (1)));};
  break;


  case 169: /* args_opt: %empty  */
  if (yyn == 169)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":605  */
               {yyval = null;};
  break;


  case 170: /* args_opt: args  */
  if (yyn == 170)
    /* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":606  */
               {yyval = ((Stree)(yystack.valueAt (0)));};
  break;



/* "/home/fnoury/L3/Compilation/projet-20210420/src/fr/ubordeaux/deptinfo/compilation/lea/parser/Parser.java":2102  */

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
  public boolean parse() throws java.io.IOException, EnvironmentException, TypeException, StreeException

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

  private static final short yypact_ninf_ = -214;
  private static final short yytable_ninf_ = -134;

/* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
   STATE-NUM.  */
  private static final short[] yypact_ = yypact_init();
  private static final short[] yypact_init()
  {
    return new short[]
    {
    -214,    34,   110,  -214,    80,   -65,   -31,  -214,    -3,  -214,
     -50,    36,  -214,    64,  -214,  -214,    49,   115,    49,    85,
      78,    46,    33,  -214,   192,    99,  -214,  -214,   104,    76,
    -214,  -214,  -214,   126,  -214,    78,  -214,  -214,  -214,  -214,
       8,    49,    49,    49,  -214,    73,   196,   131,   201,   114,
    -214,  -214,  -214,   -53,   103,    41,  -214,  -214,    78,   143,
     144,  -214,    73,    68,   142,    -6,  -214,   937,  -214,   937,
     131,   155,   158,  -214,  -214,   141,   152,   147,  -214,  -214,
    -214,  -214,  -214,  -214,    68,  -214,   937,   131,  -214,  -214,
    -214,   169,  -214,  -214,   181,   182,   189,   198,  -214,   199,
    -214,  -214,   185,    81,   180,   186,   188,   131,   131,  -214,
     265,  -214,  -214,  -214,   215,   937,   937,   937,   937,   937,
    -214,   214,   131,   131,  -214,    90,    91,    68,  -214,  -214,
      86,  -214,   233,   221,   235,   236,  -214,    87,  -214,  -214,
     111,   124,   243,   224,   222,   230,  -214,   215,  -214,   937,
    -214,  -214,  -214,   937,  -214,  -214,   248,   229,   937,  -214,
    -214,  -214,  -214,  -214,   244,  -214,   230,   232,   937,  -214,
    -214,   242,   865,  -214,  -214,  -214,  -214,   245,  -214,  -214,
    -214,  -214,  -214,   911,   247,    54,   249,   250,    23,   253,
    -214,   254,   255,   256,   -43,  -214,  -214,   852,  -214,  -214,
     252,    56,   257,  -214,  -214,  -214,  -214,   230,   261,    38,
     270,    89,   241,   -29,    23,    23,    23,    23,   275,   179,
      23,    23,    23,   264,   271,  -214,   736,    23,    23,    23,
      23,   937,    23,  -214,  -214,  -214,    23,    23,    23,    23,
      23,    23,    23,    23,    23,    23,    23,  -214,  -214,   288,
      23,  -214,  -214,  -214,  -214,   937,   272,   -57,   266,     1,
      23,   297,   251,   291,    -9,    -9,   273,   778,    -9,   377,
      23,  -214,  -214,    23,    23,    23,    23,    23,    23,    23,
      23,    23,    23,    23,    23,    23,    23,    23,    23,   395,
     413,   431,   517,     2,   -16,   736,   736,   736,   736,   736,
     736,   736,   736,   736,   736,   736,   736,   274,   128,   230,
     282,  -214,  -214,   378,    23,    23,    23,   655,  -214,   911,
    -214,    23,  -214,   129,   778,   766,    35,    35,   790,   790,
     790,   790,   790,   790,   148,   148,    13,    13,    -4,    35,
     287,  -214,  -214,   911,    23,  -214,    23,  -214,  -214,  -214,
    -214,   535,   571,   553,  -214,   347,   289,   290,  -214,   145,
    -214,   736,   736,  -214,  -214,   300,   296,   911,   911,  -214,
      23,   310,   293,   145,  -214,  -214,   303,  -214,  -214,   686,
     911,  -214,  -214,   911,   911,  -214,  -214,  -214
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
       3,     0,     0,     1,     0,     0,     0,     4,     2,     7,
       0,    11,     5,    15,     6,    30,     0,    13,     0,     0,
      53,    19,    12,    18,    53,     0,    16,    30,     0,     0,
      54,    56,    55,     0,    31,    53,    23,    24,    25,    26,
      57,     0,     0,     0,    30,    60,     0,     0,     0,     0,
      22,    59,    58,     0,     0,     0,    17,    14,    53,     0,
       0,    31,    60,     0,     0,     0,    83,     0,     9,     0,
       0,     0,     0,    20,    31,     0,     0,     0,    61,   136,
     140,   137,   139,   138,     0,    28,     0,     0,    32,    67,
      64,     0,    66,    65,     0,     0,     0,     0,    68,    76,
      27,    74,     0,     0,     0,     0,     0,     0,     0,    10,
       0,    84,    82,    30,     0,     0,     0,     0,     0,     0,
      29,    35,     0,     0,     8,     0,     0,     0,    33,    81,
       0,    80,     0,     0,     0,     0,    78,     0,    30,    30,
       0,     0,     0,     0,     0,     0,    69,     0,    71,     0,
      70,    72,    75,     0,    36,    39,     0,    41,     0,    62,
     141,    86,    31,    79,     0,    77,     0,     0,     0,    30,
      30,     0,     0,    34,    73,    31,    31,    47,    42,    45,
      63,   125,   126,     0,     0,     0,     0,     0,     0,     0,
     131,     0,     0,     0,   128,   100,    87,     0,    90,   108,
       0,     0,     0,    37,    40,    30,    30,     0,     0,   128,
       0,     0,   128,     0,     0,     0,     0,     0,     0,   128,
       0,     0,     0,   143,     0,   142,   127,     0,     0,     0,
       0,     0,     0,    85,    89,    91,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,   109,   110,     0,
       0,    48,    51,    31,    31,     0,     0,   128,     0,     0,
       0,     0,     0,     0,   162,   163,     0,   148,   157,     0,
       0,   160,   161,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,   135,   106,   111,   112,   113,
     114,   115,   116,   117,   118,   119,   120,   130,     0,     0,
       0,    43,    46,     0,     0,     0,     0,     0,   130,     0,
     122,   169,   168,     0,   146,   147,   166,   167,   153,   150,
     152,   154,   149,   151,   155,   156,   158,   159,   165,   164,
       0,   123,   124,     0,     0,    88,     0,   129,   121,    31,
      31,     0,     0,     0,    98,    92,   170,     0,   144,     0,
      94,   107,   134,    49,    52,     0,     0,     0,     0,   145,
       0,     0,     0,   102,   103,    95,     0,    96,    93,     0,
       0,    99,   101,     0,     0,   105,    97,   104
    };
  }

/* YYPGOTO[NTERM-NUM].  */
  private static final short[] yypgoto_ = yypgoto_init();
  private static final short[] yypgoto_init()
  {
    return new short[]
    {
    -214,  -214,  -214,  -214,  -214,   396,  -214,  -214,  -214,   364,
       0,    53,  -214,  -214,  -214,  -214,   -20,   -61,  -214,  -214,
    -214,  -214,  -214,  -214,  -214,  -214,  -214,  -214,  -214,  -214,
    -214,  -214,  -214,   382,  -214,   345,  -214,   -66,   190,  -214,
    -214,   262,     5,   329,  -143,  -214,  -214,  -214,  -161,    48,
    -214,  -214,   211,    57,  -171,  -166,  -213,   -54,    17,  -214
    };
  }

/* YYDEFGOTO[NTERM-NUM].  */
  private static final short[] yydefgoto_ = yydefgoto_init();
  private static final short[] yydefgoto_init()
  {
    return new short[]
    {
       0,     1,     2,     7,     8,     9,    17,    25,    19,    22,
      23,    34,    35,    36,    37,    38,    20,    49,    39,   113,
     145,   138,   166,   139,   167,   169,   207,   170,   208,   205,
     309,   206,   310,    40,    54,    61,    62,   100,   101,   137,
     130,   131,    65,    66,   195,   172,   196,   197,   198,   372,
     373,   374,   199,   200,   223,   224,   294,   225,   295,   357
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
      77,   201,   162,   102,   236,   344,   202,    45,    12,    85,
     275,   276,   201,   106,   213,   275,   276,   202,    26,   260,
     111,   255,   210,   175,    58,    69,   201,     4,   271,   272,
     110,   202,   275,   276,     3,   231,   234,   308,   216,   217,
     259,    13,    56,    57,   232,    15,    70,     6,    51,   132,
     133,   134,   135,   136,   275,   276,  -132,   323,   232,   236,
     237,   238,   239,   240,   253,   241,   242,   243,   244,   245,
     246,   247,   248,   144,   261,   103,    52,   218,    79,   316,
      53,   346,    16,   164,   287,   288,   347,   165,    50,   190,
     288,    87,   171,   128,    88,   219,    80,    81,    82,    83,
     345,   173,   177,    18,   261,   220,   287,   288,   356,   221,
      28,    74,   125,   126,   203,   204,   255,    59,   154,   155,
     190,    21,   222,    79,    84,    73,   212,   140,   141,    41,
      42,    29,    60,    10,    30,    31,    32,  -132,    42,   232,
       4,    80,    81,    82,    83,    33,   201,    71,   201,   178,
     179,   202,    11,   202,    24,   190,   354,     5,   355,   249,
       6,   257,    72,   271,   272,   293,   349,   275,   276,    84,
     146,   152,   201,   370,   -21,    47,    46,   202,    87,   371,
      27,   121,   360,   147,   153,   251,   252,    87,    87,   313,
     142,   143,   311,   312,    44,   201,   201,   201,    48,    63,
     202,   202,   202,    64,    67,   226,   377,   378,    87,   201,
      68,   156,   201,   201,   202,    75,    76,   202,   202,   385,
      86,    87,   386,   387,   157,   346,   346,   104,   348,   358,
     105,   262,   263,   264,   265,   285,   286,   267,   268,   269,
     107,   287,   288,   109,   289,   290,   291,   292,    30,    31,
      32,   108,   114,   296,   297,   298,   299,   300,   301,   302,
     303,   304,   305,   306,   115,   116,   271,   272,   273,   274,
     275,   276,   117,   277,   278,   279,   280,   317,  -132,   122,
     232,   118,   119,   120,   124,   123,   127,   129,   363,   364,
     324,   325,   326,   327,   328,   329,   330,   331,   332,   333,
     334,   335,   336,   337,   338,   339,   271,   272,   273,   274,
     275,   276,   -38,   277,   278,   279,   280,   148,   149,   150,
     151,   158,   159,   181,   160,   161,   168,   -44,   174,   182,
     176,   351,   352,   353,   281,   282,   283,   284,   285,   286,
     180,   256,   232,   -50,   287,   288,   211,    99,   214,   215,
     235,   319,   227,   228,   229,   230,   250,   187,   188,   254,
     307,   361,   190,   362,   315,   191,   192,   249,   209,   318,
     270,   314,   321,  -133,   281,   282,   283,   284,   285,   286,
     350,   344,   359,   368,   287,   288,   346,   379,   380,   381,
     369,   320,   271,   272,   273,   274,   275,   276,   375,   277,
     278,   279,   280,   383,    14,    55,    43,    78,   266,   163,
     271,   272,   273,   274,   275,   276,   112,   277,   278,   279,
     280,   382,   258,   376,     0,     0,     0,     0,   271,   272,
     273,   274,   275,   276,     0,   277,   278,   279,   280,     0,
       0,     0,     0,     0,     0,     0,   271,   272,   273,   274,
     275,   276,     0,   277,   278,   279,   280,     0,     0,     0,
     281,   282,   283,   284,   285,   286,     0,     0,     0,     0,
     287,   288,     0,     0,     0,     0,     0,   322,   281,   282,
     283,   284,   285,   286,     0,     0,     0,     0,   287,   288,
       0,     0,     0,     0,     0,   340,   281,   282,   283,   284,
     285,   286,     0,     0,     0,     0,   287,   288,     0,     0,
       0,     0,     0,   341,   281,   282,   283,   284,   285,   286,
       0,     0,     0,     0,   287,   288,     0,     0,     0,     0,
       0,   342,   271,   272,   273,   274,   275,   276,     0,   277,
     278,   279,   280,     0,     0,     0,     0,     0,     0,     0,
     271,   272,   273,   274,   275,   276,     0,   277,   278,   279,
     280,     0,     0,     0,     0,     0,     0,     0,   271,   272,
     273,   274,   275,   276,     0,   277,   278,   279,   280,     0,
       0,     0,     0,     0,     0,     0,   271,   272,   273,   274,
     275,   276,     0,   277,   278,   279,   280,     0,     0,     0,
     281,   282,   283,   284,   285,   286,     0,     0,     0,     0,
     287,   288,     0,     0,     0,     0,     0,   343,   281,   282,
     283,   284,   285,   286,     0,     0,     0,     0,   287,   288,
       0,     0,     0,     0,     0,   365,   281,   282,   283,   284,
     285,   286,     0,     0,     0,     0,   287,   288,     0,     0,
       0,     0,     0,   367,   281,   282,   283,   284,   285,   286,
       0,     0,     0,     0,   287,   288,     0,     0,     0,   366,
     271,   272,   273,   274,   275,   276,     0,   277,   278,   279,
     280,     0,   181,     0,     0,     0,     0,     0,   182,     0,
     183,     0,     0,     0,     0,     0,     0,   184,   185,     0,
     186,   271,   272,   273,   274,   275,   276,     0,   277,   278,
     279,   280,     0,     0,     0,     0,   187,   188,     0,     0,
     189,   190,     0,     0,   191,   192,   193,   209,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,   281,   282,
     283,   284,   285,   286,     0,     0,     0,     0,   287,   288,
     161,   271,   272,   273,   274,   275,   276,     0,   277,   278,
     279,   280,     0,     0,   384,     0,     0,     0,     0,   281,
     282,   283,   284,   285,   286,     0,     0,     0,     0,   287,
     288,   271,   272,   273,     0,   275,   276,     0,   277,   278,
     279,   280,     0,   271,   272,     0,     0,   275,   276,     0,
     277,   278,   279,   280,     0,   271,   272,     0,     0,   275,
     276,     0,  -134,  -134,  -134,  -134,     0,     0,     0,   281,
     282,   283,   284,   285,   286,     0,     0,     0,     0,   287,
     288,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,   281,
     282,   283,   284,   285,   286,     0,     0,     0,     0,   287,
     288,   281,   282,   283,   284,   285,   286,     0,     0,     0,
       0,   287,   288,  -134,  -134,   283,   284,   285,   286,   181,
       0,     0,     0,   287,   288,   182,     0,   183,     0,     0,
       0,     0,   181,     0,   184,   185,     0,   186,   182,     0,
     183,     0,     0,     0,     0,     0,     0,   184,   185,     0,
     186,     0,     0,   187,   188,     0,     0,   189,   190,     0,
       0,   191,   192,   193,   209,     0,   187,   188,     0,     0,
     189,   190,     0,     0,   191,   192,   193,   194,   181,     0,
       0,     0,     0,     0,   182,     0,   183,   161,   233,     0,
       0,     0,     0,   184,   185,     0,   186,     0,     0,     0,
     161,     0,     0,    89,     0,     0,    90,     0,     0,     0,
       0,     0,   187,   188,    91,     0,   189,   190,    92,     0,
     191,   192,   193,   209,     0,     0,    93,     0,    94,    95,
       0,     0,     0,     0,     0,     0,     0,    96,     0,     0,
      97,    98,     0,     0,     0,     0,   161,     0,     0,    99
    };
  }

private static final short[] yycheck_ = yycheck_init();
  private static final short[] yycheck_init()
  {
    return new short[]
    {
      61,   172,   145,    69,     3,     3,   172,    27,    73,    63,
      19,    20,   183,    74,   185,    19,    20,   183,    18,    48,
      86,    78,   183,   166,    44,    78,   197,    30,    15,    16,
      84,   197,    19,    20,     0,    78,   197,   250,    15,    16,
     211,    72,    42,    43,   101,    95,    99,    50,    40,   115,
     116,   117,   118,   119,    19,    20,    99,   270,   101,     3,
       4,     5,     6,     7,   207,     9,    10,    11,    12,    13,
      14,    15,    16,   127,   103,    70,    68,    54,    55,    78,
      72,    97,    46,   149,    93,    94,   102,   153,    35,    66,
      94,    97,   158,   113,   100,    72,    73,    74,    75,    76,
      98,   162,   168,    39,   103,    82,    93,    94,   321,    86,
      32,    58,   107,   108,   175,   176,    78,    44,   138,   139,
      66,    72,    99,    55,   101,    84,    72,   122,   123,    83,
      97,    53,    59,    53,    56,    57,    58,    99,    97,   101,
      30,    73,    74,    75,    76,    67,   317,    44,   319,   169,
     170,   317,    72,   319,    39,    66,   317,    47,   319,   103,
      50,    72,    59,    15,    16,   231,   309,    19,    20,   101,
      84,    84,   343,    28,    96,    99,    72,   343,    97,    34,
      95,   100,   343,    97,    97,   205,   206,    97,    97,   255,
     100,   100,   253,   254,    95,   366,   367,   368,    72,     3,
     366,   367,   368,    72,     3,   188,   367,   368,    97,   380,
      96,   100,   383,   384,   380,    72,    72,   383,   384,   380,
      78,    97,   383,   384,   100,    97,    97,    72,   100,   100,
      72,   214,   215,   216,   217,    87,    88,   220,   221,   222,
      99,    93,    94,    96,   227,   228,   229,   230,    56,    57,
      58,    99,    83,   236,   237,   238,   239,   240,   241,   242,
     243,   244,   245,   246,    83,    83,    15,    16,    17,    18,
      19,    20,    83,    22,    23,    24,    25,   260,    99,    99,
     101,    83,    83,    98,    96,    99,    21,    72,   349,   350,
     273,   274,   275,   276,   277,   278,   279,   280,   281,   282,
     283,   284,   285,   286,   287,   288,    15,    16,    17,    18,
      19,    20,    98,    22,    23,    24,    25,    84,    97,    84,
      84,    78,    98,    27,   102,    95,    78,    98,    84,    33,
      98,   314,   315,   316,    83,    84,    85,    86,    87,    88,
      98,    71,   101,    98,    93,    94,    99,    72,    99,    99,
      98,   100,    99,    99,    99,    99,    99,    61,    62,    98,
      72,   344,    66,   346,    98,    69,    70,   103,    72,    72,
      99,    99,    99,    99,    83,    84,    85,    86,    87,    88,
      98,     3,    95,    36,    93,    94,    97,   370,    78,    96,
     100,   100,    15,    16,    17,    18,    19,    20,    98,    22,
      23,    24,    25,   100,     8,    41,    24,    62,   218,   147,
      15,    16,    17,    18,    19,    20,    87,    22,    23,    24,
      25,   373,   211,   366,    -1,    -1,    -1,    -1,    15,    16,
      17,    18,    19,    20,    -1,    22,    23,    24,    25,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    15,    16,    17,    18,
      19,    20,    -1,    22,    23,    24,    25,    -1,    -1,    -1,
      83,    84,    85,    86,    87,    88,    -1,    -1,    -1,    -1,
      93,    94,    -1,    -1,    -1,    -1,    -1,   100,    83,    84,
      85,    86,    87,    88,    -1,    -1,    -1,    -1,    93,    94,
      -1,    -1,    -1,    -1,    -1,   100,    83,    84,    85,    86,
      87,    88,    -1,    -1,    -1,    -1,    93,    94,    -1,    -1,
      -1,    -1,    -1,   100,    83,    84,    85,    86,    87,    88,
      -1,    -1,    -1,    -1,    93,    94,    -1,    -1,    -1,    -1,
      -1,   100,    15,    16,    17,    18,    19,    20,    -1,    22,
      23,    24,    25,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      15,    16,    17,    18,    19,    20,    -1,    22,    23,    24,
      25,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    15,    16,
      17,    18,    19,    20,    -1,    22,    23,    24,    25,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    15,    16,    17,    18,
      19,    20,    -1,    22,    23,    24,    25,    -1,    -1,    -1,
      83,    84,    85,    86,    87,    88,    -1,    -1,    -1,    -1,
      93,    94,    -1,    -1,    -1,    -1,    -1,   100,    83,    84,
      85,    86,    87,    88,    -1,    -1,    -1,    -1,    93,    94,
      -1,    -1,    -1,    -1,    -1,   100,    83,    84,    85,    86,
      87,    88,    -1,    -1,    -1,    -1,    93,    94,    -1,    -1,
      -1,    -1,    -1,   100,    83,    84,    85,    86,    87,    88,
      -1,    -1,    -1,    -1,    93,    94,    -1,    -1,    -1,    98,
      15,    16,    17,    18,    19,    20,    -1,    22,    23,    24,
      25,    -1,    27,    -1,    -1,    -1,    -1,    -1,    33,    -1,
      35,    -1,    -1,    -1,    -1,    -1,    -1,    42,    43,    -1,
      45,    15,    16,    17,    18,    19,    20,    -1,    22,    23,
      24,    25,    -1,    -1,    -1,    -1,    61,    62,    -1,    -1,
      65,    66,    -1,    -1,    69,    70,    71,    72,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    83,    84,
      85,    86,    87,    88,    -1,    -1,    -1,    -1,    93,    94,
      95,    15,    16,    17,    18,    19,    20,    -1,    22,    23,
      24,    25,    -1,    -1,    78,    -1,    -1,    -1,    -1,    83,
      84,    85,    86,    87,    88,    -1,    -1,    -1,    -1,    93,
      94,    15,    16,    17,    -1,    19,    20,    -1,    22,    23,
      24,    25,    -1,    15,    16,    -1,    -1,    19,    20,    -1,
      22,    23,    24,    25,    -1,    15,    16,    -1,    -1,    19,
      20,    -1,    22,    23,    24,    25,    -1,    -1,    -1,    83,
      84,    85,    86,    87,    88,    -1,    -1,    -1,    -1,    93,
      94,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    -1,    83,
      84,    85,    86,    87,    88,    -1,    -1,    -1,    -1,    93,
      94,    83,    84,    85,    86,    87,    88,    -1,    -1,    -1,
      -1,    93,    94,    83,    84,    85,    86,    87,    88,    27,
      -1,    -1,    -1,    93,    94,    33,    -1,    35,    -1,    -1,
      -1,    -1,    27,    -1,    42,    43,    -1,    45,    33,    -1,
      35,    -1,    -1,    -1,    -1,    -1,    -1,    42,    43,    -1,
      45,    -1,    -1,    61,    62,    -1,    -1,    65,    66,    -1,
      -1,    69,    70,    71,    72,    -1,    61,    62,    -1,    -1,
      65,    66,    -1,    -1,    69,    70,    71,    72,    27,    -1,
      -1,    -1,    -1,    -1,    33,    -1,    35,    95,    96,    -1,
      -1,    -1,    -1,    42,    43,    -1,    45,    -1,    -1,    -1,
      95,    -1,    -1,    26,    -1,    -1,    29,    -1,    -1,    -1,
      -1,    -1,    61,    62,    37,    -1,    65,    66,    41,    -1,
      69,    70,    71,    72,    -1,    -1,    49,    -1,    51,    52,
      -1,    -1,    -1,    -1,    -1,    -1,    -1,    60,    -1,    -1,
      63,    64,    -1,    -1,    -1,    -1,    95,    -1,    -1,    72
    };
  }

/* YYSTOS[STATE-NUM] -- The (internal number of the) accessing
   symbol of state STATE-NUM.  */
  private static final short[] yystos_ = yystos_init();
  private static final short[] yystos_init()
  {
    return new short[]
    {
       0,   105,   106,     0,    30,    47,    50,   107,   108,   109,
      53,    72,    73,    72,   109,    95,    46,   110,    39,   112,
     120,    72,   113,   114,    39,   111,   114,    95,    32,    53,
      56,    57,    58,    67,   115,   116,   117,   118,   119,   122,
     137,    83,    97,   137,    95,   120,    72,    99,    72,   121,
     115,    40,    68,    72,   138,   113,   114,   114,   120,    44,
      59,   139,   140,     3,    72,   146,   147,     3,    96,    78,
      99,    44,    59,    84,   115,    72,    72,   121,   139,    55,
      73,    74,    75,    76,   101,   161,    78,    97,   100,    26,
      29,    37,    41,    49,    51,    52,    60,    63,    64,    72,
     141,   142,   141,   146,    72,    72,   121,    99,    99,    96,
     161,   141,   147,   123,    83,    83,    83,    83,    83,    83,
      98,   100,    99,    99,    96,   146,   146,    21,   120,    72,
     144,   145,   141,   141,   141,   141,   141,   143,   125,   127,
     146,   146,   100,   100,   161,   124,    84,    97,    84,    97,
      84,    84,    84,    97,   120,   120,   100,   100,    78,    98,
     102,    95,   148,   145,   141,   141,   126,   128,    78,   129,
     131,   141,   149,   121,    84,   148,    98,   141,   120,   120,
      98,    27,    33,    35,    42,    43,    45,    61,    62,    65,
      66,    69,    70,    71,    72,   148,   150,   151,   152,   156,
     157,   158,   159,   121,   121,   133,   135,   130,   132,    72,
     152,    99,    72,   158,    99,    99,    15,    16,    54,    72,
      82,    86,    99,   158,   159,   161,   162,    99,    99,    99,
      99,    78,   101,    96,   152,    98,     3,     4,     5,     6,
       7,     9,    10,    11,    12,    13,    14,    15,    16,   103,
      99,   120,   120,   148,    98,    78,    71,    72,   156,   158,
      48,   103,   162,   162,   162,   162,   142,   162,   162,   162,
      99,    15,    16,    17,    18,    19,    20,    22,    23,    24,
      25,    83,    84,    85,    86,    87,    88,    93,    94,   162,
     162,   162,   162,   141,   160,   162,   162,   162,   162,   162,
     162,   162,   162,   162,   162,   162,   162,    72,   160,   134,
     136,   121,   121,   141,    99,    98,    78,   162,    72,   100,
     100,    99,   100,   160,   162,   162,   162,   162,   162,   162,
     162,   162,   162,   162,   162,   162,   162,   162,   162,   162,
     100,   100,   100,   100,     3,    98,    97,   102,   100,   148,
      98,   162,   162,   162,   152,   152,   160,   163,   100,    95,
     152,   162,   162,   121,   121,   100,    98,   100,    36,   100,
      28,    34,   153,   154,   155,    98,   157,   152,   152,   162,
      78,    96,   153,   100,    78,   152,   152,   152
    };
  }

/* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final short[] yyr1_ = yyr1_init();
  private static final short[] yyr1_init()
  {
    return new short[]
    {
       0,   104,   105,   106,   106,   107,   108,   108,   109,   109,
     109,   110,   110,   111,   111,   112,   112,   113,   113,   114,
     114,   115,   115,   116,   116,   116,   116,   117,   118,   119,
     120,   121,   123,   124,   122,   125,   126,   122,   127,   128,
     122,   129,   130,   122,   131,   132,   122,   133,   134,   122,
     135,   136,   122,   137,   137,   137,   137,   138,   138,   138,
     139,   139,   140,   140,   141,   141,   141,   141,   141,   141,
     141,   141,   141,   141,   141,   142,   142,   143,   143,   144,
     144,   145,   146,   146,   147,   148,   149,   149,   150,   151,
     151,   152,   152,   152,   152,   152,   152,   152,   152,   152,
     152,   153,   153,   153,   154,   155,   156,   156,   157,   157,
     157,   157,   157,   157,   157,   157,   157,   157,   157,   157,
     157,   157,   157,   157,   157,   157,   157,   157,   158,   158,
     158,   158,   159,   159,   160,   160,   161,   161,   161,   161,
     161,   161,   162,   162,   162,   162,   162,   162,   162,   162,
     162,   162,   162,   162,   162,   162,   162,   162,   162,   162,
     162,   162,   162,   162,   162,   162,   162,   162,   162,   163,
     163
    };
  }

/* YYR2[YYN] -- Number of symbols on the right hand side of rule YYN.  */
  private static final byte[] yyr2_ = yyr2_init();
  private static final byte[] yyr2_init()
  {
    return new byte[]
    {
       0,     2,     2,     0,     2,     2,     2,     1,     9,     7,
       8,     0,     2,     0,     3,     0,     2,     3,     1,     1,
       4,     0,     2,     1,     1,     1,     1,     4,     4,     5,
       0,     0,     0,     0,     9,     0,     0,    10,     0,     0,
      10,     0,     0,    12,     0,     0,    12,     0,     0,    14,
       0,     0,    14,     0,     1,     1,     1,     0,     1,     1,
       0,     2,     6,     8,     1,     1,     1,     1,     1,     4,
       4,     4,     4,     6,     1,     4,     1,     3,     1,     3,
       1,     1,     3,     1,     3,     4,     0,     2,     4,     2,
       1,     2,     5,     7,     5,     7,     7,     9,     5,     7,
       1,     2,     1,     1,     4,     3,     3,     5,     1,     2,
       2,     3,     3,     3,     3,     3,     3,     3,     3,     3,
       3,     4,     4,     4,     4,     1,     1,     2,     1,     4,
       3,     1,     1,     3,     3,     1,     1,     1,     1,     1,
       1,     5,     1,     1,     4,     5,     3,     3,     2,     3,
       3,     3,     3,     3,     3,     3,     3,     2,     3,     3,
       2,     2,     2,     2,     3,     3,     3,     3,     3,     0,
       1
    };
  }



  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short[] yyrline_ = yyrline_init();
  private static final short[] yyrline_init()
  {
    return new short[]
    {
       0,   151,   151,   156,   157,   161,   165,   166,   170,   171,
     172,   176,   177,   181,   182,   186,   187,   191,   192,   196,
     197,   201,   202,   216,   217,   218,   219,   223,   230,   236,
     244,   249,   255,   259,   254,   274,   278,   273,   293,   297,
     292,   304,   308,   303,   323,   327,   322,   334,   338,   333,
     353,   357,   352,   364,   365,   366,   367,   371,   372,   373,
     377,   378,   387,   388,   392,   393,   394,   395,   396,   397,
     398,   399,   400,   401,   402,   406,   407,   411,   412,   416,
     417,   421,   425,   426,   430,   437,   441,   442,   446,   450,
     451,   455,   456,   457,   458,   459,   460,   461,   462,   463,
     464,   468,   469,   470,   474,   478,   482,   483,   487,   488,
     489,   490,   491,   492,   493,   494,   495,   496,   497,   498,
     499,   500,   501,   502,   503,   504,   505,   506,   512,   528,
     534,   540,   548,   557,   561,   562,   566,   567,   568,   569,
     570,   571,   575,   576,   577,   578,   579,   580,   581,   582,
     583,   584,   585,   586,   587,   588,   589,   590,   591,   592,
     593,   594,   595,   596,   597,   598,   599,   600,   601,   605,
     606
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
    int code_max = 338;
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
       2,     2,     2,    82,     2,     2,     2,    89,    94,     2,
      99,   100,    87,    85,    97,    86,   103,    88,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,    78,    98,
      83,     2,    84,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,   101,     2,   102,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    95,    93,    96,     2,     2,     2,     2,
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
      75,    76,    77,    79,    80,    81,    90,    91,    92
    };
  }


  private static final int YYLAST_ = 1009;
  private static final int YYEMPTY_ = -2;
  private static final int YYFINAL_ = 3;
  private static final int YYNTOKENS_ = 104;

/* Unqualified %code blocks.  */
/* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":23  */

	private Environment<Type> typeEnvironment = new MapEnvironment<Type>("TYPES", true);
	private Environment<Type> varEnvironment = new MapEnvironment<Type>("VARIABLES", true);
	private Environment<Type> interfaceEnvironment = new MapEnvironment<Type>("INTERFACE", true);
	private Environment<Type> classEnvironment = new MapEnvironment<Type>("CLASSE", true);
	private StackEnvironment<Type> localVarEnvironment = new StackEnvironment<Type>("STACK", true);
	private Type type;

/* "/home/fnoury/L3/Compilation/projet-20210420/src/fr/ubordeaux/deptinfo/compilation/lea/parser/Parser.java":3092  */

}
/* "/home/fnoury/L3/Compilation/projet-20210420/parser/Parser.y":610  */

