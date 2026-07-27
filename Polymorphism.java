class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Integer Addition : " + c.add(5, 10));
        System.out.println("Double Addition  : " + c.add(5.5, 4.5));
    }
}
