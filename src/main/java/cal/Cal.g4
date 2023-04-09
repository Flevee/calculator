grammar Cal;

INTEGER : '-'? [1-9][0-9]*
        | '0'
        ;
FLOAT : DIGIT+ '.' DIGIT*;
ADD : '+';
SUB : '-';
MUL : '*';

expr : expr op=('*' | '/') expr # muldiv
     | expr op=('+' | '/') expr # addsub
     | INTEGER # int
     | '(' expr ')' # parens
     ;

stat : expr ';' #print
     ;

fragment DIGIT : [0-9];
