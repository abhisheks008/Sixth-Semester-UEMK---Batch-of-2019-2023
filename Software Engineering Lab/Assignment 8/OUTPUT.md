*DATABASE PREVIEW*
```
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1012 JUAN                                17000
      1001 ABHISHEK                            14000
      1003 KRISHNA                             50500
      1008 BOSE                                20000
      1009 SURESH                               6800
```

🔴 **QUESTION 1:**
```
C:\Users\ABHISHEK\Desktop>javac a8q1.java
C:\Users\ABHISHEK\Desktop>java a8q1
Enter the Account Number :
1012
Funds transferred successfully.
```

*DATABASE VIEW:*
```
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1012 JUAN                                16500
      1001 ABHISHEK                            14000
      1003 KRISHNA                             50500
      1008 BOSE                                20000
      1009 SURESH                               6800
```

🔴 **QUESTION 1 (Version II): [Not included in the Assignment]** </br>
*In this question it has asked to transfer amount, but in the previous version of the solution we have seen that the amount is debited and not being transferred to another account. That's why I have updated the code a little bit for transferring the amount to different bank account from an account inside this database.*
```
C:\Users\ABHISHEK\Desktop>javac a8q1_v2.java

C:\Users\ABHISHEK\Desktop>java a8q1_v2
Enter the Account Number :
1009
Enter the amount to be transferred :
800
Enter the account number in which the amount will be transferred :
1012
Funds transferred successfully.
```

*DATABASE VIEW:*
```
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1012 JUAN                                17300
      1001 ABHISHEK                            14000
      1003 KRISHNA                             50500
      1008 BOSE                                20000
      1009 SURESH                               6000
```

🔴 **QUESTION 2:**
```
C:\Users\ABHISHEK\Desktop>javac a8q2.java

C:\Users\ABHISHEK\Desktop>java a8q2

-- Welcome to ABC Banking System --
Here are the options :
1. Store accounts' information.
2. Closing an Account.
3. Increase Account Balance.
4. Retrieve Date.
5. Exit.

Enter your choice :
1

-- Store Accounts Informations --

Enter Account number :
1013
Enter Account holder's name :
DAVID
Enter the Balance :
90000

1 Account stored successfully!
```

*DATABASE VIEW:*
```
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1012 JUAN                                17300
      1001 ABHISHEK                            14000
      1003 KRISHNA                             50500
      1008 BOSE                                20000
      1009 SURESH                               6000
      1013 DAVID                               90000
```

*COMMAND PROMPT:*
```
Enter your choice :
2

-- Closing an Account --

Enter Account number :
1009

1 Account has been deleted.
```

*DATABASE VIEW:*
```
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1012 JUAN                                17300
      1001 ABHISHEK                            14000
      1003 KRISHNA                             50500
      1008 BOSE                                20000
      1013 DAVID                               90000
```

*COMMAND PROMPT:*
```
Enter your choice :
3

-- Increase Account Balance --

Enter Account number :
1008
Enter balance :
1500

Balance updated for A/C number 1008
```

*DATABASE VIEW:*
```
SQL> SELECT * FROM ACCOUNT;

     ACCNO NAME                              BALANCE
---------- ------------------------------ ----------
      1012 JUAN                                17300
      1001 ABHISHEK                            14000
      1003 KRISHNA                             50500
      1008 BOSE                                21500
      1013 DAVID                               90000
```

*COMMAND PROMPT:*
```
Enter your choice :
4

-- Retrieve Data --

Enter Account number :
1001
Account holder's name : ABHISHEK
Account Balance : Rs. 14000

Enter your choice :
4

-- Retrieve Data --

Enter Account number :
1014
Not a valid information



Enter your choice :
5

C:\Users\ABHISHEK\Desktop>
```
