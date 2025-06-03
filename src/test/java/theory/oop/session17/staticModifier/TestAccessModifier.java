package theory.oop.session17.staticModifier;

public class TestAccessModifier {

    public static void main(String[] args) {
//        StaticAccessModifier staticAccessModifier = new StaticAccessModifier();
//        System.out.println(staticAccessModifier.name);
//        staticAccessModifier.name  = "new Endava";
//        System.out.println(staticAccessModifier.name);
        StaticAccessModifier.name = "new Endava";
        System.out.println(StaticAccessModifier.name);
        StaticAccessModifier.printMessage();

//        StaticAccessModifier staticAccessModifier2 = new StaticAccessModifier();
//        System.out.println(staticAccessModifier2.name);
//        staticAccessModifier2.name = "new Endava";
//        System.out.println(staticAccessModifier2.name);
    }
}
