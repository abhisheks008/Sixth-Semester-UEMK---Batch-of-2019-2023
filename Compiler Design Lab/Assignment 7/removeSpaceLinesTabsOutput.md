**Output of LEX program which will remove multiple lines, spaces and tabs in a given file.**

🔴 **Input File:** </br>
```command
abhisheks008@LAPTOP-9RGGUF05:~$ cat input.txt
I               am a boy
        My Name is Abhishek

Sharma
I Live at                       Kolkata.
                I am 21                         years old.
```

🔴 **Output File:** </br>
```command
abhisheks008@LAPTOP-9RGGUF05:~$ lex removeSpacesTabsLines.l
abhisheks008@LAPTOP-9RGGUF05:~$ cc lex.yy.c -lfl
abhisheks008@LAPTOP-9RGGUF05:~$ ./a.out
abhisheks008@LAPTOP-9RGGUF05:~$ cat output.txt
IamaboyMyNameisAbhishekSharmaILiveatKolkata.Iam21yearsold.
```
