#include <stdio.h>
#include <string.h>
#include <stdlib.h>

 typedef struct book {
	int book_id;
	char bookname[50];
	char authorname[50];
	char category[50];
	int price;
	int rating;
} book;
void hardcode(book*);
void display(book*, int);
void addbook(book* b,int*);
void update(book*,int);
void deletes(book*,int*);
void sortedbyprice(book*,int);
void showauthorsbook(book*,int);
void sortedbyrating(book*,int);
void showcategory(book*,int);
void search(book*,int);
void topthreeratings(book*,int);


void main() {

	int capacity=5;
	int count =0;
	book* b=(book*)malloc(capacity*sizeof(book));
	hardcode(b);
	count=5;
	display(b,count);


	while(1) {
		int ch;
		printf("\n\nPRESS 1 TO ADD                :  \n");
		printf("PRESS 2 TO DISPLAY                :  \n");
		printf("PRESS 3 TO UPDATE                 :  \n");
		printf("PRESS 4 TO DELETE                 :  \n");
		printf("PRESS 5 TO SEARCH                 :  \n");
		printf("PRESS 6 TO SORT BY PRICE          :  \n");
		printf("PRESS 7 TO SORT BY RATING         :  \n");
		printf("PRESS 8 TO SHOW AUTHORS BOOKS     :  \n");
		printf("PRESS 9 TO SHOW CATEGORY BOOKS    :  \n");
		printf("PRESS 10 TO TOP THREE BOOKS BY RATINGS    :  \n");
		printf("PRESS 0 TO EXIT                   :");


		scanf("%d",&ch);

		if(ch==1) {
			if (count == capacity) {
				capacity =capacity* 2;
				b = (book*)realloc(b, capacity * sizeof(book));
			}
			addbook(b,&count);



		} else if(ch==2) {

			display(b,count);
		} else if(ch==3) {

			update(b,count);
		}

		else if(ch==4) {
			deletes(b,&count);
		} else if(ch==5) {
			search(b,count);

		} else if(ch==6)	{
			sortedbyprice(b,count);
		} else if(ch==8) {
			showauthorsbook(b,count);
		} else if(ch==7) {
			sortedbyrating(b,count);
		} else if(ch==9) {
			showcategory(b,count);
		} else if(ch==0) {
			printf("Exiting.....\n");
			printf("\n--------------------------------------------\n");
			printf("   Thank you for using our program! \n");
			printf("         Created by: Shrikant Wankhede \n");
			printf("--------------------------------------------\n");

			break;
		} else if (ch==10) {
			topthreeratings(b,count);
		}



	}
}


void hardcode(book* b) {
	b[0].book_id=101;
	strcpy(b[0].bookname,"Beyond a Boundary");
	strcpy(b[0].authorname,"C. L. R. James");
	strcpy(b[0].category,"sport/cricket");
	b[0].price=2000;
	b[0].rating=5;


	b[1].book_id = 102;
	strcpy(b[1].bookname, "The Silent Patient");
	strcpy(b[1].authorname, "Alex Michaelides");
	strcpy(b[1].category, "thriller");
	b[1].price = 1800;
	b[1].rating = 4;

	b[2].book_id = 103;
	strcpy(b[2].bookname, "C Programming");
	strcpy(b[2].authorname, "Dennis Ritchie");
	strcpy(b[2].category, "Programming");
	b[2].price = 450;
	b[2].rating = 5;

	b[3].book_id = 104;
	strcpy(b[3].bookname, "Data Structures");
	strcpy(b[3].authorname, "Narasimha Karumanchi");
	strcpy(b[3].category, "Computer Science");
	b[3].price = 600;
	b[3].rating = 4;


	b[4].book_id = 105;
	strcpy(b[4].bookname, "Clean Code");
	strcpy(b[4].authorname, "Robert C. Martin");
	strcpy(b[4].category, "Software Engineering");
	b[4].price = 550;
	b[4].rating = 5;


}

void display(book* b, int count) {
	printf("%-8s %-25s %-20s %-15s %-8s %-6s\n",
	       "BookID", "Book Name", "Author Name", "Category", "Price", "Rating");
	printf("----------------------------------------------------------------------------------------\n");

	for (int i = 0; i < count; i++) {
		printf("%-8d %-25s %-20s %-15s %-8d %-6d\n",
		       b[i].book_id, b[i].bookname, b[i].authorname, b[i].category, b[i].price, b[i].rating);
	}
}

void addbook(book* b,int* i) {

	int id,choice;
	while(1) {
		int flag=0;

		printf("ENTER BOOK ID (0 for exit)");
		scanf("%d",&id);

		if(id==0) {
			printf("exiting....");
			break;
		}

		for(int j=0; j<*i; j++) {
			if(b[j].book_id==id){
				flag=1;
				break;
			}
		}

		if(flag==0) {
			b[*i].book_id=id;
			printf("ID : %d\n",b[*i].book_id);

			printf("Book Name: \n");
			scanf(" %[^\n]", b[*i].bookname);
			printf("Author Name: \n");
			scanf(" %[^\n]", b[*i].authorname);
			printf("Category: \n");
			scanf(" %[^\n]", b[*i].category);
			printf("Price: \n");
			scanf("%d",&b[*i].price);
			printf("Rating:\n");
			scanf("%d",&b[*i].rating);
			(*i)++;
			printf("Book Added Succesfully...\n");
			break;
		}
		if(flag==1) {
			printf("id already exsits! try again\n\n");
		}

	}
}


void update(book* b,int count) {
	int id;
    while(1){
    	int flag=0;
	printf("enter the id that you want to update");
	scanf("%d",&id);
	for(int i=0;i<count;i++){
		if(b[i].book_id==id){
			flag=1;
	
		}
	}
    if(flag==0) {
		printf("invalid Id! Try Again \n");
	}
	else{
		break;
	}
}

	int choice;
	printf("enter 1 for update book price : \n");
	printf("enter 2 for update book rating : \n");
	scanf("%d",&choice);
		int flag=0;
	if(choice==1) {
	
		for(int i=0; i<count; i++) {
			if(b[i].book_id==id) {
				printf("Book Name: %s \n", b[i].bookname);
				printf("Author Name: %s \n", b[i].authorname);
				printf("Category: %s\n", b[i].category);
				printf("Price: \n");
				scanf("%d",&b[i].price);
				printf("Rating: %d\n ",b[i].rating);
				printf("Book Price Updated successfuly...");
				flag=1;
				
			}
		}
	}

	if(choice==2) {
		for(int i=0; i<count; i++) {
			if(b[i].book_id==id) {
				printf("Book Name: %s \n", b[i].bookname);
				printf("Author Name: %s \n", b[i].authorname);
				printf("Category: %s\n", b[i].category);
				printf("Price: %d \n",b[i].price);
				printf("Rating: \n ");
				scanf("%d",&b[i].rating);
				printf("Book Rating Updated successfuly...");
				flag=1;
			}
		}
	}
	
}


void deletes(book* b, int* count) {
	int id,flag=0;
	while(1){
	printf("Enter the book id you want to delete(press 0 for exit): ");
	scanf("%d", &id);
	
	if(id==0){
		break;
	}

	for(int i=0; i<*count; i++) {
		if(b[i].book_id == id) {
			for(int j = i; j < *count - 1; j++) {
				b[j] = b[j + 1];
			}
			(*count)--;
			printf("book id %d deleted successfully.\n", id);
			flag=1;
			break;
		}
	}
	if(flag==0)
		printf("book id %d not found.\n", id);
}
}

void search(book* b,int count) {


	int ch;
	while(1){
	printf("FOR SEARCH BY ID PRESS 1\nFOR SEARCH BY AUTHER NAME 2\n FOR EXIT PRESS 0 :");
	scanf("%d",&ch);
	if(ch==0){
		printf("exiting...");
		break;
	}
	if(ch==1) {
		int id,found=0;
		printf("ENTER THE BOOK ID THAT YOU WANT TO SEARCH : \n");
		scanf("%d",&id);
		for(int i=0; i<count; i++) {
			if(b[i].book_id==id) {
				printf("Book ID: %d\n", b[i].book_id);
				printf("Book Name: %s\n", b[i].bookname);
				printf("Author Name: %s\n", b[i].authorname);
				printf("Category: %s\n", b[i].category);
				printf("Price: %d\n", b[i].price);
				printf("Rating: %d \n\n", b[i].rating);
				found=1;

			}
		}
		if(found==0)
			printf("book id %d not found.\n", id);
		else
			break;

	} else if(ch==2) {
		char author[50];
		int found=0;
		printf("ENTER THE AUTHOR THAT YOU WANT TO SEARCH : \n");
		scanf(" %[^\n]",author);
		for(int i=0; i<count; i++) {
			if(strcmp(b[i].authorname,author)==0) {
				printf("Book ID: %d\n", b[i].book_id);
				printf("Book Name: %s\n", b[i].bookname);
				printf("Author Name: %s\n", b[i].authorname);
				printf("Category: %s\n", b[i].category);
				printf("Price: %d\n", b[i].price);
				printf("Rating: %d \n\n", b[i].rating);
				found=1;

			}
		}
		if(found==0)
			printf("book author %s not found.\n",author);
		else
		break;
	}
	}
}

void sortedbyprice(book* b,int count) {
	book temp[count];
	for(int i=0; i<count; i++) {
		temp[i]=b[i];
	}
	while(1){

	printf("PRESS 1 FOR LOW TO HIGH \n");
	printf("PRESS 2 FOR HIGH TO LOW :\nPRESS 0 FOR EXIT :");
	int ch;
	scanf("%d",&ch);
	
	if(ch==0){
		printf("Exiting...");
		break;
	}


	if(ch==1) {
		for(int i=0; i<count; i++) {
			for(int j=0; j<count-1; j++) {
				if(temp[j].price>temp[j+1].price) {
					book swap=temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=swap;
				}
			}
		}
		printf("%-8s %-25s %-20s %-15s %-8s %-6s\n",
		       "BookID", "Book Name", "Author Name", "Category", "Price", "Rating");
		printf("----------------------------------------------------------------------------------------\n");

		for (int i = 0; i < count; i++) {
			printf("%-8d %-25s %-20s %-15s %-8d %-6d\n",
			       temp[i].book_id, temp[i].bookname, temp[i].authorname, temp[i].category, temp[i].price, temp[i].rating);
		}
		break;
	}
    else if(ch==2) {
		for(int i=0; i<count; i++) {
			for(int j=0; j<count-1; j++) {
				if(temp[j].price<temp[j+1].price) {
					book swap=temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=swap;
				}
			}
		}
		printf("%-8s %-25s %-20s %-15s %-8s %-6s\n",
		       "BookID", "Book Name", "Author Name", "Category", "Price", "Rating");
		printf("----------------------------------------------------------------------------------------\n");

		for (int i = 0; i < count; i++) {
			printf("%-8d %-25s %-20s %-15s %-8d %-6d\n",
			       temp[i].book_id, temp[i].bookname, temp[i].authorname, temp[i].category, temp[i].price, temp[i].rating);
		}
		break;
	}
	else{
		printf("Envalid choice\n\n");
	}
}
}


void showauthorsbook(book* b,int count) {
	char author[50];
	int found=0;
	printf("ENTER THE AUTHOR THAT YOU WANT TO SEARCH : \n");
	scanf(" %[^\n]",author);
	for(int i=0; i<count; i++) {
		if(strcmp(b[i].authorname,author)==0) {
			printf("Book ID: %d\n", b[i].book_id);
			printf("Book Name: %s\n", b[i].bookname);
			printf("Author Name: %s\n", b[i].authorname);
			printf("Category: %s\n", b[i].category);
			printf("Price: %d\n", b[i].price);
			printf("Rating: %d \n\n", b[i].rating);
			found=1;
		}
	}
	if(found==0)
		printf("book author %s not found.\n",author);
}


void sortedbyrating(book* b,int count) {
	book temp[count];
	for(int i=0; i<count; i++) {
		temp[i]=b[i];
	}

	for(int i=0; i<count; i++) {
		for(int j=0; j<count-1; j++) {
			if(temp[j].rating<temp[j+1].rating) {
				book swap=temp[j];
				temp[j]=temp[j+1];
				temp[j+1]=swap;
			}
		}
	}
	printf("%-8s %-25s %-20s %-15s %-8s %-6s\n",
	       "BookID", "Book Name", "Author Name", "Category", "Price", "Rating");
	printf("----------------------------------------------------------------------------------------\n");

	for (int i = 0; i < count; i++) {
		printf("%-8d %-25s %-20s %-15s %-8d %-6d\n",
		       temp[i].book_id, temp[i].bookname, temp[i].authorname, temp[i].category, temp[i].price, temp[i].rating);
	}
}


void showcategory(book* b,int count) {
	char category[50];
	int found=0;
	
	
	printf("ENTER THE CATEGORY THAT YOU WANT TO SEARCH : \n");
	scanf(" %[^\n]",category);
	for(int i=0; i<count; i++) {
		if(strcmp(b[i].category,category)==0) {
			printf("Book ID: %d\n", b[i].book_id);
			printf("Book Name: %s\n", b[i].bookname);
			printf("Author Name: %s\n", b[i].authorname);
			printf("Category: %s\n", b[i].category);
			printf("Price: %d\n", b[i].price);
			printf("Rating: %d \n\n", b[i].rating);
			found=1;
		}
	}
	if(found==0)
		printf("book category %s not found.\n",category);
}



void topthreeratings(book* b,int count) {
	book temp[count];
	for(int i=0; i<count; i++) {
		temp[i]=b[i];
	}

	for(int i=0; i<count; i++) {
		for(int j=0; j<count-1; j++) {
			if(temp[j].rating<temp[j+1].rating) {
				book swap=temp[j];
				temp[j]=temp[j+1];
				temp[j+1]=swap;
			}
		}
	}
	printf("%-8s %-25s %-20s %-15s %-8s %-6s\n",
	       "BookID", "Book Name", "Author Name", "Category", "Price", "Rating");
	printf("----------------------------------------------------------------------------------------\n");

	for (int i = 0; i < 3; i++) {
		printf("%-8d %-25s %-20s %-15s %-8d %-6d\n",
		       temp[i].book_id, temp[i].bookname, temp[i].authorname, temp[i].category, temp[i].price, temp[i].rating);
	}
}















