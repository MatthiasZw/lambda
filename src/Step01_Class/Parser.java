package Step01_Class;

public class Parser {

    public Formel parser(String formel) {
        Formel ergebnisformel = new Formel();
        String[] opperanden = formel.split("\\+");
        ergebnisformel.operand1 = Integer.parseInt(opperanden[0].trim());
        ergebnisformel.operand2 = Integer.parseInt(opperanden[1].trim());
        return ergebnisformel;

    }
}
