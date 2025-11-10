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
  Employee[] err= new Employee[3];


err[0]= new Employee();
err[1]= new Employee(7,"shrikant",1233.00);
err[2]= new Employee();


for(int i=0;i<err.length;i++){
//System.out.println(drr[i]); //hashcode printed
err[i].Display();
}
  



     }//main ends here
}//TestEmployee class ends here