package theory.oop.session17.staticModifier;

public class StaticAccessModifier {

    //STATIC
    //un modificator static poate fi aplicat la nivel de variabila, metoda, bloc de initializare, inner class sau inner interface
    // o proprietate/metoda statica se poate apela prin numele clasei(eg. NumeClasa.proprietate sau NumeClasa.metoda)
    // eficienta la salvarea memoriei

    //FINAL


   static String name = "Endava";

    public static void printMessage(){
        System.out.println("Printeaza metoda");
    }
}
