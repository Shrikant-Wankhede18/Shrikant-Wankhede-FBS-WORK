/* 3. Create Classes for Student and Employee
• Student: Attributes - rollno, name, percentage
• Employee: Attributes - id, name, annualSalary
Create a class Bank and write overloaded functions to approve loans based on the following
conditions:
For Students (Based on Percentage):
• Above 80: 2 Lakh
• Between 60-80: 1 Lakh
• Between 40-60: 50K
• Below 40: No loan approved
For Employees (Based on Annual Salary):
• Above 12 LPA: 7 Lakh
• Between 10-12 LPA: 6 Lakh

• Between 6-10 LPA: 5 Lakh

• Between 4-6 LPA: 4 Lakh
• Below 4 LPA: No loan approved
*/


class Student{
  int rollno;
  String name;
  double per;

Student(int r, String n, double p){
    this.rollno=r;
    this.name=n;
    this.per=p;

}

} // class students ends here

class Employee{
  int id;
  String name;
  double anualsal;

Employee(int r, String n, double p){
    this.id=r;
    this.name=n;
    this.anualsal=p;

}
}// class employee ends here

class LoanAproval{

void loan(Student s){
  
  if(s.per>80){
    System.out.println("Loan Aproved to "+s.name +" of 2 Lakh");
   }
else if(s.per>=60 && s.per<80){
    System.out.println("Loan Aproved to "+s.name +" of 1 Lakh");
   }
else if(s.per>=40 && s.per<60){
    System.out.println("Loan Aproved to "+s.name +" of 50 K");
   }
else{
   System.out.println("Loan Not Aproved");
}

}// student loan ends here

void loan(Employee e){
  
  if(e.anualsal>1200000){
    System.out.println("Loan Aproved to "+e.name +" of 7 Lakh");
   }
 else if(e.anualsal>=1000000 && e.anualsal<1200000){
    System.out.println("Loan Aproved to "+e.name +" of 6 Lakh");
   }
else if(e.anualsal>=600000 && e.anualsal<1000000){
    System.out.println("Loan Aproved to "+e.name +" of 5 Lakh");
   }
else if(e.anualsal>=400000 && e.anualsal<600000){
    System.out.println("Loan Aproved to "+e.name +" of 4 Lakh");
   }
else{
   System.out.println("Loan Not Aproved");
}

}// employee loan ends here




}// class loan aproval ends here

class TestLoan{

public static void main(String[] args){

Student s1,s2;
Employee e1,e2;
s1= new Student(1,"shrii",77.80);
s2= new Student(1,"virat",88.80);

e1= new Employee(101,"Rajat",800000.54);
e2= new Employee(102,"Philip",560000);



LoanAproval Bank;
Bank = new LoanAproval();

Bank.loan(s1);
System.out.println("--------------------------------------");
Bank.loan(s2);
System.out.println("--------------------------------------");
Bank.loan(e1);
System.out.println("--------------------------------------");
Bank.loan(e2);
System.out.println("--------------------------------------");

}
}
















