#include<stdio.h>
double sum(double,double);
double sub(double,double);
double mul(double,double);
double div(double,double);
int mod(int,int);

void main() {
	double a,b;
//	int a,b;
	sum(a,b);
	sub(a,b);
	mul(a,b);
	div(a,b);
	mod(a,b);


}


double sum(double a,double b) {


	printf("enter your numbers :\n",a,b);
	scanf("%lf %lf",&a,&b);
	double result=a+b;
	printf("result is :%lf\n",result);
}

double sub(double a,double b) {


	printf("enter your numbers\n",a,b);
	scanf("lf lf",&a,&b);
	double res=a-b;
	printf("result is :%lf\n",res);
}

double mul(double a,double b) {


	printf("enter your numbers\n",a,b);
	scanf("%lf %lf",&a,&b);
	double ress=a*b;
	printf("result is :%lf\n",ress);
}

double div(double a,double b) {


	printf("enter your numbers\n",a,b);
	scanf("%lf %lf",&a,&b);
	double r=a+b;
	printf("result is :%lf\n",r);
}

//int mod(int a,int b,) {
//
//
//	printf("enter your numbers\n",a,b);
//	scanf("%d %d",&a,&b);
//	int re=a%b;
//	printf("result is :%d\n",re);
//}