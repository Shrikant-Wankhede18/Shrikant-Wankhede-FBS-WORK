//WAP to Calculate the Number of Words Present in a String
#include<stdio.h>
void main(){
	char str[]="firstbit solutions is good ";
	
	int i=0,count=0,inword=0;
	while(str[i]!='\0'){
	if(str[i]!=' ' && inword==0){
		inword=1;
		count++;
	}
	else if(str[i]==' '){
		inword=0;
	}
		i++;
	}

	printf("%d",count);
}