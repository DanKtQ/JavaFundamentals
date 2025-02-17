import org.junit.jupiter.api.Test;

public class DataTypes {

    @Test
    public void main() {
        // Create integer variables
        int length = 7;
        int width = 5;
        int perimeter;

        // Calculate the area of a rectangle
        perimeter = (length + width) * 2;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }

    @Test
    public void convert() {
        // Create integer variables
        int min = 6;

        // Print variables
        System.out.println("6 minutes converted in seconds is: " + min * 60);

    }

    @Test
    public void Area() {
        int side = 7;
        System.out.println("Area of a square is: " + side * side);
    }

    @Test
    public void Volume() {
        double radius = 6.5d;
        double height = 3.2d;
//  V = πr2h
        System.out.println("The volume of a cylinder is: " + Math.PI * radius * radius * height);
    }

    @Test
    public void Fahrenheit() {
        double degree = 52.3d;
//        Celsius = (Fahrenheit - 32) / 1.8
        System.out.println("Fahrenheit to Celsius for 52 degrees is:" + (degree - 32) / 1.8);
    }

    @Test
    public void hypotenuse() {
        double perpendicular = 8.9d;
        double base = 3.7d;
//      Hypotenuse = √ (Perpendicular²+ Base²)
        System.out.println("The hypotenuse of a Right-Angled Triangle with Perpendicular: " + perpendicular + " and Base " + base + " is " + Math.sqrt(perpendicular * perpendicular + base * base));
    }

    @Test
    public void boolassig() {
        boolean adevar = true;
        System.out.println("The boolean value adevar is: " + adevar);
    }

    @Test
    public void comparison() {
        int a = 44;
        int b = 75;
        boolean comparison = a > b;
        System.out.println("Is a=" + a + " > b=" + b + " true? " + comparison);

    }

    @Test
    public void weather() {
        boolean isSunny = true;
        boolean isWarm = false;
        boolean chanceOfRain = true;
        boolean shouldGoOut = (isSunny && isWarm) || (isWarm && !chanceOfRain);
//        isSunny && isWarm: You should go out if it’s both sunny and warm.
//        isWarm && !chanceOfRain: If it’s warm but not sunny, you might still go out, but only if there’s no chance of rain.
//        Logical OR (||): Combines these two conditions into a single decision.
        System.out.println("Should I go out? " + shouldGoOut);
    }

    @Test
    public void caracter() {
        char myChar = 'w';
        System.out.println(myChar);

    }

    @Test
    public void convertCase() {
        char myChar = 'q';
        System.out.println(Character.toUpperCase(myChar));
    }

    @Test
    public void concatCharString() {
        char myChar = 'w';
        String myString = "hiske";
        System.out.println(myChar + myString + myChar);
    }

    @Test
    public void printString () {
        String myString = "learning";
        System.out.println(myString);
    }

    @Test
    public void concat2Strings () {
        String myFirstString = "learning";
        String mySecondString = "byDoing";
        System.out.println(myFirstString.concat(mySecondString));
    }

    @Test
    public void replaceCharacters () {
        String myChar = "Learning";
        System.out.println(myChar.replace('n', ' '));
    }
}

