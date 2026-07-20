import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      int[] marks = {70,80,60,70,80};
      int num=sc.nextInt();
      for(int i=0;i<marks.length;i++)
      {
          if (marks[i]==num)
          {
              System.out.print("Number found");
              return;
          }
      }
      System.out.println("Number not found");
}
}
