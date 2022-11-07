package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void calc() {
        final int numberRounds = 3;    // Количество правильных ответов для попеды
        final int numberParam = 3;
        String[][] ParametrsGame = new String[numberRounds][numberParam];
        int number1;
        int number2;
        String operator;
        int randomOperator;
        var resultMathEx = 0;
        String rule = "What is the result of the expression?";
        final int maxNumber = 100;  // Максимальное значение рандомного числа
        for (var i = 0; i < numberRounds; i++) {
            number1 = (int) (Math.random() * maxNumber);
            number2 = (int) (Math.random() * maxNumber);
            randomOperator = (int) (Math.random() * maxNumber);
            if (randomOperator > maxNumber - (maxNumber / numberParam)) {
                operator = "*";
            } else if (randomOperator < maxNumber / numberParam) {
                operator = "+";
            } else {
                operator = "-";
            }
            ParametrsGame[i][0] = number1 + " " + operator + " " + number2;
            if (operator.equals("+")) {
                resultMathEx = number1 + number2;
            } else if (operator.equals("-")) {
                resultMathEx = number1 - number2;
            } else if (operator.equals("*")) {
                resultMathEx = number1 * number2;
            }
            ParametrsGame[i][1] = Integer.toString(resultMathEx);
            ParametrsGame[i][2] = " is wrong answer ;(. Correct answer was " + resultMathEx + ".";
        }
        Engine.engine(ParametrsGame, rule);
    }
}
