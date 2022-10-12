package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        String[] number = new String[10];
        var countWin = 0;
        var name = Engine.whatYouName();
        System.out.println("What number is missing in the progression?");
        final int numberWin = 3;    // Количество правильных ответов для попеды
        final int maxNumber = 100;  // Максимальное значение рандомного числа
        final int maxsizeProgression = 10;
        for (; countWin < numberWin; countWin++) {
            int numberElementInArray = (int) (Math.random() * (number.length - 1));
            int sizeProgression = (int) (Math.random() * maxsizeProgression);
            number[0] = Integer.toString((int) (Math.random() * maxNumber));
            for (var i = 1; i < number.length; i++) {
                number[i] = Integer.toString(Integer.parseInt(number[i - 1]) + sizeProgression);
            }
            var result = number[numberElementInArray];
            number[numberElementInArray] = ". .";
            String exercise = "";
            for (var i = 1; i < number.length; i++) {
                exercise = exercise + " " + number[i];
            }
            System.out.println("Question: " + exercise);
            System.out.println("\nYour answer:");
            Scanner answerScan = new Scanner(System.in);
            String answer = answerScan.nextLine();
            if (answer.equals(result)) {
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
