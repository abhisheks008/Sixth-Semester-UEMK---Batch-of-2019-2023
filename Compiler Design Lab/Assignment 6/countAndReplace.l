%{
#include <stdio.h>
int sf=0, pf=0;
%}

%%
"scanf" {sf++; fprintf(yyout, "readf");}
"printf" {pf++; fprintf(yyout, "writef");}
%%

int yywrap()
{
return 1;
}

int main()
{
yyin = fopen("program.c","r");
yyout = fopen("new.c","w");
yylex();
printf ("Number of scanfs = %d\nNumber of printfs = %d\n", sf, pf);
return 0;
}
