interface camera{
    void photo();
}
interface music{
    void playmusic();
}
class mobile implements camera,music{
    public void photo(){
        System.out.println("photo Taken");
    }
    public void playmusic(){
        System.out.println("Music playing");
    }
}
public class Main {
    public static void main(String[]args){
        mobile m= new mobile();
        m.photo();
        m.playmusic();
    }
}
