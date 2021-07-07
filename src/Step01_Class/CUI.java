package Step01_Class;

import java.util.Scanner;

public class CUI {

    public void show(){

        System.out.println("Bitte Formel eingeben (a + b) ");
        String formel = new Scanner(System.in).nextLine();
        Formel  ergebnisformel = new Parser().parser(formel);

        Integer summe = new RechenWerk().addiere(ergebnisformel);
        System.out.printf("Das Ergebnis ist: %d " , + summe);

    }
}
