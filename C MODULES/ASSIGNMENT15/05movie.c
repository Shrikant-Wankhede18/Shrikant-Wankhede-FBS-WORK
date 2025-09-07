//5. Movie Database: Create a program that uses structures to manage a movie
//database with details like title, director, release year, and genre. Allow users
//to add, search for, and update movie records.

#include<stdio.h>
#include<string.h>
typedef struct movie
{
	char title[50];
	char director[50];
	int year;
	char genre[50];
	
}movie;
void display(movie*,int);
void addmovie(movie*,int*);
void searchmovie(movie*,int);
void update(movie*,int);

void main()
{
	int count=3;
	movie md[50]={
	{"patil","shankar",2024,"action"},
	{"saiyaara","yogesh",2025,"romantic"},
	{"sairath","shrikant",2023,"romantic"}
	};
	
	while(1){
	int choice;
	printf("\n1] display Enter:1    |   2] Add movie Enter :2   | 3] search Enter:3   |  4] update deatils enter :4   |   5] exit :5");
	printf("\n===> :");
	scanf("%d",&choice);
	if(choice==1){
		display(md,count);
	}
	else if(choice==2){
		addmovie(md,&count);
	}
	else if(choice==3){
		searchmovie(md,count);
	}
	else if(choice==4){
		update(md,count);
	}
	else if(choice==5)
	{
		break;
	}
  }
	
}


void update(movie* md,int count)
{
	char title[50];
	printf("Enter Title :");
	scanf("%s",title);
	int flag=0;
	
	for(int i=0;i<count;i++){
		if(strcasecmp(md[i].title,title)==0){
		printf("ente title :");
		scanf("%s",md[i].title);
		printf("enter Director :");
		scanf("%s",md[i].director);
		printf("enter release year:");
		scanf("%d",&md[i].year);
		printf("enter Genre :");
		scanf("%s",md[i].genre);
		printf("\n===> update details sucess fully <===\n");
		 flag=1;
		break;
		}
	}
	if(flag==0){
		printf("\n===> enter valid Movie title <===\n");
			}
}

void searchmovie(movie* md,int count)
{
	char title[50];
	printf("Enter Title :");
	scanf("%s",title);
	int flag=0;
	for(int i=0;i<count;i++){
		if(strcasecmp(md[i].title,title)==0){
		printf("\n\nTitle: %s",md[i].title);
		printf("\nDirector :%s",md[i].director);
		printf("\nrelease year:%d",md[i].year);
		printf("\nGenre: %s",md[i].genre);
		flag=1;
		break;
		}
	}
	if(flag==0){
		printf("\n===> enter valid Movie title <===\n");
			}
	
}

void addmovie(movie* md,int* count)
{
	
	int flag=0, i;
	char name[50];
	printf("\nenter mobie title:");
	scanf("%s",name);
	for(i=0;i<*count;i++){
		if(strcasecmp(md[i].title,name)==0){
			flag=1;
			break;
		}
	}
	
	if(flag==0){
		strcpy(md[*count].title, name);
		printf("Director name:");
		scanf("%s",md[*count].director);
		printf("Enter Realise year :");
		scanf("%d",&md[*count].year);
		printf("Enter Genre :");
		scanf("%s",md[*count].genre);
		printf("\n===> Add movie sucess fully<===\n");
		(*count)++;
	}
	else
	{
		printf("\n===> the movie title is allrwady existics <===\n\n");
		
	}
	
}


void display(movie* md,int count)
{
	for(int i=0;i<count;i++){
		printf("\n\nmovide details %d",i+1);
		printf("\n\nTitle: %s",md[i].title);
		printf("\nDirector :%s",md[i].director);
		printf("\nrelease year:%d",md[i].year);
		printf("\nGenre: %s",md[i].genre);
	}
}
