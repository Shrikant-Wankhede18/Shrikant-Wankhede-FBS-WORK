//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the
//desired operations.
#include <stdio.h>

int main() {
    double a, b,result;
    char operator;

    printf("Enter first number: ");
    scanf("%lf", &a);

    printf("Enter second number: ");
    scanf("%lf", &b);

    printf("Enter any operator (+, -, *, /): ");
    scanf(" %c", &operator); 
    if(operator=='+')
    {
    	result=a+b;
    	printf("addition is :%lf",result);
	}
	else
	{
		if(operator=='-')
	    {
	      result=a-b;
    	  printf("subtraction is :%lf",result);
        }
        
        if(operator=='*')
	    {
	      result=a*b;
    	  printf("multiplication is :%lf",result);
        }
        
        if(operator=='/')
	    {
	      result=a/b;
    	  printf("division is :%lf",result);
        }
        
        if(operator=='%')
	    {
	      result=(int) a%(int) b;
    	  printf("mod is : %d",result);
		}
    	  
        else
        {
        	printf("enter a valid operator");
		}
        
	}

    
}