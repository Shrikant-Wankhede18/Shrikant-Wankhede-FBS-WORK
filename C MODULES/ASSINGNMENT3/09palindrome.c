//Check the given number is Palindrome number or not.
//Input: n = 121
//Output: Palindrome
#include<stdio.h>
void main(){
	int num=121,rem,rev=0;
	int temp=num;
	while(num>0){
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
	}
	if(temp==rev){
		printf("number is palindrome");
	}
	else{
	
	printf("number is not palindrome");
}
}