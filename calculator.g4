grammar calculator;

init : declarations assignments write_statements '.';

declarations : (declaration ';')+ ;
assignments : (assignment ';')+ ;
write_statements : (write_statement ';')* write_statement ;

declaration : TYPE IDENTIFIER ;
assignment : IDENTIFIER '=' expression;
write_statement : 'write' '(' IDENTIFIER ')';

expression : term expr_rest;
expr_rest : ('+' | '-') term expr_rest
     |
     ;

term : unary term_rest;
term_rest : ('*' | '/') unary term_rest
          |
          ;

unary : '-' unary | factor;

factor : NUM
       | REAL
       ;

TYPE : 'int' | 'float' ;

LETTER : [a-zA-Z] ;
DIGIT : [0-9] ;
IDENTIFIER : LETTER(LETTER | DIGIT)* ;

NUM : [1-9](DIGIT)* ;
REAL : (NUM | '0')'.'(DIGIT)* ;

WS : [ \t\n\r]+ -> skip ; //skip whitespace