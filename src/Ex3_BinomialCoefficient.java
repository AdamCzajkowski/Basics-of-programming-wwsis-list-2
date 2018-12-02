import java.util.Scanner;

public class Ex3_BinomialCoefficient {

    /*
    ENGLISH:
    Exercise 3 - Binomial coefficient
    Write program which read 2 natural number n and k, calculate and print binomial coefficient from that numbers.
    Use recursive function.

    POLISH:
    Zadanie 3 - współczynnik wielomianowy
    Napisz program, który wczyta liczby naturalne n i k a następnie wyliczy i wypisze współczynnik
    dwumianowy (n k) z tych liczb. Wyliczenie współczynnika dwumianowego zrealizuj za pomocą funkcji
    rekurencyjnej.
     */

    private static int submitFactorialInt() {
        Scanner scanner = new Scanner(System.in);
        int tmp = scanner.nextInt();
        if (tmp < 0) {
            System.out.println("Number cannot be negative, one more try!");
            submitFactorialInt();
        }
        return tmp;
    }

    private static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static void binomialCoefficient() {
        System.out.println("Submit value of n: ");
        int n = submitFactorialInt();
        System.out.println("Submit value of k (n > k): ");
        int k = submitFactorialInt();
        if (k > n) {
            System.out.println("k cannot be greater than n, one more try!");
            binomialCoefficient();
        }
        if (k == 0 || k == n) {
            System.out.println("(n k) = " + 1);
        } else {
            System.out.println("(n k) = " + (factorial(n)) / (factorial(k) * factorial(n - k)));
        }
    }

}
