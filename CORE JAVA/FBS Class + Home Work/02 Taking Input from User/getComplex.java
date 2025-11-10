class Complex {
    int real;
    int img;

    // ----- Setters -----
    void setreal(int r) {
        this.real = r;
    }

    void setimg(int i) {
        this.img = i;
    }

    // ----- Getters -----
    int getreal() {
        return this.real;
    }

    int getimg() {
        return this.img;
    }

    // ----- Default Constructor -----
    Complex() {
        real = 0;
        img = 0;
    }

    // ----- Parameterized Constructor -----
    Complex(int r, int i) {
        real = r;
        img = i;
    }

    // ----- Display Method -----
    void display() {
        System.out.println("Real part: " + real);
        System.out.println("Imaginary part: " + img);
        System.out.println("--------------------");
    }
} // class Complex ends here


// -----------------------
class TestComplex {
    public static void main(String[] x) {
        Complex c1, c2, c3;

        c1 = new Complex();            // calls default constructor
        c2 = new Complex(10, 20);      // calls parameterized constructor
        c3 = new Complex();            // another object for setter demo

        // using setters
        c3.setreal(18);
        c3.setimg(18);

        // display
        System.out.println("Using default constructor:");
        c1.display();

        System.out.println("Using parameterized constructor:");
        c2.display();

        System.out.println("Using setters:");
        c3.display();

        // direct access using getters
        System.out.println("From getters: real = " + c3.getreal() + ", imaginary = " + c3.getimg() + " Virat");
    }
} // class TestComplex ends here
