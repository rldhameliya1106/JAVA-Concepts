package JAVA;

abstract class bird{
    abstract void Sound();
    public void sleep(){
        System.out.println("Zzzz");
    }
}

class crow extends bird{
    void Sound() {
        System.out.println("hghgghj");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        crow c = new crow();
        c.Sound();
        c.sleep();
    }
}
