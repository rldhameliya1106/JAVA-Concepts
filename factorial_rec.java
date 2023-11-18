package JAVA;
import java.util.*;
public class factorial_rec
{
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int num=sc.nextInt();
        long begin=System.nanoTime();
        fact = factorial(num);
        System.out.println("Factorial of "+num+" is: "+fact);
        long end=System.nanoTime();
        long diff=end-begin;
        System.out.println("Time taken:"+diff);
    }
}
