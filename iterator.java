package JAVA;
import java.util.*;
public class iterator {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> i = cars.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
