import java.util.Scanner;

public class Ex1_QuadraticEquation {

    /*
    ENGLISH:
    Exercise 1: Quadratic equation
        Write the program which solve quadratic equation with one unknown: ax2 + bx +c = 0.
        The program should read from standard input real coefficients a,b and c (a ≠ 0), solve delta (function delta()),
        next using function sigma() - depending on the delta sign, calculate and prints on stadnard output all possible values of x.

    POLISH:
    Zadanie 1: równanie kwadratowe
        Napisz program, który rozwiąże równanie kwadratowe z jedną niewiadomą: ax2 + bx + c = 0.
        Program powinien wczytać ze standardowego wejścia współczynniki rzeczywiste a, b i c (zakładamy,
        że a ≠ 0), wyliczyć deltę (funkcja delta()) a następnie w zależności od znaku delty (funkcja signum())
        wyliczyć i wypisać na standardowym wyjściu wszystkie możliwe wartości x.
     */

    public static int submitInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Submit value of coefficient: ");
        return scanner.nextInt();
    }

    public static int submitValueOfA() {
        System.out.println("Submit value of a");
        int tmp = submitInt();
        if (tmp == 0) {
            System.out.println("a cannot be 0, one more time!");
            submitValueOfA();
        }
        return tmp;
    }

    private static int sigma(int value) {
        if (value < 0) {
            return -1;
        } else if (value > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void quadraticEquation(int a, int b, int c) {
        System.out.println("a*x2 + b*x + c = 0");
        System.out.println(a + "*x^2 + " + b + "*x + " + c + " = 0");

        int delta = b ^ 2 - 4 * a * c;
        if (sigma(delta) == -1) {
            System.out.println("No solution, the delta is negative");
        } else if (sigma(delta) == 1) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + String.format("%.2f", x1) + ", x2 = " + String.format("%.2f", x2));
        } else {
            int x = -b / (2 * a);
            System.out.println("x = " + String.format("%f.2", x));
        }
    }
}
