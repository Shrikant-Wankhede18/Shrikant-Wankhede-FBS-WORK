#include<stdio.h>
double  salary();
void main(){
	double total=salary();
	printf("%lf",total);
}
double salary(){

double salary=5000,da,ta,hra,totalsalary;
	if(salary<=5000) {
		da=salary*0.10;
		ta=salary*0.20;
		hra=salary*0.25;
	} 
	else {
		da=salary*0.15;
		ta=salary*0.25;
		hra=salary*0.30;
	}
	totalsalary=salary+da+ta+hra;
       return totalsalary;
	
}