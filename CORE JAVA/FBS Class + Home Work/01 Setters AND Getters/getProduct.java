class Product
{
  int pid,price,quantity;  
  String pname;
void setPid(int p1)
{
  this.pid=p1;
}
void setPrice(int p1)
{
  this.price=p1;
}

void setQuantity(int q)
{
  this.quantity=q;
}

void setPname(String n)
{
 this.pname=n;
}


int getPid()
{
  return this.pid;
}
int getPrice()
{
 return this.price;
}
int getQuantity()
{
  return this.quantity;
}
String getName()
{
 return this.pname;
}

void display(){
    System.out.println("product ID : "+ this.pid);
    System.out.println("product Name : "+ this.pname);
    System.out.println("product Price : "+ this.price);
    System.out.println("product Quantity : "+ this.quantity);
}




}//class end here
class TestProduct
{
 public static void main(String[]t)
{
 Product p;
 p=new Product();


 p.setPid(01);
 p.setPrice(200);
 p.setQuantity(10);
 p.setPname("cricket bat");

p.display();


// System.out.println("product: "+" prodict id: "+p.pid+" productname: "+p.pname+" productprice: "+p.price+" productquntity: "+p.quantity);
}
}
//class Testproduct ends here
  
   