//Find sum of all numbers.

#include<stdio.h>
void main(){
	int arr[5]={20,40,40,50,50};
	int sum=0;
	for(int i=0;i<5;i++){
		sum=sum+arr[i];
	}
	printf("sum of array is %d",sum);
}