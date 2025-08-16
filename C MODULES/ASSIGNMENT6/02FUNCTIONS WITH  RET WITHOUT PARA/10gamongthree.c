#include<stdio.h>
int greateramongthree();
void main(){
    int res=greateramongthree();
	if(res==1){
		printf("a is greater");
	}
	else{
		if(res==2){
			printf("b is greater");
		}
		else if(res==3)
		{
			printf("c is greater");
		}
		
	}
}
int greateramongthree(){
int a=10,b=200,c=300;
	if(a>b && a>c){
		return 1;
	}
	else{
		if(b>c){
			return 2;
		}
		else
		{
			return 3;
		}
		
	}
}