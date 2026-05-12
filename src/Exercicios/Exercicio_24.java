package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_24 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores do triangulo x: ");
        double ax = sc.nextDouble();
        double bx = sc.nextDouble();
        double cx = sc.nextDouble();

        System.out.println("Digite os valores do triangulo y: ");
        double ay = sc.nextDouble();
        double by = sc.nextDouble();
        double cy = sc.nextDouble();

        double perimetro_x = (ax + bx + cx);
        double semiPerimetro_x = (perimetro_x / 2);
        double perimetro_y = (ay + by + cy);
        double semiPerimetro_y = (perimetro_y / 2);
        double area_X = Math.sqrt(semiPerimetro_x * (semiPerimetro_x - ax) * (semiPerimetro_x - bx) * (semiPerimetro_x - cx));
        double area_y = Math.sqrt(semiPerimetro_y * (semiPerimetro_y - ay) * (semiPerimetro_y - by) * (semiPerimetro_y - cy));

        showResult(area_X, area_y);
    }

    public static void showResult(double area_X, double area_y) {
        if (area_X > area_y) {
            System.out.printf("Triangulo X tem a maior area: %.4f%n", area_X);
        } else {
            System.out.printf("Triangulo Y tem a maior area: %.4f%n", area_y);
        }
    }
}