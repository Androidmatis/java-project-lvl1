package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static void prime() {
        int number;
        var countWin = 0;
        var name = Engine.whatYouName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        final int numberWin = 3;    // Количество правильных ответов для попеды
        final int maxNumber = 100;  // Максимальное значение рандомного числа
        for (; countWin < numberWin; countWin++) {
            number = (int) (Math.random() * maxNumber);
            System.out.println("Question: " + number);
            System.out.println("\nYour answer:");
            Scanner answerScan = new Scanner(System.in);
            String answer = answerScan.nextLine();
            boolean prime = true;
            for (var i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                }
            }
            if (prime && answer.equals("yes")) {
                System.out.println("Correct!");
            } else if (!prime && answer.equals("no")) {
                System.out.println("Correct!");
            } else if (prime && !answer.equals("yes")) {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was 'yes'.");
                Engine.youLose(name);
                break;
            } else if (!prime && !answer.equals("no")) {
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
