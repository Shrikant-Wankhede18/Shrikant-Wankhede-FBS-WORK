#include<stdio.h>
int as3perfect();
void main(){
	int res= as3perfect();
	if(res==1)
	printf("perfect ");
	else
	printf("not perfect");
}
int as3perfect(){
int no=28,i=1,sum=0;
	int temp=no;
	while(i<no)
	{
		if(no%i==0){
			sum=sum+i;
		}
		i++;
	}
	if(sum==temp)
	return 1;
	else
	return 2;
}