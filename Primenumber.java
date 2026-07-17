import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=13;
        String str = prime(n);
        System.out.println(str);
    }
    static String prime(int k)
    {
        if(k<2)
        { return " not prime";
    }
    for (int i=2;i<k;i++){
        if (k%i==0)
        return "not prime";
    }
    return "prime";
}
}
