grammar Calculator;

init : declarations assignments write_statements '.' ;

declarations : (declaration ';')+ ;
assignments : (assignment ';')+ ;
write_statements : (write_statement ';')* write_statement ;

declaration : TYPE IDENTIFIER ;
assignment : IDENTIFIER '=' expression;
write_statement : 'write' '(' IDENTIFIER ')';

expression : expression op=('*'|'/') expression     #MulDiv
           | expression op=('+'|'-') expression     #AddSub
           | NUM                                    #num
           | REAL                                   #real
           | IDENTIFIER                             #id
           | '('expression')'                       #parens
           ;

TYPE : 'int' | 'float' ;
IDENTIFIER : ALPHA(ALPHA|DIGIT)* ;
NUM : [1-9]DIGIT*;
REAL : ([1-9]DIGIT* | '0')'.'DIGIT*;

fragment
ALPHA : [a-zA-Z];

fragment
DIGIT : [0-9];

WS : [ \t\n\r]+ -> skip ; //skip whitespace and return

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;