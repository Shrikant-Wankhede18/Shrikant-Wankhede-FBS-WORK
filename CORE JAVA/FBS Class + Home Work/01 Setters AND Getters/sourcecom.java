class Complex
{
 int real;
 int img;
void setreal(int r)
{
 this.real=r;
}
void setimg(int I)
{
  this.img=I;
}
}// class ends here
class TestComplex
{
public static void main(String[]x)
{
 Complex c;
c=new Complex();
c.setreal(18);
c.setimg(18);
System.out.println("real no: "+c.real+" imagination no: "+c.img+"Virat");
}
}// class TestComplex ends here