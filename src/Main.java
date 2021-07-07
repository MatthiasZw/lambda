import java.io.Serializable;

interface abteilung{
final String abteilung = "EDV";  // nur konstanten;
String getAbteilung();

}

abstract  class Mitarbeiter  implements abteilung, Serializable, Cloneable, Comparable {
    static Integer persNr=1000;
    Integer personalNr;
    String name;
    Mitarbeiter(){
        this.personalNr=persNr;
        ++persNr;
    }
    abstract void einstellung();
    void test(){

    }
}

class Azubi extends Mitarbeiter{

    @Override
    public String getAbteilung() {
        return null;
    }

    @Override
    void einstellung() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
class Chef extends Mitarbeiter {


    @Override
    void einstellung() {
        test();
    }

    @Override
    public String getAbteilung() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}


public class Main {


    public static void main(String[] args) {
	// abstracte Klasse vs Inteface
    //    Mitarbeiter m = new Mitarbeiter();
        Chef c = new Chef();
        c.test();
        System.out.println("Chef  " + c.personalNr);
        Azubi a = new Azubi();
        System.out.println("Azubi  " + a.personalNr);

    }
}
