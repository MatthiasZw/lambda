package Step04_Interface;

import java.util.Scanner;

public class CUI {
        private Parsable parser;
        private IRechenwerk rechenWerk;

    public CUI(Parsable parser, IRechenwerk rechenWerk) {
        this.parser = parser;
        this.rechenWerk = rechenWerk;
    }

    public void show(){

        System.out.println("Bitte Formel eingeben (a +/- b) ");
        String formel = new Scanner(System.in).nextLine();
        Formel ergebnisformel = parser.parser(formel);

        Integer summe = rechenWerk.rechne(ergebnisformel);
        System.out.printf("Das Ergebnis ist: %d " , + summe);

    }
}
