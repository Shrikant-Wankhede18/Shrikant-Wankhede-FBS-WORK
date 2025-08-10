//Print perfect numbers in the given range 1 to n.
#include<stdio.h>
void main(){
	int no;
	printf("enter the number");
	scanf("%d",&no);
	for(int k=1;k<=no;k++){

	int no=k,sum=0;
//	printf("enter a number:");
//	scanf("%d",&no);
	int i=1;
	while(i<no){
	if(no%i==0)
	sum=sum+i;
	i++;

}

  if(no==sum){
  	printf("%d number is perfect \n",sum);
  }
  
}
}
