import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the personal details: ");
        String details = sc.next();

        switch(details) {
            case "name":
                System.out.println("name = Kowsika");
                break;
            case "class":
                System.out.println("class = B.E-EEE");
                break;
            case "section":
                System.out.println("section  = A");
                break;
            case "Address":
                System.out.println("Address = 841/3 Malasuthi road,Tiruchengode Namakkal");
                break;
            case "pincode":
                System.out.println("pincode = 637205");
                break;
                case "CGPA":
                    System.out.println("CGPA = 7.61");
            default:
                System.out.println("details");
        }
    }
}
