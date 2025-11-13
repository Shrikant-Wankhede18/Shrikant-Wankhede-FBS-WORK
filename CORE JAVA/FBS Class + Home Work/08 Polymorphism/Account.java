package Polymorphism;

import java.util.*;
import java.time.*; 

class Account {
    int accNo;
    String accHolderName;
    double balance;
    double withdrawAmount;
    static String bankName = "SBI";
    
    

    int getAccNo() {
		return accNo;
	}

	 void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	String getAccHolderName() {
		return accHolderName;
	}

	 void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}

	double getWithdrawAmount() {
		return withdrawAmount;
	}

	void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	 static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}// Getters and Setters Ends Here

	Account() {
        this.accNo = 1001;
        this.accHolderName = "Om";
        this.balance = 50000;
        this.withdrawAmount=1000;
    }

    Account(int accNo, String accHolderName, double balance, double withdrawAmount) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }

    void display() {
        System.out.println("Bank : " + bankName);
        System.out.println("Account No : " + accNo);
        System.out.println("Account Holder : " + accHolderName);
        System.out.println("Balance : " + balance);
    }

    void withdraw() {
        System.out.println("Withdrawal started...");
    }
}// Class ACCount Ends Here


class SavingAccount extends Account {
    static double minBal = 1000;
    double interestRate;
    
    

    static double getMinBal() {
		return minBal;
	}

	static void setMinBal(double minBal) {
		SavingAccount.minBal = minBal;
	}

	double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}//getters and setters ends here
	
	SavingAccount(){
		super();
        this.interestRate = 12.5;
		
	}

	SavingAccount(int accNo, String name, double bal, double withdrawAmount, double interestRate) {
        super(accNo, name, bal, withdrawAmount);
        this.interestRate = interestRate;
    }// getters and setters ends here

    void withdraw() {
        if (this.balance - this.withdrawAmount < this.minBal) {
            System.out.println("Withdrawal Cancelled  minimum balance of " + this.minBal);
        } else {
            this.balance=this.balance- this.withdrawAmount;
            System.out.println("Withdrawn succesful : ");
            System.out.println("Remaining balance: " + this.balance);
            System.out.println("Withdrawal By :"+ this.accHolderName);
        } 
    }
}


class CurrentAccount extends Account {
    double overdraftLimit;
    
    

   double getOverdraftLimit() {
		return overdraftLimit;
	}//getters and setters ends here

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	CurrentAccount(int accNo, String name, double bal, double withdrawAmount, double overdraftLimit) {
        super(accNo, name, bal, withdrawAmount);
        this.overdraftLimit = overdraftLimit;
    }
    
    CurrentAccount() {
        super();
        this.overdraftLimit = 25000;
    }// constructors ends here

    void withdraw() {
        if (withdrawAmount <= balance + overdraftLimit) {
            this.balance=this.balance - withdrawAmount;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + this.balance);
            System.out.println("Withdrawal By :"+ this.accHolderName);
        } else {
            System.out.println("Withdrawal Canclled due to overdraft limit.");
        }
    }
}// Class currrent Account ends here


class SalaryAccount extends Account {
    LocalDate lastSalaryDate;
    
    

    LocalDate getLastSalaryDate() {
		return lastSalaryDate;
	}
	void setLastSalaryDate(LocalDate lastSalaryDate) {
		this.lastSalaryDate = lastSalaryDate;
	}// getters and setters ends here
	
	
	SalaryAccount(int accNo, String name, double bal, double withdrawAmount, LocalDate lastSalaryDate) {
        super(accNo, name, bal, withdrawAmount);
        this.lastSalaryDate = lastSalaryDate;
    }
    SalaryAccount() {
        super();
        this.lastSalaryDate = LocalDate.of(2025,11,23);
    }//constructors ends here

    
    int daysSinceSalary() {
        LocalDate today = LocalDate.now();
        Period p = Period.between(lastSalaryDate, today);
        return p.getDays() + (p.getMonths() * 30) + (p.getYears() * 365); 
    }

    void withdraw() {
        int days = daysSinceSalary();
        

        if (days < 60) {
            System.out.println("Withdraw cancelled");
        } else if (this.withdrawAmount > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            this.balance =this.balance- this.withdrawAmount;
            System.out.println("Withdrawal successful Remaining balance: " + this.balance);
            System.out.println("Withdrawal By :"+ this.accHolderName);
        }
    }
}


class TestAccount{
    public static void main(String[] args) {
    	
    	Account[] arr = new Account[3];
    	
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter amount to withdraw (Saving Account): ");
        double amt1 = sc.nextDouble();
        arr[0] = new SavingAccount(101, "Shri", 8000, amt1, 5.0);
       
        System.out.print("Enter amount to withdraw (Current Account): ");
        double amt2 = sc.nextDouble();
       arr[1] = new CurrentAccount(102, "Amit", 2000, amt2, 10000);
       
       System.out.print("Enter amount to withdraw (Salary Account): ");
        double amt3 = sc.nextDouble();

        LocalDate lastSalary = LocalDate.of(2025, 10, 20);
        arr[2] = new SalaryAccount(103, "Ravi", 30000, amt3, lastSalary);
    
        
        for(int i=0;i<arr.length;i++) {
        	arr[i].display();
        	arr[i].withdraw();

        }

        
    }
}
