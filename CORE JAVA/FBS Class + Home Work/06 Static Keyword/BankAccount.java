import java.util.Scanner; 
class BankAccount{
	int accountNumber;
	String accHolderName;
	double currentBalance;
	static double interestRate;


static{

    interestRate=10.5;

}

	BankAccount() {
        	this.accountNumber = 0;
        	this.accHolderName = "Not Assigned";
        	this.currentBalance = 0.0;
                //this.interestRate = 0.0;
    	}

    	// Parameterized constructor
    	BankAccount(int accountNumber, String accHolderName, double currentBalance,double i) {
        	this.accountNumber = accountNumber;
        	this.accHolderName = accHolderName;
        	this.currentBalance = currentBalance;
              this.interestRate = i;
    	}

 
    	int getAccountNumber() {
        	return this.accountNumber;
    	}

    	String getAccHolderName() {
        	return this.accHolderName;
    	}

  	double getCurrentBalance() {
        	return this.currentBalance;
    	}

    	double getInterestRate() {
        	return this.interestRate;
    	}


    	void setAccountNumber(int accountNumber) {
    	    this.accountNumber = accountNumber;
    	}

    	void setAccHolderName(String accHolderName) {
        	this.accHolderName = accHolderName;
    	}

    	void setCurrentBalance(double currentBalance) {
        	this.currentBalance = currentBalance;
    	}

    	static void setInterestRate(double i) {
           System.out.print("a");
        	interestRate = i;
    	}

    	void display() {

                System.out.println("----------------------------------------");

        	System.out.println("Account Number: " + accountNumber);
        	System.out.println("Account Holder Name: " + accHolderName);
        	System.out.println("Current Balance: " + currentBalance);
        	System.out.println("Interest Rate: " + interestRate + "%");
             System.out.println("----------------------------------------");
    	}
}
class Test{
	public static void main(String[] args){
		
BankAccount b1,b2,b3;
b1=new BankAccount();
b2=new BankAccount();
b3=new BankAccount();


b1=new BankAccount(102,"tejas",4557,11);
//b1.display();


b2=new BankAccount(101,"shubham",34565,12);
b2.display();


BankAccount.setInterestRate(8.7);
b1.display();


	}
} 