#include<stdio.h>
void swapping(int*);
void display(int*);
void main(){
	int arr[]={11,23,30,4,21,45,50};
	swapping(arr);
	display(arr);
	
}
void swapping(int* arr){
	int x;
	printf("enter the xth position");
	scanf("%d",&x);
	int y;
	printf("enter the yth position");
	scanf("%d",&y);

			int temp=arr[x-1];
			arr[x-1]=arr[y-1];
			arr[y-1]=temp;
}


void display(int* arr){

for(int i=0;i<7;i++){
		printf("%d ",arr[i]);
	}
}
