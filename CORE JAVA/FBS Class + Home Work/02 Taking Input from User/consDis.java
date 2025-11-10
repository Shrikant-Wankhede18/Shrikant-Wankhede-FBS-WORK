class Distance
{
 
String km,m;

void setkm(String k)
{
  this.km=k;
}
void setm(String me)
{
 this.m=me;
}

String getKm(){
  return this.km;
}

String getM(){
  return this.m;
}

void Display(){
   System.out.println("KM is : " + this.getKm());
   System.out.println("METER is : " + this.getM());
}

Distance{
  this.km="20 km";
  this.m="10 m";
}




}//class ends here



class TestDistance
{
 public static void main(String[]x)
{
 Distance d1,d2;
 d1= new Distance();
 d2= new Distance();


d2.setkm("1 kilometer");
d2.setm("1000 miter");

d1.Display();


 
}
}//TestDistance ends here
 