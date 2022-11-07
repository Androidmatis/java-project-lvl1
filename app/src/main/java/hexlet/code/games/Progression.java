package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void progression() {
        final int numberRounds = 3;    // Количество правильных ответов для попеды
        final int numberParam = 3;
        final int maxsizeProgression = 10;
        String[][] array = new String[numberRounds][numberParam];
        String[] number = new String[maxsizeProgression];
        var countWin = 0;
        var rule = "What number is missing in the progression?";
        final int maxNumber = 100;  // Максимальное значение рандомного числа
        for (var i = 0; i < numberRounds; i++) {
            int numberElementInArray = (int) (Math.random() * (number.length - 1));
            int sizeProgression = (int) (Math.random() * maxsizeProgression);
            number[0] = Integer.toString((int) (Math.random() * maxNumber));
            for (var ii = 1; ii < number.length; ii++) {
                number[ii] = Integer.toString(Integer.parseInt(number[ii - 1]) + sizeProgression);
            }
            var result = number[numberElementInArray];
            number[numberElementInArray] = "..";
            String exercise = "";
            for (var iii = 1; iii < number.length; iii++) {
                if (iii == 1) {
                    exercise = exercise + number[iii];
                }
                exercise = exercise + " " + number[iii];
            }
            array[i][0] = exercise;
            array[i][1] = result;
            array[i][2] = " is wrong answer ;(. Correct answer was " + result + ".";
        }
        Engine.engine(array, rule);
    }
}
