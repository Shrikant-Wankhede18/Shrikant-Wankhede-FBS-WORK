class Book
{
 String isbn,bname,categ;
 int price;
void setisbn(String I)
{
  this.isbn=I;
}
void setbname(String B)
{
 this.bname=B;
}
void setcateg(String c)
{
 this.categ=c;
}
void setprice(int p)
{
  this.price=p;
}
}
//CLASS ends here
class TestBook
{
public static void main(String[]a)
{
 Book b;
b=new Book();
b.setisbn("987-56478-20");
b.setbname("Iron man");
b.setcateg("Marvel");
b.setprice(5000);
System.out.println("Book info");
System.out.println("isbn no: "+b.isbn);
System.out.println("book name: "+b.bname);
System.out.println("category: "+b.categ);
System.out.println("price: "+b.price);
}
} // TestBook ends here

 