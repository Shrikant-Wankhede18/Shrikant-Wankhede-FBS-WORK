#include<stdio.h>
int vowelandconso();
void main() {
	int res=vowelandconso();
	if(res==1) {
		printf("vowel");
	} else if (res==0) {
		printf("consonant");
	}
}


int vowelandconso() {
	char ch='y';
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		return 1;
	else
	return 0;
}