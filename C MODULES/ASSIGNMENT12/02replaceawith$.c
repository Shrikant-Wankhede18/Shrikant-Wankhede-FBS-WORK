#include<stdio.h>
void main(){
	char str[]="aaamoala";
	
	char ch;
	printf("enter a character that you want to replace with $");
	scanf("%c",&ch);
	
	int i=0;
	while(str[i]!='\0'){
		if(str[i]==ch){
			str[i]='$';
			
		}
		i++;
	}
	printf("%s",str);
	
	
}
