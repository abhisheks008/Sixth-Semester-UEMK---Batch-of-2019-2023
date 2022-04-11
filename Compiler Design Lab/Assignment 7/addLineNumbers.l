%{
int line_no = 1;
%}

line .*\n

%%
{line} {printf ("%10d> %s", line_no++, yytext); }
%%

int yywrap()
{
return 1;
}

int main()
{
yyin = fopen ("program.c", "r");
yylex();
return 0;
}
