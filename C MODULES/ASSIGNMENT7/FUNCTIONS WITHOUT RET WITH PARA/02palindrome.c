#include<stdio.h>
int palindrome(int,int,int,int,int,int);
void main(){
	int a=121,r1,r2,r3,a1,rev;
	r1=a%10;
	a1=a/10;
	r2=a1%10;
	r3=a1/10;
	rev=r1*100+r2*10+r3;
	palindrome(a,r1,r2,r3,a1,rev);
	
	
}

int palindrome(int a,int r1,int r2,int r3,int a1,int rev){
	if(a==rev)
	{
		printf("palindrome");
	}
	else
	{
		printf("not palindrome");
	}


}