
import java.util.Scanner;

public class Input {
    static Scanner in = new Scanner(System.in);



    public static String getAction(String action) {
        in.nextLine();
        System.out.printf("%s", action);
        return in.nextLine();
    }

    public static int kindValue(String title) {
        System.out.printf("%s", title);        
        return in.nextInt();
    }

    public static int getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public static int contin(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

}
