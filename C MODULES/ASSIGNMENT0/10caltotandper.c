//Write a C program to input marks of five subjects, find the total marks, and calculate
//the percentage.
#include<stdio.h>
void main(){
	float eng=74.35,math=35.49,science=80.73,marathi=60.00,hindi=80.90;
	float total=eng+math+science+marathi+hindi;
	float p=(total/500)*100;
	printf("the total marks is : %.2f\n percentage is : %.2f",total,p);
}