#include<stdio.h>
void palindromewithoperators();
void leapyear();
void salary();
void vowlsandconsononts();
void voting();
void loweruppercase();
void salary();
void calculator();


void main() {
palindromewithoperators();
leapyear();
salary();
vowlsandconsononts();
voting();
loweruppercase(); 
salary();
calculator();
}//main ends here

void evenodd() {
	int a= 2;
	if(a%2==0) {
		printf("number is even\n");
	} else {
		printf("number is odd\n");
	}
} //even odd ends here

void palindromewithoperators() {
	int a=121,r1,r2,r3,a1,rev;
	r1=a%10;
	a1=a/10;
	r2=a1%10;
	r3=a1/10;
	rev=r1*100+r2*10+r3;
	if(a==rev) {
		printf("palindrome\n");
	} else {
		printf("not palindrome\n");
	}

} // palindrome ends here

void leapyear() {
	int a=1900;
	if(a%4==0 && a%100!=0 ||a%400==0) {
		printf("year is leap year\n");
	} else {
		printf("year is not leap year\n");
	}
}//leap year ends here

void vowlsandconsononts() {
	char ch;

	printf("enter a character : ");
	scanf("%c",&ch);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		printf("vowel\n");
	} else {
		printf("consonant\n");
	}
}//vowlsandconsononts ends here

void voting() {
	int age=18;
	if(age>=18) {
		printf("youre eligile to vote\n");
	} else {
		printf("youre not eligile to vote\n");
	}
}// voting ends here

void loweruppercase() {
	char ch='Z';
	if(ch>='A' && ch<='Z') {
		printf("uppercase\n");
	} else {
		printf("lowercase\n");
	}
}//upper lower case ends here

void salary() {
	double salary=5000,da,ta,hra,totalsalary;
	if(salary<=5000) {
		da=salary*0.10;
		ta=salary*0.20;
		hra=salary*0.25;
	} else {
		da=salary*0.15;
		ta=salary*0.25;
		hra=salary*0.30;
	}
	totalsalary=salary+da+ta+hra;
	printf("total salary is : %.2lf\n",totalsalary);

}//salary ends here

void calculator() {
	double a, b,result;
	char operator;

	printf("Enter first number:\n");
	scanf("%lf", &a);

	printf("Enter second number:\n");
	scanf("%lf", &b);

	printf("Enter any operator (+, -, *, /):\n ");
	scanf(" %c", &operator);
	if(operator=='+') {
		result=a+b;
		printf("addition is :%lf\n",result);
	} else {
		if(operator=='-') {
			result=a-b;
			printf("subtraction is :%lf\n",result);
		}

		if(operator=='*') {
			result=a*b;
			printf("multiplication is :%lf\n",result);
		}

		if(operator=='/') {
			result=a/b;
			printf("division is :%lf\n",result);
		}

		if(operator=='%') {
			result=(int) a%(int) b;
			printf("mod is : %d\n",result);
		}

		else {
			printf("enter a valid operator\n");
		}

	}

}//calculator ends here

void triangle() {
#include<stdio.h>
	void main() {
		int a,b,c;
		printf("enter the first value: ");
		scanf("%d", &a);
		printf("enter the second value: ");
		scanf("%d", &b);
		printf("enter the third value: ");
		scanf("%d", &c);
		if(a==b && b==c) {
			printf("equilateral");
		} else {
			if(a==b || b==c ||a==c) {
				printf("isosceles");
			} else {
				printf("scalene");
			}
		}
	}//triangle ends here

	void greaterthanthree() {
		int a=10,b=200,c=30;
		if(a>b && a>c) {
			printf("a is greater");
		} else {
			if(b>c) {
				printf("b is greater");
			} else {
				printf("c is greater");
			}

		}
	}//greater than ends here

	void grade() {
		int marks=34;
		if(marks>=75) {
			printf("Distinction");
		} else {
			if(marks>=65) {
				printf("First Class");
			} else {
				if(marks>=55) {
					printf("Second Class");
				} else {
					if(marks>=40) {
						printf("Pass Class");
					} else {
						printf("fail");
					}
				}
			}
		}
	}//grade ends here

	void studentdis() {
		double price,discount,final_price;
		char ch;
		printf("enter the price : ");
		scanf("%lf",&price);
		printf("are you student or not (y/n) : ");
		scanf(" %c", &ch);
		if(ch=='y') {
			if(price>=500) {
				discount=(20.0/100)*price;
			} else {
				discount=(10.0/100)*price;
			}
		} else {
			if(price>=600) {
				discount=(15.0/100)*price;
			} else {
				discount=0;
			}

		}
		final_price=price-discount;
		printf("YAY YOU SAVED : %.2lf\n",discount);
		printf("TOTAL AMOUNT TO PAY : %.2lf",final_price);

	}//student discount end here
}

void age(){
	int age=11;
	if(age<12)
	{
		printf("child");
	}
	else
	{
		if(age>=12 && age<19)
		printf("teenager");
	}
	    if(age>=20 && age<59)
	    {
	    	printf("adult");
		}
		if(age>60)
		{
			printf("senior");
		}
		else
		{
			printf("please enter correct age");
		}
}

void divisionbythreeorfive(){
		int a=3,b=5;
	int num;
	printf("enter the number");
	scanf("%d",&num);
	if(num%3==0 && num%5==0) 
	{
		printf("divided by 3 and 5");
	}
	else
	{
		if(num%3==0 && num%5!=0)
		{
			printf("divided by 3");
		}
		else
		{
			if(num%3!=0 && num%5==0)
		{
			printf("divided by 5");
		}
		else
		{
			printf("divided by none");
		}
		
	}
}
}// devided by three and five ends here

void onetoten(){
	int i;
	while(i<=10)
	{
		
		printf("%d ",i);
		i++;
	}
}//one to ten ends here

void table(){
	int a,table;
	printf("enter a number:",a);
	scanf("%d",&a);
	int i=0;
	printf("Table of %d:\n",a);
	while(i<10)
	{
		table=a*i;
		i++;
		printf("%d * %d = %d\n",a,i,a*i);
	}
}//table ends here

void sumof1to5(){
	int start=1,end=5,sum=0;
	while(start<=end)
	{
		sum=sum+start;
		start++;
		
	}
	printf("%d",sum);
	
} //sumof1to5ends here


void as3primeno(){
	int no=7;
	int i=2,status=0;
	while(i<no)
	{
		if(no%i==0){
			printf("number not prime");
		status=1;
		break;
	}
	i++;
	}
	if(status==0){
		printf("number is prime");
	}

	
	
}//as3primeno ends here

void as3armstrong(){
	int no=153,rem,sum=0;
	int temp=no;
	while(no>0)
	{
		rem=no%10;
		sum=sum+(rem*rem*rem);
		no=no/10;
	} 
	if(temp==sum)
	{
		printf("amrmstrong");
	}
	else
	{
		printf("not amrmstrong");
	}
}//as3armstrong ensd here

void as3perfect(){
	int no=28,i=1,sum=0;
	int temp=no;
	while(i<no)
	{
		if(no%i==0){
			sum=sum+i;
		}
		i++;
	}
	if(sum==temp)
	printf("perfect %d",sum);
	else
	printf("not perfect");
}// as3perfect ends here

void as3fact(){
	int n=5,fact=1;
	while(n>1)
	{
		fact=fact*n;
		n--;
		
	}
	printf("%d",fact);
}//as3fact ends here

void as3strongno(){
int	num=145,remainder,sum=0,fact=1;
	while(num >0){
        remainder = num % 10;
        sum=fact*(remainder*remainder);
        num/10;
   } 
   printf("%d",sum);
}//as3strongno ends here

void as3palindrome(){
	int num=121,rem,rev=0;
	int temp=num;
	while(num>0){
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
	}
	if(temp==rev){
		printf("number is palindrome");
	}
	else{
	
	printf("number is not palindrome");
}
}//as3palindrome ends here

#include<stdio.h>
void sumofdid(){
	int num,fd,sum;
	printf("enter a number : ");
	scanf("%d",&num);
	int ld=num%10;
	while(num>10)
	{
		num=num/10;
	}
    sum=ld+num;
    printf("%d",sum);
}//sumofdid ends here

void as4armstrong() {
	int no;
	printf("enter a range :");
	scanf("%d",&no);
	for(int k=1;k<=no;k++){
	int no=k;
	int temp=no;
	int count=0;
	while(no>0) {
		no=no/10;
		count++;
	}
	int sum = 0;
	no=temp;
	while (no > 0) {
		int rem =no%10;
		int res=1;

		for (int i =1; i<=count; i++) {
			res = res*rem;
		
		}

		sum =sum+ res;
		no = no / 10;
		
	}
		if(sum==temp)
		{
			printf("number is armstrong: %d\n",sum);
		}
}
}//as4armstrong ends here


void as4primeno() {
	int num;
	scanf("%d",&num);
	for(int k=2;k<=num;k++) {
		int num=k,status=1;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				status=0;
		}
		if(status==1)
			printf("%d\n",k);

	}
}//as4prime ends here

void as4perfectno(){
	int no;
	printf("enter the number");
	scanf("%d",&no);
	for(int k=1;k<=no;k++){

	int no=k,sum=0;
//	printf("enter a number:");
//	scanf("%d",&no);
	int i=1;
	while(i<no){
	if(no%i==0)
	sum=sum+i;
	i++;

}

  if(no==sum){
  	printf("%d number is perfect \n",sum);
  }
  
}
}//as4perfect no ends here

void as41tonstrong()
 {
 	int num=145,r,sum=0,i,fact=1;
 	int temp=num;
 	while(temp!=0){
 		fact=1;
 		r=temp%10;
 		
 		
 		for(i=1;i<=r;i++){
 			fact=fact*i;
		 }
		 sum=sum+fact;
		 temp=temp/10;
	 }
	 if(sum==num)
	 printf("strong");
  }//strong no ends here
  
  void as4menudriven() {
	int choice;
	printf("enter your choice (1/2/3/4/5) : ");
	scanf("%d",&choice);
	if(choice==1) {
		int num;
		printf("enter your number : ");
		scanf("%d",&num);
		if(num%2==0) {
			printf("number is even");
		} else {
			printf("number is odd");
		}
	}


	if(choice==2) {
		int num;
		int status=0;
		printf("enter your number : ");
		scanf("%d",&num);
		int i=2;
		while(i<num) {
			if(num%i==0) 
			
				status=1;
			i++;
				
			}
			    if(status==0) {
				printf("number is prime");
			
		 	}    else {
				printf("number is not prime");
			}
			
			
	}
	
	if(choice==3){
	int num,rem,rev=0;
	printf("enter the number :");
	scanf("%d",&num);
	int temp=num;
	while(num>0){
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
	}
	if(temp==rev){
		printf("number is palindrome");
	}
	else{
	
	printf("number is not palindrome");
}
}

if(choice==4){
	int num;
	printf("enter a number :");
	scanf("%d",&num);
	if(num>0){
		printf("number is positive");
	}
	else if(num<0){
		printf("number is negitive");
	}
	else
	{
		printf("number is zero");
	}
}

if(choice==5){
	int num,rev=0;
	printf("enter a number");
	scanf("%d",&num);
	int temp=num;
	while(num>0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}printf("%d",rev);
	

}

if(choice==6)
{
	int no,sum=0;
	printf("enter a number");
	scanf("%d",&no);
	while(no>0){
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	printf("sum of digits is %d",sum);
}
}
 







