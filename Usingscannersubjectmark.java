import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamil = 88;
        int english = 90;
        int maths = 70;
        int science = 60;
        int social = 89;
        System.out.print("Enter the subject name: ");
        String subject = sc.next();
        if(subject.equalsIgnoreCase("Tamil"))
            System.out.println("Marks = " + tamil);
        else if(subject.equalsIgnoreCase("English"))
            System.out.println("Marks = " + english);
        else if(subject.equalsIgnoreCase("Maths"))
            System.out.println("Marks = " + maths);
        else if(subject.equalsIgnoreCase("Science"))
            System.out.println("Marks = " + science);
        else if(subject.equalsIgnoreCase("Social"))
            System.out.println("Marks = " + social);
        else
            System.out.println("Invalid Subject");
    }
}
