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
void setSomm(int c){
 this.comm=c;
}


void setId(int I){
  this.id=I;
}

void setName(String n){ 
  this.name=n;
}

void setSalary(int s){
  this.salary=s;
}
void setSomm(int c){
 this.comm=c;
}


}//class ends here
class TestHr
{
public static void main(String [] x)
{
 Hr h;
 h=new Hr();
 h.setid(1);
 h.setname("Shrikant");
 h.setsalary(50000);
 h.setcomm(5000);
 System.out.println("Hr id: "+h.id +" name: "+h.name+" salary "+h.salary+" comm "+h.comm);
}
}//class TestHr ends 
 