#include<stdio.h>
#include<string.h>
void main(){
	char s1[]="firstbit";
	char s2[]="FIRSTBIT";
	int x=strcmpi(s1,s2);
	printf("res : %d",x);
} 