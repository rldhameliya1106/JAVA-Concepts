package JAVA;
class Pizza{
    public void test(){
        System.out.println("Yummy");
    }
}

class Junk extends Pizza{
    public void pizza(){
        System.out.println("Pizza");
    }

}

public class MInheritance extends Junk{
    public static void main(String[] args) {
        MInheritance MI = new MInheritance();
        MI.test();
        MI.pizza();
    }
}


