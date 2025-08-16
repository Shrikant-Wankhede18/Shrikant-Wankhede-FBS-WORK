#include<stdio.h>
int divbythreeandfive(int,int,int);
void main(){
	int a=3,b=5,num;
	printf("enter the number");
	scanf("%d",&num);
	int res=divbythreeandfive(a,b,num);
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
		else{
		printf("divided by none");
		}
		
	}
}
	
	
}




int divbythreeandfive(int a,int b,int num){

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
			return 4;
		}
		
	}
}
}