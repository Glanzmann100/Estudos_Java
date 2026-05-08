package Exercicios;

public class Exercicio_22 {
    public static void main (String[] args) {
        String original = "abds VNVEA ves ERRR    ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 12);
        String s06 = original.replace("R", "T");
        String s = "potato apple lemon";
        String[] vect = s.split(" ");


        System.out.println("Original: " + original);
        System.out.println("ToLowerCase: " + s01);
        System.out.println("ToUpperCase: " + s02);
        System.out.println("Trim: " + s03); // tira os espaços
        System.out.println("Substring: " + s04); // nova string do caractere 2 em diante
        System.out.println("Substring: " + s05); // determina um começo e um fim
        System.out.println("Replace('R', 'T'): " + s06);
        System.out.println(vect[0] + " " + vect[1] + " " + vect[2]);
    }
}
