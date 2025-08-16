#include<stdio.h>
int age();
void main(){
	int res=age();
	if(res==1)
	{
		printf("youre eligile to vote");
	}
	else if(res==0){
		printf("youre not eligile to vote");
	}
}

int age(){
int age=17;
	if(age>=18)
    return 1;
    else
    return 0;

}