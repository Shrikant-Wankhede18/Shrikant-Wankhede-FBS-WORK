#include<stdio.h>
int as3prime();
void main(){
	
    int res=as3prime();
	if(res==1){
		printf("number is prime");
	}

	
	
}

int as3prime(){

int no=7;
	int i=2,status=0;
	while(i<no)
	{
		if(no%i==0){
			printf("number not prime");
		status=1;
		break;
	}
	i++;
	}
	if(status==0){
		return 1;
	}
}