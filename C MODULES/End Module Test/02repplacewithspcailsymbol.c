#include<stdio.h>
//#include<stdlib>
void main(){
	char str[30];
	printf("enter a string");
	scanf("%s",str);
	
	
	char ch;
	printf("enter a chacracter that you want to change\n");
	fflush(stdin);
	scanf("%c",&ch);
	int len=strlen(str);
	
	for(int i=0;i<len;i++){
		if(str[i]==ch){
			str[i]='#';
		}
		
	}
	printf("%s",str);
}