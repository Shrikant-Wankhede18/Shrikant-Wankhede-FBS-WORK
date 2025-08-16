#include<stdio.h>

int getSum(int);
void main(){
	int no;
	printf("Enter the number:");
	scanf("%d",&no);

   
     printf("%d",getSum(no));
	
}//main ends here

int getSum(int no){
	int sum=0;
	int i=1;
	while(i<=no){
	sum=sum+i;
		i++;
	}
return sum;
}