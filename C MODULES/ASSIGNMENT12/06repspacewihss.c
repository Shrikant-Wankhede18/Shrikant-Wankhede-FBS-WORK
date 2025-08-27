//6. WAP to Take in a String and Replace Every Blank Space with special symbol.

#include<stdio.h>
void main(){
	char str[]="firstbit solutions";
	char ch=' ';

	
	int i=0;
	while(str[i]!='\0'){
		if(str[i]==ch){
			str[i]='$';
			
		}

		i++;
	}
	printf("%s",str);
	
	
}
