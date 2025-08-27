#include<stdio.h>
int palindrome(int*,int );
void main(){
	int arr[]={1,2,2,1};
	int x=sizeof(arr)/sizeof(int);
	
	int y=palindrome(arr, x);
	if(y==1){
		printf("arry is palindrome");
	}
	else
	{
		printf("arry is not palindrome");
	}
}


int palindrome(int* arr,int x){

int flag=0;
	
	for(int i=0;i<x;i++){
		if(arr[i]==arr[x-1-i]){
			flag= 1;
		}
	}
	
	
	
	return flag;
}