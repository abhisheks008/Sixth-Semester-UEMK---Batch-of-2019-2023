// Write a lex program to count the number of words in a string.
// Code contributed by, Abhishek Sharma
// Compiler Design Lab 5
// Assignment 5

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
