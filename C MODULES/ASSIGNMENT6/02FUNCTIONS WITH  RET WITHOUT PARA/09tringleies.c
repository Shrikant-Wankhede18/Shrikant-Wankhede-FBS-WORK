#include<stdio.h>
int triangleeis();
void main(){
	int res=triangleeis();
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
		else if(res==3)
		{
			printf("scalene");
		}	
	}
	}

int triangleeis(){

int a,b,c;
	printf("enter the first value: ");
	scanf("%d", &a);
	printf("enter the second value: ");
	scanf("%d", &b);
	printf("enter the third value: ");
	scanf("%d", &c);
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