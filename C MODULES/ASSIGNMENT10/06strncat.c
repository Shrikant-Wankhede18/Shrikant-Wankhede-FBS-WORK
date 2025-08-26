#include<stdio.h>
#include<string.h>
void main(){
	char s1[20]="firstbit ";
	char s2[]="solution";
	strncat(s1,s2,3);
	printf("s1 : %s",s1);
} 