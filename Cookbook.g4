// grammar for crafting
grammar Cookbook;

WS : [ \t\n]+ -> skip ;

End : 'end';

ID : [a-zA-Z][a-zA-Z0-9]*;
Blank : '_';

Num : '0' | [1-9][0-9]*;
Str : '\'' .+? '\'';


program : definition+;

definition : 'item' ID materials? recipe End;

materials : 'mats' (ID ':' types)+ End;

recipe : 'list' row End 					#list
       | 'table' (row | (row ',')+) End 	#table
       ;

row : entry+;

entry : Blank 		# blank
      | ID			# id
      | ID':'Num	# idAndNum
      ;

types : ID
      | ((ID '/')+ ID)
      ;
