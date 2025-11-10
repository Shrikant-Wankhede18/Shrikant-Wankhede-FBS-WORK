import java.util.Scanner;
class Complex {
    int real;
    int img;

void setreal(int r) {
        this.real = r;
}

void setimg(int i) {
        this.img = i;
}

int getreal() {
        return this.real;
 }

int getimg() {
        return this.img;
}

Complex() {
        real = 0;
        img = 0;
}

Complex(int r, int i) {
        real = r;
        img = i;
 }
void display() {
   System.out.println("Real part: " + real);
   System.out.println("Imaginary part: " + img);
}
} // class Complex ends here


class TestComplex {
    public static void main(String[] x) {
       
   
Complex[] crr=new Complex[3];

crr[0]=new Complex();
crr[0]=new Complex();
crr[0]=new Complex();





}

} // class TestComplex ends here



