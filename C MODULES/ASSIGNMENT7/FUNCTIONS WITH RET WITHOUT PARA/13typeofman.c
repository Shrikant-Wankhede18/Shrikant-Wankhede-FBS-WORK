#include<stdio.h>
int typeofage();
void main(){
	int res= typeofage()
	if(res==1)
	{
		printf("child");
	}
	else
	{
		if(res==2)
		printf("teenager");
	}
	    if(res==3)
	    {
	    	printf("adult");
		}
		if(res==4)
		{
				printf("please enter correct age");
		}
		





int typeofage(){
	int age=11;
	if(age<12)
	{
		return 1;
	}
	else
	{
		if(age>=12 && age<19)
		return 2;
	}
	    if(age>=20 && age<59)
	    {
	    return 3;
		}
		if(age>60)
		{
		return 5;
		}
		
}
		