grammar Business;
@header {
package parsers;
}

r : K_INSTANCE '(' (context)+ ')' ; 
context : K_CONTEXT '(' K_ID ':' '"' IDENTIFIER '"' ')' ;

// Keywords
K_INSTANCE : 'instance' ;
K_CONTEXT : 'context' ;
K_ID : 'id' ;

IDENTIFIER : [a-z]+ ;

// Whitespace
WS : [ \t\r\n\u000C]+ -> skip ; 
