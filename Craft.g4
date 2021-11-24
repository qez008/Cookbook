// grammar for crafting
grammar Craft;

WS : [ \t\n]+ -> skip ;

EndRow : ',';
End : 'end';

ID : [a-zA-Z] [a-zA-Z0-9]*;
Blank : '_';

Num : '0' | [1-9][0-9]*;
Str : '\'' .+? '\'';

TypeSeparator : '/';


materials : 'materials' ID+ End;

def : 'item' ID materialTypes recipe End;


materialTypes : 'mats' (ID ':' types)+ End;
// recipies defines how items are created
recipe : list | grid;
list : 'list' row End;
grid : 'grid' (row | (row EndRow)+) End;

row : entry+;
entry : (Blank | ID | (ID ':' types));

type : ID;
types : type | ((type TypeSeparator)+ type);



program : (materials | def)+;