%{
#include "y.tab.h"
%}
%%
[0-9]+(\.[0-9]+)?        {return NUM;}
[a-zA-Z_][_a-zA-Z0-9]*   {return ID; }
[\t]      ;
\n        return 0;
.         return yytext[0];
%%
