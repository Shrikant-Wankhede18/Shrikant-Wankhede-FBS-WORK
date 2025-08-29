//WAP to Count the Number of Vowels in a String

#include<stdio.h>
void main(){
	char str[]="Firstbit";
	int count=0;
	int i=0;
	while(str[i]!='\0'){
//		char ch =str[i];
		
		if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'){
		
		count++;
			
		}
		i++;
		
		}
		printf("%d",count);
		
		
	}
