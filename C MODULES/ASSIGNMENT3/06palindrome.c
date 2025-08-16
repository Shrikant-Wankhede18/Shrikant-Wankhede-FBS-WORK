//Check the given number is Perfect number or not.
//Input: n = 28
//Output: Perfect
#include<stdio.h>
void main(){
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
	printf("perfect %d",sum);
	else
	printf("not perfect");
}