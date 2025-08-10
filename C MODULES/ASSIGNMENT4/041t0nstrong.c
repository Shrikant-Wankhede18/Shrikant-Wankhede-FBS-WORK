//Print strong numbers in the given range 1 to n.
#include<stdio.h>
  void main()
 {
 	int num=145,r,sum=0,i,fact=1;
 	int temp=num;
 	while(temp!=0){
 		fact=1
 		r=temp%10;
 		
 		
 		for(i=1;i<=r;i++){
 			fact=fact*i;
		 }
		 sum=sum+fact;
		 temp=temp/10;
	 }
	 if(sum==num)
	 printf("strong");
  } 