```
abhisheks008@LAPTOP-9RGGUF05:~$ lex commentCountAndEliminate.l
abhisheks008@LAPTOP-9RGGUF05:~$ cc lex.yy.c -lfl
abhisheks008@LAPTOP-9RGGUF05:~$ ./a.out

 number of comments are = 11
 
 
abhisheks008@LAPTOP-9RGGUF05:~$ cat file1.txt
/*
C program to add two integers.
*/

#include <stdio.h> // adding the header file

// main function calling
int main (){
        int a = 5;  // integer 1
        int b = 6;  // integer 2
        int c;
        c = a + b; // addition operation
        printf ("%d", c);  // printing the result
        return 0;
}

// end of the program
// code by, Abhishek Sharma
abhisheks008@LAPTOP-9RGGUF05:~$ cat newfile.txt


#include <stdio.h>


int main (){
        int a = 5;
        int b = 6;
        int c;
        c = a + b;
        printf ("%d", c);
        return 0;
}
``` 
