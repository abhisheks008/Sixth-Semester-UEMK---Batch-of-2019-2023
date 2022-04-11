**Output of the LEX which will count the tokens and classify them.**

🔴 Test Case 1: </br>
```command
while(j<=0);
         keywords : while        separators : (  identifiers : j         operators : <=  constant values : 0     separators : )  separators : ;

Total number of Tokens : 7
```
🔴 Test Case 2: </br>
```command
if(a==1)
         keywords : if   separators : (  identifiers : a         operators : ==  constant values : 1     separators : )

Total number of Tokens : 6
```

🔴 Test Case 3: </br>
```command
int a=0; b=1;
         keywords : int  separators :    identifiers : a         operators : =   constant values : 0     separators : ;
 separators :    identifiers : b         operators : =   constant values : 1     separators : ;

Total number of Tokens : 11
```
