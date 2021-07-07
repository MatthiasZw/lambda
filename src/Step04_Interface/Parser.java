package Step04_Interface;

public class Parser implements Parsable{

    public Formel parser(String formel) {
        Formel ergebnisformel = new Formel();

        if(formel.contains("+")) {
            ergebnisformel.operator = "\\+";
        } else if (formel.contains("-")) {
            ergebnisformel.operator ="-";
        }
        String[] opperanden = formel.split(ergebnisformel.operator);

        if (ergebnisformel.operator.equals("\\+")){
            ergebnisformel.operator= new String("+");
        }
        ergebnisformel.operand1 = Integer.parseInt(opperanden[0].trim());
        ergebnisformel.operand2 = Integer.parseInt(opperanden[1].trim());
        return ergebnisformel;

    }
}
