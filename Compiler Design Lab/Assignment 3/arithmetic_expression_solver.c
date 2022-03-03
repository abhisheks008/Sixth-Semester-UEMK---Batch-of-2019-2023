/*
Write C program which will calculate an arithmetic expression which is 
given as a string. Consider the expression has no paranthesis and contains 
the operators such as, +, -, * and /.

Compiler Design Lab
Program No.: 04

Code contributed by, Abhishek Sharma
*/

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <conio.h>

int stack2[30], temp, length=0, indx=0, pos=0, top=-1;
char symbol, infix[20], postfix[20], stack[30];

void push(char);
void push2(int);
char pop();
int pop2();
int precedence(char);
void infix_to_postfix (char[]);
void eval_postfix(char[]);

void push (char symbol){
	top = top + 1;
	stack[top]=symbol;
}
char pop(){
	temp = stack[top];
	top = top - 1;
	return temp;
}

// providing the priority to the operators while the operation is to be
// going on.
int precedence (char symbol){
	int priority;
	switch(symbol){
		case '#' : {
			priority = 0;
			break;
		}
		case '(' :
		case ')' :{
			priority = 1;
			break;
		}
		case '+' :
		case '-' :{
			priority = 2;
			break;
		}
		case '*' :
		case '/' :{
			priority = 3;
			break;
		}
		case '^' :{
			priority = 4;
			break;
		}
	}
	return priority;
}

// converting the infix expression to postfix.
// It will help us to calculate the result easily.
void infix_to_postfix (char infix[]){
	length = strlen(infix);
	push ('#');
	while (indx<length){
		symbol = infix[indx++];
		switch (symbol){
			case '(' :{
				push (symbol);
				break;
			}
			case ')' :{
				temp = pop();
				while (temp!='('){
					postfix[pos++] = temp;
					temp = pop();
				}
				break;
			}
			case '-' :
			case '+' :
			case '*' :
			case '/' :
			case '^' :{
				while (precedence(stack[top])>=precedence(symbol)){
					temp = pop();
					postfix[pos++] = temp;
				}
				push (symbol);
				break;
			}
			default :{
				postfix[pos++]=symbol;
				break;
			}
		}
	}
	while (top>0){
		temp = pop();
		postfix[pos++] = temp;
		postfix[pos]='\0';
	}
}

void push2 (int x){
	stack2[++top] = x;
}

int pop2 (){
	return stack2[top--];
}

// Evaluating the postfix expression
void eval_postfix (char postfix[]){
	char *temp;
	int n1, n2, n3, num;
	temp = postfix;
	while (*temp!= '\0'){
		if (isdigit(*temp)){
			num = *temp - 48;
			push2 (num);
		}
		else{
			n1 = pop2();
			n2 = pop2();
			switch (*temp){
				case '+' :
					{
						n3 = n1 + n2;
						break;
					}
				case '-' :
					{
						n3 = n2 - n1;
						break;
					}
				case '*' :
					{
						n3 = n1 * n2;
						break;
					}
				case '/' :
					{
						n3 = n2 / n1;
						break;
					}
				case '^' :
					{
						n3 = pow(n2,n1);
						break;
					}
			}
			push2 (n3);
		}
		temp++;
	}
	printf ("\nThe Result of the given expression is %d",pop2());
}


// Main Fuction
int main (){
	printf ("Enter an Infix Expression : ");
	gets (infix);
	infix_to_postfix(infix);
	printf ("\nThe Postfix Expression will be : ");
	puts (postfix);
	eval_postfix(postfix);
	return 0;
}
