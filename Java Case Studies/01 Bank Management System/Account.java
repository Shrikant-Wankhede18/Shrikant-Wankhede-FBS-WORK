package Bank;

import java.util.Date; 
import java.util.Scanner;





class Report {
	String message;
	Date txnDate;

	Report(String msg, Date date) {
		message = msg;
		txnDate = date;
	}

	void printReport() {
		System.out.println(message + " (" + txnDate + ")");
	}
}


// REPORT MANAGER STARTS

class ReportManager {
	void printAllReports(Account[] accounts, int totalAccounts) {
		System.out.println("===== ALL ACCOUNT REPORTS =====");
		for (int i = 0; i < totalAccounts; i++) {
			accounts[i].printDailyReport();
		}
	}
}//Class ReportManager Ends here


//BASE ACCOUNT

abstract class Account {
	static final String BRANCH = "Main";
	static final String IFSC = "IFSC001";

	long accNo;
	String name;
	double balance;
	Date lastTxn;

	Report[] reports = new Report[100];
	int repIndex = 0;

	Account(long accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.lastTxn = new Date();
	}

	void addReport(String msg) {
		if (repIndex < 100)
			reports[repIndex++] = new Report(msg, lastTxn);
	}

	abstract void deposit(double amt);

	abstract void withdraw(double amt);

	void printDailyReport() {
		System.out.println("---- Report Acc: " + accNo + " (" + name + ") ----");
		for (int i = 0; i < repIndex; i++)
			reports[i].printReport();
	}

	void printDetails() {
		System.out.println("Acc No: " + accNo);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
		System.out.println("Branch: " + BRANCH);
		System.out.println("IFSC: " + IFSC);
	}
}//class account ends here


//SAVINGS ACCOUNT

class SavingsAccount extends Account {
	static final double MIN_BAL = 1000;
	static final double INTEREST = 4.0;

	SavingsAccount(long accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	void deposit(double amt) {
		if (amt > 0) {
			balance =balance+ amt;
			lastTxn = new Date();
			addReport("Deposited: " + amt +"Balance is : " + balance);
			System.out.println("Depositted Succesfully.......");
		}
	}

	@Override
	void withdraw(double amt) {
		if (amt > 0 && balance - amt >= MIN_BAL) {
			balance =balance- amt;
			lastTxn = new Date();
			addReport("Withdrawn: " + amt + "Remaining Balance : " + balance);
			System.out.println("Withdrwal Succesfully.......");
		} else {
			System.out.println("Cannot withdraw below min balance!");
		}
	}

	@Override
	void printDetails() {
		System.out.println("---- Savings Account ----");
		super.printDetails();
		System.out.println("Min Balance: " + MIN_BAL);
		System.out.println("Interest Rate: " + INTEREST + "%");
	}
}// class Saving ends here


//SALARY ACCOUNT

class SalaryAccount extends Account {
	String employer;
	String empid;
	boolean frozen = false;

	SalaryAccount(long accNo, String name, double balance, String employer, String empid) {
		super(accNo, name, balance);
		this.employer = employer;
		this.empid = empid;
	}

	void checkFreeze(Date currentDate) {
		if (frozen)
			return;
		long diff = currentDate.getTime() - lastTxn.getTime();
		long days = diff / (1000 * 60 * 60 * 24);
		if (days >= 60) {
			frozen = true;
			System.out.println("Salary Account " + accNo + " is FROZEN due to inactivity!");
		}
	}

	void checkFreeze() {
		checkFreeze(new Date());
	}

	void deposit(double amt, Date currentDate) {
		checkFreeze(currentDate);
		if (frozen) {
			System.out.println("Cannot deposit. Account is frozen!");
			return;
		}
		if (amt > 0) {
			balance =balance + amt;
			lastTxn = currentDate;
			addReport("Deposited: " + amt +"Balance is : "+balance);
			System.out.println("Depositted Succesfully.......");
			frozen = false;
		}
	}

	@Override
	void deposit(double amt) {
		deposit(amt, new Date());
	}

	@Override
	void withdraw(double amt) {
		checkFreeze();
		if (frozen) {
			System.out.println("Cannot withdraw. Account is frozen!");
			return;
		}
		if (amt > 0 && amt <= balance) {
			balance =balance- amt;
			lastTxn = new Date();
			addReport("Withdrawn: " + amt + "Remaining Balance : "+balance);
			System.out.println("Withdrawal Succesfully.......");
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	@Override
	void printDetails() {
		System.out.println("---- Salary Account ----");
		super.printDetails();
		System.out.println("Employer: " + employer);
		System.out.println("Employee ID: " + empid);
		System.out.println("Status: " + (frozen ? "FROZEN" : "ACTIVE"));
	}
}//class salary ends here


//CURRENT ACCOUNT

class CurrentAccount extends Account {
	double overdraft;
	String businessType;

	CurrentAccount(long accNo, String name, double balance, double od, String type) {
		super(accNo, name, balance);
		overdraft = od;
		businessType = type;
	}

	@Override
	void deposit(double amt) {
		if (amt > 0) {
			balance =balance+ amt;
			lastTxn = new Date();
			addReport("Deposited: " + amt +"Balance is : " + balance);
			System.out.println("Depositted Succesfully.......");
		}
	}

	@Override
	void withdraw(double amt) {
		if (amt > 0 && amt <= balance + overdraft) {
			balance =balance- amt;
			lastTxn = new Date();
			addReport("Withdrawn: " + amt + " (OD)"+ "Remining Balance :"+balance);
			System.out.println("Withdrawal Succesfully.......");
		} else {
			System.out.println("Cannot withdraw. Overdraft limit reached!");
		}
	}

	@Override
	void printDetails() {
		System.out.println("---- Current Account ----");
		super.printDetails();
		System.out.println("Overdraft Limit: " + overdraft);
		System.out.println("Business Type: " + businessType);
	}
}// current accout ends here


//LOAN ACCOUNT

class LoanAccount extends Account {
	double loanAmount;
	double emi;
	int months;
	int monthsPaid;
	double interestRate;

	LoanAccount(long accNo, String name) {
		super(accNo, name, 0);
	} 

	void issueLoan(double amount, int months, double rate) {
		loanAmount = amount;
		this.months = months;
		monthsPaid = 0;
		interestRate = rate;
		emi = (amount + amount * rate / 100) / months;
		balance =balance- amount;
		addReport("Loan issued: " + amount + ", EMI: " + emi +"Remaining lon : "+balance);
	}

	void payEMI() {
		if (monthsPaid < months) {
			balance =balance+ emi;
			monthsPaid++;
			addReport("EMI Paid: " + emi + " Month: " + monthsPaid + "/" + months);
			System.out.println("EMI Paid: " + emi + ", Remaining Months: " + (months - monthsPaid));
			if (monthsPaid == months)
				addReport("Loan Completed");
		} else {
			System.out.println("All EMIs already paid!");
		}
	}

	void payFullLoan() {
		double totalPayable = (loanAmount + loanAmount * interestRate / 100) - (emi * monthsPaid);
		balance += totalPayable;
		monthsPaid = months;
		addReport("Loan fully paid: " + totalPayable);
		System.out.println("Loan fully paid: " + totalPayable);
	}

	@Override
	void deposit(double amt) {
		System.out.println("Cannot deposit in loan account. Use payEMI or payFullLoan.");
	}

	@Override
	void withdraw(double amt) {
		System.out.println("Cannot withdraw from loan account.");
	}

	void printLoanInfo() {
		System.out.println("---- Loan Info ----");
		System.out.println("Loan Amount: " + loanAmount);
		System.out.println("Months: " + months);
		System.out.println("EMI: " + emi);
		System.out.println("Months Paid: " + monthsPaid);
		System.out.println("Interest Rate: " + interestRate + "%");
	}

	@Override
	void printDetails() {
		System.out.println("---- Loan Account ----");
		super.printDetails();
		printLoanInfo();
	}
}//loan Accounts Ends here



//Class Bank

class Bank {
	
	 ReportManager p1=new ReportManager();
	 
	 
   Account[] accounts = new Account[500];
  int index = 0;
    
  long[] createdAccLog = new long[500];
  int createdIndex = 0;

  long[] deletedAccLog = new long[500];
  int deletedIndex = 0;

    long nextSavingsAcc = 1000000001L;
    long nextSalaryAcc  = 2000000001L;
    long nextCurrentAcc = 3000000001L;
    long nextLoanAcc    = 4000000001L;

    // ------------ Generate Account Number ------------
    long generateAccNo(int type) {
        if (type == 1) return nextSavingsAcc++;
        else if (type == 2) return nextSalaryAcc++;
        else if (type == 3) return nextCurrentAcc++;
        else return nextLoanAcc++;
    }

    // ------------ Add Account ------------
    void addAccount(Account a) {
        if (index < accounts.length) {
            accounts[index++] = a;
            System.out.println("Account Created! Acc No: " + a.accNo);
            createdAccLog[createdIndex++]=a.accNo;
        }
    }

    // ------------ Delete Account ------------
    boolean deleteAccount(long acc) {
        for (int i = 0; i < index; i++) {
            if (accounts[i].accNo == acc) {
                accounts[i] = accounts[index - 1];
                accounts[index - 1] = null;
                index--;
                deletedAccLog[deletedIndex++]= acc;
                return true;
            }
        }
        return false;
    }

    // ------------ Find Account ------------
    Account findAccount(long acc) {
        for (int i = 0; i < index; i++)
            if (accounts[i].accNo == acc)
                return accounts[i];
        return null;
    }

    // ------------ View all Reports ------------
    void printAllReports() {
        System.out.println("===== ALL ACCOUNT REPORTS =====");
        for (int i = 0; i < index; i++)
            accounts[i].printDailyReport();
    }
    
    void printBankReport() {
        p1.printAllReports(accounts, index);
    }
   
    
    
}//class bank ends here




//controller starts
class Controller{
	Scanner sc = new Scanner(System.in);
	Bank bank= new Bank();
	
	
	void createAccount() {
		 System.out.println("\nSelect Account Type:");
	        System.out.println("1. Savings");
	        System.out.println("2. Salary");
	        System.out.println("3. Current");
	        System.out.print("Enter type: ");
	        int type = sc.nextInt();

	        long accNo = bank.generateAccNo(type);

	        if (type == 1) {
	            System.out.print("Enter name: ");
	            String name = sc.next();
	            System.out.print("Enter initial balance: ");
	            double bal = sc.nextDouble();

	            bank.addAccount(new SavingsAccount(accNo, name, bal));
	        }
	        else if (type == 2) {
	            System.out.print("Enter name: ");
	            String name = sc.next();
	            System.out.print("Enter initial balance: ");
	            double bal = sc.nextDouble();
	            System.out.print("Enter employer: ");
	            String emp = sc.next();
	            System.out.print("Enter employee ID: ");
	            String id = sc.next();

	            bank.addAccount(new SalaryAccount(accNo, name, bal, emp, id));
	        }
	        else if (type == 3) {
	            System.out.print("Enter name: ");
	            String name = sc.next();
	            System.out.print("Enter initial balance: ");
	            double bal = sc.nextDouble();
	            System.out.print("Enter overdraft limit: ");
	            double od = sc.nextDouble();
	            System.out.print("Enter business type: ");
	            String bt = sc.next();

	            bank.addAccount(new CurrentAccount(accNo, name, bal, od, bt));
	        }
	        else {
	        	System.out.println("Envalid Choice! Please enter valid choice");
	        }
	       
	    }
	
	
	
	
	void deleteAccountFlow() {
	        System.out.print("Acc No: ");
	        long acc = sc.nextLong();
	        if (bank.deleteAccount(acc)) {
	        	System.out.println("Deleted!");
	        }
	        else {
	        	System.out.println("Account not found.");
	        }
	    }

	    void depositFlow() {
	        System.out.print("Acc No: ");
	        long acc = sc.nextLong();
	        Account a = bank.findAccount(acc);
	        if (a == null) return;

	        System.out.print("Amount: ");
	        double amt = sc.nextDouble();
	        

	        

	        if (a instanceof SalaryAccount) {
	        	SalaryAccount sa =(SalaryAccount) a;
	        	System.out.print("Simulated Current Date (yyyy mm dd): ");
		        int y = sc.nextInt();
		        int m = sc.nextInt();
		        int d = sc.nextInt();
		        Date currentDate = new Date(y - 1900, m - 1, d);
	            sa.deposit(amt, currentDate);
	            
	        } else {
	            a.deposit(amt);
	        }
	    }

	   void withdraw(){
	        System.out.print("Acc No: ");
	        long acc = sc.nextLong();
	        Account a = bank.findAccount(acc);
	        if (a == null) return;
	        System.out.print("Amount: ");
	        double amt = sc.nextDouble();
	        a.withdraw(amt);
	       
	    }
	
	
	void applyForLoan() {
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Debts: ");
        double debt = sc.nextDouble();
        System.out.print("Requested Loan: ");
        double reqLoan = sc.nextDouble();
        double maxLoan = salary * 10 - debt;
        if (reqLoan > maxLoan) {
            System.out.println("Loan exceeds eligibility!");
            return;
        }
        System.out.println("EMI Duration 1)6 2)12 3)24 months");
        int ch = sc.nextInt();
        int months;
        if (ch == 1) months = 6;
        else if (ch == 2) months = 12;
        else if (ch == 3) months = 24;
        else months = 12;

        double rate = months <= 12 ? 8.0 : 10.0;

        LoanAccount la = new LoanAccount(bank.generateAccNo(4), name);
        la.issueLoan(reqLoan, months, rate);
        bank.addAccount(la);
    }

    void payEMI() {
        System.out.print("Acc No: ");
        long acc = sc.nextLong();
        LoanAccount la = (LoanAccount) bank.findAccount(acc);
        if (la != null) la.payEMI();
    }

    void payFullLoan() {
        System.out.print("Acc No: ");
        long acc = sc.nextLong();
        LoanAccount la = (LoanAccount) bank.findAccount(acc);
        if (la != null) la.payFullLoan();
    }

     void loanInfo() {
        System.out.print("Acc No: ");
        long acc = sc.nextLong();
        LoanAccount la = (LoanAccount) bank.findAccount(acc);
        if (la != null) la.printLoanInfo();
    }

    void dailyReport() {
        System.out.print("Acc No: ");
        long acc = sc.nextLong();
        Account a = bank.findAccount(acc);
        if (a != null) a.printDailyReport();
    }

    void showAccountDetails() {
        System.out.print("Enter Account Number: ");
        long acc = sc.nextLong();
        Account a = bank.findAccount(acc);
        if (a != null) {
        	a.printDetails();
        }
        else {
        	System.out.println("Account not found!");
        }
    }

    
    void printAccountHistory() {
        System.out.println("\n===== ACCOUNT HISTORY =====");

        System.out.println("\n--- Created Accounts ---");
        for (int i = 0; i < bank.createdIndex; i++)
            System.out.println("Created: " + bank.createdAccLog[i]);

        System.out.println("\n--- Deleted Accounts ---");
        for (int i = 0; i < bank.deletedIndex; i++)
            System.out.println("Deleted: " + bank.deletedAccLog[i]);
    }
    
    void printBankReport() {
    	     bank.printBankReport();
    }

	
	
	
}//class controller ends here



class Test{
	

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
	Controller c1= new Controller();

	
	System.out.println("╔══════════════════════════════════════╗");
	System.out.println("║          BANK MANAGEMENT SYSTEM      ║");
	System.out.println("║                                      ║");
	System.out.println("║          Press 'S' to Start          ║");
	System.out.println("╚══════════════════════════════════════╝");
	char ah = sc.next().toUpperCase().charAt(0);


	
	while(true) {
		
		if(ah=='S' || ah=='s') {
			System.out.println("-----Welome to Bank Management System-----");
			
			System.out.println("Press the Below buttons For your Work");
			
			 System.out.println("\n===== BANK MENU =====");
	            System.out.println("1. Create Account");
	            System.out.println("2. Delete Account");
	            System.out.println("3. Deposit");
	            System.out.println("4. Withdraw");
	            System.out.println("5. Request Loan");
	            System.out.println("6. Pay EMI");
	            System.out.println("7. Pay Full Loan");
	            System.out.println("8. Loan Info");
	            System.out.println("9. Daily Report");
	            System.out.println("10. Bank Daily Report");
	            System.out.println("11. Show Account Details");
	            System.out.println("12. Show Created/Deleted Accounts");
	            System.out.println("0. Exit");
	            System.out.print("Enter choice: ");

	            int ch = sc.nextInt();
	            if (ch == 0) break;
	            else if (ch == 1) c1.createAccount();
	            else if (ch == 2) c1.deleteAccountFlow();
	            else if (ch == 3) c1.depositFlow();
	            else if (ch == 4) c1.withdraw();
	            else if (ch == 5) c1.applyForLoan();
	            else if (ch == 6) c1.payEMI();
	            else if (ch == 7) c1.payFullLoan();
	            else if (ch == 8) c1.loanInfo();
	            else if (ch == 9) c1.dailyReport();
	            else if (ch == 10) c1. printBankReport();
	            else if (ch == 11) c1.showAccountDetails();
	            else if (ch == 12) c1.printAccountHistory();
			
			}
		
		}
	}
}




