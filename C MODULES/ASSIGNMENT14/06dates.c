//Date (date, month, year)

#include<stdio.h>
typedef struct dates {
	int date;
	int month;
	int year;
} dates;
dates store();
void display(dates);
void main() {
	dates s1;
	printf("enter the details of dates:\n");
	s1=store();
	printf("entered details\n");
	display(s1);
}

dates store() {
	dates temp;
	printf("enter the  date :");
	scanf("%d",&temp.date);
	printf("enter the  month :");
	scanf("%d",&temp.month);
	printf("enter the  year :");
	scanf("%d",&temp.year);
	return temp;
}


void display(dates s) {
	printf("--------------------------------------------------------------------------------------------\n");
	printf("date : %d\n",s.date);
	printf("month : %d\n",s.month);
	printf("year : %d\n",s.year);
	printf("\n--------------------------------------------------------------------------------------------\n");

}


