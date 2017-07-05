grammar MainGrammar;
import NumberGrammar;

Letter: A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z;

id: Letter (Letter | NUMBER)*;
forkID : Letter (Letter | NUMBER)*;
//arrayId: (id) (WS)? OpenArray (WS)? expression (WS)? CloseArray;

program : ((statement (WS)?)+ (WS)? (fork (WS)? (program (WS)? )+ (WS)? join)?)+ (WS)? EOF;

fork: Fork WS forkID WS BGN (WS)? program (WS)? END;
join: Join forkID;

Fork: F O R K;
Join: J O I N;

statement: (WS)? (Var WS)? type WS id (WS ASS WS expression)? (WS)? EndStatement (WS)?                                                  #declStat
//         | (WS)? (Var WS)? type OpenArray CloseArray WS id (WS ASS WS expression)? (WS)? EndStatement (WS)?   #arrayDeclStat
         | (WS)? target WS ASS WS expression (WS)? EndStatement (WS)?                                                                   #assStat
         | (WS)? IF (WS)? expression (WS)? (THEN)? (WS)? statement ((WS)? ELSE (WS)? statement)? (WS)?                                  #ifStat
         | (WS)? WHILE (WS)? expression (WS)? (DO)? (WS)? statement (WS)?                                                               #whileStat
         | (WS)? BGN (WS)? (statement)+ (WS)? END (WS)?                                                                                 #blockStat
         ;

Var : V A R;
type: primitiveType ;//| arrayType;
primitiveType: Integer | Boolean;
Integer: I N T E G E R | I N T;
Boolean: B O O L E A N | B O O L;
//arrayType: primitiveType OpenArray CloseArray;

expression: prfOp (WS)? expression                                   #prfExpr
          | expression (WS)? multOp (WS)? expression                 #multExpr
          | expression (WS)? plusOp (WS)? expression                 #plusExpr
          | expression (WS)? boolOp (WS)? expression                 #boolExpr
          | expression (WS)? compOp (WS)? expression                 #compExpr
          | LPAR (WS)? expression (WS)? RPAR                         #parExpr
          | id                                                       #idExpr
          | num                                                      #numExpr
          //| arrayId                                                  #indexExpr
          | type (WS)? OpenArray (WS)? expression (WS)? CloseArray   #arrayExpr
          | TRUE                                                     #trueExpr
          | FALSE                                                    #falseExpr
          ;

num : ngWrittenNumber | NUMBER;
NUMBER: ([0-9])+;
target: id ;//| arrayId;

prfOp: Minus | Not;
Minus:  '-' | M I N U S;
Not:    '!' | N O T;

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

EQ: '==' | E Q U A L S | E Q U A L (WS)? T O;
GT: '>' | (I S (WS)?)? G R E A T E R (WS)? T H A N;
GE: '>=' | (I S (WS)?)? G R E A T E R (WS)? T H A N (WS)? O R (WS)? E Q U A L S;
LT: '<' | (I S (WS)?)? L O W E R (WS)? T H A N;
LE: '<=' | (I S (WS)?)? L O W E R (WS)? T H A N (WS)? O R (WS)? E Q U A L S;
NE: '!=' | N O T (WS)? E Q U A L (WS)? T O;

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

