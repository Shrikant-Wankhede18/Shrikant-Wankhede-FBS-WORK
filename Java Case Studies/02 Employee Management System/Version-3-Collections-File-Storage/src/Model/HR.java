package Model;

import java.io.Serializable;


import Model.Employee;

public class HR extends Employee implements Serializable{

	double commission;
	
	public HR() {
		super();
		this.commission = 0;
	}
	
	
	public HR(int id, String name, double salary,double commission) {
		super(id,name,salary);
		this.commission = commission;
	}

	

	public double getCommission() {
		return commission;
	}


	public void setCommission(double commission) {
		this.commission = commission;
	}


	
	@Override
	public String toString() {
		
		return super.toString()+"/ncommission:" + commission;
	}


	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return this.getSalary()+this.commission;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


	


	

}
