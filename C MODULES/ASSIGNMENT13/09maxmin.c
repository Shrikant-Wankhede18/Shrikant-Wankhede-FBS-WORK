#include <stdio.h>

void max(int*,int);
void min(int*,int);

int main() {
	int* ptr =(int*)malloc(5*sizeof(int));
	int*p=ptr;
	for (int i=0;i<5;i++){
		scanf("%d",ptr+i);
		
	}
	int size=5;
    max(p,size);
    min(p,size);
}

void max(int* arr,int size) {
    int max = arr[0];
    for (int i = 1; i < size; i++) {
        if (max<arr[i]) {
            max = arr[i];  
        }
    }
    printf("Maximum number in array is %d\n", max); 
}

void min(int* arr,int size) {
    int min = arr[0];
    for (int i = 1; i < size; i++) {
        if (arr[i] < min) {
            min = arr[i]; 
        }
    }
    printf("Minimum number in array is %d\n", min); 
}
