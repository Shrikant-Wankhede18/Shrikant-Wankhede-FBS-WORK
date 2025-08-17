//8. Merge two arrays

#include<stdio.h>
void main(){
	int arr[5]= {1,2, 3, 4,5};
	int brr[5]={10,20,30, 40, 50};
	int crr[5],i;
	
	
	for(i=0;i<5;i++){
		crr[i]=arr[i];
		printf("%d ",crr[i]);
	}
	
	for(int j=0;j<5;j++){
		crr[i]=brr[j];
		printf("%d ",crr[i]);
		i++;
	}
}