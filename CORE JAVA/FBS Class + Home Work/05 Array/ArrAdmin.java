class Admin
{
  int id;
  String name;
  double salary;
  int allow;
void setId(int I)
{
  this.id=I;
}
void setName(String n)
{
  this.name=n;
}
void setSalary(double s)
{
 this.salary=s;
}
void setAllow(int b)
{
  this.allow=b;
}

void display(){
System.out.println("-------------------------------------");

    System.out.println("Admin info");
    System.out.println("Admin id: "+this.id);
    System.out.println("Admin name: "+this.name);
    System.out.println("Admin salary: "+this.salary);
    System.out.println("Admin "+this.allow);
System.out.println("-------------------------------------");

}

Admin(){
   id=101;
   name="shrii";
   salary=45000.00;
   allow=1000;
}


Admin(int i,String n,double d, int a){
   id=i;
   name=n;
   salary=d;
   allow=a;
}


}// class ends here



class TestAdmin
{
 public static void main (String []x)
{
 
 
Admin[] arr= new Admin[3];


arr[0]= new Admin();
arr[1]= new Admin(102,"virat",12933.00,1200);
arr[2]= new Admin();


for(int i=0;i<arr.length;i++){
//System.out.println(drr[i]); //hashcode printed
arr[i].display();
}
  
}
}//class TestAdmin ends



