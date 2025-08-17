//Find sum of all numbers.
int sumofarray(int*);
#include<stdio.h>
void main(){
	int arr[5]={20,40,40,50,50};
     int sum=sumofarray(arr);
     printf("sum of array is %d",sum);
}

int sumofarray(int arr[]){

	int sum=0;
	for(int i=0;i<5;i++){
		sum=sum+arr[i];
	}
	return sum;
}