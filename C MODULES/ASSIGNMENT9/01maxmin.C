#include <stdio.h>

void max(int*,int);
void min(int*,int);

int main() {
	int arr[5] = {40, 30, 50, 70, 20};
	int size=5;
    max(arr,size);
    min(arr,size);
}

void max(int arr[],int size) {
    int max = arr[0];
    for (int i = 1; i < size; i++) {
        if (max<arr[i]) {
            max = arr[i];  
        }
    }
    printf("Maximum number in array is %d\n", max); 
}

void min(int arr[],int size) {
    int min = arr[0];
    for (int i = 1; i < size; i++) {
        if (arr[i] < min) {
            min = arr[i];  // update min
        }
    }
    printf("Minimum number in array is %d\n", min);  // print once
}
