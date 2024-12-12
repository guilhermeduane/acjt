package acjavatest;

import java.util.regex.*;

public class RegularExpressions {

    public static boolean matches(String input) {
        String regex = "^(?!no\\sdamages$)(damage|minor\\sdamages|heavy\\sdamage)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

    public static void main(String[] args) {

        System.out.println("Match: " + matches("damage"));
        System.out.println("Match: " + matches("minor damages"));
        System.out.println("Match: " + matches("heavy damage"));
        System.out.println("Match: " + matches("no damages"));
        System.out.println("Match: " + matches("minor damage"));
    }
}


