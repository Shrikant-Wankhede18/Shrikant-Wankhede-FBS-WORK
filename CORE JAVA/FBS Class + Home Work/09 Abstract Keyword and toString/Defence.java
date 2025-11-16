package Abstract;


abstract class Defence {
    String countryName;
    int noOfHeadQuarters;
    int noOfTroops;
    double budget;
    int noOfDepartments;
    int noOfVehicles;
    String locationOfHeadQuarters;
    int manpower;
    int missionsPerformed;
    int casualties;

    // Constructors
    Defence() {
        this.countryName = "Unknown";
        this.noOfHeadQuarters = 0;
        this.noOfTroops = 0;
        this.budget = 0;
        this.noOfDepartments = 0;
        this.noOfVehicles = 0;
        this.locationOfHeadQuarters = "Unknown";
        this.manpower = 0;
        this.missionsPerformed = 0;
        this.casualties = 0;
    }

    Defence(String countryName, int hq, int troops, double budget, int departments,
            int vehicles, String location, int manpower, int missions, int casualties) {

        this.countryName = countryName;
        this.noOfHeadQuarters = hq;
        this.noOfTroops = troops;
        this.budget = budget;
        this.noOfDepartments = departments;
        this.noOfVehicles = vehicles;
        this.locationOfHeadQuarters = location;
        this.manpower = manpower;
        this.missionsPerformed = missions;
        this.casualties = casualties;
    }

    // Abstract Method
    abstract void attack();

    public String toString() {
        return "Country: " + countryName +
               "\nHeadQuarters: " + noOfHeadQuarters +
               "\nTroops: " + noOfTroops +
               "\nBudget: " + budget +
               "\nDepartments: " + noOfDepartments +
               "\nVehicles: " + noOfVehicles +
               "\nHQ Location: " + locationOfHeadQuarters +
               "\nManpower: " + manpower +
               "\nMissions Performed: " + missionsPerformed +
               "\nCasualties: " + casualties;
    }
}// class defence ends here


class Army extends Defence {
    int tanks;
    int guns;
    int grenades;
    int battalions;

    Army() {
        super();
        this.tanks = 0;
        this.guns = 0;
        this.grenades = 0;
        this.battalions = 0;
    }

    Army(String countryName, int hq, int troops, double budget, int departments, int vehicles,
         String location, int manpower, int missions, int casualties,
         int tanks, int guns, int grenades, int battalions) {

        super(countryName, hq, troops, budget, departments, vehicles, location,
              manpower, missions, casualties);

        this.tanks = tanks;
        this.guns = guns;
        this.grenades = grenades;
        this.battalions = battalions;
    }

    void attack() {
        System.out.println("Army attacks on ground with tanks and guns!");
    }

    public String toString() {
        return super.toString() +"\nTanks: " + tanks +"\nGuns: " + guns +"\nGrenades: " + grenades +"\nBattalions: " + battalions;
    }
}// class army ends here

class Navy extends Defence {
    int ships;
    int submarines;
    int torpedoes;

    Navy() {
        super();
        this.ships = 0;
        this.submarines = 0;
        this.torpedoes = 0;
    }

    Navy(String countryName, int hq, int troops, double budget, int departments, int vehicles,
         String location, int manpower, int missions, int casualties,
         int ships, int submarines, int torpedoes) {

        super(countryName, hq, troops, budget, departments, vehicles, location,
              manpower, missions, casualties);

        this.ships = ships;
        this.submarines = submarines;
        this.torpedoes = torpedoes;
    }

    void attack() {
        System.out.println("Navy launches torpedo attack from submarines!");
    }

    public String toString() {
        return super.toString() +"\nShips: " + ships +"\nSubmarines: " + submarines +"\nTorpedoes: " + torpedoes;
    }
}// class navy ends here


class Airforce extends Defence {
    int missiles;
    int aircrafts;
    int squadrons;

    Airforce() {
        super();
        this.missiles = 0;
        this.aircrafts = 0;
        this.squadrons = 0;
    }

    Airforce(String countryName, int hq, int troops, double budget, int departments, int vehicles,
             String location, int manpower, int missions, int casualties,
             int missiles, int aircrafts, int squadrons) {

        super(countryName, hq, troops, budget, departments, vehicles, location,
              manpower, missions, casualties);

        this.missiles = missiles;
        this.aircrafts = aircrafts;
        this.squadrons = squadrons;
    }

    void attack() {
        System.out.println("Airforce attacks from sky using jets and missiles!");
    }

    public String toString() {
        return super.toString() +"\nMissiles: " + missiles + "\nAircrafts: " + aircrafts +"\nSquadrons: " + squadrons;
    }
}

class TestDefence {
    public static void main(String[] args) {

        Defence[] arr = new Defence[3];

        arr[0] = new Army("India", 12, 1400000, 900000.0, 20, 50000, "Delhi", 1500000, 200, 5000, 4000, 10000, 7000, 50);

        arr[1] = new Navy("India", 8, 80000, 700000.0, 10, 20000,"Mumbai", 90000, 100, 1000,150, 20, 500);

        arr[2] = new Airforce("India", 10, 120000, 850000.0, 15, 30000,"Delhi", 130000, 150, 1500, 500, 300, 30);

        for (Defence d : arr) {
            System.out.println(d);
            d.attack();
            System.out.println("--------------------------------------------------");
        }
    }
}
