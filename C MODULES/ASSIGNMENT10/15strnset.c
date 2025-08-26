#include<stdio.h>
#include<string.h>
void main(){
	char str[]="firstbit";
	strnset(str,'#',3);
	printf("length is : %s",str);
} 