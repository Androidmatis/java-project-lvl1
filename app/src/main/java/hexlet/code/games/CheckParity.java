package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class CheckParity {
    public static void checkParity() {
        int randomNumber;
        var countWin = 0;
        var name = Engine.whatYouName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int numberWin = 3;    // Количество правильных ответов для попеды
        final int maxNumber = 100;  // Максимальное значение рандомного числа
        for (; countWin < numberWin; countWin++) {
            randomNumber = (int) (Math.random() * maxNumber);
            System.out.println("Question: " + randomNumber);
            System.out.println("\nYour answer:");
            Scanner answerScan = new Scanner(System.in);
            String answer = answerScan.nextLine();
            if (randomNumber % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
            } else if (randomNumber % 2 == 1 && answer.equals("no")) {
                System.out.println("Correct!");
            } else if (randomNumber % 2 == 0 && !answer.equals("yes")) {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was 'yes'.");
                Engine.youLose(name);
                break;
            } else if (randomNumber % 2 == 1 && !answer.equals("no")) {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was 'no'.");
                Engine.youLose(name);
                break;
            }
        }
        if (countWin == numberWin) {
            Engine.youWin(name);
        }
    }
}
