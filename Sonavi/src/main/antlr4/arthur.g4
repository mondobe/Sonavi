grammar arthur;
/*
 * Parser Rules
 */

codeBlock :
CLEFT exp=start+ CRIGHT
;

start :
stop
| codeBlock
| setVar
| expression 
| print
| func
;

stop :
STOP
;

setVar :
name=NAME EQUALS exp=expression SCOLON
;

func : 
exp=expression '.run' SCOLON #run
| exp=expression '.repeat' LPAR num=expression RPAR SCOLON #repeat
| exp=expression '.if' LPAR con=expression RPAR SCOLON #if
;

expression : 
NUMBER #basicNum
| exp=QUOTES #string
| name=NAME #getVar
| LPAR exp=expression RPAR #paren
| left=expression oper=POW right=expression #compOp
| left=expression oper=(DIVIDE | TIMES | MOD) right=expression #compOp
| left=expression oper=(PLUS | MINUS) right=expression #compOp
| left=expression oper=DEQS right=expression #boolOp
| arg=codeBlock #Block
;

print :
command=PRINT LPAR arg=expression RPAR SCOLON
;


/*
 * Lexer Rules
 */
STOP : '!END' ;
NUMBER : ([0-9] | '_')+ ('.' ('0' .. '9') +)? ;
WHITESPACE : (' ' | '\t')+ -> skip;
PLUS : '+' ;
MINUS : '-' ;
DIVIDE : '/' ;
TIMES : '*' ;
POW : '^' ;
MOD : '%' ;
LPAR : '(' ;
RPAR : ')' ;
SCOLON : ';' ;
PRINT : 'print' ;
EQUALS : '=' ;
DEQS : '==' ;
CLEFT : '{' ;
CRIGHT : '}' ;
QUOTES : '"' (~[\r\n"])* '"' ;
NAME : [a-zA-Z][a-zA-Z0-9]*;