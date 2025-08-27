//mystrstr user define function
#include<stdio.h>
#include<string.h>
mystrstr(char*,char*);
void main()
{
	char str[]="first bit ";
	char sub[]="solutions";
	 mystrstr(str,sub);

}
mystrstr(char* str,char* sub)
{
	while(*str !='\0'&&*sub!='\0'&& *str==*sub){
		str++;
		sub++;
	}
	if(*sub=='\0')
	puts(*str);
	str++;
}