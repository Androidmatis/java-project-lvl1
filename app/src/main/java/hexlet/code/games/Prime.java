package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void prime() {
        final int numberRounds = 3;    // Количество правильных ответов для попеды
        final int numberParam = 3;
        String[][] ParametrsGame = new String[numberRounds][numberParam];
        int number;
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int maxNumber = 100;  // Максимальное значение рандомного числа
        for (var i = 0; i < numberRounds; i++) {
            number = (int) (Math.random() * maxNumber);
            ParametrsGame[i][0] = Integer.toString(number);
            boolean prime = true;
            for (var ii = 2; ii < number; ii++) {
                if (number % ii == 0) {
                    prime = false;
                }
            }
            if (number < 2) {
                prime = false;
            }
            if (prime) {
                ParametrsGame[i][1] = "yes";
                ParametrsGame[i][2] = " is wrong answer ;(. Correct answer was 'yes'.";
            } else {
                ParametrsGame[i][1] = "no";
                ParametrsGame[i][2] = " is wrong answer ;(. Correct answer was 'no'.";
            }
        }
        Engine.engine(ParametrsGame, rule);
    }
}
