class Hr
{
 int id;
 String name;
 int salary,comm;
void setId(int I){
  this.id=I;
}

void setName(String n){ 
  this.name=n;
}

void setSalary(int s){
  this.salary=s;
}
void setComm(int c){
 this.comm=c;
}


int getId(){
  return this.id;
}

String getName(){ 
 return this.name;
}

int getSalary(){
  return this.salary;
}
int getComm(){
 return this.comm;
}

void display(){
   System.out.println("ID : " +this.id);
   System.out.println("ID : " +this.name);
   System.out.println("ID : " +this.salary);
   System.out.println("ID : " +this.comm);
}

Hr(){

System.out.println("constructor called");
    this.id=101;
    this.name="shrikant"
    this.salary=12000;
    this.comm=1200;
}



}//class ends here
class TestHr
{
public static void main(String [] x)
{
 Hr h,g,h2;
 h=new Hr();
 g=new Hr()
h2=new Hr();

 h.setId(1);
 h.setName("Shrikant");
 h.setSalary(50000);
 h.setComm(5000);

 g.setId(2);
 g.setName("Shrikant");
 g.setSalary(50000);
 g.setComm(5000);

h.display();
g.display();
h2.display();


 //System.out.println("Hr id: "+h.id +" name: "+h.name+" salary "+h.salary+" comm "+h.comm);
}
}//class TestHr ends 
 