abstract class payment{
    protected double amount;
    payment (double amount){
        this.amount = amount;
    }
    abstract void pay();
    void recipt(){
        System.out.println("Recipt generated");
        System.out.println("Amount paid:$"+amount);
    }
    void showPaymentStatus(){
        System.out.println("payment successful");
    }
}
class UPIpayment extends payment {
    private String UPIID;
    UPIpayment (double amount,String UPIID){
        super(amount);
        this.UPIID=UPIID;
    }
    @Override
    void pay(){
        System.out.println("Processing UPI payment.......");
        System.out.println("UPIID:"+UPIID);
    }
}
class cardpayment extends payment{
    private String cardNumber;
    cardpayment (double amount,String cardNumber){
        super (amount);
        this.cardNumber = cardNumber;
    }
@Override
    void pay() {
        System.out.println("Processing card payment....");
System.out.println("CardNumber:**** **** ****"+cardNumber.substring(cardNumber.length()-4));

    }
}
public class Main{
    public static void main(String[]args){
        payment p1=new UPIpayment(550.75,"KOWSIKA@oksbi");
         payment p2 = new cardpayment(1250.50, "1234567812345678");
        p1.pay();
        p1.recipt();
        p1.showPaymentStatus();
        System.out.println();
        p2.pay();
        p2.recipt();
        p2.showPaymentStatus();
    }
}
