//Check the given number is prime or not.
//Input: n = 7
//Output: Prime
#include<stdio.h>
void main(){
	int no=7;
	int i=2,status=0;
	while(i<no)
	{
		if(no%i==0){
			printf("number not prime");
		status=1;
		break;
	}
	i++;
	}
	if(status==0){
		printf("number is prime");
	}

	
	
}