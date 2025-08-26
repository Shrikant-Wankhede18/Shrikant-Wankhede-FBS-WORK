#include<stdio.h>
#include<string.h>
void main(){
	
	char s2[]="solution";
	char s1[]=strdup(s2);
	printf("s1 : %s",s1);
} 