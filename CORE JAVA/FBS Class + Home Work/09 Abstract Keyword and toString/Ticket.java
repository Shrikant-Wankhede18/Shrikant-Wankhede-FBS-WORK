package Abstract;

abstract class Ticket {
	int ticketId;
	double ticketPrice;
	String seatNo;
	int getTicketId() {
		return ticketId;
	}
	void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	double getTicketPrice() {
		return ticketPrice;
	}
	void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	String getSeatNo() {
		return seatNo;
	}
	void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}//getters and setters ends here
	
	Ticket(){
		this.ticketId=00;
		this.ticketPrice=00;
		this.seatNo="Null";
		
	}
	
	Ticket(int i,double p,String s){
		this.ticketId=i;
		this.ticketPrice=p;
		this.seatNo=s;
		
	}//constructors ends here
	
	
	abstract void book();
	
	public String toString() {
		return "Ticket id :" +this.ticketId + "\nTicket Price :" +this.ticketPrice + "\nSeat No :" +this.seatNo;
	}

}

class BusTicket extends Ticket{
	int busNo;

	int getBusNo() {
		return busNo;
	}

	void setBusNo(int busNo) {
		this.busNo = busNo;
	}//getters and setters ends here
	
	BusTicket(){
		super();
		busNo=00;
	}
	
	BusTicket(int ti,double p,String sn,int bn){
		super(ti,p,sn);
		busNo=bn;
	}
	
	
	
	public String toString() {
		return super.toString()+"\nBus no :"+this.busNo;
	}
	
	void book() {
		System.out.println("Bus Ticket Booked Bus No :"+ this.busNo +"Seat No"+this.seatNo);
	}
	
}//class bus ends here

class TrainTicket extends Ticket{
	int trainNo;
	String coachNO;
	
	int getTrainNo() {
		return trainNo;
	}
	void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	String getCoachNO() {
		return coachNO;
	}
	void setCoachNO(String coachNO) {
		this.coachNO = coachNO;
	}//getters and setter ends here
	
	TrainTicket(){
		super();
		this.trainNo=00;
		this.coachNO="Null";
	}
	
	TrainTicket(int ti,double p,String sn,int bn,String cn){
		super(ti,p,sn);
		trainNo=bn;
		this.coachNO=cn;
	}//constructors ends here
	
	
	
	public String toString() {
		return super.toString()+"\nTrain no :"+this.trainNo +"\nCoach no :"+this.coachNO;
	}
	
	void book() {
		System.out.println("Train Ticket Booked Train No :"+ this.trainNo +"Coach No : "+this.coachNO+ "Seat No"+this.seatNo);
	}
	
}//class TrainTicket ends here

class FlightTicket extends Ticket{
	int gateNo;

	int getGateNo() {
		return gateNo;
	}

	void setGateNo(int gateNo) {
		this.gateNo = gateNo;
	}//getters and setters ends here
	

	FlightTicket(){
		super();
		this.gateNo=00;
		
	}
	
	FlightTicket(int ti,double p,String sn,int bn){
		super(ti,p,sn);
		gateNo=bn;
	}//constructors ends here
	
	
	
	public String toString() {
		return super.toString()+ "Gate no :"+this.gateNo;
	}
	
	void book() {
	System.out.println("Flight Ticket Booked gate No :"+ this.gateNo +"Seat No"+this.seatNo);
}
}

class TestTicket{
	public static void main(String[] args) {
		Ticket[] trr =new Ticket[3];
		
		 trr[0]= new BusTicket(101,2550.87,"36",123);
		
		 trr[1]= new TrainTicket(101,2550.87,"32",123,"S2");
		
		trr[2]= new FlightTicket(101,2550.87,"GEN11",12);
		
		for(int i=0;i<trr.length;i++) {
			
			System.out.println(trr[i].toString());
			trr[i].book();
			System.out.println("_____________________________________");
		}
		
		
		
	}
}


