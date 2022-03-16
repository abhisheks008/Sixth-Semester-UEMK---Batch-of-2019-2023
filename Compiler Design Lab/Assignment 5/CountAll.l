%{
int word = 0;
int digits = 0;
int spl = 0;
int line = 0;
int temp = 0;
int count = 0;
%}

%%
[a-zA-Z]* {word++; count=count+yyleng;}
[0-9] {digits++;}
\n {line++; word++;}
. {spl++;}
%%

int yywrap () {}

int main()
{
yyin = fopen ("dummy.txt","r");
yylex();
temp = count + spl + digits;
printf ("Number of Words = %d\nNumber of Digits = %d\nNumber of Special Characters = %d\nNumber of Lines = %d\nNumber of Characters = %d\n", word, digits, spl, line, temp);
return 0;
}
