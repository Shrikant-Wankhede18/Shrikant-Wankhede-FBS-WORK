//2. Search the given number in array.
#include<stdio.h>
void searchnuminarray(int*,int,int);
void main() {
	int arr[5]= {74,7,40,7,10};
	int  n=7;
	int flag=0;
    searchnuminarray(arr,n,flag);


}


void searchnuminarray(int arr[],int n,int flag){
	for( int i=0; i<5; i++) {
		printf("%d ",arr[i]);
		}
		printf("\n");
    
   for(int i=0;i<5;i++){
   	  if(arr[i]==n){
   	  printf("%d at %d index\n",arr[i],i);
   	  flag=1;
   	  
		 }
   	
   }
   if(flag==0)
   printf(" No not Found");


}