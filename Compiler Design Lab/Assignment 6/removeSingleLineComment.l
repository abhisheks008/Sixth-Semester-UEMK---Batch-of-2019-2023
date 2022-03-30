%{
#include <stdio.h>
%}

%%
"//"([a-z]|[0-9]|[A-Z]|" ")* {}
%%

int main()
{
yylex();
return 0;
}

int yywrap()
{
}
