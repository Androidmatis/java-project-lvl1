package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n0 - Exit\n2 - Even"
                + "\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime");
        Scanner numberGame = new Scanner(System.in);
        int choice = numberGame.nextInt();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case 0:
                break;
            case 1:
                Cli.whatYouName();
            case 2:
                CheckParity.checkParity();
            case 3:
                Calc.calc();
            case 4:
                GCD.gcd();
            case 5:
                Progression.progression();
            case 6:
                Prime.prime();
            default: break;
        }
    }
}
