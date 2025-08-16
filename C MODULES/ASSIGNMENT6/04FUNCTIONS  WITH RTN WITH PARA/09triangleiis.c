#include<stdio.h>
int triangleeis(int,int,int);
void main(){
	int a,b,c;
	printf("enter the first value: ");
	scanf("%d", &a);
	printf("enter the second value: ");
	scanf("%d", &b);
	printf("enter the third value: ");
	scanf("%d", &c);
	int res=triangleeis(a,b,c);
	if(res==1)
		{
		printf("equilateral");
	}
	else
	{
	     if(res==2)
		{
		 printf("isosceles");	
		}
		else
		{
			printf("scalene");
		}	
	}
}

int triangleeis(int a,int b,int c){

	if(a==b && b==c)
		{
		return 1;
	}
	else
	{
	     if(a==b || b==c ||a==c)
		{
		 return 2;	
		}
		else
		{
			return 3;
		}	
	}
	
}