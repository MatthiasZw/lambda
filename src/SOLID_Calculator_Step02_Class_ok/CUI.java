package SOLID_Calculator_Step02_Class_ok;

import java.util.Scanner;

public class CUI {

    public void show(){

        System.out.println("Bitte Formel eingeben (a +/- b) ");
        String formel = new Scanner(System.in).nextLine();
        Formel ergebnisformel = new Parser().parser(formel);

        Integer summe = new RechenWerk().rechne(ergebnisformel);
        System.out.printf("Das Ergebnis ist: %d " , + summe);

    }
}
