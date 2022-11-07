package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gcd() {
        final int numberRounds = 3;    // Количество правильных ответов для попеды
        final int numberParam = 3;
        String[][] ParametrsGame = new String[numberRounds][numberParam];
        int number1;
        int number2;
        var result = 0;
        String rule = "Find the greatest common divisor of given numbers.";
        final int maxNumber = 100;  // Максимальное значение рандомного числа
        int miniNumber;
        for (var i = 0; i < numberRounds; i++) {
            number1 = (int) (Math.random() * maxNumber);
            if (number1 == 0) {
                number1 = 1;
            }
            number2 = (int) (Math.random() * maxNumber);
            if (number2 == 0) {
                number2 = 1;
            }
            ParametrsGame[i][0] = number1 + " " + number2;
            if (number1 < number2) {
                miniNumber = number1;
            } else {
                miniNumber = number2;
            }
            for (var ii = 1; ii <= miniNumber; ii++) {
                if (number1 % ii == 0 && number2 % ii == 0) {
                    result = ii;
                }
            }
            ParametrsGame[i][1] = Integer.toString(result);
            ParametrsGame[i][2] = " is wrong answer ;(. Correct answer was " + result + ".";
        }
        Engine.engine(ParametrsGame, rule);
    }
}
