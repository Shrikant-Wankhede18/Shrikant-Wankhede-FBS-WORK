package Abstract;


abstract class Employee {
	
	int id;
	String name;
	double salary;
	
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
    double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}//getters and setters ends here
	
	Employee(){
		id=00;
		name="not given";
		salary=0.0;
		
	}
	
	Employee(int i,String n,double d){
		id=i;
		name=n;
		salary=d;
		
	}
	
	abstract double calSal();
	
	public String toString() {
		return "id is :" + this.id + "\nname is :"  + this.name + "\nsalary is :" + this.salary;
	}
		
	
	
}// class employee ends here

class SalesManager extends Employee{
	double incentive;
	int target;
	double getIncentive() {
		return incentive;
	}
	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	int getTarget() {
		return target;
	}
	void setTarget(int target) {
		this.target = target;
	}// getters and setters end here
	
	SalesManager(){
		super();
		incentive=00;
		target=00;
	}
	
	SalesManager(int id,String name,double salary,double i,int t){
		super(id,name,salary);
		incentive=i;
		target=t;
	}
	
	
	double calSal() {
		return salary+incentive;
	}
	
	
	public String toString() {
		return super.toString()+"incentive is :" + this.incentive +"Target is :" + this.target;
	}
	
	
}// sales manager ends here

class Hr extends Employee{
	
	double commision;

	double getCommision() {
		return commision;
	}

	void setCommision(double commision) {
		this.commision = commision;
	}
//getters and setters ends
	
	Hr(){
		super();
		commision=00;
	}
	
	Hr(int id,String name,double salary,double c){
		super(id,name,salary);
		commision=c;
	}//constructors end here
	
	
	double calSal() {
		return salary+commision;
	}
	
	public String toString() {
		return super.toString()+"Commision is :" + this.commision;
	}
	
	
}// hr ends here

class Admin extends Employee{
	double allownce;

	public double getAllownce() {
		return allownce;
	}

	public void setAllownce(double allownce) {
		this.allownce = allownce;
	}//getters and setters ends here
	
	Admin(){
		super();
		allownce=00;
	}
	
	Admin(int id,String n,double salary,double a){
		super(id,n,salary);
		allownce=a;
	}
	
	
	double calSal() {
		return salary+allownce;
	} 
	
	
	public String toString() {
		return super.toString()+"allowance is : "+this.allownce;
	}
}//class Admin ends here

class AreaSalesManager extends SalesManager{
	String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}//Getters and setters ends here

	AreaSalesManager() {
		super();
		area="Kothrud";
		
	}

	AreaSalesManager(int id, String name, double salary, double i, int t,String ar) {
		super(id, name, salary, i, t);
		area=ar;
		
	}// constructors ends here
	
	
	
	public String toString() {
		return super.toString() +"Area :"+this.area;
	}
	
	
}

class TestEmployee{
	
	public static void main (String []args) {
		Employee e1; //generic
		
		
		e1=new SalesManager(101,"Virat",10000,25645,13);
		System.out.println(e1);
		System.out.println("\nsalary of Sales manager : " + e1.calSal());
		
		e1=new Admin(101,"Virat",10000,255);
		//System.out.println(e1);
		//System.out.println("salary of Sales manager : " + e1.calSal());
		
		e1=new AreaSalesManager(101,"Virat",10000,25645,13,"25km");
		System.out.println(e1);
		System.out.println("\nsalary of Sales manager : " + e1.calSal());
		
		
		
		
		
		
		
	}
}
