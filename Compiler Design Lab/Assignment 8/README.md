## Compiler Design Lab | Assignment 8

**Question:** *Write a YACC program to check the validity of an arithmetic expression that uses the operators such as +, -, * and /* </br>

🔴 **Process to run Yacc program:**
```
// Before running the code make sure your system has bison and libbison-dev installed. 
// If not, then install by writing the following code in the Ubuntu terminal.
ubuntu-cmd:~$ sudo apt-get update
ubuntu-cmd:~$ sudo apt install flex bison
ubuntu-cmd:~$ sudo apt install libbison-dev

// After installing the packages, write the code separately for the LEX and YACC program.
ubuntu-cmd:~$ vi checkValidity.l
ubuntu-cmd:~$ vi checkValidity.y
ubuntu-cmd:~$ lex checkValidity.l
ubuntu-cmd:~$ yacc -d checkValidity.y
ubuntu-cmd:~$ cc lex.yy.c y.tab.c -ly -ll
ubuntu-cmd:~$ ./a.out
Type the expression & press enter key.
1+5*6/7
Valid Expression!

ubuntu-cmd:~$ ./a.out
Type the expression & press enter key.
a+b++c+d
Invalid Expression :(

ubuntu-cmd:~$ ./a.out
Type the expression & press enter key.
a+b++c+d
Invalid Expression :(

ubuntu-cmd:~$ ./a.out
Type the expression & press enter key.
a+b+c+d
Valid Expression!
```



