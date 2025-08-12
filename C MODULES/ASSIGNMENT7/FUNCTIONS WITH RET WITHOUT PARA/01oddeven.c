#include<stdio.h>
int oddeven();
void main(){
	if(oddeven()){
		printf("number is even");
	}
	else{
		printf("number is odd");
	}
	
}

int oddeven(){
	int a= 2;
	if(a%2==0)
		return 1;
}