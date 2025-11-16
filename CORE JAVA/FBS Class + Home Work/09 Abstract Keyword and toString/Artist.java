package Abstract;


abstract class Artist {
    String name;
    String artStyle;
    
    

   String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getArtStyle() {
		return artStyle;
	}

	void setArtStyle(String artStyle) {
		this.artStyle = artStyle;
	}// Getters And Setters Ends Here

	Artist() {
        this.name = "Unknown Artist";
        this.artStyle = "General Art";
    }

    Artist(String name, String artStyle) {
        this.name = name;
        this.artStyle = artStyle;
    }// Constructors Ends here

   abstract  void perform();

    
    public String toString() {
    	return "Name: " + name +"Art Style: " + artStyle;
    }
}// class Artist Ends Here

class Singer extends Artist {
    String genre;
    String famousSong;
    
    

   String getGenre() {
		return genre;
	}

	void setGenre(String genre) {
		this.genre = genre;
	}

	String getFamousSong() {
		return famousSong;
	}

	void setFamousSong(String famousSong) {
		this.famousSong = famousSong;
	}// Getters And SEtters ends here

	Singer() {
        super();
        this.genre = "Classical";
        this.famousSong = "Unknown";
    }

    Singer(String name, String artStyle, String genre, String famousSong) {
        super(name, artStyle);
        this.genre = genre;
        this.famousSong = famousSong;
    }

    void perform() {
        System.out.println(name + " is singing a " + genre + " song: \"" + famousSong + "\".");
    }

   
    
    public String toString() {
    	return super.toString()+"Genre: " + this.genre + "Famous Song: " + this.famousSong;
    }
}// Class Singer ends here

class Painter extends Artist {
    String paintingStyle;
    String famousPainting;
    
    

   String getPaintingStyle() {
		return paintingStyle;
	}

	void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}

	String getFamousPainting() {
		return famousPainting;
	}

	void setFamousPainting(String famousPainting) {
		this.famousPainting = famousPainting;
	}// Getters And Setters End here

	Painter() {
        super();
        this.paintingStyle = "Modern";
        this.famousPainting = "Untitled";
    }

    Painter(String name, String artStyle, String paintingStyle, String famousPainting) {
        super(name, artStyle);
        this.paintingStyle = paintingStyle;
        this.famousPainting = famousPainting;
    }//Coonstructors end here

    void perform() {
        System.out.println(name + " is painting a masterpiece in " + paintingStyle + " style.");
    }

    
    
    public String toString() {
    	return super.toString()+"\nPainting Style: " + paintingStyle + "\nFamous Painting: " + famousPainting;
    }
}// Class Painter Ends here

class Actor extends Artist {
    String movieName;
    String roleType;
    
    
    
    

   String getMovieName() {
		return movieName;
	}

	void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	String getRoleType() {
		return roleType;
	}

	void setRoleType(String roleType) {
		this.roleType = roleType;
	}//getters and setters ends here

	Actor() {
        super();
        this.movieName = "Unknown";
        this.roleType = "Supporting";
    }

    Actor(String name, String artStyle, String movieName, String roleType) {
        super(name, artStyle);
        this.movieName = movieName;
        this.roleType = roleType;
    }

    void perform() {
        System.out.println(name + " is acting as " + roleType + " in the movie \"" + movieName + "\".");
    }

    
    
    public String toString() {
    	return super.toString()+"\nMovie Name: " + movieName + "\nRole Type: " + roleType;
    }
}//class Actor ends here-

class TestArtist {
    public static void main(String[] args) {
        Artist[] arr=new Artist[3];

        arr[0] = new Singer("Lata Mangeshkar", "Singing", "Classical / Playback", "Lag Jaa Gale");
        

        arr[1] = new Painter("M. F. Husain", "Painting", "Modern / Cubist", "Horses Series");
       

        arr[2] = new Actor("Amitabh Bachchan", "Acting", "Sholay", "Lead Role");
       
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i].toString());
       
        	arr[i].perform();
        	
        	System.out.println("_____________________________________________");
        }
    }
}

