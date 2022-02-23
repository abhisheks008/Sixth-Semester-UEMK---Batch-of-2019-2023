/*
Write a C program which will read a C program, and will delete all the comments.
After deleting all the comments it will write the program in a separate file.
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

void check_comment (char);
void block_comment ();
void single_comment ();

FILE *fp1, *fp2;

int main(){
	char c;
	fp1 = fopen ("file1.txt","r");
	fp2 = fopen ("MyNewFile.txt","w");
	while ((c=fgetc(fp1))!=EOF){
		check_comment (c);
	}
	fclose (fp1);
	fclose (fp2);
	return 0;
}

// handles both types of comments
void check_comment (char c){
	char d;
	if (c == '/'){
		if ((d = fgetc(fp1))=='*'){
			block_comment();
		}
		else if (d == '/'){
			single_comment ();
		}
		// if both the cases are failed, then we can add the characters in the new file, as they are not comments.
		else {
			fputc (c, fp2);
			fputc (d, fp2);
		}
	}
	// again if both the cases are failed, then we can add the characters in the new file, as they are not comments.
	else{
		fputc (c, fp2);
	}
}

// function to handle the block comments
void block_comment (){
	char d, e;
	// keep reading all the characters of the comment
	while ((d = fgetc(fp1))!=EOF){
		if (d == '*'){
			e = fgetc (fp1);
			// check out whether the comment is ended or, not
			if (e == '/'){ 
				return;
			}
		}
	}
}


// function that handles a single line comment
void single_comment (){
	char d, e;
	while ((d = fgetc(fp1))!=EOF){
		if (d == '\n'){
			fputc ('\n', fp2); // adding a '\n' after the comment ends
			return;
		}
	}
}

// code contributed, Abhishek Sharma, 2022
