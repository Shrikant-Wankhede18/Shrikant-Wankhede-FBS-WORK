#include<stdio.h>
int FDLDsum(int);
void main(){
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
	printf("Sum of fd or ld of %d = %d",no,FDLDsum(no));

}//main ends here

int FDLDsum(int no){
	int fd,ld;
	ld=no%10;
	fd=no;
	while(fd>10){
		fd=fd/10;
		
	}
	int sum=fd+ld;
	return sum;
}