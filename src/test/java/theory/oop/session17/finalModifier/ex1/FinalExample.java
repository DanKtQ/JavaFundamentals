package theory.oop.session17.finalModifier.ex1;

public class FinalExample {

    // final keyword folosit poate fi aplecat pentru outer class, inner class, variabile/filed si metode
    // nu poate fi aplicata la interfete, constructor, blocks si enumuri
    // final class = nu poate fi extinsa/mostenita
    // final method = nu poate sa fie suprascrisa
    // o variabila declarata si initializata cu final nu poate fi schimbata

    static final int a = 123;

    static final int ROTI_MASINA = 4;

    public static void main(String[] args) {
        System.out.println("a = " + a);
//        a = a +1;
    }
}
