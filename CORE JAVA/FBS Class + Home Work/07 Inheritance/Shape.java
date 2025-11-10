package inheritance;

class Shape {
    String color;
    int borderWidth;


    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
    int getBorderWidth() {
        return borderWidth;
    }
    void setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
    }    // Getters and Setters

   
    Shape() {
        color = "No Color";
        borderWidth = 0;
    }

    Shape(String color, int borderWidth) {
        this.color = color;
        this.borderWidth = borderWidth;
        
    }//constructors ensd here

    void display() {
        System.out.println("Color : " + this.color);
        System.out.println("Border Width : " + this.borderWidth);
    }
}// class shape ends here


class Circle extends Shape {
    double radius;

    
    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }// Getters and Setters ends here

    
    Circle() {
        super();
        radius = 0.0;
    }

    Circle(String color, int borderWidth, double radius) {
        super(color, borderWidth);
        this.radius = radius;
    }// Constructors ends here

    void display() {
        System.out.println("----------------------------------");
        super.display();
        System.out.println("Radius : " + this.radius);
        System.out.println("----------------------------------");
    }
}//class circle ends here


class Rectangle extends Shape {
    double length;
    double width;

    
    double getLength() {
        return length;
    }
    void setLength(double length) {
        this.length = length;
    }
    double getWidth() {
        return width;
    }
    void setWidth(double width) {
        this.width = width;
    }// Getters and Setters ends here

    
    Rectangle() {
        super();
        length = 0.0;
        width = 0.0;
    }//constructors ends here

    Rectangle(String color, int borderWidth, double length, double width) {
        super(color, borderWidth);
        this.length = length;
        this.width = width;
    }

    void display() {
        System.out.println("----------------------------------");
        super.display();
        System.out.println("Length : " + this.length);
        System.out.println("Width : " + this.width);
        System.out.println("----------------------------------");
    }
}//class rectangle ends here


class Triangle extends Shape {
    double base;
    double height;

    // Getters and Setters
    double getBase() {
        return base;
    }
    void setBase(double base) {
        this.base = base;
    }
    double getHeight() {
        return height;
    }
    void setHeight(double height) {
        this.height = height;
    }

   
    Triangle() {
        super();
        base = 0.0;
        height = 0.0;
    }

    Triangle(String color, int borderWidth, double base, double height) {
        super(color, borderWidth);
        this.base = base;
        this.height = height;
    } // Constructors ends here

    void display() {
        System.out.println("----------------------------------");
        super.display();
        System.out.println("Base : " + this.base);
        System.out.println("Height : " + this.height);
        System.out.println("----------------------------------");
    }
}//class triangle ends here


class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle("Red", 2, 5.5);
        c1.display();

        Rectangle r1 = new Rectangle("Blue", 3, 8.0, 4.0);
        r1.display();

        Triangle t1 = new Triangle("Green", 1, 6.0, 3.0);
        t1.display();
    }
}
