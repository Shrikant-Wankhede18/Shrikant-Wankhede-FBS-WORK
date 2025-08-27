//WAP to Take in Two Strings and Display the Larger String without Using Built-in
//Functions

#include<stdio.h>
void main() {
	char str1[20];
	char str2[20];

	printf("enter the first string : ");
	scanf("%s",&str1);

	printf("enter the second string : ");
	scanf("%s",&str2);
    int flag=0;
	int i=0;
	while(str1[i]!='\0' && str2[i]!='\0') {
		if(str1[i]>str2[i]) {
			flag=1;
		} else if(str1[i]<str2[i]) {
			flag=2;}

		i++;
	}

	if(flag==1) {
		printf("str 1 is greater");
	} else if(flag==2) {
		printf("str 2 is greater");
	} else {
		printf("equal");
	}

}
