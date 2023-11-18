package JAVA;

class student {
    String name;
}
class clg extends student{

}
public class HInheritance extends student{
    public static void main(String[] args) {
        HInheritance HI = new HInheritance();
        HI.name = "RD";
        System.out.println("Name: "+HI.name);

        clg c =new clg();
        c.name = "SSASIT";
        System.out.println("Clg: "+c.name);
    }
}
