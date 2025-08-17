//6. Accept array and print only prime numbers of array.

#include<stdio.h>
void main() {
	int arr[5]= {1,37,56,7,33};
	int status,num;
	for(int i=0; i<5; i++) {
		num=arr[i];
		status=0;
		if(num<2) {
			status=1;
		}


		for (int j=2; j<num-1; j++) {
			if(num%j==0) {
				status=1;
			}
		}
        if(status==0) {
		printf("%d ",num);
	}
	}
	


}

