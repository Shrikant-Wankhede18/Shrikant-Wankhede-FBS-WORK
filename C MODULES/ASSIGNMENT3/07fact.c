//Find factorial of given number.
//Input: n = 5
//Output: 120
#include<stdio.h>
void main(){
	int n=5,fact=1;
	while(n>1)
	{
		fact=fact*n;
		n--;
		
	}
	printf("%d",fact);
}
