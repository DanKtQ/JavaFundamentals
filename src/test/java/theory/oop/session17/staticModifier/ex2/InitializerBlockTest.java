package theory.oop.session17.staticModifier.ex2;

public class InitializerBlockTest {

    private String name ="Ana";

    {
        System.out.println("setting field");
    }

        public InitializerBlockTest(){
            name = "Serena";
        System.out.println("setting constructor");

    }

    public static void main(String[] args) {
        InitializerBlockTest test = new InitializerBlockTest();
        System.out.println(test.name);
    }

}
