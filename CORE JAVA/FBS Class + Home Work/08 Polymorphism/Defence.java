package Polymorphism;


class Defence {
	String countryName;
	int noOfHeadQuatrors;
	int noOfTroops;
	double budget;
	int noOfDepartments;
	int noOfVehicle;
	String locationOfHeadQuators;
	int manPower;
	int noOfMissionPerfomed;
	int noOfCasuality;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getNoOfHeadQuatrors() {
		return noOfHeadQuatrors;
	}
	public void setNoOfHeadQuatrors(int noOfHeadQuatrors) {
		this.noOfHeadQuatrors = noOfHeadQuatrors;
	}
	public int getNoOfTroops() {
		return noOfTroops;
	}
	public void setNoOfTroops(int noOfTroops) {
		this.noOfTroops = noOfTroops;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public int getNoOfDepartments() {
		return noOfDepartments;
	}
	public void setNoOfDepartments(int noOfDepartments) {
		this.noOfDepartments = noOfDepartments;
	}
	public int getNoOfVehicle() {
		return noOfVehicle;
	}
	public void setNoOfVehicle(int noOfVehicle) {
		this.noOfVehicle = noOfVehicle;
	}
	public String getLocationOfHeadQuators() {
		return locationOfHeadQuators;
	}
	public void setLocationOfHeadQuators(String locationOfHeadQuators) {
		this.locationOfHeadQuators = locationOfHeadQuators;
	}
	public int getManPower() {
		return manPower;
	}
	public void setManPower(int manPower) {
		this.manPower = manPower;
	}
	public int getNoOfMissionPerfomed() {
		return noOfMissionPerfomed;
	}
	public void setNoOfMissionPerfomed(int noOfMissionPerfomed) {
		this.noOfMissionPerfomed = noOfMissionPerfomed;
	}
	public int getNoOfCasuality() {
		return noOfCasuality;
	}
	public void setNoOfCasuality(int noOfCasuality) {
		this.noOfCasuality = noOfCasuality;
	}// getters and setters ends here
	
	Defence(){
		this.countryName = "Null";
		this.noOfHeadQuatrors =00;
		this.noOfTroops = 00;
		this.budget = 00;
		this.noOfDepartments = 00;
		this.noOfVehicle = 00;
		this.locationOfHeadQuators = "Null";
		this.manPower = 00;
		this.noOfMissionPerfomed = 00;
		this.noOfCasuality = 00;
	}
	
	
	Defence(String countryName, int noOfHeadQuatrors, int noOfTroops, double budget, int noOfDepartments,
			int noOfVehicle, String locationOfHeadQuators, int manPower, int noOfMissionPerfomed, int noOfCasuality) {
		
		this.countryName = countryName;
		this.noOfHeadQuatrors = noOfHeadQuatrors;
		this.noOfTroops = noOfTroops;
		this.budget = budget;
		this.noOfDepartments = noOfDepartments;
		this.noOfVehicle = noOfVehicle;
		this.locationOfHeadQuators = locationOfHeadQuators;
		this.manPower = manPower;
		this.noOfMissionPerfomed = noOfMissionPerfomed;
		this.noOfCasuality = noOfCasuality;
	}// constructors ends here
	
	
	void display() {
		
		System.out.println("Country Name :"+this.countryName);
		System.out.println("Country Name :"+this.noOfHeadQuatrors);
		System.out.println("Country Name :"+this.noOfTroops);
		System.out.println("Country Name :"+this.budget);
		System.out.println("Country Name :"+this.noOfDepartments);
		System.out.println("Country Name :"+this.noOfVehicle);
		System.out.println("Country Name :"+this.locationOfHeadQuators);
		System.out.println("Country Name :"+this.manPower);
		System.out.println("Country Name :"+this.noOfMissionPerfomed);
		System.out.println("Country Name :"+this.noOfCasuality);
		
	}
	
	
	void attack() {
		
		System.out.println("attack Mode Activated");
	}
	
	
}// class Defence ends here

class Army extends Defence{
	
	int noOfTank;
	int noOfGuns;
	int noOfGraneds;
	int noOfBatalians;
	
	public int getNoOfTank() {
		return noOfTank;
	}
	void setNoOfTank(int noOfTank) {
		this.noOfTank = noOfTank;
	}
	int getNoOfGuns() {
		return noOfGuns;
	}
	void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}
	 int getNoOfGraneds() {
		return noOfGraneds;
	}
	 void setNoOfGraneds(int noOfGraneds) {
		this.noOfGraneds = noOfGraneds;
	}
	int getNoOfBatalians() {
		return noOfBatalians;
	}
	void setNoOfBatalians(int noOfBatalians) {
		this.noOfBatalians = noOfBatalians;
	}// getters and setters ends here
	Army() {
		super();
		noOfTank=00;
		noOfGuns=0;
		noOfGraneds=00;
		noOfBatalians=00;
		
	}
	Army(String countryName, int noOfHeadQuatrors, int noOfTroops, double budget, int noOfDepartments,
			int noOfVehicle, String locationOfHeadQuators, int manPower, int noOfMissionPerfomed, int noOfCasuality,int nt,int ng,int nog,int nb) {
		super(countryName, noOfHeadQuatrors, noOfTroops, budget, noOfDepartments, noOfVehicle, locationOfHeadQuators, manPower,
				noOfMissionPerfomed, noOfCasuality);
		
		noOfTank=nt;
		noOfGuns=ng;
		noOfGraneds=nog;
		noOfBatalians=nb;
		
	}// constructors ends here
	
	void display() {
		super.display();
		System.out.println("No Of Tanks : " + this.noOfTank);
		System.out.println("No Of Guns : " + this.noOfGuns);
		System.out.println("No Of Greneds : " + this.noOfGraneds);
		System.out.println("No Of Batalians : " + this.noOfBatalians);
	}
	
	
void attack() {
		
		System.out.println("Army Attack on Ground");
	}
	
	
	
	
	
}// class army ends here

class Navy extends Defence{
	int noOfShips;
	int noOfSummariens;
	int noOfTorpidos;
	public int getNoOfShips() {
		return noOfShips;
	}
	void setNoOfShips(int noOfShips) {
		this.noOfShips = noOfShips;
	}
	int getNoOfSummariens() {
		return noOfSummariens;
	}
	void setNoOfSummariens(int noOfSummariens) {
		this.noOfSummariens = noOfSummariens;
	}
	int getNoOfTorpidos() {
		return noOfTorpidos;
	}
	void setNoOfTorpidos(int noOfTorpidos) {
		this.noOfTorpidos = noOfTorpidos;
	}// getters and setters ends here
	
	public Navy() {
		super();
		noOfShips=00;
		noOfSummariens=00;
		noOfTorpidos=00;
		
	}
	public Navy(String countryName, int noOfHeadQuatrors, int noOfTroops, double budget, int noOfDepartments,
			int noOfVehicle, String locationOfHeadQuators, int manPower, int noOfMissionPerfomed, int noOfCasuality,int ns,int nsu,int nt) {
		super(countryName, noOfHeadQuatrors, noOfTroops, budget, noOfDepartments, noOfVehicle, locationOfHeadQuators, manPower,
				noOfMissionPerfomed, noOfCasuality);
		
		noOfShips=ns;
		noOfSummariens=nsu;
		noOfTorpidos=nt;
	}// constructors ends here
	
	void display() {
		super.display();
		System.out.println("No Of Ships : " + this.noOfShips);
		System.out.println("No Of Summariens: " + this.noOfSummariens);
		System.out.println("No Of Torpidos : " + this.noOfTorpidos);
		
		
	}
	
	
void attack() {
		
		System.out.println("Navy Attacks with torpidos");
	}
	
	
	
	
	
}// class navy ends here

class Airforce extends Defence{
	int noOfMilliels;
	int noOfAircrafts;
	int noOfSquadrons;
	
	int getNoOfMilliels() {
		return noOfMilliels;
	}
	 void setNoOfMilliels(int noOfMilliels) {
		this.noOfMilliels = noOfMilliels;
	}
	int getNoOfAircrafts() {
		return noOfAircrafts;
	}
	void setNoOfAircrafts(int noOfAircrafts) {
		this.noOfAircrafts = noOfAircrafts;
	}
	int getNoOfSquadrons() {
		return noOfSquadrons;
	}
	void setNoOfSquadrons(int noOfSquadrons) {
		this.noOfSquadrons = noOfSquadrons;
	}// getters and setters ends here
	
	
	Airforce() {
		super();
		noOfMilliels=00;
		noOfAircrafts=00;
		noOfSquadrons=00;
	}
	Airforce(String countryName, int noOfHeadQuatrors, int noOfTroops, double budget, int noOfDepartments,
			int noOfVehicle, String locationOfHeadQuators, int manPower, int noOfMissionPerfomed, int noOfCasuality,int nm,int na,int ns) {
		super(countryName, noOfHeadQuatrors, noOfTroops, budget, noOfDepartments, noOfVehicle, locationOfHeadQuators, manPower,
				noOfMissionPerfomed, noOfCasuality);
		noOfMilliels=nm;
		noOfAircrafts=na;
		noOfSquadrons=ns;
	}//constructors ends here
	
	void display() {
		super.display();
		System.out.println("No Of noOfMilliels : " + this.noOfMilliels);
		System.out.println("No Of Aircraft : " + this.noOfAircrafts);
		System.out.println("No Of Squadrons : " + this.noOfSquadrons);
		
	}
	
void attack() {
		
		System.out.println("Airforce  Attacks with Jets");
	}
	
	
}// class Airforce ends Here

class TestDefence{
	
	public static void main(String[] args) {
		
		Defence a1= new Army("India",1234,23452,256241,26718,368716,"Mumbai",76865,77765,76,79876,786,7,876);
		a1.display();
		a1.attack();
		System.out.println("--------------------------------------------------");
		a1= new Navy("India",1234,23452,256241,26718,368716,"Mumbai",76865,77765,76,79876,786,7);
		a1.display();
		a1.attack();
		System.out.println("--------------------------------------------------");
		a1= new Airforce("India",1234,23452,256241,26718,368716,"Mumbai",76865,77765,76,79876,786,7);
		a1.display();
		a1.attack();
		
		
		
	}
}

