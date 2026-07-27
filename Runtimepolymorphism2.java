class College {
    void department() {
        System.out.println("Welcome to Excel Engineering College");
    }
}
class CSE extends College {
    @Override
    void department() {
        System.out.println("Welcome to Computer Science Department");
    }
}
class EEE extends College {
    @Override
    void department() {
        System.out.println("Welcome to EEE Department");
    }
}
class ECE extends College {
    @Override
    void department() {
        System.out.println("Welcome to ECE Department");
    }
}
public class Main {
    public static void main(String[] args) {

        College c = new CSE();
        c.department();

        College d = new EEE();
        d.department();

        College e = new ECE();
        e.department();
    }
}
