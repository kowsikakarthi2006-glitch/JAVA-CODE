abstract class payment{
    abstract void pay();
    void recipt(){
        System.out.println("Recipt Generated");
    }
}
class UPI extends payment{
    void pay(){
        System.out.println("Paid using UPI");
    }
}
class card extends payment{
    void pay(){
        System.out.println("Paid using card");
    }
}
public class Main{
    public static void main(String[]args){
        UPI d = new UPI();
        d.recipt();
        d.pay();
    }
}
