// grammar for crafting
grammar Cookbook;

WS : [ \t\n]+ -> skip ;

EndRow : ',';
End : 'end';

ID : [a-zA-Z][a-zA-Z0-9]*;
Blank : '_';

Num : '0' | [1-9][0-9]*;
Str : '\'' .+? '\'';

TypeSeparator : '/';

program : definition+;

definition : 'item' ID materials? recipe End;

materials : 'mats' (ID ':' types)+ End;
recipe : list | table;

list : 'list' row End;
table : 'table' (row | (row EndRow)+) End;

row : entry+;
entry : (Blank | ID | ID':'Num);

types : ID | ((ID TypeSeparator)+ ID);
