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

Distance(){
  this.km="20 km";
  this.m="10 m";
}




}//class ends here



class TestDistance
{
 public static void main(String[]x)
{
 Distance[] drr=   new Distance[2];
 drr[0]= new Distance();
 drr[1]= new Distance();

for (int i=0;i<2;i++){

drr[i].Display();
}



 
}
}//TestDistance ends here
 