#include<stdio.h>
double sum();
double sub();
double mul();
double div();
int mod();

void main() {
	double result=sum();
	printf("result is :%lf\n",result);
	
	double res=sub();
	printf("result is :%lf\n",res);
	
	double ress=mul();
	printf("result is :%lf\n",ress);
	
	double r=div();
	printf("result is :%lf\n",r);
	
	int re=mod();
	printf("result is :%d\n",re);
	
	
	
}
	
	
double sum(){
	
    double a, b,result;
    printf("enter your numbers :\n",a,b);
    scanf("%lf %lf",&a,&b);
    result=a+b;
    return result;
}

double sub(){
	
    double a, b,res;
    printf("enter your numbers\n",a,b);
    scanf("lf lf",&a,&b);
    res=a-b;
    return res;
}

double mul(){
	
    double a, b,ress;
    printf("enter your numbers\n",a,b);
    scanf("%lf %lf",&a,&b);
    ress=a*b;
    return ress;
}

double div(){
	
    double a, b,r;
    printf("enter your numbers\n",a,b);
    scanf("%lf %lf",&a,&b);
    r=a+b;
    return r;
}

int mod(){
	
    int a, b,re;
    printf("enter your numbers\n",a,b);
    scanf("%d %d",&a,&b);
    re=a%b;
    return re;
}