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





} //class Employee ends here

class TestEmployee{
public static void main(String [] args){
  Employee e1,e2; //reference
  e1 = new Employee();
  e2 = new Employee(); // object created
  
  e1.setId(101);
  e1.setName("shrii");
  e1.setSalary(2555.48);

  e2.setId(102);
  e2.setName("tejas");
  e2.setSalary(22555.48);

e1.Display();
e2.Display();


if(e1.getSalary()>e2.getSalary()){
   System.out.println("salary of "+ e1.name + " " +"is greater");
}
else{
 System.out.println("salary of "+ e2.name + "is greater");
}

  //System.out.println("Details of Employee is: "+e1.id +"/"+ e1.name +"/"+e1.salary);
   
   }//main ends here
}//TestEmployee class ends here