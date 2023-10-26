import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static int NUMBER = 0;
    public static String[] GREECE_FLAG = {
            "blue,3,no", "white,2,no", "blue,15,break",
            "blue,3,no", "white,2,no", "blue,3,no", "white,12,break",
            "white,8,no", "blue,12,break",
            "blue,3,no", "white,2,no", "blue,3,no", "white,12,break",
            "blue,3,no", "white,2,no", "blue,15,break",
            "white,20,break",
            "blue,20,break",
            "white,20,break",
            "blue,20,break"
    };

    public static void main(String[] args) {
        drawFlag("Greece",GREECE_FLAG);
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
    public static void numberToWord(int number) {
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
    }

    public static boolean isPositive(int number) {
        return (number >= 0);
    }

    // Exercise 17
    public static void createTreeWithLoops() {
        int columns = 6;
        int maxRowSize = 20;
        int asteriskCount = 2;
        boolean firstLine = true;
        String bottomLine = "";
        for(int index = 0; index < columns; index++) {
            String currentLine = "";
            int currentSpaces = maxRowSize - asteriskCount;
            currentSpaces /= 2;
            for(int subIndex = 0; subIndex < currentSpaces; subIndex++) {
                currentLine += " ";
            }
            for(int subIndex2 = 0; subIndex2 < asteriskCount; subIndex2++) {
                currentLine += "*";
            }
            for(int subIndex = 0; subIndex < currentSpaces; subIndex++) {
                currentLine += " ";
            }
            System.out.print(currentLine);
            if(firstLine) {
                bottomLine = currentLine;
            }
            firstLine = false;
            System.out.print("\n");
            asteriskCount += 2;
        }
        for(int i = 0; i < 2; i++) {
            System.out.println(bottomLine);
        }
    }

    // Exercise 18
    public static ArrayList<Integer> getOddNumbers(int[] numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                oddNumbers.add(numbers[i]);
            }
        }
        return oddNumbers;
    }

    public static ArrayList<Integer> getMultiplesOf3(int[] numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 3 == 0) {
                oddNumbers.add(numbers[i]);
            }
        }
        return oddNumbers;
    }

    public static void greetMultipleTimes(int times) {
        int index = 0;
        do {
            System.out.println("Hello!");
            index++;
        } while (index < times);
    }

    public static void reverseAlphabet() {
        String reverseAlphabet = "ZYXWVTSRQPONMLKJIHGFEDCBA";
        int alphabetSize = reverseAlphabet.length();
        ArrayList<String> removedLetters = new ArrayList<>();

        for(char character: reverseAlphabet.toCharArray()) {
            if(character != 'A') {
                removedLetters.add(Character.toString(character));
                reverseAlphabet = reverseAlphabet.substring(1);
                System.out.println(reverseAlphabet);
            }
        }
        Collections.reverse(removedLetters);
        for(String letter: removedLetters) {
            reverseAlphabet += letter;
            System.out.println(reverseAlphabet);
        }
    }

    // Exercise 19
    public static void exitAtThirdIteration() {
        int index = 0;
        while(index < 3) {
            index++;
        }
    }

    // Exercise 20
    public static String javaOrNull(String param) {
        if(param == "java") {
            return param;
        } else {
            return null;
        }
    }

    public static boolean login(String user, String password) {
        return (user == "admin" && password == "1234");
    }

    public static boolean randomOddOrEven() {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        return (randomNumber % 2 == 0);
    }

    // Exercise 21
    public static void drawFlag(String flagName, String[] colorDigitBreak) {
        String whiteColor = "\u001B[47m";
        String blackColor = "\u001B[30m";
        String redColor = "\u001B[31m";
        String greenColor = "\u001B[32m";
        String magentaColor = "\u001B[35m";
        String blueColor = "\u001B[34m";
        String yellowColor = "\u001B[33m";

        String bold = "\u001B[1m";
        String underline = "\u001B[4m";
        String reset = "\u001B[0m";
        String singleBlock = "██";

        int maxCharWidth = 18;

        for(String action: colorDigitBreak ) {
            String color = splitByCommas(action)[0];
            switch (color) {
                case "white":
                    color = whiteColor;
                    break;
                case "black":
                    color = blackColor;
                    break;
                case "red":
                    color = redColor;
                    break;
                case "green":
                    color = greenColor;
                    break;
                case "magenta":
                    color = magentaColor;
                    break;
                case "blue":
                    color = blueColor;
                    break;
                case "yellow":
                    color = yellowColor;
                    break;

            }
            int digit = Integer.parseInt(splitByCommas(action)[1]);
            boolean isBreak = splitByCommas(action)[2].equals("break");
            for(int i = 0; i < digit; i++) {
                System.out.print(reset + color + singleBlock);
            }
            if(isBreak) {
                System.out.print(reset + "\n");
            }
        }
        System.out.println(reset + bold + underline + flagName);
    }

    public static String[] splitByCommas(String text) {
        return text.split(",");
    }


}
