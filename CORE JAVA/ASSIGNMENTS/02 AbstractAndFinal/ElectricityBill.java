package AbstractAndFinal;

abstract class ElectricityBill {
	
	int units;
	String cusName;
	
	ElectricityBill(int units,String n){
		this.units=units;
		this.cusName=n;
		
	}
	
	abstract double calculateBill();
	
	final void generateBill() {
		
		double tax= calculateBill() *1.05;
		double finalBill=tax+50;
		
		System.out.println("Customer Name  : " + cusName);
		System.out.println("Units Consumed : " +units);
		System.out.println("Total Bill     : " + finalBill);
		
	}

}// class Electricity Bill ends here

class ResidentialBill extends ElectricityBill{
	
	ResidentialBill(int units,String cusName){
		super(units,cusName);
		
	}
	
	double calculateBill(){
		double bill=0;
		if(this.units >=0 && this.units<=100) {
			bill= this.units * 2.5;
		}
		else if(this.units >=101 && this.units<300) {
			bill=this.units*3.5;
		}
		else if(this.units >=300 && this.units<=500) {
			bill= this.units*5;
		}
		else {
			bill=this.units*5+150;
		}
		
		return bill;
		
		
	}
	
	
}// Recidancy bill ends here

class CommercialBill extends ElectricityBill{
	
	CommercialBill (int units,String cusName){
		super(units,cusName);
		
	}
	
	double calculateBill(){
		double bill=0;
		if(this.units >1 &&this.units <=200) {
			bill= 1500;
		}
		else if(this.units >=200 ) {
			bill=(this.units*6.5)* 1.08;
		}
		
		return bill;
		
		
	}
	
	
}// Recidancy bill ends here

class TestElectricityBill{
	public static void main(String[] args) {
		
		ElectricityBill e1= new CommercialBill(133,"shrikant");
		e1.generateBill();
		System.out.println("_____________________________________");
		
		ElectricityBill e2= new ResidentialBill(133,"virat");
		e2.generateBill();
		
	}
	
	
	
}
