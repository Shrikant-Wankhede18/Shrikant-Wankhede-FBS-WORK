//Write a C program to convert temperature from Celsius to Fahrenheit using the
//formula:
//F = (C *9/5) + 32
#include<stdio.h>
void main(){
	double temp=40.48;
	double fehre;
	fehre=(temp *9/5) + 32;
	printf("the converted fehrenheit is %lf",fehre);
}