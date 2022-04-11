**Output for the LEX program to add line numbers in a file.** </br>

🔴 **Input File:** </br>
```command
abhisheks008@LAPTOP-9RGGUF05:~$ cat program.c
#include <stdio.h>
int main()
{
        int a, b;
        printf ("Enter 1st number: ");
        scanf ("%d",&a);
        printf ("Enter 2nd number: ");
        scanf ("%d", &b);
        int sum1;
        sum1 = a + b;
        printf ("The sum of %d and %d is %d", a, b, sum1);
        return 0;
}
```

🔴 **Output File:** </br>
```command
abhisheks008@LAPTOP-9RGGUF05:~$ lex addLineNumbers.l
abhisheks008@LAPTOP-9RGGUF05:~$ cc lex.yy.c -lfl
abhisheks008@LAPTOP-9RGGUF05:~$ ./a.out
         1> #include <stdio.h>
         2> int main()
         3> {
         4>     int a, b;
         5>     printf ("Enter 1st number: ");
         6>     scanf ("%d",&a);
         7>     printf ("Enter 2nd number: ");
         8>     scanf ("%d", &b);
         9>     int sum1;
        10>     sum1 = a + b;
        11>     printf ("The sum of %d and %d is %d", a, b, sum1);
        12>     return 0;
        13> }
```

