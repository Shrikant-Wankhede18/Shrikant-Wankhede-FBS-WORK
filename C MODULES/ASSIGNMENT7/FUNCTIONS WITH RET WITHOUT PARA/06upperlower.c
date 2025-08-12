#include<stdio.h>
int upperlowercase();
void main(){
	int res=upperlowercase();
	if(res==1)
	{
		printf("uppercase");
	}
	else if(res==0)
	{
		printf("lowercase");
	}
}

int upperlowercase(){

char ch='t';
	if(ch>='A' && ch<='Z')
		return 1;
	else
		return 0;
}