grammar MainGrammar;

program : ;



number : writtenNumber | NumericNumber;
NumericNumber: [0-9]+;
writtenNumber: billion million thousand single
             | billion million thousand
             | billion million single
             | million thousand single
             | billion thousand single
             | billion million
             | billion thousand
             | thousand single
             | million thousand
             | million single
             | billion single
             | million
             | billion
             | million
             | thousand
             | single
             | Zero;

single  : (only)? hundred (And)? only | (only)? hundred | only ;
only    : singles | main2 | main1;
singles : One | Two | Three | Four | Five | Six | Seven | Eight | Nine | Ten;
main1   : Eleven | Twelve | first ('-')? Teen;
main2   : doubles (('-')? seconds)?;
hprefix : Two | Three | Four | Five | Six | Seven | Eight | Nine;

seconds : One | Two | Three | Four | Five | Six | Seven | Eight | Nine;
first   : Thir | Four | Fif | Six | Seven | Eigh | Nine;
doubles : Twenty | Thirty | Forty | Fifty | Sixty | Seventy | Eighty | Ninety;

hundred : H U N D R E D;
thousand: (single)? T H O U S And; //Fix this maybe?
million : (single)? M I L L I O N;
billion : (single)? B I L L I O N;

Zero   : Z E R O;
One    : O N E;
Two    : T W O;
Three  : T H R E E;
Four   : F O U R;
Five   : F I V E;
Six    : S I X;
Seven  : S E V E N;
Eight  : E I G H T;
Nine   : N I N E;
Eigh  : E I G H;

Ten    : T E N;
Eleven : E L E V E N;
Twelve : T W E L V E;
Thir   : T H I R;
Fif    : F I F;

Teen   : T E E N;
Twenty : T W E N T Y;
Thirty : T H I R T Y;
Forty : F O R T Y;
Fifty  : F I F T Y;
Sixty  : S I X T Y;
Seventy: S E V E N T Y;
Eighty : E I G H T Y;
Ninety : N I N E T Y;

And : A N D;

A: 'A' | 'a';
B: 'B' | 'b';
C: 'C' | 'c';
D: 'D' | 'd';
E: 'E' | 'e';
F: 'F' | 'f';
G: 'G' | 'g';
H: 'H' | 'h';
I: 'I' | 'i';
J: 'J' | 'j';
K: 'K' | 'k';
L: 'L' | 'l';
M: 'M' | 'm';
N: 'N' | 'n';
O: 'O' | 'o';
P: 'P' | 'p';
Q: 'Q' | 'q';
R: 'R' | 'r';
S: 'S' | 's';
T: 'T' | 't';
U: 'U' | 'u';
V: 'V' | 'v';
W: 'W' | 'w';
X: 'X' | 'x';
Y: 'Y' | 'y';
Z: 'Z' | 'z';

