package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String whatYouName() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
