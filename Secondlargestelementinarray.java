class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int max = arr[0];
        int second = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                second = max;
                max = arr[i];
            }
        }

        System.out.println("Second Largest Element: " + second);
    }
}
