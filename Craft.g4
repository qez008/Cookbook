// grammar for crafting
grammar Craft;

WS : [ \t\n]+ -> skip ;

Open : '{';
Close : '}';

ID : '_' | [a-zA-Z]+;
Amount :  [0-9]+;

item : ID; // ':' Amount;

row : item+;
rows : row ',' rows | row;

list : 'list' Open row Close;
grid : 'grid' Open rows Close;

recipe : list | grid;

def : ID '=' recipe;

defs : def+;
