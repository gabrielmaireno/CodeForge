grammar Expr;

options { tokenVocab=ExprLexer; }

program
    : (stat | def | ifBloco | whileBloco)+ EOF
    ;

stat
    : tipo ID Assign expr SemiColon
    | ID Assign expr SemiColon
    | expr SemiColon
    ;

def
    : ID LParen ID (Comma ID)* RParen LBrace (stat* return RBrace)|(stat+) RBrace
    ;

tipo: 'string' | 'int' | 'float' | 'boolean' | 'double' | 'char';

whileBloco
    : 'while' LParen expr RParen LBrace (stat | ifBloco)+ | return? RBrace
    | 'while' LParen expr RParen LBrace return RBrace
    ;

ifBloco
    : 'if' LParen expr RParen LBrace (stat | ifBloco | whileBloco)+ return? RBrace ('else' LBrace (stat | ifBloco | whileBloco)+ return? RBrace)?
    | 'if' LParen expr RParen LBrace return RBrace ('else' LBrace return RBrace)?
    ; 

func
    : ID LParen ID* (Comma ID)* RParen
    ;

return
    : RETURN expr SemiColon
    ;

expr
    : const
    | ID
    | func
    | expr multiplicaoOp expr
    | expr adicaoOp expr
    | expr comparacaoOp expr
    | expr booleanOp expr
    ;

EspacoBranco : [ \r\t\n]+ -> skip;


multiplicaoOp: '*' | '/' | '%';
adicaoOp: '+' | '-';
comparacaoOp: '==' | '!=' | '>' | '<' | '>=' | '<=' ;
booleanOp: 'and' | '||' | 'or' | '&&';

const: INT | FLOAT | STR | BOOL;

INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;
STR: ('"' ~'"'* '"' ) | ('\'' ~'\''* '\'');
BOOL: 'true' | 'false';

RETURN: 'return';

Assign : '=';
SemiColon : ';';
LParen : '(';
RParen : ')';
LBrace : '{';
RBrace : '}';
Comma : ',';
Not : '!';
ID : [a-zA-Z_][a-zA-Z0-9_]*;
