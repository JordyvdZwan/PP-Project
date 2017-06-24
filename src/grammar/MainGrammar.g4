grammar MainGrammar;
import NumberGrammar;

id: Letter (Letter | IDNum)*;

program : (statement)+ EOF;

statement: (WS)? (Var WS)? type WS id (WS ASS WS expression)? (WS)? EndStatement (WS)?                      #declStat
         | (WS)? target WS ASS WS expression (WS)? EndStatement (WS)?                                       #assStat
         | (WS)? IF (WS)? expression (WS)? (THEN)? (WS)? statement ((WS)? ELSE (WS)? statement)? (WS)?         #ifStat
         | (WS)? WHILE (WS)? expression (WS)? (DO)? (WS)? statement (WS)?                                      #whileStat
         | (WS)? BGN (WS)? (statement)+ (WS)? END (WS)?                                                     #blockStat
         ;

Var : V A R;
type: array | primitiveType;
primitiveType: Integer | Boolean;
Integer: I N T E G E R | I N T;
Boolean: B O O L E A N | B O O L;
array: primitiveType OpenArray CloseArray;

expression: prfOp (WS)? expression                                  #prfExpr
          | expression (WS)? binOp (WS)? expression                 #binExpr
          | LPAR (WS)? expression (WS)? RPAR                        #parExpr
          | id                                                      #idExpr
          | num                                                     #numExpr
          | id (WS)? OpenArray (WS)? expression (WS)? CloseArray    #arrayExpr
          | TRUE                                                    #trueExpr
          | FALSE                                                   #falseExpr
          ;

num : ngWrittenNumber | NUMBER;
NUMBER: ([0-9])+;
target: id;

prfOp: Minus | Not;
Minus:  '-' | M I N U S;
Not:    '!' | N O T;


binOp: multOp | plusOp | boolOp | compOp;

multOp: Mult | Div;
plusOp: Plus | Minus;
boolOp: And | Or;
compOp: EQ | LT | LE | NE | GT | GE;

Mult: '*' | T I M E S;
Div:  '/' | D I V I D E D WS B Y;

Plus: '+' | P L U S;
//MINUS ALREADY DEFINED ABOVE

And: '&' | '&&' | A N D;
Or:  '|' | '||' | O R;

EQ: '==' | E Q U A L S;
GT: '>' | G R E A T E R (WS)? T H A N;
GE: '>=' | G R E A T E R (WS)? T H A N (WS)? O R (WS)? E Q U A L S;
LT: '<' | L O W E R (WS)? T H A N;
LE: '<=';
NE: '!=';

IF: I F;
THEN: T H E N;
ELSE: E L S E;
WHILE: W H I L E;
DO: D O;
ASS: '=' | S E T WS T O;

TRUE: T R U E;
FALSE: F A L S E;

BGN: '{';
END: '}';
SEMI: ',';
LPAR: '(';
RPAR: ')';

OpenArray   : '[';
CloseArray  : ']';

EndStatement: ';';

Letter: A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z;

IDNum: ([0-9])+;

WS : ([ \t\r\n])+;

fragment A: 'A' | 'a';
fragment B: 'B' | 'b';
fragment C: 'C' | 'c';
fragment D: 'D' | 'd';
fragment E: 'E' | 'e';
fragment F: 'F' | 'f';
fragment G: 'G' | 'g';
fragment H: 'H' | 'h';
fragment I: 'I' | 'i';
fragment J: 'J' | 'j';
fragment K: 'K' | 'k';
fragment L: 'L' | 'l';
fragment M: 'M' | 'm';
fragment N: 'N' | 'n';
fragment O: 'O' | 'o';
fragment P: 'P' | 'p';
fragment Q: 'Q' | 'q';
fragment R: 'R' | 'r';
fragment S: 'S' | 's';
fragment T: 'T' | 't';
fragment U: 'U' | 'u';
fragment V: 'V' | 'v';
fragment W: 'W' | 'w';
fragment X: 'X' | 'x';
fragment Y: 'Y' | 'y';
fragment Z: 'Z' | 'z';

