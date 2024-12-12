package acjavatest;

public class Bonus {

    private static int counter = 0;

    public static String getValue(boolean param) {
        if (param) {
            return "a";
        } else {
            counter++;
            if (counter % 2 == 0) {
                return "b";
            } else {
                return "c";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getValue(true));
        System.out.println(getValue(false));
        System.out.println(getValue(false));
    }
}

