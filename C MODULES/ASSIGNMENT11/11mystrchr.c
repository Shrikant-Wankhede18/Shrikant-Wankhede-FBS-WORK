#include<stdio.h>
void mystrchr(char*,int);
void main(){
	char str[]="firstbit";
	char ch;
	printf("enter a character that you want to find");
	scanf("%c",&ch);
	mystrchr(str,ch);
}

void mystrchr(char* str,int ch){
	int i=0,flag=0;
	while(str[i]!='\0'){
		if(str[i]==ch){
			printf("character found at %d th index",i);
			flag=1;
			break;
		}
		i++;
	}
	if(flag==0){
		printf("char not found");
	}
}