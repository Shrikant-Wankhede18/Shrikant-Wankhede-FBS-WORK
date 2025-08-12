#include<stdio.h>
int greateramongthree(int,int,int);
void main(){
	int a=10,b=200,c=300;
int res=greateramongthree(a,b,c);
	if(res==1){
		printf("a is greater");
	}
	else{
		if(res==2){
			printf("b is greater");
		}
		else
		{
			printf("c is greater");
		}
		
	}
	
    
}
int greateramongthree(int a,int b,int c){

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