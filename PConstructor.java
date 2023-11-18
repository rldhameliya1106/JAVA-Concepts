package JAVA;

public class PConstructor {

    PConstructor(){
        System.out.println("Default Constructor");
    }
    PConstructor(int x){
        System.out.println("Value of x is: "+ x);
    }

    public static void main(String[] args) {
        PConstructor dC = new PConstructor();
        PConstructor PC = new PConstructor(23);
    }
}
