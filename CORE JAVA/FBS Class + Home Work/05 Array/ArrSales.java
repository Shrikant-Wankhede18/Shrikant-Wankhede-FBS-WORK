class SalesManager
{
 int id;
 String name;
 double salary;
 int incen,target;

void setId(int I)
{
   this.id=I;
}
void setName(String n)
{
 this.name=n;
}
 
void setSalary(double d)
{
  this.salary=d;
}

void setIncen(int x)
{
  this.incen=x;
}

void setTarget(int t)
{
 this.target=t;
}


int getId()
{
   return this.id;
}
String getName()
{
  return this.name;
}
 
double getSalary()
{
  return this.salary;
}

int getIncen()
{
  return this.incen;
}

int getTarget(int t)
{
 return this.target;
}

void display(){
    System.out.println(" ID : " + this.id);
    System.out.println(" NAME : " + this.name);
    System.out.println(" SALARY : " + this.salary);
    System.out.println(" INCEN : " + this.incen);
    System.out.println(" TARGET : " + this.target);
}

SalesManager(){
   id=101;
   name="shrii";
   salary=106666;
   incen=1088;
   target=12;
}


SalesManager(int i,String n,double s,int a,int t){
   id=i;
   name=n;
   salary=s;
   incen=a;
   target=t;
}




}// class ends here


class TestSales
{
public static void main(String [] x)
{
 
SalesManager[] srr= new SalesManager[3];


srr[0]= new SalesManager();
srr[1]= new SalesManager(7,"rajat",20287,1233,13);
srr[2]= new SalesManager();


for(int i=0;i<srr.length;i++){
srr[i].display();
}
  



}
}  //Test Salesmanager ends
 