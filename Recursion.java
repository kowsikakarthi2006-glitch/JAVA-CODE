import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n value: ");
        int n = sc.nextInt();
        pat(n);
    }
    static void pat(int k) {
        if (k == 0) {
            return;
        }
        System.out.println(k);
        pat(k - 1);
    }
}
