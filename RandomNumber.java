package JAVA;
import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int num = (int)(Math.random() * 100);
int a;
        do{
            System.out.println("Guess My number(1-100):");
            a = sc.nextInt();
            if(a==num){
                System.out.println("Congretulation! your guess is correct.");
                break;
            }
            else if(a>num){
                System.out.println("your guess is greater");
            }
            else if(a<num){
                System.out.println("your guess is lesser");
            }
        }while(a>=0);

        System.out.println("Guess is :"+a);
    }

}
