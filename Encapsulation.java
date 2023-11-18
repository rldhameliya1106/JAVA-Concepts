package JAVA;

public class Encapsulation {
    private String Name;

    void setName(String name){
        Name = name;
    }

    String getName(){
        return Name;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setName("RD");
        String n = e.getName();
        System.out.println(n);
    }
}
