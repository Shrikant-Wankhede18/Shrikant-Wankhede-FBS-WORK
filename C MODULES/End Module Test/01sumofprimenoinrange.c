#include<stdio.h>
void main(){
	int num,i,j,sum=0;
	printf("enter a number : ");
	scanf("%d",&num);
	
	for(i=2;i<=num;i++){
		int flag=0;
	for(j=2;j<=i/2;j++)
	{
		if(i%j==0){
			
			flag=1;
			break;
		}
	}
	if(flag==0){
		sum=sum+i;
	}
	
 }
 printf("Ther Sum of prime is :%d",sum);
	
}