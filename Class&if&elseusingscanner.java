import java.util.*;
class hospital{
    String patientname;
    int Age;
    double bill;
     hospital(String patientname,int Age,double bill){
         this.patientname=patientname;
         this.Age=Age;
         this.bill=bill;
     }
     void display(){
         System.out.println("patientname:"+patientname);
         System.out.println("Age:"+Age);
         System.out.println("bill:"+bill);
     
        if (bill >= 5000) {
        System.out.println("HIGH BILL");
        }else{
        System.out.println("NORMAL BILL");
}
  }
}
public class Main{
    public static void main(String[]arge){
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the patient name:");
        String name = sc.nextLine();
        System.out.println("Enter the age:"); 
        int age = sc.nextInt();
        System.out.println("Enter the bill:");
double bill = sc.nextDouble();
        hospital s = new hospital(name, age, bill);

s.display();
    }
}
