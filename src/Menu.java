import java.util.Scanner;

public class Menu {
    private static int submitOption() {
        Scanner scanner = new Scanner(System.in);
        int tmp = scanner.nextInt();
        if (tmp < 0) {
            System.out.println("Number cannot be negative, one more try!");
            submitOption();
        }
        return tmp;
    }

    public static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Ex1_QuadraticEquation  ");
        System.out.println("2. Ex2_Factorial");
        System.out.println("3. Ex3_BinomialCoefficient");
        System.out.println("4. Ex4_LucasSequence");
        System.out.println("5 Exit ");
    }

    public static void menu() {
        printMenu();
        System.out.println("\nSubmit yours option: ");
        int option = submitOption();
        switch (option) {
            case 1:
                System.out.println("1. Ex1_QuadraticEquation\n");
                Ex1_QuadraticEquation.quadraticEquation(Ex1_QuadraticEquation.submitValueOfA(), Ex1_QuadraticEquation.submitInt(), Ex1_QuadraticEquation.submitInt());
                menu();
            case 2:
                System.out.println("2. Ex2_Factorial\n");
                Ex2_Factorial.printFactorial();
                menu();
            case 3:
                System.out.println("3. Ex3_BinomialCoefficient\n");
                Ex3_BinomialCoefficient.binomialCoefficient();
                menu();
            case 4:
                System.out.println("4. Ex4_LucasSequence\n");
                Ex4_LucasSequence.ResultOfLucasSequance();
                menu();
            default:
                System.out.println("5. Exit ");
                break;
        }
    }
}
