//WAP to Form a New String where the First Character and the Last Character have
//been Exchanged
#include<stdio.h>
void main(){
	char str[]="Firstbit";
	int x=strlen(str);
	printf("%d",x);
	int i=0;
	while(str[i]!='\0'){
		
		if(i==0){
			int temp=str[0];
			str[0]=str[x-1];
			str[x-1]=temp;
			
		}
		
		i++;
		}
		
		printf("%s",str);
		
	}
	