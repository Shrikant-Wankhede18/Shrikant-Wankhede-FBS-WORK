#include<stdio.h>
int getfactorial();
void main() {
	
	printf("factorial is = %d",getfactorial());
	
}//main end 


int getfactorial(){
	int no;
	printf("Enter the number:");
	scanf("%d",&no);
	int i=1,fact=1;
	while(i<=no) {
		fact=fact*i;
		i++;

	}
	return fact;
} // end getfactorial