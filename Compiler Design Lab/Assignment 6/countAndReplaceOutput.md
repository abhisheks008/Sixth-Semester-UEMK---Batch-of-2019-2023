**Test Cases** for the LEX program which will count the number of `scanf` and `printf` statements in a C program, replace them with `readf` and `writef` statements respectively.</br>
```
abhisheks008@LAPTOP-9RGGUF05:~$ touch program.c
abhisheks008@LAPTOP-9RGGUF05:~$ touch new.c
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
abhisheks008@LAPTOP-9RGGUF05:~$ vi countAndExchange.l
abhisheks008@LAPTOP-9RGGUF05:~$ lex countAndExchange.l
abhisheks008@LAPTOP-9RGGUF05:~$ cc lex.yy.c -lfl
abhisheks008@LAPTOP-9RGGUF05:~$ ./a.out
Number of scanfs = 2
Number of printfs = 3
abhisheks008@LAPTOP-9RGGUF05:~$ cat new.c
#include <stdio.h>
int main()
{
        int a, b;
        writef ("Enter 1st number: ");
        readf ("%d",&a);
        writef ("Enter 2nd number: ");
        readf ("%d", &b);
        int sum1;
        sum1 = a + b;
        writef ("The sum of %d and %d is %d", a, b, sum1);
        return 0;
}
```
