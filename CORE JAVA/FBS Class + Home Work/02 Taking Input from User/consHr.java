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
    this.name="shrikant";
    this.salary=12000;
    this.comm=1200;
}

Hr(int i,String n,int s,int c){

System.out.println("parameterized constructor called");
    this.id=i;
    this.name=n;
    this.salary=s;
    this.comm=c;
}




}//class ends here
class TestHr
{
public static void main(String [] x)
{
Hr[] drr= new Hr[3];


hrr[0]= new Hr();
hrr[1]= new Hr(7,"shrii",244888,1178);
hrr[2]= new Hr();


for(int i=0;i<hrr.length;i++){
//System.out.println(drr[i]); //hashcode printed
Hrr[i].display();
}
  


 }
}//class TestHr ends 
 