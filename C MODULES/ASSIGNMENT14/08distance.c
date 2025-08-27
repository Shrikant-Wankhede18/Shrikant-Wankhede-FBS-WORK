//Distance ( feet, inch)



#include<stdio.h>
typedef struct distance {
	int feet;
	int inch;

} distance;
distance store();
void display(distance);
void main() {
	distance d1;
	printf("enter the distance:\n");
	d1=store();
	printf("entered details\n");
	display(d1);
}

distance store() {
	distance temp;
	printf("enter the feets :");
	scanf("%d",&temp.feet);
	printf("enter the inches :");
	scanf("%d",&temp.inch);
	return temp;
}


void display(distance s) {
	printf("--------------------------------------------------------------------------------------------\n");
	printf("feet : %d\n",s.feet);
	printf("inches : %d\n",s.inch);
	printf("\n--------------------------------------------------------------------------------------------\n");

}


