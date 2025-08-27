//HR (id, name, salary, commission)

#include<stdio.h>
typedef struct hr{
	int id;
	char name[20];
	int salary;
	int commission;
}hr;
hr store();
void display(hr);
void main(){
	hr h1;
	printf("enter the details of HR :\n");
    h1=store();
    printf("\n\nentered details of HR :\n");
    display(h1);

}

hr store(){
	hr temp;
	printf("enter the id of HR :");
	scanf("%d",&temp.id);
	printf("enter the name of HR :");
	scanf("%s",temp.name);
	printf("enter the salary of HR :");
	scanf("%d",&temp.salary);
	printf("enter the commission of HR :");
	scanf("%d",&temp.commission);
	return temp;
}

void display(hr s){
	printf("--------------------------------------------------------------------------------------------\n");
	printf("id : %d\n",s.id);
	printf("name : %s\n",s.name);
	printf("salary : %d\n",s.salary);
	printf("commission : %d\n",s.commission);
	
	printf("--------------------------------------------------------------------------------------------\n");
	
	
}
