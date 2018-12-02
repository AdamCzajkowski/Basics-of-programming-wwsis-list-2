import java.util.Scanner;

public class Ex4_LucasSequence {
/*

    ENGLISH:
    Write program, which read natural number n, calculate and print n number in Lucas Sequance. Use recursive function.

    POLISH:
    Napisz program, który wczyta liczbę naturalną n a następnie wyliczy i wypisze n-tą liczbę Lucasa.
    Wyliczenie liczby Lucasa zrealizuj za pomocą funkcji rekurencyjnej.

 */

    private static int submitPossitiveInt() {
        Scanner scanner = new Scanner(System.in);
        int tmp = scanner.nextInt();
        if (tmp < 0) {
            System.out.println("Number cannot be negative, one more try!");
            submitPossitiveInt();
        }
        return tmp;
    }

    private static int LucasSequence(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else {
            return (LucasSequence(n - 1) + LucasSequence(n - 2));
        }
    }

    public static void ResultOfLucasSequance() {
        System.out.println("Submit to which number write numbers from the Lucas sequence: ");
        int n = submitPossitiveInt();
        while (n != 0) {
            System.out.print(LucasSequence(n) + " ");
            n--;
        }
    }
}
