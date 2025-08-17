//5. Print alternate elements in array.
#include<stdio.h>
void alternatenumbers(int*);
void main(){
	int arr[5]={11,34,56,87,33};
	alternatenumbers(arr);
}

void alternatenumbers(int arr[]){
	for(int i=0;i<5;i++){
		
			printf("alternate numbers :%d\n",arr[i=i+1]);
		}
}
