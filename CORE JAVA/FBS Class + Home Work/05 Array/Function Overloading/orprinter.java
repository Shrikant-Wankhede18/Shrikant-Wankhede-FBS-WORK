class Printer{

void print(){
System.out.println("hello");

}

void print(int a){
System.out.println(a);

}


void print(char a){
System.out.println(a);

}


void print(String a){
System.out.println(a);

}


}// class printer ends here

class Test{

public static void main(String [] args){

 Printer p1;
 p1=new Printer();

p1.print();
p1.print(10);
p1.print('a');
p1.print("shrii");

}
}



















