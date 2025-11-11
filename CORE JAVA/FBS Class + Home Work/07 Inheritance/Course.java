package inheritance;



class Course {
    String courseName;
    String instructor;
    int durationWeeks;
    double price;
    boolean hasExercises;
    int weeklyTests;

	void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	String getCourseName() {
		return courseName;
	}
	void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	String getInstructor() {
		return instructor;
	}
	 void setDurationWeeks(int durationWeeks) {
		this.durationWeeks = durationWeeks;
	}
	int getDurationWeeks() {
		return durationWeeks;
	}
	void setPrice(double price) {
		this.price = price;
	}
	double getPrice() {
		return price;
	}
	void setHasExercises(boolean hasExercises) {
		this.hasExercises = hasExercises;
	}
	boolean isHasExercises() {
		return hasExercises;
	}
	void setWeeklyTests(int weeklyTests) {
		this.weeklyTests = weeklyTests;
	}
	int getWeeklyTests() {
		return weeklyTests;
	}// getters and setters ends here

	Course(String courseName, String instructor, int durationWeeks, double price, boolean hasExercises, int weeklyTests) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.durationWeeks = durationWeeks;
		this.price = price;
		this.hasExercises = hasExercises;
		this.weeklyTests = weeklyTests;
	}

	Course() {
		this.courseName = "Practice";
		this.instructor = "ABC";
		this.durationWeeks = 4;
		this.price = 500000;
		this.hasExercises = true;
		this.weeklyTests = 1;
	}// constructors ends here

	void display() {
		System.out.println("Course Name : " + this.courseName);
		System.out.println("Instructor : " + this.instructor);
		System.out.println("Duration : " + this.durationWeeks + " weeks");
		System.out.println("Price : " + this.price);
		System.out.println("Has Exercises: " + this.hasExercises);
		System.out.println("Weekly Tests: " + this.weeklyTests);
	}
}//class cource ends here

class ProgrammingCourse extends Course {
	String language;
	boolean hasProjects;

	void setLanguage(String language) {
		this.language = language;
	}
	String getLanguage() {
		return language;
	}
	void setHasProjects(boolean hasProjects) {
		this.hasProjects = hasProjects;
	}
	boolean isHasProjects() {
		return hasProjects;
	}// getters and setters ends here

	ProgrammingCourse() {
		super();
		this.language = "Java";
		this.hasProjects = true;
	}

	ProgrammingCourse(String courseName, String instructor, int durationWeeks, double price,
			boolean hasExercises, int weeklyTests, String language, boolean hasProjects) {
		super(courseName, instructor, durationWeeks, price, hasExercises, weeklyTests);
		this.language = language;
		this.hasProjects = hasProjects;
	}// constructors ends here

	void display() {
		super.display();
		System.out.println("Language : " + this.language);
		System.out.println("Has Projects : " + this.hasProjects);
	}
}

class ArtCourse extends Course {
	String artType;
	boolean materialsIncluded;

	void setArtType(String artType) {
		this.artType = artType;
	}
	String getArtType() {
		return artType;
	}
	void setMaterialsIncluded(boolean materialsIncluded) {
		this.materialsIncluded = materialsIncluded;
	}
	boolean isMaterialsIncluded() {
		return materialsIncluded;
	}//getters and setters ends here

	ArtCourse() {
		super();
		this.artType = "Painting";
		this.materialsIncluded = true;
	}

	ArtCourse(String courseName, String instructor, int durationWeeks, double price,
			boolean hasExercises, int weeklyTests, String artType, boolean materialsIncluded) {
		super(courseName, instructor, durationWeeks, price, hasExercises, weeklyTests);
		this.artType = artType;
		this.materialsIncluded = materialsIncluded;
	}// constructors ends here

	void display() {
		super.display();
		System.out.println("Art Type : " + this.artType);
		System.out.println("Materials Included : " + this.materialsIncluded);
	}

}//class artcource ends here

class MathCourse extends Course {
	String mathLevel;
	boolean hasCalculatorUse;

	void setMathLevel(String mathLevel) {
		this.mathLevel = mathLevel;
	}
	String getMathLevel() {
		return mathLevel;
	}
	void setHasCalculatorUse(boolean hasCalculatorUse) {
		this.hasCalculatorUse = hasCalculatorUse;
	}
	boolean isHasCalculatorUse() {
		return hasCalculatorUse;
	}// getters and setters ends here

	MathCourse() {
		super();
		this.mathLevel ="Advanced Algebra";
		this.hasCalculatorUse = true;
	}

	MathCourse(String courseName, String instructor, int durationWeeks, double price,
			boolean hasExercises, int weeklyTests, String mathLevel, boolean hasCalculatorUse) {
		super(courseName, instructor, durationWeeks, price, hasExercises, weeklyTests);
		this.mathLevel = mathLevel;
		this.hasCalculatorUse = hasCalculatorUse;
	}//constructors ends here

	void display() {
		super.display();
		System.out.println("Math Level : " + this.mathLevel);
		System.out.println("Allows Calculator : " + this.hasCalculatorUse);
	}
}

class TestCource {
	public static void main(String[] args) {
		MathCourse m = new MathCourse();
		m.display();
	}
}
