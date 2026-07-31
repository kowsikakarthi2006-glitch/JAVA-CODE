import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Stack Size:");
        int size =sc.nextInt();
        int[]Stack=new  int[size];
        int top=-1;
        int choice;
        do{
            System.out.println("\n1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            
            System.out.print("Enter Choice:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    if(top==size-1){
                        System.out.println("Stackoverflow");
                    }else{
                        System.out.print("Enter value:");
                        int value=sc.nextInt();
                        top++;
                        Stack[top]=value;
                        System.out.println(value+"inserted");
                    }
                    break;
                case 2:
                    if(top==-1){
                        System.out.println("Stack underflow");
                    }else{
                        System.out.println(Stack[top]+"removed");
                        top--;
                    }
                    break;
                case 3:
                    if(top==-1){
                        System.out.println("Stack is Empty");
                    }else{
                        System.out.println("Top element="+Stack[top]);
                    }
                    break;
                case 4:
                    if(top==-1){
                        System.out.println("Stack elements:");
                        for(int i=top;i>=0;i--){
                            System.out.println(Stack[i]);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Program Ended");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice!=5);
        sc.close();
    }
}
