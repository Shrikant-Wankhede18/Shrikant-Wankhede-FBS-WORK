//WAP to check if the year is leap or not
#include<stdio.h>
void main(){
	int a=1900;
	if(a%4==0 && a%100!=0 ||a%400)
	{
		printf("year is leap year");
	}
	else
	{
		printf("year is not leap year");
	}
}