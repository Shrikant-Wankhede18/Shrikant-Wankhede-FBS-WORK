import java.util.Scanner;
class Employee{

int id;
String name;
double salary;

void setId(int x)
{
   this.id=x;

}

void setName(String str){
  this.name=str;
}

void setSalary(double x){

this.salary=x;
}

int getId(){
   return this.id;
}

String getName(){
   return this.name;
}

double getSalary(){
     return this.salary;
}

void Display(){
  System.out.println("id is "+ this.getId());
  System.out.println("name is "+ this.getName());
  System.out.println("name is "+ this.getSalary());
}

Employee(){
   id=101;
   name="virat";
   salary=14500;
}

Employee(int i,String n,double d){
   id=i;
   name=n;
   salary=d;
}





} //class Employee ends here

class TestEmployee{
public static void main(String [] args){
  Employee e1,e2,e3; //reference
  e1 = new Employee();
  e2 = new Employee(); // object created
  
  e1.setId(101);
  e1.setName("shrii");
  e1.setSalary(2555.48);

 
e1.Display();
e2.Display();


Scanner sc= new Scanner(System.in);
System.out.println("ENTER Id");
int i = sc.nextInt();
sc.nextLine();
System.out.println("ENTER NAME");
String n = sc.nextLine();
System.out.println("ENTER SALARY");
double s = sc.nextDouble();

e3 = new Employee(i,n,s);
e3.Display();



   }//main ends here
}//TestEmployee class ends here