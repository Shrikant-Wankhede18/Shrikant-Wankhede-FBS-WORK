//SalesManager (id, name, salary, incentive, target)


#include<stdio.h>
typedef struct SalesManager{
	int id;
	char name[20];
	int salary;
	int incentive;
	int target;
}SalesManager;
SalesManager store();
void display(SalesManager);
void main(){
	SalesManager s1;
	printf("enter the details of SalesManager :\n");
    s1=store();
    printf("\n\nentered details of SalesManager :\n");
    display(s1);

}

SalesManager store(){
	SalesManager temp;
	printf("enter the id  :");
	scanf("%d",&temp.id);
	printf("enter the name  :");
	scanf("%s",temp.name);
	printf("enter the salary  :");
	scanf("%d",&temp.salary);
	printf("enter the incentive :");
	scanf("%d",&temp.incentive);
	printf("enter the target :");
	scanf("%d",&temp.target);
	return temp;
}

void display(SalesManager s){
	printf("--------------------------------------------------------------------------------------------\n");
	printf("id : %d\n",s.id);
	printf("name : %s\n",s.name);
	printf("salary : %d\n",s.salary);
	printf("incentive : %d\n",s.incentive);
	printf("target : %d\n",s.target);
	
	printf("--------------------------------------------------------------------------------------------\n");
	
	
}
