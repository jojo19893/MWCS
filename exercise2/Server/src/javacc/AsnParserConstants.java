package javacc;
/* Generated By:JJTree&JavaCC: Do not edit this line. AsnParserConstants.java */
public interface AsnParserConstants {

  int EOF = 0;
  int OBJECT_IDENTIFIER_TKN = 8;
  int BSTRING_TKN = 9;
  int HSTRING_TKN = 10;
  int CSTRING_TKN = 11;
  int NUMBER_ERANGE_TKN = 12;
  int NUMBER_TKN = 13;
  int DOT_TKN = 14;
  int COMMA_TKN = 15;
  int LEFTBRACE_TKN = 16;
  int RIGHTBRACE_TKN = 17;
  int LEFTPAREN_TKN = 18;
  int RIGHTPAREN_TKN = 19;
  int LEFTBRACKET_TKN = 20;
  int RIGHTBRACKET_TKN = 21;
  int LESSTHAN_TKN = 22;
  int MINUS_TKN = 23;
  int GETS_TKN = 24;
  int BAR_TKN = 25;
  int SEMI_COLON_TKN = 26;
  int SELECTOR_TKN = 27;
  int TAGS_TKN = 28;
  int BOOLEAN_TKN = 29;
  int INTEGER_TKN = 30;
  int BIT_TKN = 31;
  int STRING_TKN = 32;
  int OCTET_TKN = 33;
  int NULL_TKN = 34;
  int SEQUENCE_TKN = 35;
  int OF_TKN = 36;
  int SET_TKN = 37;
  int IMPLICIT_TKN = 38;
  int CHOICE_TKN = 39;
  int ANY_TKN = 40;
  int OPTIONAL_TKN = 41;
  int DEFAULT_TKN = 42;
  int COMPONENTS_TKN = 43;
  int UNIVERSAL_TKN = 44;
  int APPLICATION_TKN = 45;
  int PRIVATE_TKN = 46;
  int TRUE_TKN = 47;
  int FALSE_TKN = 48;
  int BEGIN_TKN = 49;
  int END_TKN = 50;
  int DEFINITIONS_TKN = 51;
  int EXPLICIT_TKN = 52;
  int ENUMERATED_TKN = 53;
  int EXTERNAL_TKN = 54;
  int EXPORTS_TKN = 55;
  int IMPORTS_TKN = 56;
  int REAL_TKN = 57;
  int INCLUDES_TKN = 58;
  int MIN_TKN = 59;
  int MAX_TKN = 60;
  int SIZE_TKN = 61;
  int FROM_TKN = 62;
  int WITH_TKN = 63;
  int COMPONENT_TKN = 64;
  int PRESENT_TKN = 65;
  int ABSENT_TKN = 66;
  int DEFINED_TKN = 67;
  int BY_TKN = 68;
  int PLUS_INFINITY_TKN = 69;
  int MINUS_INFINITY_TKN = 70;
  int OBJECTTYPE_TKN = 71;
  int SYNTAX_TKN = 72;
  int ACCESS_TKN = 73;
  int STATUS_TKN = 74;
  int DESCRIPTION_TKN = 75;
  int REFERENCE_TKN = 76;
  int INDEX_TKN = 77;
  int DEFVAL_TKN = 78;
  int DHINT = 79;
  int TC_TKN = 80;
  int MACRO_TKN = 81;
  int LCASEFIRST_IDENT_TKN = 82;
  int UCASEFIRST_IDENT_TKN = 83;

  int DEFAULT = 0;
  int WithinASNComment = 1;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"--\"",
    "<token of kind 6>",
    "<token of kind 7>",
    "<OBJECT_IDENTIFIER_TKN>",
    "<BSTRING_TKN>",
    "<HSTRING_TKN>",
    "<CSTRING_TKN>",
    "<NUMBER_ERANGE_TKN>",
    "\"0\"",
    "\".\"",
    "\",\"",
    "\"{\"",
    "\"}\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"<\"",
    "\"-\"",
    "\"::=\"",
    "\"|\"",
    "\";\"",
    "\":\"",
    "\"TAGS\"",
    "\"BOOLEAN\"",
    "\"INTEGER\"",
    "\"BIT\"",
    "\"STRING\"",
    "\"OCTET\"",
    "\"NULL\"",
    "\"SEQUENCE\"",
    "\"OF\"",
    "\"SET\"",
    "\"IMPLICIT\"",
    "\"CHOICE\"",
    "\"ANY\"",
    "\"OPTIONAL\"",
    "\"DEFAULT\"",
    "\"COMPONENTS\"",
    "\"UNIVERSAL\"",
    "\"APPLICATION\"",
    "\"PRIVATE\"",
    "\"TRUE\"",
    "\"FALSE\"",
    "\"BEGIN\"",
    "\"END\"",
    "\"DEFINITIONS\"",
    "\"EXPLICIT\"",
    "\"ENUMERATED\"",
    "\"EXTERNAL\"",
    "\"EXPORTS\"",
    "\"IMPORTS\"",
    "\"REAL\"",
    "\"INCLUDES\"",
    "\"MIN\"",
    "\"MAX\"",
    "\"SIZE\"",
    "\"FROM\"",
    "\"WITH\"",
    "\"COMPONENT\"",
    "\"PRESENT\"",
    "\"ABSENT\"",
    "\"DEFINED\"",
    "\"BY\"",
    "\"PLUS-INFINITY\"",
    "\"MINUS-INFINITY\"",
    "\"OBJECT-TYPE\"",
    "\"SYNTAX\"",
    "\"ACCESS\"",
    "\"STATUS\"",
    "\"DESCRIPTION\"",
    "\"REFERENCE\"",
    "\"INDEX\"",
    "\"DEFVAL\"",
    "\"DISPLAY-HINT\"",
    "\"TEXTUAL-CONVENTION\"",
    "\"MACRO\"",
    "<LCASEFIRST_IDENT_TKN>",
    "<UCASEFIRST_IDENT_TKN>",
  };

}
