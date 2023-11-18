package JAVA;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of ele:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter element:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter no for search:");
        int x=sc.nextInt();
        int i=0,j=n-1;
        long begin=System.nanoTime();

        while(i<=j){
            int k=(i+j)/2;
            if(x==a[k]){
                System.out.println("ele at possition:"+(k+1));
                break;
            }
            else if(x<a[k]){
                j=k-1;
            }
            else{
                i=k+1;
            }
        }
        if(i>j){
            System.out.println(x+"is not in array.");
        }
        long end=System.nanoTime();
        long diff=end - begin;
        System.out.println("Time Taken:"+diff);
    }
}
