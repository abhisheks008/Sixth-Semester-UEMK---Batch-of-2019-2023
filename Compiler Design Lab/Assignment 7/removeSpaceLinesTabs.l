%{
%}

%%
[ \n\t]+ {fprintf(yyout, "");}
. {fprintf(yyout, "%s", yytext);}
%%

int yywrap()
{
return 1;
}

int main()
{
yyin = fopen("input.txt","r");
yyout = fopen("output.txt","w");
yylex();
return 0;
}
