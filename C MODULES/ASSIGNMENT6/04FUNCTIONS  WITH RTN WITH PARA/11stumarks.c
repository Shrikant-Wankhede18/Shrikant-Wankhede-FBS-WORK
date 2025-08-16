#include<stdio.h>
int markss(int);
void main(){
	int marks=74;
    int res=markss(marks);
    if(res==1)
	{
	printf("Distinction");
	}
	else
	{
	     if(res==2)
		{
				printf("First Class");
		}
		else
		{
			if(res==3)
			{
				printf("Second Class");
			}
			else
			{
				if(res==4)
				{
						printf("Pass Class");
				}
				else if(res==5)
					printf("fail");
				
			}
		}
	}

	
}

int markss(int marks){

	if(marks>=75)
	{
return 1;
	}
	else
	{
	     if(marks>=65)
		{
				return 2;
		}
		else
		{
			if(marks>=55)
			{
			return 3;
			}
			else
			{
				if(marks>=40)
				{
					return 4;
				}
				else if(marks<35)
					return 5;
				
			}
		}
	}
}