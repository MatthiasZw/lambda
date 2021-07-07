package Step03Dependency_Injection;

import java.util.Scanner;

public class CUI {
        private Parser parser;
        private RechenWerk rechenWerk;

    public CUI(Parser parser, RechenWerk rechenWerk) {
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
