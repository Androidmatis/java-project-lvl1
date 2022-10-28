package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(String[][] game, String rule) {
        System.out.println("Welcome to the Brain Games!"
                + "\nMay I have your name?");
        Scanner nameScan = new Scanner(System.in);
        String nameGamer = nameScan.nextLine();
        System.out.println("Hello, " + nameGamer + "!");
        System.out.println(rule);
        final int numberWin = 3;    // Количество правильных ответов для попеды
        for (int i = 0; i < numberWin; i++) {
            System.out.println("Question: " + game[i][0]);
            System.out.println("\nYour answer:");
            Scanner answerScan = new Scanner(System.in);
            String answer = answerScan.nextLine();
            if (!answer.equals(game[i][1])) {
                System.out.println(answer + game[i][2]);
                System.out.println("Let's try again, " + nameGamer + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + nameGamer + "!");
    }
}