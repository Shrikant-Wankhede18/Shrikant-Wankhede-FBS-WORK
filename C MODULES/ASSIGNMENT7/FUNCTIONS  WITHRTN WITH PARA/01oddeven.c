#include<stdio.h>
int oddeven(int);
void main(){
	int a= 2;
	int res=oddeven(a);
	if (res==1)
	{
		printf("number is even");
	}
	else
	{
		printf("odd");
	}
	
}

int oddeven(int a){
	if(a%2==0){
	
			return 1;
	}
	else{
	   return 2;
	}
}