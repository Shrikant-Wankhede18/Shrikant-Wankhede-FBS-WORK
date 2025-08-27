//WAP to Remove the nth Index Character from a Non-Empty String

//WAP Replace all Occurrences of ‘a’ with $ in a String

#include<stdio.h>
void main(){
	char str[]="firstbit";
	int index;
	printf("enter a index that you want to delete : ");
	scanf("%d",&index);
	int i=index;
	while(str[i]!='\0'){
		
			str[i]=str[i+1];
			i++;	
		}
		str[i]='\0';
		printf("%s",str);
		
	}
	
	
	
	
