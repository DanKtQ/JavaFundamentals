package theory.oop.session17.valueVsReferenceType;

public class ReferenceType {

    public static void main(String[] args) {
        String st1 = new String("hello");
        String st2 = new String("hello");

        int intreg1 = 5;
        int intreg2 = 5;

        if (intreg2 == intreg1){
            System.out.println("Valorile sunt la fel");
    }
        else {
        System.out.println("Valorile sunt diferite");
    }

        if (st1 == st2){
            System.out.println("Valorile sunt la fel");
        }
        else {
            System.out.println("Valorile sunt diferite");
        }
    }
}
