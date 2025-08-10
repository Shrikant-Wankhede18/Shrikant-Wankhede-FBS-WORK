//Print prime numbers in the given range 1 to n.
#include<stdio.h>
void main() {
	int num;
	scanf("%d",&num);
	for(int k=2;k<=num;k++) {
		int num=k,status=1;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				status=0;
		}
		if(status==1)
			printf("%d\n",k);

	}
}