grammar NumberGrammar;

ngNumber : ngWrittenNumber | NGNumericNumber;
NGNumericNumber: [0-9]+;
ngWrittenNumber: (ngbillion (NGAnd)?)? (ngmillion (NGAnd)?)? (ngthousand (NGAnd)?)? ngsingle
             | (ngbillion (NGAnd)?)? (ngmillion (NGAnd)?)? ngthousand (NGAnd)? (ngsingle)?
             | (ngbillion (NGAnd)?)? ngmillion (NGAnd)? (ngthousand (NGAnd)?)? (ngsingle)?
             | ngbillion (NGAnd)? (ngmillion(NGAnd)?)? (ngthousand (NGAnd)?)? (ngsingle)?
             | NGZero;

nghundred : NGHundred;
ngthousand: (ngsingle)? NGThousand; //Fix this maybe?
ngmillion : (ngsingle)? NGMillion;
ngbillion : (ngsingle)? NGBillion;

ngsingle  : (nghprefix)? nghundred (NGAnd)? ngonly | (nghprefix)? nghundred | ngonly ;
ngonly    : ngmain1 | ngmain2 | ngsingles;
ngsingles : NGOne | NGTwo | NGThree | NGFour | NGFive | NGSix | NGSeven | NGEight | NGNine | NGTen;
ngmain1   : NGEleven | NGTwelve | NGEighteen | ngfirst NGTeen;
ngmain2   : ngdoubles (('-')? ngseconds)?;
nghprefix : ngonly;

ngseconds : NGOne | NGTwo | NGThree | NGFour | NGFive | NGSix | NGSeven | NGEight | NGNine;
ngfirst   : NGThir | NGFour | NGFif | NGSix | NGSeven | NGNine;
ngdoubles : NGTwenty | NGThirty | NGForty | NGFifty | NGSixty | NGSeventy | NGEighty | NGNinety;

NGHundred: NGH NGU NGN NGD NGR NGE NGD;
NGThousand: NGT NGH NGO NGU NGS NGA NGN NGD;
NGMillion: NGM NGI NGL NGL NGI NGO NGN;
NGBillion: NGB NGI NGL NGL NGI NGO NGN;

NGZero   : NGZ NGE NGR NGO;
NGOne    : NGO NGN NGE;
NGTwo    : NGT NGW NGO;
NGThree  : NGT NGH NGR NGE NGE;
NGFour   : NGF NGO NGU NGR;
NGFive   : NGF NGI NGV NGE;
NGSix    : NGS NGI NGX;
NGSeven  : NGS NGE NGV NGE NGN;
NGEight  : NGE NGI NGG NGH NGT;
NGNine   : NGN NGI NGN NGE;

NGTen      : NGT NGE NGN;
NGEleven   : NGE NGL NGE NGV NGE NGN;
NGTwelve   : NGT NGW NGE NGL NGV NGE;
NGEighteen : NGE NGI NGG NGH NGT NGE NGE NGN;
NGThir     : NGT NGH NGI NGR;
NGFif      : NGF NGI NGF;

NGTeen   : NGT NGE NGE NGN;
NGTwenty : NGT NGW NGE NGN NGT NGY;
NGThirty : NGT NGH NGI NGR NGT NGY;
NGForty : NGF NGO NGR NGT NGY;
NGFifty  : NGF NGI NGF NGT NGY;
NGSixty  : NGS NGI NGX NGT NGY;
NGSeventy: NGS NGE NGV NGE NGN NGT NGY;
NGEighty : NGE NGI NGG NGH NGT NGY;
NGNinety : NGN NGI NGN NGE NGT NGY;

NGAnd : NGA NGN NGD;

NGA: 'A' | 'a';
NGB: 'B' | 'b';
NGC: 'C' | 'c';
NGD: 'D' | 'd';
NGE: 'E' | 'e';
NGF: 'F' | 'f';
NGG: 'G' | 'g';
NGH: 'H' | 'h';
NGI: 'I' | 'i';
NGJ: 'J' | 'j';
NGK: 'K' | 'k';
NGL: 'L' | 'l';
NGM: 'M' | 'm';
NGN: 'N' | 'n';
NGO: 'O' | 'o';
NGP: 'P' | 'p';
NGQ: 'Q' | 'q';
NGR: 'R' | 'r';
NGS: 'S' | 's';
NGT: 'T' | 't';
NGU: 'U' | 'u';
NGV: 'V' | 'v';
NGW: 'W' | 'w';
NGX: 'X' | 'x';
NGY: 'Y' | 'y';
NGZ: 'Z' | 'z';

