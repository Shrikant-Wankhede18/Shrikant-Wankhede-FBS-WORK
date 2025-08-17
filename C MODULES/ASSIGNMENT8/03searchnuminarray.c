//Search the given number in array.
#include<stdio.h>
void main(){
	int arr[5];
	int brr[5];	
	for(int i=0;i<5;i++){
		printf("enter the number at %d index",i);
		scanf("%d",&arr[i]);
	}
	printf("entered array arr[5]={");
	for(int i=0;i<5;i++){
		printf("%d",arr[i]);
	}
	printf("}\n");
	
	}
	printf("entered array brr[5]={");
	for(int k=0;k<5;k++){
		printf("%d",brr[k]);
	}
	printf("}\n");
	
	
}