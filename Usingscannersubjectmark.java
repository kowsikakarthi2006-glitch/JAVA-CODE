import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the subject name: ");
        String subject = sc.next();

        switch(subject) {
            case "Tamil":
                System.out.println("Marks = 88");
                break;
            case "English":
                System.out.println("Marks = 90");
                break;
            case "Maths":
                System.out.println("Marks = 70");
                break;
            case "Science":
                System.out.println("Marks = 60");
                break;
            case "Social":
                System.out.println("Marks = 89");
                break;
            default:
                System.out.println("Invalid Subject");
        }
    }
}
