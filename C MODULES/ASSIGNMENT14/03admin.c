//Admin (id, name, salary, allowance)

#include<stdio.h>
typedef struct admin{
	int id;
	char name[20];
	int salary;
	int allowance;
}admin;
admin store();
void display(admin);
void main(){
	admin a1;
	printf("enter the details of admin :\n");
    a1=store();
    printf("\n\nentered details of admin :\n");
    display(a1);

}

admin store(){
	admin temp;
	printf("enter the id of admin :");
	scanf("%d",&temp.id);
	printf("enter the name of admin :");
	scanf("%s",temp.name);
	printf("enter the salary of admin :");
	scanf("%d",&temp.salary);
	printf("enter the allowance of admin :");
	scanf("%d",&temp.allowance);
	return temp;
}

void display(admin s){
	printf("--------------------------------------------------------------------------------------------\n");
	printf("id : %d\n",s.id);
	printf("name : %s\n",s.name);
	printf("salary : %d\n",s.salary);
	printf("allowance : %d\n",s.allowance);
	
	printf("--------------------------------------------------------------------------------------------\n");
	
	
}
