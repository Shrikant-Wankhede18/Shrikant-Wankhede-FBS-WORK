#include<stdio.h>
char upperlowercase(char);
void main() {
	char ch='T';
	int res=upperlowercase(ch);
	if(res==1) {
		printf("uppercase");
	} else {
		printf("lowercase");
	}

}

char upperlowercase(char ch) {

	if(ch>='A' && ch<='Z') {
		return 1;
	} else {
		return 2;
	}
}