#include<stdio.h>
void main(){
	int units,bill;
	printf("enter your units");
	scanf("%d",&units);
	if (units<=50){
	bill=units*30;
	printf("youre bill is :%d",bill);
    }  
    else if (units<=150){
	bill=units*40;
	printf("youre bill is :%d",bill);
    }  
    else if (units>151){
	bill=units*50;
	printf("youre bill is :%d",bill);
    }  

}