class Admin
{
  int id;
  String name;
  double salary;
  int allow;
void setid(int I)
{
  this.id=I;
}
void setname(String n)
{
  this.name=n;
}
void setsalary(double s)
{
 this.salary=s;
}
void setallow(int b)
{
  this.allow=b;
}
}// class ends here
class TestAdmin
{
 public static void main (String []x)
{
 Admin a;
 a=new Admin();
 a.setid(101);
 a.setname("Shrikant");
 a.setsalary(50000.00);
 a.setallow(10000);
System.out.println("Admin info");
System.out.println("Admin id: "+a.id);
System.out.println("Admin name: "+a.name);
System.out.println("Admin salary: "+a.salary);
System.out.println("Admin "+a.allow);
}
}//class TestAdmin ends



