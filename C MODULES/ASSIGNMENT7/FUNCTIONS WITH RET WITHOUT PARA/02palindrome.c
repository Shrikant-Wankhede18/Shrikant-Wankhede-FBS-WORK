#include<stdio.h>
int palindrome();
void main(){
	int res=palindrome();
	if(res==1)
	{
		printf("palindrome");
	}
	else
	{
		printf("not palindrome");
	}

	
}

int palindrome(){
	int a=122,r1,r2,r3,a1,rev;
	r1=a%10;
	a1=a/10;
	r2=a1%10;
	r3=a1/10;
	rev=r1*100+r2*10+r3;
	if(a==rev)
	return 1;

}