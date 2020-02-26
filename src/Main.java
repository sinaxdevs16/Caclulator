import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static double num1;
    private static double num2;

    private static void print(String str) {
        System.out.println(str + '\n');
    }

    private static void print(double num) {
        System.out.println(num);
    }

    private static void Get() {
        print("Enter number1");
        num1 = scanner.nextDouble();
        print("Enter number2");
        num2 = scanner.nextDouble();
    }

    public static void main(String[] args) {
        double result;
        int choice;
        while (true) {
            print("(1) Sum");
            print("(2) Mines");
            print("(3) Mul");
            print("(4) Divide");
            print("(5) Exit");
            print("Enter Your Choice");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Get();
                    result = num1 + num2;
                    print(result);
                    break;
                case 2:
                    Get();
                    result = num1 - num2;
                    print(result);
                    break;
                case 3:
                    Get();
                    result = num1 * num2;
                    print(result);
                    break;
                case 4:
                    Get();
                    result = num1 / num2;
                    print(result);
                    break;
                case 5:
                    exit(0);
                    break;
                default:
                    print("The Entries is Incorrect !");
                    break;
            }
        }
    }
}
