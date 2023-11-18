package JAVA;

public class recursion {

    static int fact(int x){
        if(x==0 || x==1){
            return 1;
        }
        else{
            return x * fact(x-1);
        }
    }
    public static void main(String[] args) {
        int result = fact(10);
        System.out.println("Factorial of given num is: " + result);

    }

}
