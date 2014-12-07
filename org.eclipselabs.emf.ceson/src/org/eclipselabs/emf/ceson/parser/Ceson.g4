/**
 * Ceson grammar.
 */
grammar Ceson;

model : definition+
;
definition : ID '=' value 
		   ;
value : ID 			    #Ref
	  | Int			    #IntLiteral
	  | Float		    #RealLiteral
	  | String			#StringLiteral
      | enumName 		#EnumLiteral
	  | object 	   		#ObjectLiteral
	  | array			#ArrayLiteral
	  ;
array : '[' (value (','value)*)? ']'
	  ;
object : className? '{' featureList '}';

featureList : (feature (','feature)*)? 
;

enumName : (ID '.')? (ID '.')? ID 
	;
className : (ID '.')? ID 
			  ;
feature : ID ':' value #Containment
		|  ID '>' value #Reference 
		;
ID : [a-zA-Z][_\-a-zA-Z0-9]+ ;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

fragment
DIGIT
:
    [0-9]
;

Int
:
    DIGIT+
;

Float : DIGIT+'.'DIGIT+;

String
:
    '\'' .*? '\''
;