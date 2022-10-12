package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void gcd() {
        int number1;
        int number2;
        var countWin = 0;
        var result = 0;
        var name = Engine.whatYouName();
        System.out.println("What is the result of the expression?");
        final int numberWin = 3;    // Количество правильных ответов для попеды
        final int maxNumber = 100;  // Максимальное значение рандомного числа
        for (; countWin < numberWin; countWin++) {
            number1 = (int) (Math.random() * maxNumber);
            number2 = (int) (Math.random() * maxNumber);
            System.out.println("Question: " + number1 + " " + number2);
            System.out.println("\nYour answer:");
            Scanner answerScan = new Scanner(System.in);
            String answer = answerScan.nextLine();
            int miniNumber;
            if (number1 < number2) {
                miniNumber = number1;
            } else {
                miniNumber = number2;
            }
            for (var i =1; i <= miniNumber; i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    result = i;
                }
            }
            if (Integer.parseInt(answer) == result) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was "
                        + result + ".");
                Engine.youLose(name);
                break;
            }
        }
        if (countWin == numberWin) {
            Engine.youWin(name);
        }
    }
}
