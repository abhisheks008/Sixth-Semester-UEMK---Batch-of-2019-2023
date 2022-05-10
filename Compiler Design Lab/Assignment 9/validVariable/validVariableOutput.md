```
abhisheks008@LAPTOP-9RGGUF05:~$ vi validVariable.l
abhisheks008@LAPTOP-9RGGUF05:~$ vi validVariable.y
abhisheks008@LAPTOP-9RGGUF05:~$ lex validVariable.l
abhisheks008@LAPTOP-9RGGUF05:~$ yacc -d validVariable.y
abhisheks008@LAPTOP-9RGGUF05:~$ cc lex.yy.c y.tab.c -ly -ll
y.tab.c: In function ‘yyparse’:
y.tab.c:1212:16: warning: implicit declaration of function ‘yylex’ [-Wimplicit-function-declaration]
 1212 |       yychar = yylex ();
      |                ^~~~~
y.tab.c:1339:7: warning: implicit declaration of function ‘yyerror’; did you mean ‘yyerrok’? [-Wimplicit-function-declaration]
 1339 |       yyerror (YY_("syntax error"));
      |       ^~~~~~~
      |       yyerrok
abhisheks008@LAPTOP-9RGGUF05:~$ ./a.out

Enter a name to tested for identifier abc

It is a identifier!
```
