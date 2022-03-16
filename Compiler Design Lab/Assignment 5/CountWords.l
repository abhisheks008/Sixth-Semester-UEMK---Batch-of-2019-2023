%{
int count = 0;
%}

%%
[a-zA-Z0-9]* {count++;}
%%

int yywrap () {}

int main ()
{
printf ("Enter a string: ");
yylex();
printf ("Number of words present in the string is = %d\n", count);
}
