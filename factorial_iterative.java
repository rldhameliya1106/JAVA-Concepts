package JAVA;
import java.util.*;
public class factorial_iterative
{
    public static void main(String args[]){
        int i,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        int num=sc.nextInt();
        long begin=System.nanoTime();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
        long end=System.nanoTime();
        long diff=end-begin;
        System.out.println("Time taken:"+diff);
    }
}
