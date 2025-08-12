#include<stdio.h>
char vowelandconso(char);
void main() {
	char ch='y';
	int res =vowelandconso(ch);
	if (res==1){
	printf("vowel");
	} else  {
		printf("consonant");
	}

}



char vowelandconso(char ch) {

	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		return 1;
	} else  {
	return 2;
	}
}