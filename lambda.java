package JAVA;
import java.util.*;
public class lambda {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.forEach( (n) -> { System.out.println(n); } );
    }

}
