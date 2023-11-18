package JAVA;

interface animalSound{
    abstract void Sound();

}

interface animalSleep{
    abstract void sleep();
}

class dog implements animalSound,animalSleep{
    public void Sound() {
        System.out.println("bhow-bhow");
    }

    public void sleep(){
        System.out.println("Zzzz");
    }
}

public class Interface {
    public static void main(String[] args) {
        dog d = new dog();
        d.sleep();
        d.Sound();
    }
}
