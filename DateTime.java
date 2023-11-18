package JAVA;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String Formate = dt.format(dtf);
        System.out.println("Formated DateTime: " + Formate);
    }
}
