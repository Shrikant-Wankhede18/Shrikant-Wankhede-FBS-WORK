#include<stdio.h>
int FDLDsum();
void main(){
	printf("Sum of fd or ld  = %d",FDLDsum());

}//main ends here

int FDLDsum(){
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
	int fd,ld;
	ld=no%10;
	fd=no;
	while(fd>10){
		fd=fd/10;
		
	}
	int sum=fd+ld;
	return sum;
}