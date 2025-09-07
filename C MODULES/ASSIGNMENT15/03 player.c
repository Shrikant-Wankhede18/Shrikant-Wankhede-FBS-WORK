//3. Write a program to create an array for 10 players. For each player store name, no. of
//matches played, runs, wickets takes.
//a. Create function to Accept the information of each player.
//b. Create function to display the information of all the players
//c. Display the information of player who made maximum runs and the one who took
//maximum number of wickets.

#include<stdio.h>
typedef struct player
{
	int jn;
	char name[20];
	int matches_played;
	int run;
	int wickets;
	
}player;

void add(player*,int);
void display(player*,int);
void maxrun(player*,int);

void main()
{
	player arr[10];
	add(arr,10);
	display(arr,10);
	maxrun(arr,10);
}

void maxrun(player* arr,int n)
{
	player brr[10];
	
	for(int i=0;i<n;i++){
		brr[i]=arr[i];
	}
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n-i-1;j++){
			if(brr[j].run>=brr[j+1].run){
				player temp=brr[j];
				brr[j]=brr[j+1];
				brr[j+1]=temp;
				
			}
		}
	}
	
	for(int i=0;i<1;i++){
		printf("\nmax run :%d\n",i+1);
		printf("\njarsey_no:%d",brr[i].jn);
		printf("\n Name:%s",brr[i].name);
		printf("\n matches_played:%d",brr[i].matches_played);
		printf("\n Run :%d",brr[i].run);
		printf("\n Wicket: %d",brr[i].wickets);	
	}
	
	
	for(int i=0;i<n;i++){
		for(int j=0;j<n-i-1;j++){
			if(brr[j].wickets>=brr[j+1].wickets){
				player temp=brr[j];
				brr[j]=brr[j+1];
				brr[j+1]=temp;
				
			}
		}
	}
	
	for(int i=0;i<1;i++){
		printf("\nmax wicket :%d\n",i+1);
		printf("\njarsey_no:%d",brr[i].jn);
		printf("\n Name:%s",brr[i].name);
		printf("\n matches_played:%d",brr[i].matches_played);
		printf("\n Run :%d",brr[i].run);
		printf("\n Wicket: %d",brr[i].wickets);	
	}
	
}

void display(player* arr,int n)
{
	for(int i=0;i<n;i++){
		printf("\nplayer details:%d\n",i+1);
		printf("\njarsey_no:%d",arr[i].jn);
		printf("\n Name:%s",arr[i].name);
		printf("\n matches_played:%d",arr[i].matches_played);
		printf("\n Run :%d",arr[i].run);
		printf("\n Wicket: %d",arr[i].wickets);	
	}
}


void add(player* arr,int n)
{
	for(int i=0;i<n;i++){
		printf("\nplayer details:%d\n",i+1);
		printf("Enter J no :");
		scanf("%d",&arr[i].jn);
		printf("Enter Name: ");
		scanf("%s",arr[i].name);
		printf("Enter matches_played: ");
		scanf("%d",&arr[i].matches_played);
		printf("Enter Run: ");
		scanf("%d",&arr[i].run);
		printf("Enter Wicket: ");
		scanf("%d",&arr[i].wickets);
	}
}

