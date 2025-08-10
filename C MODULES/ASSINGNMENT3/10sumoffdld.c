//Find Sum of first and last digit of given number.
//Input: n = 12345
//Output: 6 (1 + 5)
#include<stdio.h>
void main(){
	int num,fd,sum;
	printf("enter a number : ");
	scanf("%d",&num);
	int ld=num%10;
	while(num>10)
	{
		num=num/10;
	}
    sum=ld+num;
    printf("%d",sum);
}