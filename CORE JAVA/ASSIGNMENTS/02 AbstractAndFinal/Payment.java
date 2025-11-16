package AbstractAndFinal;

abstract class Payment {
	long  paymentId;
	double amount;
	String payerName;
	String status;
	
	void printSummary() {
		System.out.println("Payment Id : " + this.paymentId);
		System.out.println("Amount  : " + this.amount);
		System.out.println("Payer Name: " + this.payerName);
		System.out.println("Payment Id : " + this.status);
	}
	
	final void process() {
		if(validate()) {
			amountDeduct();
			sendNotification();
			this.status="Success";
		}
		else {
			this.status="not Success";
		}
		
	}//final ends here
	
	abstract boolean validate();
	abstract void amountDeduct();
	abstract void sendNotification();


}// class Payment ends here

class CardPayment extends Payment{
	String cardNumber;
	String cvv;
	
	CardPayment(int paymentId, double amount, String payerName, String cardNumber, String cvv) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.payerName = payerName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }
	
	boolean validate(){
		if(this.cardNumber.length()==16 && this.cvv.length()==3 && this.amount>0) {
			System.out.println("Card Validated Succesfully....");
			return true;
			
			}
		else {
			System.out.println("Card NOT Validated....");
			return false;
		}
		
	}
	
	void amountDeduct() {
        System.out.println("Deducting amount from card...");
    }

   
    void sendNotification() {
        System.out.println("Sending card payment notification...");
    }

	
	
}//class CardPayment ends here

class UpiPayment extends Payment{
	String upiId;
	
	
	UpiPayment(int paymentId, double amount, String payerName, String cr) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.payerName = payerName;
        this.upiId=cr;
    }
	
	boolean validate() {
		if(upiId.contains("@") && this.amount>1 && this.amount <100000) {
			System.out.println("Upi Validated Succesfully....");
			return true;
		}
		else {
			return false;
		}
	}
	
	void amountDeduct() {
        System.out.println("Deducting amount from Upi...");
    }

   
    void sendNotification() {
        System.out.println("Sending card payment notification...");
    }
	
}

class TestPayment {
    public static void main(String[] args) {
        Payment[] prr = new Payment[4];
        
       prr[0] = new CardPayment(101, 1500, "Shrii", "1234567812345678", "123");
       prr[1]= new CardPayment(102, 500, "Shubbhh", "111122223333444", "12");
       prr[2] = new UpiPayment(103,200,"Reddy","Reddy@123");
       prr[3] = new UpiPayment(104, 150000, "David", "david@upi");

        

        for(int i=0;i< prr.length;i++) {
        	prr[i].process();
        	prr[i].printSummary();
        	System.out.println("_____________________________________");
    }
}
}

