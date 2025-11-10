class Calculator{

void add(int a, int b){
 System.out.println("add is of int + int :" +(a + b));
}

void add(double a, double b){
 System.out.println("add of double + double :"+(a + b));
}

void add(double a, int b){
 System.out.println("add of float + double :"+(a + b));

}

void add(int a, double b){
 System.out.println("add of int + double :"+(a + b));

}// add ends here

void sub(int a, int b){
 System.out.println("sub is of int + int :" +(a - b));
}

void sub(double a, double b){
 System.out.println("sub of double + double :"+(a - b));
}

void sub(double a, int b){
 System.out.println("sub of float + double :"+(a - b));

}

void sub(int a, double b){
 System.out.println("sub of int + double :"+(a - b));

}// sub ends here

void mul(int a, int b){
 System.out.println("add is of int + int :" +(a * b));
}

void mul(double a, double b){
 System.out.println("add of double + double :"+(a * b));
}

void mul(double a, int b){
 System.out.println("add of float + double :"+(a * b));

}

void mul(int a, double b){
 System.out.println("add of int + double :"+(a * b));

}// add ends here

void div(int a, int b){
 System.out.println("sub is of int + int :" +(a / b));
}

void div(double a, double b){
 System.out.println("sub of double + double :"+(a / b));
}

void div(double a, int b){
 System.out.println("sub of float + double :"+(a / b));

}

void div(int a, double b){
 System.out.println("sub of int + double :"+(a / b));

}// sub ends here



}

class TestCal{

public static void main(String[] args){

Calculator c;
c= new Calculator();

int a=10,b=10;
double d=10.25,e=10.23;
System.out.println("addition");
c.add(a,b);
c.add(d,e);
c.add(d,a);
c.add(a,e);
System.out.println("----------------");
System.out.println("substraction");
c.sub(a,b);
c.sub(d,e);
c.sub(d,a);
c.sub(a,e);
System.out.println("----------------");
System.out.println("Mul");
c.mul(a,b);
c.mul(d,e);
c.mul(d,a);
c.mul(a,e);
System.out.println("----------------");
System.out.println("Div");
c.div(a,b);
c.div(d,e);
c.div(d,a);
c.div(a,e);







}
}



