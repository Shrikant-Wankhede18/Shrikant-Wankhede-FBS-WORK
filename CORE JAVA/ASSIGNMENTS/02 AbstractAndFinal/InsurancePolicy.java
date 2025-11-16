package AbstractAndFinal;

abstract class InsurancePolicy {
	
	String policyHolderName;
    double basePremium;
    
    
    
    InsurancePolicy(String policyHolderName, double basePremium) {
		super();
		this.policyHolderName = policyHolderName;
		this.basePremium = basePremium;
	}


	abstract double calculatePremium();

    
    void printPolicyDetails() {
    	System.out.println("Policy Holder Name : "+this.policyHolderName);
    	System.out.println("Base Premium : "+this.basePremium);
    	System.out.println("Total Premium  : "+this.calculatePremium());
    }

}//class incurance policy ends here

class CarInsurance extends InsurancePolicy{
	int carAgeInYears;
	boolean hadAccidentInLastYear;
	double carValue;
	
	
	
	CarInsurance(String policyHolderName, double basePremium, int carAgeInYears, boolean hadAccidentInLastYear,
			double carValue) {
		super(policyHolderName, basePremium);
		this.carAgeInYears = carAgeInYears;
		this.hadAccidentInLastYear = hadAccidentInLastYear;
		this.carValue = carValue;
	}




	double calculatePremium() {
		double premium=0.0;
		if(this.carAgeInYears<=3) {
			premium=this.basePremium * 1.10;
		}
		else if( this.carAgeInYears>=3 && this.carAgeInYears<=7) {
			premium=this.basePremium * 1.20;
		}
		else if( this.carAgeInYears>=7) {
			premium=this.basePremium * 1.30;
		}
		
		
		if(hadAccidentInLastYear==true) {
			premium=premium + (premium * 1.25);
		}
		else {
			premium=premium - (premium * 1.25);
		}
		
		if(this.carValue>1000000) {
			premium=premium+2000;
		}
		
		return premium;
		
	}
	
}//Class CarInsurance ends here


class HealthInsurance extends InsurancePolicy{

int age;
boolean isSmoker;
boolean hasPreExistingDisease;




HealthInsurance(String policyHolderName, double basePremium, int age, boolean isSmoker,
		boolean hasPreExistingDisease) {
	super(policyHolderName, basePremium);
	this.age = age;
	this.isSmoker = isSmoker;
	this.hasPreExistingDisease = hasPreExistingDisease;
}




double calculatePremium() {
	double premium=0.0;
	if(this.age<30) {
		premium=this.basePremium * 1.10;
	}
	else if( this.age>=30 && this.age<=45) {
		premium=this.basePremium * 1.25;
	}
	else if( this.age>45) {
		premium=this.basePremium * 1.30;
	}
	
	
	if(this.isSmoker==true) {
		premium=premium + (premium * 1.30);
	}
	else {
		premium=premium - (premium * 1.05);
	}
	
	if(hasPreExistingDisease==true) {
		premium=premium*1.20;
	}
	
	return premium;
	
}

}//class HealthInsurance Ends here

class TestInsurance{
	public static void main(String[] args) {
		InsurancePolicy[] irr=new InsurancePolicy[2];
		
		irr[0]= new CarInsurance("shrii",10000,4,true,500000);
		irr[1]= new HealthInsurance("shrii",10000,4,true,false);
		
		
		for(int i=0;i<irr.length;i++){
			irr[i].printPolicyDetails();
			System.out.println("________________________________");
		}
	}
}


	
