import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    static void print(String str) {
        System.out.println(str + '\n');
    }

    static void print(double num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        double num1, num2, result;
        int choice;
        Scanner scanner = new Scanner(System.in);
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
                    print("Enter number1");
                    num1 = scanner.nextDouble();
                    print("Enter number2");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    print(result);
                    break;
                case 2:
                    print("Enter number1");
                    num1 = scanner.nextDouble();
                    print("Enter number2");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    print(result);
                    break;
                case 3:
                    print("Enter number1");
                    num1 = scanner.nextDouble();
                    print("Enter number2");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    print(result);
                    break;
                case 4:
                    print("Enter number1");
                    num1 = scanner.nextDouble();
                    print("Enter number2");
                    num2 = scanner.nextDouble();
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
