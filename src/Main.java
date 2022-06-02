import java.util.Scanner;

public class Main {

    static void Addition() {

        int number, value = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Number of numbers: ");
        number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.print("number " + i + ":");
            value += scan.nextInt();
        }
        System.out.println("Result: " + value);
    }

    static void Subtraction() {

        int number, result = 0, value;

        Scanner scan = new Scanner(System.in);
        System.out.print("Number of numbers: ");
        number = scan.nextInt();

        for (int i = 1; i <= number; i++) {

            System.out.print("number " + i + ":");
            value = scan.nextInt();

            if (i == 1) {
                result += value;
                continue;
            }
            result -= value;
        }
        System.out.println("Result: " + result);
    }

    static void Multiplication() {
        int number, result = 1, value = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Number of numbers: ");
        number = scan.nextInt();

        for (int i = 1; i <= number; i++) {

            System.out.print("number " + i + ":");
            value = scan.nextInt();

            if (value == 0) {
                result = 0;
                break;
            }
            result *= value;
        }
        System.out.println("Result: " + result);

    }

    static void Division() {

        int number, value = 1;
        double result = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Number of numbers: ");
        number = scan.nextInt();

        if (number == 1) {
            System.out.println("Please enter at least two numbers!");
            Division();
        }

        for (int i = 1; i <= number; i++) {

            System.out.print("number " + i + ":");
            value = scan.nextInt();

            if (i == 1) {
                result = value;
                continue;
            } else if (i != 1 && value == 0) {
                System.out.println("You cannot enter the divisor as 0!");
                i--;
                continue;
            }
            result /= value;
        }
        System.out.println("Quotient: " + result);
    }

    static void Exponentiation() {

        int base, exp, result = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Base: ");
        base = scan.nextInt();
        System.out.print("Exponent: ");
        exp = scan.nextInt();

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
    }

    static void Modulo() {

        int dvd, dvs, result;

        Scanner scan = new Scanner(System.in);
        System.out.print("Dividend: ");
        dvd = scan.nextInt();
        System.out.print("Divisor: ");
        dvs = scan.nextInt();

        result = dvd % dvs;
        System.out.println("Remainder: " + result);

    }

    static void AreaPerimeter() {

        int s1, s2, area, perim;
        Scanner scan = new Scanner(System.in);
        System.out.print("First side: ");
        s1 = scan.nextInt();
        System.out.print("Second side: ");
        s2 = scan.nextInt();

        area = s1 * s2;
        perim = 2 * (s1 + s2);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perim);
    }

    public static void main(String[] args) {

        int select, n1, n2;
        String transaction = "1-Addition\n2-Subtraction\n3-Multiplication\n" +
                "4-Division\n5-Exponentiation\n6-Modulo\n7-Area and Perimeter of a Rectangle\n" +
                "0-Log out";

        Scanner inp = new Scanner(System.in);
        System.out.println(transaction);

        do {
            System.out.print("Enter your selection: ");
            select = inp.nextInt();

            switch (select) {
                case 1:
                    Addition();
                    break;
                case 2:
                    Subtraction();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    Exponentiation();
                    break;
                case 6:
                    Modulo();
                    break;
                case 7:
                    AreaPerimeter();
                    break;
                case 0:
                    System.out.println("Log out successful");
                    break;
                default:
                    System.out.println("You made a wrong choice, try again!");
            }
        } while (select != 0);
    }
}
