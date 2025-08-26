#include<stdio.h>
#include<string.h>
void main(){
	char s1[10]="firstbit";
	char s2[10]="solution";
	strncpy(s2,s1,4);
	printf("s2 : %s",s2);
} 