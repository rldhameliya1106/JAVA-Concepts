package JAVA;
import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> HM = new HashMap<String,Integer>();
        HM.put("RD",1);
        HM.put("CD",2);
        HM.put("AB",3);

        for(String i:HM.keySet()){
            System.out.println("Keys: " + i+ "Values: " + HM.get(i));
        }

    }
}
