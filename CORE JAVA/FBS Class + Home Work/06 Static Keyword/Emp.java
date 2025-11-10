

class Employee {

String name;
double basicSalary;
static double companyBonusRate;


static{

companyBonusRate = 500; 
	
   }// static fun ends here

	
Employee(){

this.name = "shrii";
this.basicSalary = 20000;
	
 }//default constructor 

Employee(String a,double b){

this.name = a;
this.basicSalary = b;

}//parameter  constructor 

	void setname(String a){

	this.name = a;

    }

	void setbasicSalary(double b){

	this.basicSalary = b;

    }

	static void setcompanyBonusRate(double c){

	companyBonusRate = c;

    }//set ends here 


	String getname(){

	return this.name ;

    }

	double getbasicSalary(){

	return this.basicSalary ;

    }

	double getcompanyBonusRate(){

	return this.companyBonusRate ;

    }//get ends here 


	double totalsalary(){

	double totalsalary = basicSalary + (basicSalary*companyBonusRate/100);
	return totalsalary;

	}//totalsalary ends here 

	void display(){

	System.out.println("Name:"+this.name);
	System.out.println("Basisc Salary:"+this.basicSalary);
	System.out.println("bonous :"+this.companyBonusRate);
	System.out.println("total salary: "+totalsalary());
	System.out.println("---------------------------------");

    }//display ends here 



}// employee class ends here


class TestEmployee {

public static void main(String[]args){




Employee e1 = new Employee();
Employee e2 = new Employee("Virat",50000);
Employee e3 = new Employee("Ab",26000);

e1.display();
e2.display();
e3.display();
	
    }

}