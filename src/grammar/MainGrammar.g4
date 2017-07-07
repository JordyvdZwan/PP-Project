grammar MainGrammar;
import NumberGrammar;

program : (WS)? (statement (WS)?)+ EOF;

statement: (WS)? (Var WS)? type WS id (WS ASS WS expression)? (WS)? EndStatement (WS)?                                       #declStat
         | (WS)? (Var WS)? Shared WS type WS id (WS ASS WS expression)? (WS)? EndStatement (WS)?                             #sharedDeclStat
         | (WS)? target WS ASS WS expression (WS)? EndStatement (WS)?                                                        #assStat
         | (WS)? IF (WS)? expression (WS)? (THEN)? (WS)? statement ((WS)? ELSE (WS)? statement)? (WS)?                       #ifStat
         | (WS)? WHILE (WS)? expression (WS)? (DO)? (WS)? statement (WS)?                                                    #whileStat
         | (WS)? BGN (WS)? (statement)+ (WS)? END (WS)?                                                                      #blockStat
         | (WS)? (Lock | Unlock) (WS)? LPAR (WS)? id (WS)? RPAR (WS)? EndStatement (WS)?                                     #lockStat
         | (WS)? Fork (WS)? LPAR (WS)? forkID (WS)? RPAR (WS)? statement (WS)?                                               #forkStat
         | (WS)? Join (WS)? LPAR (WS)? forkID (WS)? RPAR (WS)? EndStatement (WS)?                                            #joinStat
         ;

expression: prfOp (WS)? expression                                   #prfExpr
          | expression (WS)? multOp (WS)? expression                 #multExpr
          | expression (WS)? plusOp (WS)? expression                 #plusExpr
          | expression (WS)? boolOp (WS)? expression                 #boolExpr
          | expression (WS)? compOp (WS)? expression                 #compExpr
          | LPAR (WS)? expression (WS)? RPAR                         #parExpr
          | id                                                       #idExpr
          | num                                                      #numExpr
          | TRUE                                                     #trueExpr
          | FALSE                                                    #falseExpr
          ;

//Identifiers
id: Letter (Letter | NUMBER)*;
forkID : Letter (Letter | NUMBER)*;
target: id;

//Types
type: primitiveType ;
primitiveType: Integer | Boolean;

//Primitive values
num : ngWrittenNumber | NUMBER;

//Operator classes
prfOp: Minus | Not;
multOp: Mult;
plusOp: Plus | Minus;
boolOp: And | Or;
compOp: EQ | LT | LE | NE | GT | GE;

//primitive values
NUMBER: ([0-9])+;
TRUE: T R U E;
FALSE: F A L S E;

//KeyWords
//Declaration Keywords
Var : V A R;
Integer: I N T E G E R;
Boolean: B O O L E A N;
ASS: '=' | S E T WS T O;

//Concurrency Keywords
Fork: F O R K;
Join: J O I N;
Shared: S H A R E D;
Lock: L O C K;
Unlock: U N L O C K;

//Other Keywords
StartComment: '%';
EndComent: '%';

//Mathematical Operator Keywords
Minus:  (MINUS | MINUS2);
MINUS: '-';
Mult: '*' | TIMES;
Not:    '!' | NOT;
Plus: '+' | PLUS;


MINUS2: M I N U S;
NOT: N O T;
TIMES: T I M E S;
PLUS: P L U S;

//Boolean Operator Keywords
And: '&' | '&&' | AND;
Or:  '|' | '||' | OR;
AND: A N D;
OR: O R;

//Relational Operator Keywords
EQ: '==' | EQUALS | EQUALTO;
GT: '>' | ISGREATERTHAN;
GE: '>=' | GREATEROREQUAL;
LT: '<' | LOWERTHAN;
LE: '<=' | LOWEROREQUAL;
NE: '!=' | NOTEQUAL;

EQUALS:E Q U A L S;
EQUALTO:E Q U A L (WS)? T O;
ISGREATERTHAN:(I S (WS)?)? G R E A T E R (WS)? T H A N;
GREATEROREQUAL:(I S (WS)?)? G R E A T E R (WS)? T H A N (WS)? O R (WS)? E Q U A L S;
LOWERTHAN:(I S (WS)?)? L O W E R (WS)? T H A N;
LOWEROREQUAL:(I S (WS)?)? L O W E R (WS)? T H A N (WS)? O R (WS)? E Q U A L S;
NOTEQUAL: N O T (WS)? E Q U A L (WS)? T O;

//Control structures Keywords
IF: I F;
THEN: T H E N;
ELSE: E L S E;
WHILE: W H I L E;
DO: D O;

//Basic characters
BGN: '{';
END: '}';
SEMI: ',';
LPAR: '(';
RPAR: ')';
OpenArray   : '[';
CloseArray  : ']';
EndStatement: ';';

//Utility
WS : ([ \t\r\n])+;
Comment: (StartComment ((Letter | NUMBER | WS)*) EndComent) -> skip;

Letter: A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z;

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

