//1. Create a structure Book with data members as bname, id, author, price. Accept the
//values of all these members from user and display them.
#include<stdio.h>
typedef struct book{
	char bname[30];
	int id;
	char author[30];
	int price;
}book ;

void main(){
	book b;
	printf("Enter The Name Of Book :");
	scanf(" %[^\n]",b.bname);
	printf("Enter The Id Of Book :");
	scanf("%d",&b.id);
	printf("Enter The Name Of Author :");
	scanf(" %[^\n]",b.author);
	printf("Enter The Price Of Book :");
	scanf("%d",&b.price);
	
	
	printf("-------->ENTERED DATA OF BOOK<-------\n");
	printf("Book Name   : %s\n",b.bname);
	printf("Book Id     : %d\n",b.id);
	printf("Book Author : %s\n",b.author);
	printf("Book Price  : %d\n",b.price);
}

