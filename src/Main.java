import java.util.Random;

public class Main {

    public static int NUMBER = 0;

    public static void main(String[] args) {
        personalData();
    }

    /* Exercise 1
    *  1: Install the JDK 18 & Then we go to enviroment varables and we create a new one
    *  with the jdk path, we will create a new varaible like this: %JAVA_PATH_NAME/bin
    *
    *  2: To change the version we just have to edit the previous path and the
    *  JAVA_PATH_NAME/bin will do the change automatically
    * */


    // Exercise 2
    public static void iLoveJava() {
        System.out.println("I <3 Java");
    }

    // Exercise 3
    public static void scapeSequences() {
        System.out.println("Hey I'm Albert \nHow are you today?");
        System.out.println("These \t are \t tabbed \t words ");
        System.out.println("This is a slash \\ ");
        System.out.println("\"I like the product - Elena\"");
        System.out.println("\'car\'");
        System.out.println("simple\rWord");
        System.out.println("Some\bTesting");
    }

    // Exercise 4
    public static void explainAlgorithm() {
        int num1 = 10; // Number 1 value
        int num2 = 20; // Number 2 value
        int sum = num1 + num2; // Sum of Number 1 & 2
        System.out.println(sum); // Print result of the sum
    }

    // Exercise 5
    public static void typesOfValues() {
        // Logic
        boolean isRed = false;
        System.out.println(isRed);

        // Character
        char titleFirstLetter = 'a';
        System.out.println(titleFirstLetter);

        // Integers
        byte age = 22;
        short year = 2023;
        int countryPopulation = 1230000;
        long serialNumber = 1028947239;
        System.out.println(age + " " + year + " " + countryPopulation + " " + serialNumber);

        // Real numbers
        float testResult = 7.5f;
        double temperature = 21.34;
        System.out.println("The result was " + testResult + ". With a temperature of" + temperature);
    }

    // Exercise 6
    public static void circularNumbers() {
        byte num1 = (byte) 135;
        short num2 = (short) 32792;
        int num3 = (int) 2147484647L;
        long num4 = (long) 9223372036854795807f;;
    }

    // Exercise 7
    public static final byte NUM1 = (byte) 135;
    public static final short NUM2 = (short) 32792;
    public static final int NUM3 = (int) 2147484647L;
    public static final long NUM4 = (long) 9223372036854795807f;

    // Exercise 8
    public static void personalData() {
        String
            name = "Albert",
            surnames = "Castiñeira Aranda",
            street = "S/ Creative 123",
            country = "Spain",
            email = "thisismymail@mail.mail";
        int postalCode = 12345;
        char gender = 'm';
        System.out.println(
                name + " " + surnames + "\n Street: " + street + ", " + country +
                "\n Email: " + email + "\n PostalCode: " + postalCode + "\n Gender: " + gender);
    }

    // Exercise 9
    public static void operations() {
        int num1 = 10 - 5;
        int num2 = 55 + 45;
        int num3 = -3;
        int num4 = 5 * 5;
        int num6 = (int) 25 / 7;
        float num7 = 25f / 7;
        double num8 = (double) 25 % 4;
    }

    // Exercise 10
    public static void increaseNumber() {
        NUMBER ++;
    }

    public static void decreaseNumber() {
        NUMBER -= 2;
    }

    // Exercise 11
    public static void combinedOperations() {
        int number = 25;
        number += 25;
        number -= 15;
        number *= 2;
        number /= 2;
        number %= 3;
        System.out.println(number);
    }

    // Exercise 12
    public static void logicOperators() {
        int num1 = 1, num2 = 2, num3 = 3, num4 = 2;
        System.out.println((num4 == num2));
        System.out.println((num2 == num3));
        System.out.println((num1 != num3));
        System.out.println((num4 < num3));
        System.out.println((num3 < num1));
        System.out.println((num1 > num3));
        System.out.println((num2 > num4));
        System.out.println((num2 > num3));
        System.out.println((num4 == num2));
        System.out.println((num2 >= num3));
        System.out.println((num2 <= num4));
        System.out.println((num2 <= num1));
        System.out.println((num1 >= num2));
        System.out.println((num2 >= num1));
        System.out.println((num2 >= num2));
    }

    // Exercise 13
    public static void logicOperators2() {
        boolean bool1 = true, bool2 = false, bool3 = false;
        System.out.println(bool1 == !bool2);
        System.out.println(bool2 == !bool3);
    }

    // Exercise 14
    public static boolean isOdd(int number) {
        return number % 2 == 0;
    }

    public static void printWhiteOrBlack() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if(randomNumber <= 50) {
            System.out.println("White");
        } else {
            System.out.println("Black");
        }
    }

    // Exercise 15
    public static void printRedOrBlack() {
        double randomValue = Math.round(Math.random());
        if(randomValue == 0) {
            System.out.println("Red");
        } else {
            System.out.println("Black");
        }
    }

    public static void getClimateDetails(double temperature) {
        String climateType = "", specificClimateRegion = "";
        if(temperature < 10) {
            climateType = "Cold climate";
            if(temperature < 5) {
                specificClimateRegion = "Polar";
            } else {
                specificClimateRegion = "High mountain";
            }
        } else if(temperature >= 10 && temperature < 20) {
            climateType = "Tempered climate";
            if(temperature < 13.5) {
                specificClimateRegion = "Oceanic";
            } else if(temperature < 16.5) {
                specificClimateRegion = "Mediterranean";
            } else {
                specificClimateRegion = "Continental";
            }
        } else if(temperature >= 20) {
            climateType = "Hot climate";
            if(temperature < 23.5) {
                specificClimateRegion = "Equatorial";
            } else if(temperature < 26.5) {
                specificClimateRegion = "Tropical";
            } else {
                specificClimateRegion = "Desert";
            }
        }
        System.out.println(climateType + " - " + specificClimateRegion);
    }

    // Exercise 16

}