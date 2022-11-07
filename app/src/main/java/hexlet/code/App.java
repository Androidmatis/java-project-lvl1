package hexlet.code;

import hexlet.code.games.CheckParity;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter."
                + "\n0 - Exit"
                + "\n1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n6 - Prime");
        Scanner numberGame = new Scanner(System.in);
        String choice = numberGame.nextLine();
        System.out.println("Your choice: " + choice);
        final int maxNumberGame = 6;
        final int minNumberGame = 1;
        final int numberCliGame = 1;
        final int numberCheckParityGame = 2;
        final int numberCalcGame = 3;
        final int numberGCDGame = 4;
        final int numberProgressionGame = 5;
        final int numberPrimeGame = 6;
        for (int i = minNumberGame; i <= maxNumberGame; i++) {
            if (Integer.toString(i).equals(choice)) {
                switch (Integer.parseInt(choice)) {
                    case numberCliGame:
                        Cli.whatYouName();
                        break;
                    case numberCheckParityGame:
                        CheckParity.checkParity();
                        break;
                    case numberCalcGame:
                        Calc.calc();
                        break;
                    case numberGCDGame:
                        GCD.gcd();
                        break;
                    case numberProgressionGame:
                        Progression.progression();
                        break;
                    case numberPrimeGame:
                        Prime.prime();
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
