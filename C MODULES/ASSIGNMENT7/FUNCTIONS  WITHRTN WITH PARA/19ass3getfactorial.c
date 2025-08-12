#include<stdio.h>
int getfactorial(int);
void main() {
	int no;
	printf("Enter the number:");
	scanf("%d",&no);
	
	printf("%d",getfactorial(no));
	
}//main end 


int getfactorial(int num){
	int i=1,fact=1;
	while(i<=num) {
		fact=fact*i;
		i++;

	}
	return fact;
} // end getfactorial