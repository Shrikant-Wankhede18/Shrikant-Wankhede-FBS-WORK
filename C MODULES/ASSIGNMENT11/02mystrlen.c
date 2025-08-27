//mystrlen use define function
#include<stdio.h>
#include<string.h>
int mystrlen(char*);
void main()
{
	char str[10]="firstbit";
 int res=mystrlen(str);
	printf("%d",res);
	
}
int mystrlen(char* str)
{
	int count=0;
	for(int i=0;str[i]!='\0';i++){
		count++;
	}
		return count;
}