package Abstract;


abstract class Vehicle {
	String brand;
	String model;
	int noOfWheels;
	int engineCapacity;
	String fuelType;
	
	
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	int getEngineCapacity() {
		return engineCapacity;
	}
	void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	String getFuelType() {
		return fuelType;
	}
	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}//getters and setters ends here
	
	Vehicle(){
		this.brand="not given";
		this.model="not given";
		this.noOfWheels=00;
		this.engineCapacity=00;
		this.fuelType="not given";
	}
	
	Vehicle(String b,String m,int now,int cap,String f){
		this.brand=b;
		this.model=m;
		this.noOfWheels=now;
		this.engineCapacity=cap;
		this.fuelType=f;
	}
	
	
	
	abstract void brake();
	
	public String toString() {
		return "Brand: "+brand+" Model: "+model+" Wheels: "+noOfWheels+" Engine: "+engineCapacity+" Fuel: "+fuelType;
	}
	
}// class vehicle ends here



class Car extends Vehicle{
	boolean airBag;
	int noOfDoors;
	
	boolean isAirBag() {
		return airBag;
	}
	void setAirBag(boolean airBag) {
		this.airBag = airBag;
	}
	int getNoOfDoors() {
		return noOfDoors;
	}
	void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}//getters and setters ends here
	
	Car(){
		super();
		airBag=false;
		noOfDoors=00;
	}
	Car(String brand,String model,int noOfWheels,int engineCapacity,String fuelType,boolean a, int nod){
		super(brand,model,noOfWheels,engineCapacity,fuelType);
		airBag=a;
		noOfDoors=nod;
	}//constructor ends here
	
	
	
	void brake() {
		System.out.println("Drum Brake Applied");
	}
	
	public String toString() {
		return super.toString()+" AirBag: "+airBag+" Doors: "+noOfDoors;
	}
	
}//class Car ends here



class Truck extends Vehicle{
	boolean emergancyDoor;
	int noOfDoors;
	
	boolean isEmergancyDoor() {
		return emergancyDoor;
	}
	void setEmergancyDoor(boolean emergancyDoor) {
		this.emergancyDoor = emergancyDoor;
	}
	int getNoOfDoors() {
		return noOfDoors;
	}
	void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}//getters and setters ends here
	
	Truck(){
		super();
		emergancyDoor=false;
		noOfDoors=00;
	}
	Truck(String brand,String model,int noOfWheels,int engineCapacity,String fuelType,boolean a, int nod){
		super(brand,model,noOfWheels,engineCapacity,fuelType);
		emergancyDoor=a;
		noOfDoors=nod;
	}//constructor ends here
	
	
	
	void brake() {
		System.out.println(" Air Brake Applied");
	}
	
	public String toString() {
		return super.toString()+" EmergencyDoor: "+emergancyDoor+" Doors: "+noOfDoors;
	}
	
}//class Truck ends here



class Bike extends Vehicle{
	boolean stand;

	boolean isStand() {
		return stand;
	}

	 void setStand(boolean stand) {
		this.stand = stand;
	}//getters and setters ends here
	 
	 Bike(){
			super();
			stand=false;
		}
		
		Bike(String brand,String model,int noOfWheels,int engineCapacity,String fuelType,boolean a){
			super(brand,model,noOfWheels,engineCapacity,fuelType);
			stand=a;
		}//constructor ends here
		
		
		
		void brake() {
			System.out.println("Disc Brake Applied");
		}
	 
	 public String toString() {
		 return super.toString()+" Stand: "+stand;
	 }
}//class bike ends here



class TestVehicle{
	
	public static void main(String[] args) {
		
	    Vehicle[] vrr= new Vehicle[3];
	    		
	    vrr[0]= new Car("BMW","M5",4,2000,"Diesel",true,4);
		
		 
		vrr[1]=new Truck("Ashok Leyland","Eicher",12,3000,"Diesel",true,2);
		
		
		 
		vrr[2]=new Bike("Royal Enfield","Hunter",2,350,"petrol",true);
		
		
		for(int i=0;i<vrr.length;i++) {
			System.out.println(vrr[i].toString());
			vrr[i].brake();
			 System.out.println("------------------------------");
		}
		
	}
}
