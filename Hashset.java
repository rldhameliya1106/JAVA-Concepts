package JAVA;
import java.util.*;
public class Hashset {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("A");
        hs.add("B");
        hs.add("C");
//        hs.add("C");


        for(String i: hs){
            System.out.println(i);
        }
    }
}
