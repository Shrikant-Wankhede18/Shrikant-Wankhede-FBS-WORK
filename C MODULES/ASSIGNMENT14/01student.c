//Student (rollNo, name, marks)
#include<stdio.h>
typedef struct student{
	int rollno;
	char name[20];
	int marks;
}student;
student store();
void display(student);
void main(){
	student s1;
	printf("enter the details of student :\n");
    s1=store();
    printf("\n\nentered details of student :\n");
    display(s1);

}

student store(){
	student temp;
	printf("enter the roll no of student :");
	scanf("%d",&temp.rollno);
	printf("enter the name of student :");
	scanf("%s",temp.name);
	printf("enter the marks of student :");
	scanf("%d",&temp.marks);
	return temp;
}

void display(student s){
	printf("--------------------------------------------------------------------------------------------\n");
	printf("roll no : %d\n",s.rollno);
	printf("name : %s\n",s.name);
	printf("marks : %d\n",s.marks);
	printf("--------------------------------------------------------------------------------------------\n");
	
	
}
