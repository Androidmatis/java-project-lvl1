package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String whatYouName() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner nameScan = new Scanner(System.in);
        String name = nameScan.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void youLose(String name) {
        System.out.println("Let's try again, " + name + "!");
    }

    public static void youWin(String name) {
        System.out.println("Congratulations, " + name + "!");
    }
}
