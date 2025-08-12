#include<stdio.h>
int getStrong(int );
void main(){
	int no;
	printf("Enter the number:");
	scanf("%d",&no);
int res=	getStrong(no);
	if(res==no)
	printf("No is Strong");
	else
	printf("No is Not Strong");
	
}//main ends here

int getStrong(int no){
		int sum=0;
		int temp=no;
		while(no>0){
			int rem=no%10;
			int fact=1;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
				}
				sum=sum+fact;
				no=no/10;
			
		}return sum;
	
}