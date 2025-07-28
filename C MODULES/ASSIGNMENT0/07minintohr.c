//Write a C program to convert given minutes into hours and remaining minutes.
#include<stdio.h>
void main(){
	int min=129;
	int hours;
	int minute;
	hours=min/60;
	minute=min%60;
	printf("the converted minutes in hours is %d : hour and %d minute",hours,minute);
}