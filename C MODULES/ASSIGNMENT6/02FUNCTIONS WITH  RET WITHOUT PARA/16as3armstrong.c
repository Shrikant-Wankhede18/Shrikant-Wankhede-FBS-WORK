#include<stdio.h>
int as3armstrong();
void main(){
	int res= as3armstrong();
	if(res==1)
	{
		printf("amrmstrong");
	}
	else if(res==2)
	{
		printf("not amrmstrong");
	}
}

int as3armstrong(){
int no=152,rem,sum=0;
	int temp=no;
	while(no>0)
	{
		rem=no%10;
		sum=sum+(rem*rem*rem);
		no=no/10;
	} 
	if(temp==sum)
	{
		return 1;
	}
	else
	{
		return 2;
	}
}