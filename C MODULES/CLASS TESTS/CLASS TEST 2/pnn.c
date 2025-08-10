#include<stdio.h>
void main(){
	int no;
	printf("enter the number");
	scanf("%d",&no);
	if(no>0){
		printf("number is positive");
	}
	else if(no<0){
		printf("number is negitive");
	}
	else{
		printf("number is neutral");
	}
}