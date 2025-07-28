//Write a C program to swap two numbers using a temporary third variable.
#include<stdio.h>
void main(){
	int a=20;
	int b=10;
	int temp;
    temp=a;
	a=b;
	b=temp;
	printf("the swapped values are %d, %d",a,b);
	}