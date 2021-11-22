// grammar for crafting
grammar Craft;

WS: [ \t\n]+ -> skip ;

Open: '{';
Close: '}';

ID: [a-zA-Z]+;
Amount: [0-9]+;

item: ID ':' Amount;

row: item row | item;
rows: row newrow rows | row;
newrow: '&';

list: 'list' Open row Close;
block: 'block' Open rows Close;

recipe: list | block;

declaration: ID '=' recipe;

declarations: declaration+;
