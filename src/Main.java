import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Main main = new Main();
    private static Connection connection;
    public static int NUMBER = 0;
    public static String WHITE_COLOR = "\u001B[47m";
    public static String BLACK_COLOR = "\u001B[30m";
    public static String RED_COLOR = "\u001B[31m";
    public static String GREEN_COLOR = "\u001B[32m";
    public static String MAGENTA_COLOR = "\u001B[35m";
    public static String BLUE_COLOR = "\u001B[34m";
    public static String YELLOW_COLOR = "\u001B[33m";
    public static String BOLD = "\u001B[1m";
    public static String UNDERLINE = "\u001B[4m";
    public static String RESET = "\u001B[0m";
    public static String SINGLE_BLOCK = "██";
    public static String[] GREECE_FLAG_LINES = {
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
    public static ArrayList<String> cells = new ArrayList<>();
    public static void main(String[] args) {
        BattleShip newGame = new BattleShip();
    }

    /* Exercise 1
    *  1: Install the JDK 18 & Then we go to enviroment varables and we create a new one
    *  with the jdk path, we will create a new varaible like this: %JAVA_PATH_NAME/bin
    *
    *  2: To change the version we just have to edit the previous path and the
    *  JAVA_PATH_NAME/bin will do the change automatically
    * */


    // Exercise 2
    public void iLoveJava() {
        System.out.println("I <3 Java");
    }

    // Exercise 3
    public void scapeSequences() {
        System.out.println("Hey I'm Albert \nHow are you today?");
        System.out.println("These \t are \t tabbed \t words ");
        System.out.println("This is a slash \\ ");
        System.out.println("\"I like the product - Elena\"");
        System.out.println("\'car\'");
        System.out.println("simple\rWord");
        System.out.println("Some\bTesting");
    }

    // Exercise 4
    public void explainAlgorithm() {
        int num1 = 10; // Number 1 value
        int num2 = 20; // Number 2 value
        int sum = num1 + num2; // Sum of Number 1 & 2
        System.out.println(sum); // Print result of the sum
    }

    // Exercise 5
    public void typesOfValues() {
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
    public void circularNumbers() {
        byte num1 = (byte) 135;
        short num2 = (short) 32792;
        int num3 = (int) 2147484647L;
        long num4 = (long) 9223372036854795807f;;
    }

    // Exercise 7
    public final byte NUM1 = (byte) 135;
    public final short NUM2 = (short) 32792;
    public final int NUM3 = (int) 2147484647L;
    public final long NUM4 = (long) 9223372036854795807f;

    // Exercise 8
    public void personalData() {
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
    public void operations() {
        int num1 = 10 - 5;
        int num2 = 55 + 45;
        int num3 = -3;
        int num4 = 5 * 5;
        int num6 = (int) 25 / 7;
        float num7 = 25f / 7;
        double num8 = (double) 25 % 4;
    }

    // Exercise 10
    public void increaseNumber() {
        NUMBER ++;
    }

    public void decreaseNumber() {
        NUMBER -= 2;
    }

    // Exercise 11
    public void combinedOperations() {
        int number = 25;
        number += 25;
        number -= 15;
        number *= 2;
        number /= 2;
        number %= 3;
        System.out.println(number);
    }

    // Exercise 12
    public void logicOperators() {
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
    public void logicOperators2() {
        boolean bool1 = true, bool2 = false, bool3 = false;
        System.out.println(bool1 == !bool2);
        System.out.println(bool2 == !bool3);
    }

    // Exercise 14
    public boolean isOdd(int number) {
        return number % 2 == 0;
    }

    public void printWhiteOrBlack() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        if(randomNumber <= 50) {
            System.out.println("White");
        } else {
            System.out.println("Black");
        }
    }

    // Exercise 15
    public void printRedOrBlack() {
        double randomValue = Math.round(Math.random());
        if(randomValue == 0) {
            System.out.println("Red");
        } else {
            System.out.println("Black");
        }
    }

    public void getClimateDetails(double temperature) {
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
    public void numberToWord(int number) {
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

    public boolean isPositive(int number) {
        return (number >= 0);
    }

    // Exercise 17
    public void createTreeWithLoops() {
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
    public ArrayList<Integer> getOddNumbers(int[] numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                oddNumbers.add(numbers[i]);
            }
        }
        return oddNumbers;
    }

    public ArrayList<Integer> getMultiplesOf3(int[] numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 3 == 0) {
                oddNumbers.add(numbers[i]);
            }
        }
        return oddNumbers;
    }

    public void greetMultipleTimes(int times) {
        int index = 0;
        do {
            System.out.println("Hello!");
            index++;
        } while (index < times);
    }

    public void reverseAlphabet() {
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
    public void exitAtThirdIteration() {
        int index = 0;
        while(index < 3) {
            index++;
        }
    }

    // Exercise 20
    public String javaOrNull(String param) {
        if(param == "java") {
            return param;
        } else {
            return null;
        }
    }

    public boolean login(String user, String password) {
        return (user == "admin" && password == "1234");
    }

    public boolean randomOddOrEven() {
        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        return (randomNumber % 2 == 0);
    }

    // Exercise 21
    public void drawFlag(String flagName, String[] colorDigitBreak) {


        int maxCharWidth = 18;

        for(String action: colorDigitBreak ) {
            String color = splitByCommas(action)[0];
            switch (color) {
                case "white":
                    color = WHITE_COLOR;
                    break;
                case "black":
                    color = BLACK_COLOR;
                    break;
                case "red":
                    color = RED_COLOR;
                    break;
                case "green":
                    color = GREEN_COLOR;
                    break;
                case "magenta":
                    color = MAGENTA_COLOR;
                    break;
                case "blue":
                    color = BLUE_COLOR;
                    break;
                case "yellow":
                    color = YELLOW_COLOR;
                    break;
                default:
                    color = WHITE_COLOR;
                    break;

            }
            int digit = Integer.parseInt(splitByCommas(action)[1]);
            boolean isBreak = splitByCommas(action)[2].equals("break");
            for(int i = 0; i < digit; i++) {
                System.out.print(RESET + color + SINGLE_BLOCK);
            }
            if(isBreak) {
                System.out.print(RESET + "\n");
            }
        }
        System.out.println(RESET + BOLD + UNDERLINE + flagName);
    }

    public String[] splitByCommas(String text) {
        return text.split(",");
    }

    // Exercise 22
    public void printRandomColors() {
        Random random = new Random();
        String[] posibleColors =
        {WHITE_COLOR, BLACK_COLOR, RED_COLOR, BLUE_COLOR, YELLOW_COLOR, GREEN_COLOR, MAGENTA_COLOR};
        System.out.println(RESET + BOLD + UNDERLINE + "Random colors");
        for(int i = 0; i < 50; i++) {
            int randomColorIndex = random.nextInt(7);
            System.out.print(RESET + posibleColors[randomColorIndex] + SINGLE_BLOCK);
        }
    }

    // Exercise 23
    public void createTreeWithLoopsPainted() {
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
                currentLine += (WHITE_COLOR + " " + RESET);
            }
            for(int subIndex2 = 0; subIndex2 < asteriskCount; subIndex2++) {
                currentLine += (GREEN_COLOR + "*" + RESET);
            }
            for(int subIndex = 0; subIndex < currentSpaces; subIndex++) {
                currentLine += (WHITE_COLOR + " " + RESET);
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
            System.out.println(RESET + BLACK_COLOR + bottomLine);
        }
    }

    // Exercise 24
    public void typeOfValueTable() {
        System.out.println("[" + BOLD + "BYTE" + RESET + "]-------------------");
        System.out.println(BOLD + "Byte count" + RESET + ": 1 Byte / 8 Bits");
        System.out.println(BOLD + "Range" + RESET + ": -128 to 127");
    }

    // Exercise 25
    /* 1:
    *  You can obtain the class using: ((Object) variableName).getClass();
    *  You can only obtain the class of the types that are not primitive values, like int.
    *  EXAMPLES:
    *   int primitiveInt = 42;
    *   Integer wrappedInt = Integer.valueOf(primitiveInt);
    *
    *   Integer wrappedInt = Integer.valueOf(42);
    *   int primitiveInt = wrappedInt.intValue();
    */
    public void displayType(Object param) {
        if (param.getClass().isPrimitive()) {
            System.out.println(param.getClass().getName() + " (primitive)");
        } else {
            System.out.println(param.getClass().getName());
        }
    }

    // Exercise 26
    public void conversions() {
        // 1:
        double doubleValue = 123.456;

        float floatValue = (float) doubleValue;
        long longValue = (long) floatValue;
        int intValue = (int) longValue;
        short shortValue = (short) intValue;
        byte byteValue = (byte) shortValue;

        // 2:
        byte byteValue2 = 100;
        short shortValue2 = (short) byteValue2;
        int intValue2 = (int) shortValue2;
        long longValue2 = (long) intValue2;
        float floatValue2 = (float) longValue2;
        double doubleValue2 = (double) floatValue2;

        /* 3:
        *  If we have a byte bigger than 127 it will crash, we need to change the
        *  variable type to ensure that the value is lower than the type max. In
        *  this change we can change it to short.
        * */
    }

    // Exercise 27
    public void printfUsage() {
        String name = "NAME", surname1 = "SURNAME1", surname2 = "SURNAME2";
        System.out.printf("%-10s %-10s %-10s%n", name, surname1, surname2);
        System.out.printf("%-10s %s%s%n", name, surname1, surname2);
        System.out.printf("%3$s %2$s %1$s%n", name, surname1, surname2);
        System.out.printf("%10s%n","22");
        System.out.printf("%010d%n",22);
        System.out.printf("%010.2f%n",17.1829327);
        System.out.printf("%s\r%s%s%n","This is a","Hello","World");
    }

    // Exercise 28
    public void printStudentsTable() {
        System.out.printf("%-15s%-15s%-15s%-15s%n", "Name", "Surnames", "Class", "Birth Year");
        System.out.println("-----------------------------------------------------------");
        String[] names = {"Mounir", "Albert", "Ivan", "Luciano"};
        String[] surnames = {"Jhonson", "Castineira", "Martinez", "Brown"};
        String[] classes = {"Java1", "Java3", "Java2", "Java5"};
        int[] birthYears = {2000, 2001, 2002, 2003};
        for (int i = 0; i < 4; i++) {
            System.out.printf("%-15s%-15s%-15s%-15d%n", names[i], surnames[i], classes[i], birthYears[i]);
        }
    }

    // Exercise 29
    /* Code on package main
    *  We can import methods using: import com.actions.HelloWorld;
    *  Or we can import all actions using: import com.actions.*;
    */

    // Exercise 30
    public void iterationUsingRecursion() {
        // 1:
        String[] technologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
        iterateWithRecursion(technologies,0);

        // 2: Will be the same till index reaches HTML index

        // 3:
        long target = 11235813213455L;
        long a = 0, b = 1;
        int n = 0;
        fibonacciRecursive(a, b, n, target);

        // 4:
        System.out.println(reverseWord("supercalifrasticolisticoespialidoso"));

        // 5:
        System.out.println(sumDigitsFromNumber(328495908));
    }

    public void iterateWithRecursion(String[] array, int index) {
        if (index >= array.length) {
            return;
        }
        System.out.println(array[index]);
        iterateWithRecursion(array,index+1);
    }

    public void fibonacciRecursive(long a, long b, int n, long target) {
        if (a > target) {
            return;
        }
        System.out.println("F(" + n + ") = " + a);
        fibonacciRecursive(b, a + b, n + 1, target);
    }

    public String reverseWord(String word) {
        if (word.length() <= 1) {
            return word;
        } else {
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            String middle = word.substring(1, word.length() - 1);
            String reversedMiddle = reverseWord(middle);
            return lastChar + reversedMiddle + firstChar;
        }
    }

    public int sumDigitsFromNumber(int number) {
        if (number < 10) {
            return number;
        } else {
            int lastDigit = number % 10;
            int remainingDigits = number / 10;
            return lastDigit + sumDigitsFromNumber(remainingDigits);
        }
    }

    // Exercise 31
    public class Car {
        private int fuel;
        private int maxSpeed;

        Car() {
            this.fuel = 100;
            this.maxSpeed = 200;
        }
        Car(int fuel, int maxSpeed) {
            this.fuel = fuel;
            this.maxSpeed = maxSpeed;
        }

        public int getFuel() {
            return this.fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        public int getMaxSpeed() {
            return this.maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public void refuel(int fuel) {
            setFuel(fuel);
        }

        public void drive() {
            System.out.println("Driving!");
        }
    }
    Car car1 = new Car();
    Car car2 = new Car(150,300);
    Car car3 = new Car(130,150);

    // Exercise 32
    public class CreditCard {
        private double balance;

        CreditCard() {
            setBalance(1000.00);
        }

        private void setBalance(double balance) {
            this.balance = balance;
        }

        private double getBalance() {
            return this.balance;
        }

        private void payTo(String bankAccount, double balance) {
            if(balance <= this.balance) {
                setBalance(this.balance - balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }

        // Exercise 33
        public class Employee {
            float salary;

        }

        public class Programmer extends Employee {
            int bonus;

            public float getSalary() {
                return this.salary;
            }

            public void setSalary(float salary) {
                this.salary = salary;
            }

            public float getBonus() {
                return this.bonus;
            }

            public void setBonus(int bonus) {
                this.bonus = bonus;
            }
        }

        // Exercise 34
        public class Person {
            private String name;
            private String surnames;
            private String id;
            private String type;
        }

        public class Client extends Person {
            private String category;
            private String code;

            private void generateCode() {
                // Code
            }
        }

        public class Employee2 extends Person {
            private String contractType;
            private double salary;

            private double calculateSalary() {
                return salary * 12;
            }
        }

        // Exercise 35
        public class BasicEmployee {
            private String name;
            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return name;
            }
        }

        public class Worker extends BasicEmployee {
            private String location;
            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }
        }

        public class Executive extends BasicEmployee {
            private String room;
            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }
        }

        public class Officer extends Executive {
            private int teamSize;
            public int getTeamSize() {
                return teamSize;
            }

            public void setTeamSize(int teamSize) {
                this.teamSize = teamSize;
            }
        }

        public class Technician extends Executive {
            private String speciality;
            public String getSpeciality() {
                return speciality;
            }

            public void setSpeciality(String speciality) {
                this.speciality = speciality;
            }
        }

    }

    // Exercise 36
    abstract class LivingCreature {
        public abstract void eat();
    }

    public class Plant extends LivingCreature {
        private String commonName;

        @Override
        public void eat() {
            System.out.println("Absorb solar light");
        }
    }

    public class Animal extends LivingCreature {
        private String name;
        @Override
        public void eat() {
            System.out.println("Eat food");
        }
    }

    public class CarnivorousAnimal extends Animal {

    }

    public class HerbivorousAnimal extends Animal {

    }

    // Exercise 37
    public interface IPerson {
        String getName(); // Getter method for name
        void setName(String name); // Setter method for name
    }

    public class Teacher implements IPerson{
        private String name;

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void setName(String name) {
            this.name = name;
        }
    }

    // Exercise 38
    public class CarVehicle {
        private String company;
        int speed;

        CarVehicle(String company, int speed) {
            setCompany(company);
            setSpeed(speed);
        }
        public void setCompany(String companyName) {
            this.company = companyName;
        }
        public String getCompany() {
            return this.company;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void getSpeed() {
            System.out.println(this.company + " car's speed is " + this.speed + "Km/hr");
        }
    }

    private CarVehicle vehicle1 = new CarVehicle("Honda", 100);
    private CarVehicle vehicle2 = new CarVehicle("Jeep", 500);
    private CarVehicle vehicle3= new CarVehicle("BMW", 800);

    // Exercise 39
    public void doGenericQuestions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = sc.nextLine();
        System.out.print("Whats your age? ");
        int age = sc.nextInt();
        System.out.println("Whats your las test mark?");
        double mark = sc.nextDouble();
        System.out.println("Are you in front of a computer right now?");
        boolean answer = sc.nextBoolean();
        sc.close();
        System.out.println(name + " is " + age + ", his last mark was " + mark + " and the answer is "
        + answer);
    }

    // Exercise 40
    public class TicTacToe {
        private String player1 = "X";
        private String player2 = "O";
        private String lastPlayerMove = null;
        private ArrayList<String> cells = new ArrayList<>();
        private String selectedOption = null;
        private Scanner sc = new Scanner(System.in);

        TicTacToe() {
            init();
        }

        private void init() {
            for(int i = 0; i < 9; i++) {
                cells.add(" ");
            }
            startGame();
        }

        private void startGame() {
            System.out.println("Select one of this options:");
            System.out.println("1 - Human vs Human");
            System.out.println("2 - Human vs CPU");
            System.out.println("3 - CPU vs CPU");
            System.out.print("Choose one option: ");
            selectedOption = sc.nextLine();
            printCells();
            while (!hasAnyPlayerWon()) {
                playRound();
            }
            System.out.println("---------------------------------------------");
            System.out.println(">> Winner is Player " + lastPlayerMove + " <<");
            System.out.println("---------------------------------------------");
        }

        private boolean hasAnyPlayerWon() {
            boolean result = false;
            boolean row1 = areCellsEqual(0,1,2);
            boolean row2 = areCellsEqual(3,4,5);
            boolean row3 = areCellsEqual(6,7,8);
            boolean column1 = areCellsEqual(0,3,6);
            boolean column2 = areCellsEqual(1,4,7);
            boolean column3 = areCellsEqual(2,5,8);
            boolean diagonal1 = areCellsEqual(0,4,8);
            boolean diagonal2 = areCellsEqual(2,4,6);
            if(row1 || row2 || row3 || column1 || column2 || column3 || diagonal1 || diagonal2) {
                result = true;
            }
            return result;
        }

        private boolean areCellsEqual(int index1, int index2, int index3) {
            boolean result = false;
            boolean cell1 = isCellFull(index1) && cells.get(index1).equals(cells.get(index2));
            boolean cell2 = isCellFull(index2) && cells.get(index2).equals(cells.get(index3));
            boolean cell3 = isCellFull(index3) && cells.get(index3).equals(cells.get(index1));
            if(cell1 && cell2 && cell3) {
                result = true;
            }
            return result;
        }

        private boolean isCellFull(int index) {
            boolean result = false;
            boolean isEmpty = cells.get(index).equals(" ");
            boolean hasPlayerValue = cells.get(index).equals("X") || cells.get(index).equals("O");
            if(!isEmpty && hasPlayerValue) {
                result = true;
            }
            return result;
        }

        private void playRound() {
            System.out.println("Write your (X,Y) move: ");

            if(!hasAnyPlayerWon()) {
                if(selectedOption.equals("3")) {
                    randomMove(player1);
                } else {
                    doMove(player1);
                }
                printCells();
                lastPlayerMove = player1;
            }

            if(!hasAnyPlayerWon()) {
                if (selectedOption.equals("2") || selectedOption.equals("3")) {
                    randomMove(player2);
                } else {
                    doMove(player2);
                }
                printCells();
                lastPlayerMove = player2;
            }
        }

        private void randomMove(String player) {
            ArrayList<Integer> emptyCellsIndex = new ArrayList<>();
            for (int index = 0; index < cells.size(); index++) {
                System.out.println("Cell: " + index + ": " + cells.get(index));
                if(!isCellFull(index)) {
                    emptyCellsIndex.add(index);
                }
            }
            Random random = new Random();
            int randomIndex = random.nextInt(emptyCellsIndex.size());
            setCellValue(emptyCellsIndex.get(randomIndex), player);
        }

        private void doMove(String player) {
            String userMove;
            boolean moveIsValid = false;
            while(!moveIsValid) {
                System.out.print("Player " + player + " move: ");
                userMove = sc.nextLine();
                if(getCellIndexFromCoords(userMove) != -1) {
                    moveIsValid = setCellValue(getCellIndexFromCoords(userMove), player);
                } else {
                    System.out.println("Invalid move!");
                }
            }
        }

        private boolean setCellValue(int index, String value) {
            boolean result = false;
            if(!isCellFull(index)) {
                cells.set(index,value);
                result = true;
            } else {
                System.out.println("--------------------------------");
                System.out.println(">> This cell is already full! <<");
                System.out.println("--------------------------------");
            }
            return result;
        }

        private int getCellIndexFromCoords(String coords) {
            int index;
            switch (coords) {
                case "A1":
                    index = 0;
                    break;
                case "A2":
                    index = 1;
                    break;
                case "A3":
                    index = 2;
                    break;
                case "B1":
                    index = 3;
                    break;
                case "B2":
                    index = 4;
                    break;
                case "B3":
                    index = 5;
                    break;
                case "C1":
                    index = 6;
                    break;
                case "C2":
                    index = 7;
                    break;
                case "C3":
                    index = 8;
                    break;
                default:
                    index = -1;
            }
            return index;
        }

        private void printCells() {
            System.out.println("\n    1   2   3  ");
            System.out.println("  + - + - + - +");
            System.out.println(
                "A | " + cells.get(0) + " | " +  cells.get(1) + " | " +  cells.get(2) + " | "
            );
            System.out.println("  + - + - + - +");
            System.out.println(
                    "B | " + cells.get(3) + " | " +  cells.get(4) + " | " +  cells.get(5) + " | "
            );
            System.out.println("  + - + - + - +");
            System.out.println(
                    "C | " + cells.get(6) + " | " +  cells.get(7) + " | " +  cells.get(8) + " | "
            );
            System.out.println("  + - + - + - +");
        }


    }

    // Exercise 41
    public void doGenericQuestionsProtected() {
        int age = 0;
        double mark = 0;
        boolean answer = false;
        String errorMessage = "Error: ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = sc.nextLine();
        System.out.print("Whats your age? ");
        try {
            age = sc.nextInt();
        } catch (Exception e) {
            System.out.println(errorMessage + e);
        }
        System.out.println("Whats your las test mark?");
        try {
            mark = sc.nextDouble();
        } catch(Exception e) {
            System.out.println(errorMessage + e);
        }
        System.out.println("Are you in front of a computer right now?");
        try {
            answer = sc.nextBoolean();
        } catch(Exception e) {
            System.out.println(errorMessage + e);
        }
        sc.close();
        try {
            System.out.println(name + " is " + age + ", his last mark was " + mark + " and the answer is "
                    + answer);
        } catch (Exception e) {
            System.out.println("Something went wrong! Error: " + e);
        }

    }

    // Exercise 42
    // Code is on the package exercise.federicoGarciaLorca

    // Exercise 43
    enum Job {
        BACKEND("Back End Developer"),
        FRONTEND("Front End Developer"),
        FULLSTACK("Full Stack Developer");
        private String jobName;

        Job(String jobName) {
            this.jobName = jobName;
        }

        public String getJobName() {
            return this.jobName;
        }
    }
    public class Developer {
        private String name, surnames, id, role;
        private int age;

        Developer(String name, String surnames, String id, Job role, int age) {
            setName(name);
            setSurnames(surnames);
            setId(id);
            setRole(role);
            setAge(age);
        }

        private void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        private void setSurnames(String surnames) {
            this.surnames = surnames;
        }

        public String getSurnames() {
            return this.surnames;
        }

        private void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return this.name;
        }

        private void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        private void setRole(Job job) {
            this.role = job.getJobName();
        }
    }

    Developer dev1 = new Developer("John", "Gonzalez","3409332340A",Job.BACKEND,23);
    Developer dev2 = new Developer("Anna", "Garcia","3409583480F",Job.FRONTEND,27);
    Developer dev3 = new Developer("Jessica", "Lexa","335583480D",Job.FULLSTACK,29);

    // Exercise 44
    private void crudDatabase() {
        final String dbUrl = "jdbc:mysql://localhost:3306/";
        final String user = "root";
        final String password = "admin";
        final String tableName = "employee";
        connection = databaseConnection(dbUrl,user,password);
        selectAllFromDB(tableName);
        //insertEmployeeIntoTable(tableName, 2, "Albert", "Castiñeira Aranda", "Spain");
        editEmployeFromTable(tableName, 2, "Albert", "Fernandez", "Spain");
        selectAllFromDB(tableName);
        deleteEmployeeFromTable(2);
    }

    private Connection databaseConnection(String dbUrl, String user, String password) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl,user,password);
            System.out.println("[SQL CONNECTION] OK");
        } catch (Exception e) {
            System.out.println("[SQL CONNECTION] EXCEPTION => " + e);
        }
        return connection;
    }
    private void selectAllFromDB(String tableName) {
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * FROM java_testing." + tableName);
            ResultSetMetaData resultMetadata = result.getMetaData();
            System.out.println("Table: " + tableName);
            for(int i = 1; i < resultMetadata.getColumnCount(); i++) {
                String columnName = resultMetadata.getColumnName(i).toString();
                System.out.printf("%15s", columnName);
            }
            int spacing = ((resultMetadata.getColumnCount() * 10) - 5);
            String formattedText = String.format("%n%" + spacing + "s", " ", " ").replace(" ","-");
            System.out.println(formattedText);
            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                String surnames = result.getString("surnames");
                String location = result.getString("location");
                System.out.printf("%n%15d%15s%15s%15s", id, name, surnames, location);
            }
            result.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("[SQL SELECT] EXCEPTION => " + e);
        }


    }

    private void insertEmployeeIntoTable(String tableName, int id, String name, String surnames, String location) {
        String query =
        "INSERT INTO java_testing." + tableName + " (id, name, surnames, location) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, surnames);
            preparedStatement.setString(4, location);
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("[SQL INSERT] New employee inserted");
            } else {
                System.out.println("[SQL INSERT] Insertion failed ");
            }
        } catch(Exception e) {
            System.out.println("[SQL INSERT] Exception " + e);
        }
    }
    private void editEmployeFromTable(String tableName, int id, String name, String surnames, String location) {
        String query =
            "UPDATE java_testing." + tableName + " SET name = ?, surnames = ?, location = ? WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, surnames);
            preparedStatement.setString(4, location);
            preparedStatement.setInt(1, id);
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("[SQL UPDATE] New employee inserted");
            } else {
                System.out.println("[SQL UPDATE] Insertion failed ");
            }
        } catch(Exception e) {
            System.out.println("[SQL INSERT] Exception " + e);
        }
    }
    private void deleteEmployeeFromTable(int id) {
        String query =
                "DELETE FROM users WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("[SQL UPDATE] New employee inserted");
            } else {
                System.out.println("[SQL UPDATE] Insertion failed ");
            }
        } catch(Exception e) {
            System.out.println("[SQL INSERT] Exception " + e);
        }
    }

    // Exercise 45
    private void showMessageIVA(){
        JOptionPane.showMessageDialog(null,
                "The total is:\n\t\t 120€ (IVA 10% not incl.)\n\t\t 132€ (with IVA incl.)");
    }

    // Exercise 46
    private void showWarningMessage() {
        String name = JOptionPane.showInputDialog("Whats your name? ");
        System.out.println("Name: " + name);
        if(name.equals("Albert")) {
            JOptionPane.showMessageDialog(
                    null,
                    name,
                    "Name",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    name,
                    "Name",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }

    // Exercise 47
    private void chooseDialogType() {
        String option = JOptionPane.showInputDialog(
                "Choose an icon: \n -1: NONE \n 0: ERROR \n 1: INFO \n 2: WARNING \n 3: QUESTION"
        );
        int type = Integer.parseInt(option);
        JOptionPane.showMessageDialog(
                null,
                "This is a custom icon represented by a number.",
                "Custom Icon",
                type
        );
    }

    // Exercise 48
    private void showInputSelectDialog() {
        String[] options = {"Option 1", "Option 2", "Option 3"};
        String selectedOption = (String) JOptionPane.showInputDialog(
                null,
                "Select an option:",
                "Select Option",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0] // Default selection
        );

        if (selectedOption != null) {
            System.out.println("Selected option: " + selectedOption);
        } else {
            System.out.println("No option selected.");
        }
    }

    // Exercise 49
    private void showCustomDialog() {
        ImageIcon customIcon = new ImageIcon("src/pizza.jpg");
        Image customImage = customIcon.getImage();
        int width = 100;
        int height = 100;
        Image resizedImage = customImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        String title = "Questions about food";
        String question = "Do you like pizza with pineapple?";
        String[] options = {"I love it", "I hate it!", "I prefer a cheese one","Next","Exit"};
        int selectedOption = JOptionPane.showOptionDialog(
                null,
                question,
                title,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                resizedIcon,
                options,
                options[0]
        );
    }

    // Exercise 50
    private void showFundesplaiWindow() {
        String title = "Fundesplai Esplai";
        ImageIcon customIcon = new ImageIcon("src/fundesplai.png");
        JDialog customDialog = new JDialog();
        customDialog.setTitle(title);
        customDialog.setResizable(false);
        customDialog.setIconImage(customIcon.getImage());
        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(Color.BLUE);
        customDialog.add(contentPanel);
        customDialog.setSize(800, 600);
        customDialog.setLocationRelativeTo(null);
        customDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        customDialog.setVisible(true);
    }

    // Exercise 51
    private void showBorderLayout() {
        JFrame frame = new JFrame("BorderLayout");
        frame.setLayout(new BorderLayout());

        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    // Exercise 52
    private void flowLayoutDialog() {
        JFrame frame = new JFrame("FlowLayout Example");

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        frame.setContentPane(panel);

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));

        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    // Exercise 53
    private void buttonsDialog() {
        JFrame frame = new JFrame("3x3 Button Grid");

        JPanel panel = new JPanel(new GridLayout(3, 3));
        frame.setContentPane(panel);

        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("Button " + i);
            panel.add(button);
        }

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Exercise 54
    static class BattleShip {

        private final int cellNumber = 50;
        private ArrayList<String> cellList = new ArrayList<>();
        private int shipPartsCount = 0;
        private int foundShipParts = 0;
        private final int shipCountEasy = 5;
        private final int shipCountMedium = 4;
        private final int shipCountDifficult = 3;
        private int turnCount = 0;
        private Scanner sc = new Scanner(System.in);
        private JFrame frame = new JFrame("BattleShip");
        private ArrayList<JButton> layoutButtons = new ArrayList<>();
        private ArrayList<Integer> pressedCells = new ArrayList<>();
        private JTextArea textArea = new JTextArea(10, 30);
        private Color waterColor = new Color(173, 216, 230);

        BattleShip() {
            setup();
        }

        private void setup() {
            for(int i = 0; i < cellNumber; i++) {
                cellList.add(" ");
            }
            buildWindow();
            generateShips();
            printGameStartMessage();
        }

        private void buildWindow() {
            Image icon = Toolkit.getDefaultToolkit().getImage("src/battleShipLogo.png");
            Image redSphere = Toolkit.getDefaultToolkit().getImage("src/redSphere.png");
            int width = 40;
            int height = 40;
            Image resizedImage = redSphere.getScaledInstance(width, height, Image.SCALE_SMOOTH);

            JPanel topPanel = new JPanel(new GridLayout(5, 5));
            Dimension buttonSize = new Dimension(50, 50); // Adjust the size as needed

            for (int i = 1; i <= cellNumber; i++) {
                JButton button = new JButton("");
                button.setPreferredSize(buttonSize);

                int index = i - 1;
                button.setBackground(waterColor);
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if(isWater(index)) {
                            button.setBackground(Color.BLUE);
                        } else {
                            button.setIcon(new ImageIcon(resizedImage));
                            button.setBackground(Color.BLUE);
                            foundShipParts++;
                        }
                        if(!pressedCells.contains(index)) {
                            pressedCells.add(index);
                            incrementTurnCount();
                            printTurn(getCellValue(index));
                        }
                        if(areAllShipsDestroyed()) {
                            endGame();
                        }

                    }
                });
                layoutButtons.add(button);
                topPanel.add(button);
            }
            textArea.setEditable(false);
            Insets padding = new Insets(10, 10, 20, 10);
            textArea.setBorder(new EmptyBorder(padding));
            textArea.setWrapStyleWord(true);
            textArea.setLineWrap(true);

            JScrollPane scrollPane = new JScrollPane(textArea);
            DefaultCaret caret = (DefaultCaret) textArea.getCaret();
            caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

            frame.setLayout(new BorderLayout());
            frame.add(topPanel, BorderLayout.NORTH);
            frame.add(scrollPane, BorderLayout.CENTER);

            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setIconImage(icon);
            frame.setVisible(true);
            textArea.setBackground(Color.BLACK);
            textArea.setForeground(Color.WHITE);
        }

        private void print(String text) {
            textArea.append("\n"+text);
        }

        private void printGameStartMessage() {
            print("Welcome to BattleShip game");
            print("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            print("You have to discover where are the hidden ships.");
            print("There are " + shipPartsCount + " map cells filled with ship parts. Good luck!");
        }
        private void incrementTurnCount() {
            turnCount++;
        }

        private void printTurn(String text) {
            print("--------------------------------");
            print("[ Turn " + turnCount + " ] " + text);
        }

        private String getCellValue(int cellIndex) {
            String cellValue = cellList.get(cellIndex);
            String result;
            if(cellValue.equals(" ")) {
                result = "Water";
            } else {
                result = "Ship";
            }
            return result;
        }

        private void printGameEndMessage() {
            print("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            print("GG! You found all the ships!");
            print("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        }

        private void disableAllButtons() {
            for(int i = 0; i < layoutButtons.size(); i++) {
                JButton button = layoutButtons.get(i);
                button.setBackground(Color.BLUE);
                button.setEnabled(false);
            }
        }

        private void endGame() {
            printGameEndMessage();
            disableAllButtons();
        }
        private boolean areAllShipsDestroyed() {
            return foundShipParts == shipPartsCount;
        }
        private Boolean isWater(int cellIndex) {
            return cellList.get(cellIndex).equals(" ");
        }

        private void generateShips() {
            setShip(getRandomShipCoords(1));
            setShip(getRandomShipCoords(2));
            setShip(getRandomShipCoords(3));
        }

        private ArrayList<Integer> getRandomCellsCube() {
            ArrayList<Integer> cells = new ArrayList<>();
            Random random = new Random();
            int randomValue = random.nextInt(27);
            int result = randomValue + 11;
            int[] valuesToAdd = {-11, -10, -9, -1, 0, 1, 9, 10, 11};

            for (int i = 0; i < 9; i++) {
                cells.add(result + valuesToAdd[i]);
            }
            return cells;
        }

        private int getRandomCellIndexFromCube(ArrayList<Integer> cellsCube) {
            Random random = new Random();
            int result = 0;
            boolean validCoords = false;
            while (!validCoords) {
                int randomCellIndex = cellsCube.get(random.nextInt(cellsCube.size()));

                if(cellList.get(randomCellIndex).equals("Ship")) {
                    validCoords = false;
                } else {
                    result = randomCellIndex;
                    validCoords = true;
                }
            }
            return result;
        }
        private int[] getRandomCellIndexesFromCube(ArrayList<Integer> cellsCube, int shipLength) {
            Random random = new Random();
            ArrayList<int[]> availableCellCombinations = new ArrayList<>();

            boolean cellsCubeMidTop = isWater(cellsCube.get(1));
            boolean cellsCubeFirstMid = isWater(cellsCube.get(3));
            boolean cellsCubeLastMid = isWater(cellsCube.get(5));
            boolean cellsCubeMidBottom = isWater(cellsCube.get(7));

            if (shipLength == 2) {
                if(cellsCubeMidTop) {
                    if(isWater(cellsCube.get(0))) {
                        availableCellCombinations.add(new int[]{cellsCube.get(0),cellsCube.get(1)});
                    }
                    if(isWater(cellsCube.get(2))) {
                        availableCellCombinations.add(new int[]{cellsCube.get(1),cellsCube.get(2)});
                    }
                }

                if(cellsCubeFirstMid) {
                    if(isWater(cellsCube.get(0))) {
                        availableCellCombinations.add(new int[]{cellsCube.get(0),cellsCube.get(3)});
                    }
                    if(isWater(cellsCube.get(6))) {
                        availableCellCombinations.add(new int[]{cellsCube.get(3),cellsCube.get(6)});
                    }
                    if(isWater(cellsCube.get(4))) {
                        availableCellCombinations.add(new int[]{cellsCube.get(3),cellsCube.get(4)});
                    }
                }

                if(cellsCubeLastMid) {
                    if(isWater(cellsCube.get(2))) {
                        availableCellCombinations.add(new int[]{cellsCube.get(2),cellsCube.get(5)});
                    }
                    if(isWater(cellsCube.get(8))) {
                        availableCellCombinations.add(new int[]{cellsCube.get(5),cellsCube.get(8)});
                    }
                    if(isWater(cellsCube.get(4))) {
                        availableCellCombinations.add(new int[]{cellsCube.get(4),cellsCube.get(5)});
                    }
                }

                if(cellsCubeMidBottom) {
                    if(isWater(cellsCube.get(6))) {
                        availableCellCombinations.add(new int[]{cellsCube.get(6),cellsCube.get(7)});
                    }
                    if(isWater(cellsCube.get(8))) {
                        availableCellCombinations.add(new int[]{cellsCube.get(7),cellsCube.get(8)});
                    }
                }
            }
            if (shipLength == 3) {
                if(cellsCubeMidTop) {
                    if(isWater(cellsCube.get(0)) && isWater(cellsCube.get(2))) {
                        availableCellCombinations.add(
                            new int[]{cellsCube.get(0),cellsCube.get(1),cellsCube.get(2)}
                        );
                    }
                    if(isWater(cellsCube.get(4)) && isWater(cellsCube.get(7))) {
                        availableCellCombinations.add(
                            new int[]{cellsCube.get(1),cellsCube.get(4),cellsCube.get(7)}
                        );
                    }
                }
                if(cellsCubeFirstMid) {
                    if(isWater(cellsCube.get(0)) && isWater(cellsCube.get(6))) {
                        availableCellCombinations.add(
                                new int[]{cellsCube.get(0),cellsCube.get(3),cellsCube.get(6)}
                        );
                    }
                }
                if(cellsCubeLastMid) {
                    if(isWater(cellsCube.get(2)) && isWater(cellsCube.get(8))) {
                        availableCellCombinations.add(
                                new int[]{cellsCube.get(2),cellsCube.get(5),cellsCube.get(8)}
                        );
                    }
                }
            }
            int randomIndex =  random.nextInt(availableCellCombinations.size());
            return availableCellCombinations.get(randomIndex);
        }

        private ArrayList<Integer> getRandomShipCoords(int shipLength) {
            ArrayList<Integer> randomCellsCube = getRandomCellsCube();
            ArrayList<Integer> generatedCoords = new ArrayList<>();
            Random random = new Random();

            if(shipLength == 1) {
                generatedCoords.add(getRandomCellIndexFromCube(randomCellsCube));
            } else {
                for(int i : getRandomCellIndexesFromCube(randomCellsCube,shipLength)) {
                    generatedCoords.add(i);
                }
            }
            return generatedCoords;
        }
        
        private boolean setShip(ArrayList<Integer> shipCells) {
            boolean canFit = true;
            String ship = "Ship";
            for(int shipCell : shipCells) {
                if(cellList.get(shipCell).equals(" ")) {
                    cellList.set(shipCell, ship);
                } else {
                    canFit = false;
                }
                shipPartsCount++;
            }
            return canFit;
        }

    }


}
