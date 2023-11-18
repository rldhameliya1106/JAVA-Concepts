package JAVA;
import java.util.regex.*;


public class Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abc",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hyy  abcdefghdjgj");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}

