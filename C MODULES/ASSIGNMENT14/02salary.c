//Employee (id, name, salary)
#include<stdio.h>
typedef struct employee{
	int id;
	char name[20];
	int salary;
}employee;
employee store();
void display(employee);
void main(){
	employee s1;
	printf("enter the details of employee :\n");
    s1=store();
    printf("\n\nentered details of employee :\n");
    display(s1);

}

employee store(){
	employee temp;
	printf("enter the id of employee :");
	scanf("%d",&temp.id);
	printf("enter the name of empyoee :");
	scanf("%s",temp.name);
	printf("enter the salary of employee :");
	scanf("%d",&temp.salary);
	return temp;
}

void display(employee s){
	printf("--------------------------------------------------------------------------------------------\n");
	printf("id : %d\n",s.id);
	printf("name : %s\n",s.name);
	printf("salary : %d\n",s.salary);
	printf("\n--------------------------------------------------------------------------------------------\n");
	
	
}
