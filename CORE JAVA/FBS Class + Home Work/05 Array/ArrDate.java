class Date{
int date,month,year;
String dow;

void setDate(int x){
this.date=x;
}

void setMonth(int x){
this.month=x;
}

void setYear(int x){
this.year=x;
}

int getDay(){

   return this.date;
}

int getMonth(){

   return this.month;
}

int getYear(){

   return this.year;
}


void display(){

System.out.println("-----------------------------");

 System.out.println("Day is : "+ this.date);
 System.out.println("Month is : "+ this.month);
 System.out.println("year is : "+ this.year);
System.out.println("-----------------------------");
} 


Date(){

System.out.println("constructor called");
   this.date=31;
   this.month=12;
   this.year=2025;
   this.dow="sunday";
}

Date(int d,int m,int y,String r){

System.out.println("parameterized constructor called");
   this.date=d;
   this.month=m;
   this.year=y;
   this.dow=r;
}






} //date ends here

class Test{
public static void main(String [] args){

Date[] drr= new Date[3];


drr[0]= new Date();
drr[1]= new Date(7,11,2025,"Friaday");
drr[2]= new Date(6,11,2025,"Thursday");


for(int i=0;i<drr.length;i++){
//System.out.println(drr[i]); //hashcode printed
drr[i].display();
}
  





  
   
   }//main ends here
}//Test class ends here