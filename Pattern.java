class Main {
    public static void main(String[] args) {
        int n=5;
        int m=10;
        pat(n);
        pat(m);
        pat(3);
        pat(4);
    }
    static void pat(int k)
    {
        for(int i=0;i<k;i++)
        {
            for(int j=i;j<k;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
