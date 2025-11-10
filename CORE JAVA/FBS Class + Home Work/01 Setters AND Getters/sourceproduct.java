class Product
{
  int pid,price,quantity;  
  String pname;
void setpid(int p1)
{
  this.pid=p1;
}
void setprice(int p1)
{
  this.price=p1;
}
{
  this.quantity=q;
}
void setpname(String n);
void setquantity(int q);
{
 this.pname=n;
}

}//class end here
class TestProduct
{
 public static void main(String[]t)
{
 Product p;
 p=new Product();
 p.setpid(01);
 p.setprice(200);
 p.setquantity(10);
 p.setpname("cricket bat");
 System.out.println("product: "+" prodict id: "+p.pid+" productname: "+p.pname+" productprice: "+p.price+" productquntity: "+p.quantity);
}
}
//class Testproduct ends here
  
   