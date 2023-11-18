package JAVA;

public class methodOverloading {
    static int sum(int x,int y){
        return x+y;
    }

    static double sum(double x,double y){
        return x+y;
    }


    public static void main(String[] args) {
        System.out.println("Sum of int  is:"+sum(3,5));
        System.out.println("Sum of float is:"+ sum(3.5,8.9));
    }
}
