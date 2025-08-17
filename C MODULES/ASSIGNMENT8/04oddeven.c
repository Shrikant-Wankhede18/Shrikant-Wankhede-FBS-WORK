//Find odd and even among the numbers.
#include<stdio.h>
void main(){
	int arr[5]={11,34,56,87,33};
	for(int i=0;i<5;i++){
		if(arr[i]%2==0){
			printf("even numbers :%d\n",arr[i]);
		}
		else{
			printf("odd numbers :%d\n",arr[i]);
		}
	}
}