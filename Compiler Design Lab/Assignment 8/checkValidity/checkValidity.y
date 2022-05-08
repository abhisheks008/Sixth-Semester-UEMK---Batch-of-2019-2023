%{
#include<stdio.h>
#include<stdlib.h>
int yylex();
int yyerror();
%}
%token NUM ID
%left '+''-'
%left '*''/'
%%
e:e'+'e
| e'-'e
| e'*'e
| e'/'e
| '('e')'
| NUM
| ID    ;
%%
int main()
{
printf("Type the expression & press enter key.\n");
yyparse();
printf("Valid Expression!\n");
return 0;
}
int yyerror()
{
printf("Invalid Expression :(\n");
exit(0);
}
