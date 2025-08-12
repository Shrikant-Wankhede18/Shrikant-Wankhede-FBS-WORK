#include<stdio.h>
void as4perfectno(int);
void main(){
	int no;
	printf("enter the number");
	scanf("%d",&no);
	as4perfectno(no);
	
}
void as4perfectno(int no){
	
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