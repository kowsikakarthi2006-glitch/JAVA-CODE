class Main {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 50) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZ BUZZ");
            }
            else if (i % 3 == 0) {
                System.out.println("FIZZ");
            }
            else if (i % 5 == 0) {
                System.out.println("BUZZ");
            }
            else {
                System.out.println(i);
            }

            i++;
        }
    }
}
