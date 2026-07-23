class mygrandpa {
    void display(){
        System.out.println("my grand father is a farmer");
    }
}

class child extends mygrandpa{
    void show() {
        System.out.println("my father is a weaver");
    }
}

class me extends child{
    void display1(){
        System.out.println("I am a student");
    }
}

public class Main{
    public static void main(String[]args){
        me obj=new me();
        obj.display1();
        obj.show();
        obj.display();
    } 
}
