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
}//class ends here
class TestDistance
{
 public static void main(String[]x)
{
 Distance d;
 d= new Distance();
d.setkm("1 kilometer");
d.setm("1000 miter");
System.out.println(d.km+" means "+d.m);
}
}//TestDistance ends here
 