//Search the given number in array.
#include<stdio.h>
//Find odd and even among the numbers.
void oddeven(int*);
#include<stdio.h>
void main(){
	int arr[5]={11,34,56,87,33};
	oddeven(arr);
		
}
void oddeven(int arr[]){

for(int i=0;i<5;i++){
		if(arr[i]%2==0){
			printf("even numbers :%d\n",arr[i]);
		}
		else{
			printf("odd numbers :%d\n",arr[i]);
		}
	}
}