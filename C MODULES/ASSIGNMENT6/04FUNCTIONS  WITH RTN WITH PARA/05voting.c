#include<stdio.h>
int age(int);
void main(){
	int a=17;
int res=age(a);
		if(res==1)
   {
		printf("youre eligile to vote");
	}
	else{
		printf("youre not eligile to vote");
	}
	
}

int age(int a){

	if(a>=18)
   {
		return 1;
	}
	else{
		return 2;
	}
}