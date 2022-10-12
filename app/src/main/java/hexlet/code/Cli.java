package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void whatYouName() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner name = new Scanner(System.in);
        System.out.println("Hello, " + name.nextLine() + "!");
    }
}
