%{
#include<stdio.h>
int com=0;
%}
%s COMMENT
%%
"/*" {BEGIN COMMENT;}
<COMMENT>"*/" {BEGIN 0;com++;}
<COMMENT>\n {com++;}
<COMMENT>. {;}
\/\/.* {; com++;}
.|\n {fprintf(yyout,"%s",yytext);}
%%
int main()
{
yyin=fopen("file1.txt","r");
yyout=fopen("newfile.txt","w");
yylex();
printf("\n number of comments are = %d\n",com);
return 0;
}
int yywrap()
{
return 1;
}
