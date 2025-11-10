class Student
{
  int rno;
  String name;
  double marks;
void setrno(int r)
{
  this.rno=r;
}
void setname(String n)
{
 this.name=n;
}
void setmarks(double m)
{
 this.marks=m;
}

int getRno()
{
  return this.rno;
}
String getName()
{
 return this.name;
}
double getMarks()
{
 return this.marks;
}

void display(){
  System.out.println("roll no is "+ this.getRno());
  System.out.println("name is "+ this.getName());
  System.out.println("salary is "+ this.getMarks());
}


Student(){
  this.rono=21;
  this.name="shrikant";
  this.marks=74.54;
}

}
// class ends here


class TestStudent
{
  public static void main(String [] t)
{

 Student s1,s2;
 s1=new Student();
 s2=new Student();

 s1.setrno(23);
 s1.setname("shrikant");
 s1.setmarks(7.63);

s2.display();

s1.display();
//System.out.println("student info: "+s1.rno + s1.name + s1.marks);
}
}