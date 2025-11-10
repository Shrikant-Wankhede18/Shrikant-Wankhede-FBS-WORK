//2. Create Classes for Triangle, Rectangle, and Circle
//Create a class Shape and write overloaded functions to calculate the area of different shapes:
//• Triangle (base and height)
//• Rectangle (length and breadth)
//• Circle (radius)


class Shape{

void calculate(int r){
  double area=3.14*r*r;
  System.out.println("area of circle is :" + area);

}

void calculate(int b, int h ){
  double area=0.5*(b*h);
  System.out.println("area of triangle is :" + area);

}

void calculate(double l, int b ){
  double area=l*b;
  System.out.println("area of rectangle is :" + area);

}






}

class TestShape{

public static void main(String[] args){

  Shape s1;
  s1=new Shape();

int r=10, b=10, h=20, base=10;
double l=20.0;
 
s1.calculate(r);
s1.calculate(b,h);
s1.calculate(l,base);


}
}