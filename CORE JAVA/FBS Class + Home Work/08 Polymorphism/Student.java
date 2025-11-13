package Polymorphism;


class Employee {
	
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
	
	void display(){
		System.out.println("id is :" + this.id);
		System.out.println("name is :" + this.name);
		System.out.println("salary is :" + this.salary);
	}
	
	double calSal() {
		return salary;
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
	
	void display() {
		//System.out.println("--------------------------------");
		super.display();
		System.out.println("incentive is :" + this.incentive);
		System.out.println("Target is :" + this.target);
		//System.out.println("--------------------------------");
	}
	
	double calSal() {
		return salary+incentive;
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
	
	void display() {
		System.out.println("--------------------------------");
		super.display();
		System.out.println("Commision is :" + this.commision);
		System.out.println("--------------------------------");
	}
	
	double calSal() {
		return salary+commision;
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
	
	void display() {
		System.out.println("--------------------------------");
		super.display();
		System.out.println("allowance is : "+this.allownce);
		System.out.println("--------------------------------");
	}
	
	double calSal() {
		return salary+allownce;
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
	
	void display() {
		System.out.println("\nArea Sales manager :");
		super.display();
		System.out.println("Area :"+this.area);
	}
	
	
}

class TestEmployee{
	
	public static void main (String []args) {
		Employee e1= new Employee(); //generic
		
		e1=new Employee(101,"shrikant",10000);
		e1.display();
		System.out.println("salary of Employee : " + e1.calSal());
		
		e1=new SalesManager(101,"Virat",10000,25645,13);
		e1.display();
		System.out.println("salary of Sales manager : " + e1.calSal());
		
		e1=new Admin(101,"Virat",10000,255);
		e1.display();
		System.out.println("salary of Sales manager : " + e1.calSal());
		
		
		
		
		
	}
}
