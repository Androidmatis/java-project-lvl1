package hexlet.code.games;

import hexlet.code.Engine;

public class CheckParity {
    public static void checkParity() {
        final int numberRounds = 3;    // Количество правильных ответов для попеды
        final int numberParam = 3;
        String[][] array = new String[numberRounds][numberParam];
        int randomNumber;
        var rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int maxNumber = 100;  // Максимальное значение рандомного числа
        for (var i = 0; i < numberRounds; i++) {
            int questionInt = (int) (Math.random() * maxNumber);
            String questionString = Integer.toString(questionInt);
            array[i][0] = questionString;
            if (questionInt % 2 == 0) {
                array[i][1] = "yes";
                array[i][2] = " is wrong answer ;(. Correct answer was 'yes'.";
            } else if (questionInt % 2 == 1) {
                array[i][1] = "no";
                array[i][2] = " is wrong answer ;(. Correct answer was 'no'.";
            }
        }
        Engine.engine(array, rule);
    }
}
