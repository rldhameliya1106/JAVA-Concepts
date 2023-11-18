package pkg011;

import java.util.*;
public class Quick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of ele:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter element:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long begin = System.nanoTime();
        quickSort(a, 0, n - 1);
        long end = System.nanoTime();
        long diff=end-begin;
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.println(" "+a[i]);
        }
        System.out.println("Time complexity is : " +diff);
    }
   public static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a,pi + 1, high);
        }
    }

   public static int partition(int[] a, int low, int high) {
        int pivot,i,temp;
         pivot = a[high];
         i = low-1;

        for(int j=low;j<high;j++) {
            if(a[j] <= pivot) {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
       temp = a[i+1];
       a[i+1] = a[high];
       a[high] = temp;
        return i+1;
    }

}