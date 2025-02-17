import org.junit.jupiter.api.Test;

public class OperatorsIfSwitchBreakContinue {

    @Test
    public void basicArithmeticOperators() {
        int x = 10;
        int y = 0;
        System.out.println(x - y);
        System.out.println(x + y);
        System.out.println(x * y);

        //Division by zero
        String division;
        if (y != 0) {
            division = String.valueOf((double) x / y);
        } else {
            division = "undefined - division by zero";
        }
        System.out.println(division);
    }

//    @Test
//    public void modulusMagic() {
//
//        Scanner scannerObj = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int number = scannerObj.nextInt();
//
//        String result = (number % 2 == 0 ? "Even" : "Odd");
//        System.out.println("The number " + number + " is " + result + ".");
//        scannerObj.close();
//    }

    @Test
    public void compound() {
        int x = 6;
        x += 4;
        System.out.println(x);

        int y = 7;
        y -= 1;
        System.out.println(y);

        int z = 10;
        z *= 5;
        System.out.println(z);

        int w = 100;
        w /= 4;
        System.out.print(w);
    }
}

