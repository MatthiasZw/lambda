package SOLID_Calculator;

import java.util.Scanner;

public class Monolith {
    public static void main(String[] args) {
        System.out.println("Bitte Formel eingeben (a + b) ");
        String formel = new Scanner(System.in).nextLine();
        String[] opperanden = formel.split("\\+");
        Integer op1=Integer.parseInt(opperanden[0].trim());
        Integer op2=Integer.parseInt(opperanden[1].trim());
        Integer summe = op1 + op2;
        System.out.printf("Das Ergebnis ist: %d " , + summe);

    }
}
