//Time (hour, min, sec)


#include<stdio.h>
typedef struct time {
	int hour;
	int min;
	int sec;
} time;
time store();
void display(time);
void main() {
	time t1;
	printf("enter the details of dates:\n");
	t1=store();
	printf("entered details\n");
	display(t1);
}

time store() {
	time temp;
	printf("enter the hour :");
	scanf("%d",&temp.hour);
	printf("enter the min :");
	scanf("%d",&temp.min);
	printf("enter the  sec :");
	scanf("%d",&temp.sec);
	return temp;
}


void display(time s) {
	printf("--------------------------------------------------------------------------------------------\n");
	printf("hour : %d\n",s.hour);
	printf("min : %d\n",s.min);
	printf("sec : %d\n",s.sec);
	printf("\n--------------------------------------------------------------------------------------------\n");

}


