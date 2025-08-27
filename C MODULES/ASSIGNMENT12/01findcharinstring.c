//Write a program to scan string from user then scan a single character and search it
//in a accepted string.

#include<stdio.h>
void main(){
	char str[]="firstbit";
	int flag=0;
	char ch;
	printf("enter a character that you want to search");
	scanf("%c",&ch);
	
	int i=0;
	while(str[i]!='\0'){
		if(str[i]==ch){
			printf("found at %d th index",i);
			flag =1;
		}
		i++;
	}
	
	if(flag==0){
		printf("char not found");
	}
	
}

