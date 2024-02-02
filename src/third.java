import java.util.*;

public class third {
    public static void main(String[] args) {
        Date time = new Date();
        int hours = time.getHours();
        if (hours >= 6 && hours <= 12) {
            System.out.println("Good morning! It's " + hours + " o'clock now!");
        }
        else if (hours >= 13 && hours <= 15) {
            System.out.println("Good Day! It's " + hours + " o'clock now!");
        }
        else if (hours >= 16) {
            System.out.println("Good Evening! It's " + hours + " o'clock now!");
        }
        else if (hours >= 1) {
            System.out.println("Good Night! It's " + hours + " o'clock now!");
        }
    }
}
