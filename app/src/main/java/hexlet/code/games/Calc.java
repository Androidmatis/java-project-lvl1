package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Calc {
    public static void calc() {
        int number1;
        int number2;
        String operator;
        int randomOperator;
        var countWin = 0;
        var resultMathEx = 0;
        var name = Engine.whatYouName();
        System.out.println("What is the result of the expression?");
        final int numberWin = 3;    // Количество правильных ответов для попеды
        final int maxNumber = 100;  // Максимальное значение рандомного числа
        for (; countWin < numberWin; countWin++) {
            number1 = (int) (Math.random() * maxNumber);
            number2 = (int) (Math.random() * maxNumber);
            randomOperator = (int) (Math.random() * maxNumber);
            if (randomOperator > 66) {
                operator = "*";
            } else if (randomOperator < 33) {
                operator = "+";
            } else {
                operator = "-";
            }
            System.out.println("Question: " + number1 + " " + operator + " " + number2);
            System.out.println("\nYour answer:");
            Scanner answerScan = new Scanner(System.in);
            String answer = answerScan.nextLine();
            if (operator.equals("+")) {
                resultMathEx = number1 + number2;
                if (Integer.parseInt(answer) == resultMathEx) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was "
                            + resultMathEx + ".");
                    Engine.youLose(name);
                    break;
                }
            } else if (operator.equals("-")) {
                resultMathEx = number1 - number2;
                if (Integer.parseInt(answer) == resultMathEx) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was "
                            + resultMathEx + ".");
                    Engine.youLose(name);
                    break;
                }
            } else if (operator.equals("*")) {
                resultMathEx = number1 * number2;
                if (Integer.parseInt(answer) == resultMathEx) {
                    System.out.println("Correct!");
                } else {
                    System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was "
                            + resultMathEx + ".");
                    Engine.youLose(name);
                    break;
                }
            }
        }
        if (countWin == numberWin) {
            Engine.youWin(name);
        }
    }
}
