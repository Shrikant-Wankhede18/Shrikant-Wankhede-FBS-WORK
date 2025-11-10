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

} //class Employee ends here

class TestEmployee{
public static void main(String [] args){
  Employee e1; //reference
  e1 = new Employee(); // object created
  
  e1.setId(101);
  e1.setName("shankar");
  e1.setSalary(2555.48);

  System.out.println("Details of Employee is: "+e1.id +"/"+ e1.name +"/"+e1.salary);
   
   }//main ends here
}//TestEmployee class ends here