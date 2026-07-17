import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the A value:");
        int a= sc.nextInt();
        System.out.println("Enter the B value:");
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap:");
        System.out.println("A:"+a);
        System.out.println("B:"+b);
        
    }
}

