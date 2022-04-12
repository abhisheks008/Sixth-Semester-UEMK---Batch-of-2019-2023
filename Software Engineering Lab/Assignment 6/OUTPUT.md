🔴 **QUESTION 1:** 
```COMMAND
C:\Users\ABHISHEK\Desktop>javac a6q1.java

C:\Users\ABHISHEK\Desktop>java a6q1
connection established
```

*PREVIOUS DATABASE IN SQL:*
```SQL
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1000 SAYAN                               56000
      1001 ABHISHEK                            15000
      1002 PRABIR                               6500
```

🔴 **QUESTION 2:** 
```command
C:\Users\ABHISHEK\Desktop>javac a6q2.java

C:\Users\ABHISHEK\Desktop>java a6q2
Two new values have been inserted successfully!
```

*DATABASE VIEW:*
```SQL
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1000 SAYAN                               56000
      1001 ABHISHEK                            15000
      1002 PRABIR                               6500
      1003 KRISHNA                             50000
      1004 AMRINDER                             1500
```


🔴 **QUESTION 3:**
```COMMAND
C:\Users\ABHISHEK\Desktop>javac a6q3.java

C:\Users\ABHISHEK\Desktop>java a6q3
Balance Updated!
```
*DATABASE VIEW:*
```SQL
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1000 SAYAN                               56500
      1001 ABHISHEK                            15500
      1002 PRABIR                               7000
      1003 KRISHNA                             50500
      1004 AMRINDER                             2000
```

🔴 **QUESTION 4:**
```command
C:\Users\ABHISHEK\Desktop>javac a6q4.java

C:\Users\ABHISHEK\Desktop>java a6q4
updated
```

*DATABASE VIEW:*
```sql
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1000 SAYAN                               56500
      1001 ABHISHEK                            15500
      1003 KRISHNA                             50500
```


🔴 **QUESTION 5:**
```COMMAND
C:\Users\ABHISHEK\Desktop>java a6q5
Enter the A/C holder name
BOSE
Enter the account number
1008
Enter the balance Rs
14000
1 account stored successfully
```
*DATABASE VIEW:*
```sql
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1000 SAYAN                               56500
      1001 ABHISHEK                            15500
      1003 KRISHNA                             50500
      1008 BOSE                                14000
```

🔴 **QUESTION 6:**
```command
C:\Users\ABHISHEK\Desktop>javac a6q6.java

C:\Users\ABHISHEK\Desktop>java a6q6
Enter the account number
1008
Enter the balance to be deposited Rs
6000
Money deposited successfully
```
*DATABASE VIEW:*
```sql
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1000 SAYAN                               56500
      1001 ABHISHEK                            15500
      1003 KRISHNA                             50500
      1008 BOSE                                20000
```
