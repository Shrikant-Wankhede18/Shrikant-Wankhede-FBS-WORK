#include<stdio.h>
int getpallindrome();
void main(){
  
 
  if( getpallindrome()==1){
  	printf("Number is pallindrome");
  }else{
  	printf("Number is Not pallindrome");
  }


}//main end here

int getpallindrome(){
	 int no;
  printf("Enter the number:");
  scanf("%d",&no);
	int rev=0;
	int temp=no;
		while(no>0){
		int rem=no%10;
		 rev=rev*10+rem;
		no=no/10;
		
	}
	
	if(rev==temp){
	return 1;
	}
	else
	return 0;
}