package hexlet.code;

import hexlet.code.games.*;

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
        for (int i = minNumberGame; i <= maxNumberGame; i++) {
            if (Integer.toString(i).equals(choice)) {
                switch (Integer.parseInt(choice)) {
                    case 1:
                        Cli.whatYouName();
                        break;
                    case 2:
                        CheckParity.checkParity();
                        break;
                    case 3:
                        Calc.calc();
                        break;
                    case 4:
                        GCD.gcd();
                        break;
                    case 5:
                        Progression.progression();
                        break;
                    case 6:
                        Prime.prime();
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
