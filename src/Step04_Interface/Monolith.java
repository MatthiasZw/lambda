package Step04_Interface;

public class Monolith {
    public static void main(String[] args) {
       //Parsable parser = new Parser(); alt
       IRechenwerk rechenWerk = new RechenWerk();
        IBMParser ibmParser = new IBMParser();  // neu


        new CUI(ibmParser,rechenWerk).show();

    }
}
