//Print table for given number.
//Input: n = 5
//Output: 5 10 15 20 25 30 35 40 45 50
#include<stdio.h>
void main(){
	int a,table;
	printf("enter a number:",a);
	scanf("%d",&a);
	int i=0;
	printf("Table of %d:\n",a);
	while(i<10)
	{
		table=a*i;
		i++;
		printf("%d * %d = %d\n",a,i,a*i);
	}
}