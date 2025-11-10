package inheritance;

public class Student {
 int FBSId;
 String Name;
 int Distance;
 static int count=0;
 
 
 
 
 int getFBSId() {
	return FBSId;
 }
 void setFBSId(int fBSId) {
	FBSId = fBSId;
 }
 String getName() {
	return Name;
 }
 void setName(String name) {
	Name = name;
 }
 int getDistance() {
	return Distance;
 }
 void setDistance(int distance) {
	Distance = distance;
 }
 

 
 Student(){
	 System.out.println("students default Called");
	 FBSId=101;
	 Name="shrikant";
	 Distance=14;
	 count++;
 }
 
 Student(int f,String s,int d){
	 System.out.println("students Para Called");
	 FBSId=f;
	 Name=s;
	 Distance=d;
	 count++;
 }
 
 static int getCount() {
	 return count;
 }
 
 void display() {
	 System.out.println("FBS Id :"+this.FBSId);
	 System.out.println("Name is :"+this.Name);
	 System.out.println("Distance :"+this.Distance);
 }
 

}// class student ends here

class PlacedStudent extends Student{ //step 1
	//step 2 remove state and behavior
	String CName;
	String Degignation;
	
	
	String getCName() {
		return CName;
	}
	void setCName(String cName) {
		CName = cName;
	}
	 String getDegignation() {
		return Degignation;
	}
	 void setDegignation(String degignation) {
		Degignation = degignation;
	}
	 
	 
	 PlacedStudent(){
		 super(); //step 3a
		 
		 CName="xyz";
		 Degignation="abc";
		 System.out.println("Placed students default Called");
		
	 }
	 
	 PlacedStudent(int FBSId,String Name,int Distance,String cn,String dis){
		 
		 super(FBSId,Name,Distance); //step 3b
		 CName=cn;
		 Degignation=dis;
		 System.out.println("Placed students Para Called");
		 
	 }
	 
	 void display() {
		 
		 
		 super.display(); //step 4
		 System.out.println("cName :"+this.CName);
		 System.out.println("Degignation :"+this.Degignation);
		 
	 }
	
	
	
	
}// class PlacedStudents ends here

class TestStudent{
	public static void main(String [] args) {
		
		Student s1=new Student();
		System.out.println("count is :"+ Student.getCount());
		s1.display();
		PlacedStudent ps1= new PlacedStudent();
		System.out.println("count is :"+ Student.getCount());
		ps1.display();
		
	}

}
