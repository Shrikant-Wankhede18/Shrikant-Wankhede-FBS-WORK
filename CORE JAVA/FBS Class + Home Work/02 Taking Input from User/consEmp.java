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
  e3 = new Employee(101,"ab",345.00);
  e1.setId(101);
  e1.setName("shrii");
  e1.setSalary(2555.48);

 
e1.Display();
e2.Display();
e3.Display();


if(e1.getSalary()>e2.getSalary()){
   System.out.println("salary of "+ e1.name + " " +"is greater");
}
else{
 System.out.println("salary of "+ e2.name + "is greater");
}

  //System.out.println("Details of Employee is: "+e1.id +"/"+ e1.name +"/"+e1.salary);
   
   }//main ends here
}//TestEmployee class ends here