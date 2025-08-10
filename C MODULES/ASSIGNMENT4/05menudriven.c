//5. Write a menu driven program to take a number for user and perform operations as follows.
//
//Press 1.To check number is even or odd.
//2.To check number is prime or not.
//3.To check number is pallindrome or not.
//4.To check number is positive, negative or zero.
//5.To reverse a number.
//6.To find sum of digits.
#include<stdio.h>
void main() {
	int choice;
	printf("enter your choice (1/2/3/4/5) : ");
	scanf("%d",&choice);
	if(choice==1) {
		int num;
		printf("enter your number : ");
		scanf("%d",&num);
		if(num%2==0) {
			printf("number is even");
		} else {
			printf("number is odd");
		}
	}


	if(choice==2) {
		int num;
		int status=0;
		printf("enter your number : ");
		scanf("%d",&num);
		int i=2;
		while(i<num) {
			if(num%i==0) 
			
				status=1;
			i++;
				
			}
			    if(status==0) {
				printf("number is prime");
			
		 	}    else {
				printf("number is not prime");
			}
			
			
	}
	
	if(choice==3){
	int num,rem,rev=0;
	printf("enter the number :");
	scanf("%d",&num);
	int temp=num;
	while(num>0){
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
	}
	if(temp==rev){
		printf("number is palindrome");
	}
	else{
	
	printf("number is not palindrome");
}
}

if(choice==4){
	int num;
	printf("enter a number :");
	scanf("%d",&num);
	if(num>0){
		printf("number is positive");
	}
	else if(num<0){
		printf("number is negitive");
	}
	else
	{
		printf("number is zero");
	}
}

if(choice==5){
	int num,rev=0;
	printf("enter a number");
	scanf("%d",&num);
	int temp=num;
	while(num>0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}printf("%d",rev);
	

}

if(choice==6)
{
	int no,sum=0;
	printf("enter a number");
	scanf("%d",&no);
	while(no>0){
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	printf("sum of digits is %d",sum);
}
}
