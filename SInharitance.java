package JAVA;

    class food{
    public void pizza(){
        System.out.println("Pizza");
    }

}

public class SInharitance extends food {
    public static void main(String[] args) {
        SInharitance SI = new SInharitance();

        SI.pizza();
    }
}
