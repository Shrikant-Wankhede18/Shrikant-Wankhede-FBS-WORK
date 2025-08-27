//Write a program to check the string is palindrome or not.
#include<stdio.h>
void main(){
	char str[]="radar";
	int j=0,count=0;
	while(str[j]!='\0'){
		count++;
		j++;
	}
	
	int size=count;
	int flag=0;
	int i=0;
	while(str[i]!='\0'){
		if(str[i]==str[size-1-i]){
			flag=1;
		}
		i++;
	}
	if(flag==1)
	printf("palindrome");
	else
	printf("not palindrome");
	
	
}