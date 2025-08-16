//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
//equilateral =All three sides are equal.
//isosceles = Any two sides are equal.
//scalene = All sides are different.
#include<stdio.h>
void main(){
	int a,b,c;
	printf("enter the first value: ");
	scanf("%d", &a);
	printf("enter the second value: ");
	scanf("%d", &b);
	printf("enter the third value: ");
	scanf("%d", &c);
	if(a==b && b==c)
	{
		printf("equilateral");
	}
	else
	{
	    if(a==b || b==c ||a==c)
		{
		 printf("isosceles");	
		}
		else
		{
			printf("scalene");
		}	
	}
}