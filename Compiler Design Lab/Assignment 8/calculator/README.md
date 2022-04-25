**Question:** *Write a YACC program to implement a basic calculator which can perform basic arithmetic operations.* </br>

🔴 **Process to run Yacc program:**
```
// Before running the code make sure your system has bison and libbison-dev installed. 
// If not, then install by writing the following code in the Ubuntu terminal.
ubuntu-cmd:~$ sudo apt-get update
ubuntu-cmd:~$ sudo apt install flex bison
ubuntu-cmd:~$ sudo apt install libbison-dev

// After installing the packages, write the code separately for the LEX and YACC program.
ubuntu-cmd:~$ vi calculator.l
ubuntu-cmd:~$ vi calculator.y
ubuntu-cmd:~$ lex calculator.l
ubuntu-cmd:~$ yacc -d calculator.y
ubuntu-cmd:~$ cc lex.yy.c y.tab.c -ly -ll
```

🔴 **Test Case 1:**
```
ubuntu-cmd:~$ ./a.out
Enter Any Arithmetic Expression :
5+6

Result=11

Entered arithmetic expression is Valid
```


🔴 **Test Case 2:**
```
ubuntu-cmd:~$ ./a.out
Enter Any Arithmetic Expression :
(5+6+8)*0

Result=0

Entered arithmetic expression is Valid
```

🔴 **Test Case 3:**
```
ubuntu-cmd:~$ ./a.out
Enter Any Arithmetic Expression :
5+6+/8+1+8*7

Entered arithmetic expression is Invalid
```

🔴 **Test Case 4:**
```
ubuntu-cmd:~$ ./a.out
Enter Any Arithmetic Expression :
89%2

Result=1

Entered arithmetic expression is Valid
```
