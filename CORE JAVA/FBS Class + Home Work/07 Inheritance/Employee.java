package inheritance;

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
	
}

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
		System.out.println("--------------------------------");
		super.display();
		System.out.println("incentive is :" + this.incentive);
		System.out.println("Target is :" + this.target);
		System.out.println("--------------------------------");
	}
	
	
}

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
	
	
}

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
}

class TestEmployee{
	public static void main(String [] args) {
		
		SalesManager s1=new SalesManager(101,"philip",1234,54,12);
		s1.display();
		Hr h1= new Hr(102,"virat",124551,5423.97);
		h1.display();
		Admin a1=new Admin(103,"Rajat",35555,5342.98);
		a1.display();
	}
}
