package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void prime() {
        final int numberRounds = 3;    // Количество правильных ответов для попеды
        final int numberParam = 3;
        String[][] array = new String[numberRounds][numberParam];
        int number;
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int maxNumber = 100;  // Максимальное значение рандомного числа
        for (var i = 0; i < numberRounds; i++) {
            number = (int) (Math.random() * maxNumber);
            array[i][0] = "Question: " + number;
            boolean prime = true;
            for (var ii = 2; ii < number; ii++) {
                if (number % ii == 0) {
                    prime = false;
                }
            }
            if (prime) {
                array[i][1] = "yes";
                array[i][2] = " is wrong answer ;(. Correct answer was 'yes'.";
            } else {
                array[i][1] = "no";
                array[i][2] = " is wrong answer ;(. Correct answer was 'no'.";
            }
        }
        Engine.engine(array, rule);
    }
}
