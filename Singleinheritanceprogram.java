class Parent {
    void display(){
        System.out.println("This is the parent class.");
    }
}

class child extends Parent{
    void show() {
        System.out.println("This is the child class.");
    }
}

public class Main{
    public static void main(String[]argts){
        child obj=new child();
        obj.display();
        obj.show();
    } 
}
