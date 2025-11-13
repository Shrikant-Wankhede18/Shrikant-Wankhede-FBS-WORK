package Polymorphism;

class MusicalInstrument {
    String name;
    String type;
    double price;

    MusicalInstrument() {
        name = "Unknown";
        type = "General";
        price = 0.0;
    }

    MusicalInstrument(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    String getType() {
        return type;
    }
    void setType(String type) {
        this.type = type;
    }
    double getPrice() {
        return price;
    }
    void setPrice(double price) {
        this.price = price;
    }

    void display() {
        System.out.println("Instrument Name : " + this.name);
        System.out.println("Type : " + this.type);
        System.out.println("Price : " + this.price);
    }

    void playSound() {
        System.out.println("Playing a musical instrument sound...");
    }
}//class MusicalInstuments End here

class Guitar extends MusicalInstrument {
    int numberOfStrings;

    Guitar() {
        super();
        numberOfStrings = 0;
    }

    Guitar(String name, String type, double price, int numberOfStrings) {
        super(name, type, price);
        this.numberOfStrings = numberOfStrings;
    }
    
    public int getNumberOfStrings() {
		return numberOfStrings;
	}

	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}

	void display() {
        super.display();
        System.out.println("Number of Strings : " + this.numberOfStrings);
    }

    void playSound() {
        System.out.println(" Guitar is strumming...");
    }
}//class Guitar End here

class Piano extends MusicalInstrument {
    int numberOfKeys;

    Piano() {
        super();
        numberOfKeys = 0;
    }

    Piano(String name, String type, double price, int numberOfKeys) {
        super(name, type, price);
        this.numberOfKeys = numberOfKeys;
    }
    
    public int getNumberOfKeys() {
		return numberOfKeys;
	}

	public void setNumberOfKeys(int numberOfKeys) {
		this.numberOfKeys = numberOfKeys;
	}

	void display() {
        super.display();
        System.out.println("Number of Keys : " + this.numberOfKeys);
    }

    void playSound() {
        System.out.println("Piano is playing a melody...");
    }
}

class Flute extends MusicalInstrument {
    String material;

    Flute() {
        super();
        material = "Unknown";
    }

    Flute(String name, String type, double price, String material) {
        super(name, type, price);
        this.material = material;
    }

    public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	void display() {
        super.display();
        System.out.println("Material : " + this.material);
    }

    void playSound() {
        System.out.println("Flute is producing a soothing tone...");
    }
}//class Flute End here

class TestInstrument {
    public static void main(String[] args) {
    	
    	MusicalInstrument[] mrr=new  MusicalInstrument [3];
    	
        mrr[0] = new Guitar("Yamaha F310", "String", 8500, 6);
       

        mrr[1] = new Piano("Casio CTK-3500", "Keyboard", 12000, 61);
        

        mrr[2] = new Flute("Bamboo Flute", "Wind", 800, "Bamboo");
        
        for(int i=0;i<mrr.length;i++) {
        	mrr[i].display();
        	mrr[i].playSound();
        }
       
    }
}
