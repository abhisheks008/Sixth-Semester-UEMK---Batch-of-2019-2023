%{
int n = 0;
%}

%%
"while"|"if"|"else"|"auto"|"break"|"case"|"char"|"continue"|"do"|"default"|"const"|"double"|"enum"|"extern"|"for"|"goto"|"float"|"int"|"long"|"register"|"return"|"signed"|"static"|"sizeof"|"short"|"struct"|"switch"|"typedef"|"union"|"void"|"volatile"|"unsigned" {n++; printf("\t keywords : %s", yytext);}

[a-zA-Z_][a-zA-Z0-9_]* {n++; printf("\t identifiers : %s", yytext);}
"<="|"=="|"="|"++"|"-"|"*"|"+"|"/" {n++; printf("\t operators : %s", yytext);}
[(){}|, ;] {n++; printf("\t separators : %s", yytext);}
[0-9]+ {n++; printf("\t constant values : %s", yytext);}
%%

int yywrap()
{
return 1;
}

int main()
{
yylex();
printf ("\nTotal number of Tokens : %d\n",n);
}
