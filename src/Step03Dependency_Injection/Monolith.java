package Step03Dependency_Injection;

public class Monolith {
    public static void main(String[] args) {
       Parser parser = new Parser();
       RechenWerk rechenWerk = new RechenWerk();



        new CUI(parser,rechenWerk).show();

    }
}
