#include <stdio.h>

void max();
void min();

void main() {
    max();
    min();
}

void max() {
    int arr[5] = {40, 30, 50, 70, 20};
    int max = arr[0];
    for (int i = 1; i < 5; i++) {
        if (max<arr[i]) {
            max = arr[i];  
        }
    }
    printf("Maximum number in array is %d\n", max);  // print once
}

void min() {
    int arr[5] = {20, 30, 50, 70, 20};
    int min = arr[0];
    for (int i = 1; i < 5; i++) {
        if (arr[i] < min) {
            min = arr[i];  // update min
        }
    }
    printf("Minimum number in array is %d\n", min);  // print once
}
