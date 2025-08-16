#include<stdio.h>
int divbythreeandfive();
void main(){
	int res=divbythreeandfive();
	if(res==1) 
	{
		printf("divide by 3 and 5");
	}
	else
	{
		if(res==2)
		{
			printf("divided by 3");
		}
		else
		{
			if(res==3)
		{
			printf("divided by 5");
		}
		else if(res==5)
		{
			printf("divided by none");
		}
		
	}
}
}




int divbythreeandfive(){
	int a=3,b=5;
	int num;
	printf("enter the number");
	scanf("%d",&num);
	if(num%3==0 && num%5==0) 
	{
		return 1;
	}
	else
	{
		if(num%3==0 && num%5!=0)
		{
			return 2;
		}
		else
		{
			if(num%3!=0 && num%5==0)
		{
		return 3;
		}
		else{
			return 5;
		}
		
	}
}
}