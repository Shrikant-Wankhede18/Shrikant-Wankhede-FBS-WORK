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
 System.out.println("Day is : "+ this.date);
 System.out.println("Month is : "+ this.month);
 System.out.println("year is : "+ this.year);
} 


Date(){

System.out.println("constructor called");
   this.date=31;
   this.month=12;
   this.year=2025;
   this.dow="sunday";
}





} //date ends here

class Test{
public static void main(String [] args){
  Date d1,d2,d3; //reference
  d1 = new Date();
  d2 = new Date();
  d3= new Date();


  d1.setDate(31);
  d1.setMonth(10);
  d1.setYear(2025);

  d2.setDate(21);
  d2.setMonth(10);
  d2.setYear(2025);

d1.display();
d2.display();
d3.display();

 if(d1.getMonth()>d2.getMonth()){
      System.out.println("d1 is younger");
}
else{
    System.out.println("d2 is younger");
}



if(d1.getYear()>d2.getYear()){
      System.out.println("d1 is younger");
}
else{
    System.out.println("d2 is younger");
}

if(d1.getDay()>d2.getDay()){
      System.out.println("d1 is younger");
}
else{
    System.out.println("d2 is younger");
}



  //System.out.println("Date is: "+d1.date +"/"+ d1.month +"/"+d1.year);
   
   }//main ends here
}//Test class ends here