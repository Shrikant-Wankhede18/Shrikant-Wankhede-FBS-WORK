//2. Create a structure Time with data members as hrs, min, sec. Accept the values of all
//these members from user and display them. Also perform addition of two time variables
//and display the result. If sec goes beyond 60, carry it to min etc. Add a method to convert
//the given time into sec.

#include<stdio.h>
typedef struct time
{
	int hrs;
	int min;
	int sec;
}time;

void add(time*);
void convert(time*);
void display(time);

void main()
{
	time t1;
	add(&t1);
	convert(&t1);
	display(t1);
}
void display(time t1)
{
	printf("Hrs:%d ",t1.hrs);
	printf("Min:%d ",t1.min);
	printf("Sec:%d",t1.sec);
}

void convert(time* t1)
{
	int all;
	
	all=t1->hrs*3600 + t1->min*60 + t1->sec;
	
	t1->hrs=all/3600;
	t1->min=all%3600/60;
	t1->sec=all%3600%60;
}

void add(time* t1)
{
	printf("Enter Hrs: ");
	scanf("%d",&t1->hrs);
	printf("Enter Min: ");
	scanf("%d",&t1->min);
	printf("Enter Sec: ");
	scanf("%d",&t1->sec);
}