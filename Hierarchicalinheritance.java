class mydaddy {
    void display(){
        System.out.println("my father is a farmer");
    }
}

class mysister extends mydaddy{
    void show() {
        System.out.println("my father is a weaver");
    }
}

class me extends mysister{
    void display1(){
        System.out.println("I am a student");
    }
}

public class Main{
    public static void main(String[]args){
        me obj=new me();
        obj.display1();
        mysister sis=new mysister();
        sis.show();
        obj.display();
    } 
}
