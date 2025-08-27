//Product (id, name, quantity, price)

#include<stdio.h>
typedef struct product{
	int id;
	char name[20];
	int quantity;
	int price;
}product;
product store();
void display(product);
void main(){
	product p1;
	printf("enter the details of product :\n");
    p1=store();
    printf("\n\nentered details of product :\n");
    display(p1);

}
product store(){
	product temp;
	printf("enter the id of product :");
	scanf("%d",&temp.id);
	printf("enter the name of product :");
	scanf("%s",temp.name);
	printf("enter the quantity:");
	scanf("%d",&temp.quantity);
	printf("enter the price:");
	scanf("%d",&temp.price);
	return temp;
}

void display(product s){
	printf("--------------------------------------------------------------------------------------------\n");
	printf("id : %d\n",s.id);
	printf("name : %s\n",s.name);
	printf("quantity : %d\n",s.quantity);
	printf("price : %d\n",s.price);
	
	printf("--------------------------------------------------------------------------------------------\n");
	
	
}
