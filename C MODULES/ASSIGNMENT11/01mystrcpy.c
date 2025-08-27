//mystrcpy user define function;
#include<stdio.h>
#include<string.h>
char* mystrcpy(char*,char*);
void main()
{
	char str[10]="FIRSTBIT";
	char brr[10];
	mystrcpy(brr,str);
	puts(brr);
}
char* mystrcpy(char* brr,char* str)
{
	int i,j;
	for(i=0,j=0;str[i]!='\0';i++,j++){
		brr[i]=str[j];
	}
	brr[i]='\0';
	return brr;
}