//Accept the price from user. Ask the user if he is a student (user may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% otherwise
//discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.
#include<stdio.h>
void main(){
	double price,discount,final_price;
	char ch;
	printf("enter the price : ");
	scanf("%lf",&price);
	printf("are you student or not (y/n) : ");
	scanf(" %c", &ch);
	if(ch=='y'){
		if(price>=500){
			discount=(20.0/100)*price;
		}
		else
		{
			discount=(10.0/100)*price;
		}
	}
	else
	{
		if(price>=600)
		{
		  discount=(15.0/100)*price;	
		}
		else
		{
			discount=0;
		}
	
	}
	final_price=price-discount;
	printf("YAY YOU SAVED : %.2lf\n",discount);
	printf("TOTAL AMOUNT TO PAY : %.2lf",final_price);
	
}