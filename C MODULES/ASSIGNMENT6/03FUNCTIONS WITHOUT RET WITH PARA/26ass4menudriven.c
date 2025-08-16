#include<stdio.h>
void menudrive(int,int);
void main(){
	int choice,num;
	printf("enter your choice (1/2/3/4/5) : ");
	scanf("%d",&choice);
	printf("enter a number :");
	scanf("%d",&num);
	menudrive(choice,num);
	
}
void menudrive(int choice,int num) {
	
	if(choice==1) {
		if(num%2==0) {
			printf("number is even");
		} else {
			printf("number is odd");
		}
	}


	if(choice==2) {
	
		int status=0;
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
	int rem,rev=0;
	
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
	int rev=0;
	
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
	int sum=0;
	
	while(num>0){
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	printf("sum of digits is %d",sum);
}
}
