class Car
{
 String model,brand,color,dcapacity;
 int price;


void setmodel(String m)
{
  this.model=m;
}
void setbrand(String b)
{
  this.brand=b;
}
void setcolor(String r)
{
  this.color=r;
}
void setdcapacity( String f)
{ 
  this.dcapacity=f;
}
void setprice( int p)
{
  this.price=p;
}


}// class ends here
class TestCar
{
public static void main(String[]b)
{
  Car c;
  c=new Car();

  c.setmodel("BMW_m5");
  c.setbrand("BMW");
  c.setcolor("blue");
  c.setprice(1000000);
  c.setdcapacity("15 capacity");
System.out.println("car info");
System.out.println("model: "+c.model);
System.out.println("brand: "+c.brand);
System.out.println("color: "+c.color);
System.out.println("price: "+c.price);
System.out.println("dcpacity: "+c.dcapacity);






}
}//class Testcar ends 
 
 