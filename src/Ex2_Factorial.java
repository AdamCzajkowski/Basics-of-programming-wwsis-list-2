import java.util.Scanner;

public class Ex2_Factorial {

    /*
        ENGLISH:
        Exercise 2: Factorial
        Factorial natural number n is product of consecutive from 1 to n. Factorial n! is defined recursive.
        n! = {
            1 dla n = 0
            n ∙ (n − 1)! dla n > 0
            }
        Write program which read natural number n and calculate factorial that number. Use recursive call.

        POLISH:
        Zadanie 2: silnia
        Silnia z liczby naturalnej n to iloczyn kolejnych liczb naturalnych od 1 do n. Silnia n! jest zdefiniowana
        rekurencyjnie:
        n! = {
            1 dla n = 0
            n ∙ (n − 1)! dla n > 0
            }
        Napisz program, który wczyta liczbę naturalną n a następnie wyliczy i wypisze silnię z tej liczby.
        Wyliczenie silni zrealizuj za pomocą funkcji rekurencyjnej.
    */

    public static int submitFactorialInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Submit value to calculate factorial: ");
        int tmp = scanner.nextInt();
        if (tmp < 0) {
            System.out.println("Number cannot be negative, one more try!");
            submitFactorialInt();
        }
        return tmp;
    }

    public static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static void printFactorial() {
        int tmp = submitFactorialInt();
        System.out.println("factorial of  " + tmp + " is " + factorial(tmp));
    }
}
