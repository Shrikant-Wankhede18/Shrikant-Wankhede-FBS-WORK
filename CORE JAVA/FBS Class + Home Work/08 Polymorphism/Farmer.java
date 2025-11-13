package Polymorphism;


class Farmer {
	String farmerName;
	int farmerId;
	String location;
	int experienceYear;
	double landArea;
	
	String getFarmerName() {
		return farmerName;
	}
	void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	int getFarmerId() {
		return farmerId;
	}
	void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
    String getLocation() {
		return location;
	}
	void setLocation(String location) {
		this.location = location;
	}
	int getExperienceYear() {
		return experienceYear;
	}
	void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}

	
	public double getLandArea() {
		return landArea;
	}
	public void setLandArea(double landArea) {
		this.landArea = landArea;
	}	// getters and setters ends here
	Farmer() {
		this.farmerName = "Null";
		this.farmerId = 00;
		this.location = "Null";
		this.experienceYear = 00;
		this.landArea=00;
	}
	
	
	    Farmer(String fn, int fid, String loc, int ey,double la) {
		this.farmerName = fn;
		this.farmerId = fid;
		this.location = loc;
		this.experienceYear = ey;
		this.landArea=la;
	}// constructors ends here
	    
	    void display() {
	    	System.out.println("Farmer Name :" +this.farmerName);
	    	System.out.println("Farmer Id :" +this.farmerId);
	    	System.out.println("Farm Location :" +this.location);
	    	System.out.println("Experience :" +this.experienceYear);
	    	System.out.println("Land Area :" +this.landArea);
	    	
	   }
	    
	    void produce() {
	    	System.out.println("produced goods");
	    }
	    
	    void calSubsidy() {
	    	System.out.println("Subsidy given");
	    	
	    }
	
	
}//class Farmer ends here

class DairyFarm extends Farmer{
	int noOFCattels;
	int milkProductionPerDay;
	String dairyFarmName;
	
	int getNoOFCattels() {
		return noOFCattels;
	}
	void setNoOFCattels(int noOFCattels) {
		this.noOFCattels = noOFCattels;
	}
	int getMilkProductionPerDay() {
		return milkProductionPerDay;
	}
	void setMilkProductionPerDay(int milkProductionPerDay) {
		this.milkProductionPerDay = milkProductionPerDay;
	}
	String getDairyFarmName() {
		return dairyFarmName;
	}
	void setDairyFarmName(String dairyFarmName) {
		this.dairyFarmName = dairyFarmName;
	}// getters and setters ends here
	DairyFarm() {
		super();
		noOFCattels=00;
		milkProductionPerDay=00;
		dairyFarmName="Null";
		
	}
	DairyFarm(String fn, int fid, String loc, int ey,double la,int nc,int mp,String dfn) {
		super(fn, fid, loc, ey,la);
		noOFCattels=nc;
		milkProductionPerDay=mp;
		dairyFarmName=dfn;
		
      }// constructors ends here
	
	void display() {
		super.display();
		System.out.println("no Of Cattels : "+this.noOFCattels);
		System.out.println("no Of Cattels : "+this.milkProductionPerDay);
		System.out.println("no Of Cattels : "+this.dairyFarmName);
		
	}
	
	
	void calSubsidy() {
    	System.out.println("Subsidy Recived on the Basis nof buffalos ");
    	
    }
	
	
}// class DairyFarm ends here
class PoultryFarm extends Farmer{
	int noOfChickens;
	int noOfShades;
	int noOfEggsProduction;
	int noOfHens;
	String poultryFarmName;
	public int getNoOfChickens() {
		return noOfChickens;
	}
	public void setNoOfChickens(int noOfChickens) {
		this.noOfChickens = noOfChickens;
	}
	public int getNoOfShades() {
		return noOfShades;
	}
	public void setNoOfShades(int noOfShades) {
		this.noOfShades = noOfShades;
	}
	public int getNoOfEggsProduction() {
		return noOfEggsProduction;
	}
	public void setNoOfEggsProduction(int noOfEggsProduction) {
		this.noOfEggsProduction = noOfEggsProduction;
	}
	public int getNoOfHens() {
		return noOfHens;
	}
	public void setNoOfHens(int noOfHens) {
		this.noOfHens = noOfHens;
	}
	public String getPoultryFarmName() {
		return poultryFarmName;
	}
	public void setPoultryFarmName(String poultryFarmName) {
		this.poultryFarmName = poultryFarmName;
	}//getters and setters ends here
	
	
	PoultryFarm() {
		super();
		 noOfChickens=00;
		noOfShades=00;
		noOfEggsProduction=00;
		noOfHens=00;
		poultryFarmName="Null";
	}
	PoultryFarm(String fn, int fid, String loc, int ey, double la,int a,int b,int c,int d,String e) {
		super(fn, fid, loc, ey, la);
		noOfChickens=a;
		noOfShades=b;
		noOfEggsProduction=c;
		noOfHens=d;
		poultryFarmName=e;
	}
	
	void display() {
		super.display();
		System.out.println("no Of chickens : "+this.noOfChickens);
		System.out.println("no Of Shades : "+this.noOfShades);
		System.out.println("no Of Eggs Production : "+this.noOfEggsProduction);
		System.out.println("no Of hens : "+this.noOfHens);
		System.out.println("Poultry Farm Name : "+this.poultryFarmName);
	}
	
	
	void calSubsidy() {
    	System.out.println("Subsidy Recived on the Basis nof Hens ");
    	
    }
	
	
}//class Poultryfarm ends here

class OrganicFarm extends Farmer{
	int organicFarmId;
	String cropType;
	int fertilization;
	public int getOrganicFarmId() {
		return organicFarmId;
	}
	public void setOrganicFarmId(int organicFarmId) {
		this.organicFarmId = organicFarmId;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	public int getFertilization() {
		return fertilization;
	}
	public void setFertilization(int fertilization) {
		this.fertilization = fertilization;
	}// getters and setters ends here
	
	
	OrganicFarm() {
		super();
		organicFarmId=00;
		cropType="Null";
		fertilization=00;
	}
	OrganicFarm(String fn, int fid, String loc, int ey, double la,int a,String b,int c) {
		super(fn, fid, loc, ey, la);
		organicFarmId=a;
		cropType=b;
		fertilization=c;
	}//constructors ends here
	
	void display() {
		super.display();
		System.out.println("Ogrnanic Farm id : "+this.organicFarmId);
		System.out.println("Crop Type : "+this.cropType);
		System.out.println("fertilization : "+this.fertilization);
		
		
	}
	
	
	void calSubsidy() {
    	System.out.println("Subsidy Recived on the Basis nof crop ");
    	
    }
	
	
	
}// class Organic ends here


class TestFarmer{
	public static void main(String[] args) {
		
		Farmer of1= new OrganicFarm();
		of1.display();
		of1.calSubsidy();
		
		
		of1= new PoultryFarm();
		of1.calSubsidy();
		
		of1= new DairyFarm();
		of1.calSubsidy();
		
		
	}
}
