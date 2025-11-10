/* Q1. Design a class ElectricityBill with a static variable ratePerUnit. Each object will have customer details and number of units consumed. Use a static method to change the rate. Calculate bill using a non-static method. */

class ElectricityBill{

String customerName;
int NoOfUnitConsumed;
static double RatePerUnit;

static{

RatePerUnit=12.7;

}


void setCusName(String n){

     this.customerName=n;
}

void setNoOfUnitConsumed(int n){

     this.NoOfUnitConsumed=n;
}


static void setRatePerUnit(double n){

     RatePerUnit=n;
}// setters ends here


String getCusName(){

     return this.customerName;
}

int getNoOfUnitConsumed(){

     return this.NoOfUnitConsumed;
}


static double getRatePerUnit(){

    return RatePerUnit;
}// getters ends here


ElectricityBill(){
System.out.println("default called");



String customerName="NUll";
int NoOfUnitConsumed=00;
//static double RatePerUnit;
}

ElectricityBill(String n,int a){
System.out.println("parametrized called");

customerName=n;
NoOfUnitConsumed=a;
//static double RatePerUnit=r;
}

void display(){
System.out.println("name : " + this.customerName);
System.out.println("Total Units : " + this.NoOfUnitConsumed);
System.out.println("Rate Per Unit : " + RatePerUnit);
System.out.println("Total Bill is : " + (this.NoOfUnitConsumed*RatePerUnit));
}


}

class TestBill{

public static void main(String[] args){

ElectricityBill e1,e2;

e1 = new ElectricityBill("shrikant",120);
e2 = new ElectricityBill("virat",100);
e1.display();





}
}







