class laptop{
    String brand;
String processor;
int ram;
int price;
laptop(String brand,String processor,int ram,int price){
    this.brand=brand;
    this.processor=processor;
    this.ram=ram;
    this.price=price;
}
void display(){
    System.out.println("brand:"+brand);
    System.out.println("processor:"+processor);
    System.out.println("ram:"+ram);
    System.out.println("price:"+price);
}
}
public class Main{
    public static void main(String[]args){
        
    
    laptop[] laptops= new laptop[3];
laptop l1= new laptop("DELL","i5",8,55000);
laptops[0]=l1;
laptop l2=new laptop("HP","i7",16,80000);
laptops[1]=l2;
laptop l3=new laptop("LENOVO","Ryzen 5",8,60000);
laptops[2]=l3;
  for (int i=0; i<laptops.length;i++){
      laptops[i].display();
   if (laptops[i].price > 60000) {
    System.out.println("Premium Laptop");
} else {
    System.out.println("Budget Laptop");
}
  }
}
}
