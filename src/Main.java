import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner intSc = new Scanner(System.in);
        Scanner stringSc = new Scanner(System.in);

        System.out.println("Welcome to my calculator!\n");

        System.out.print("Enter the first value: ");
        int firstValue = intSc.nextInt();

        System.out.print("Enter the operation: ");
        String operation = stringSc.next();

        System.out.print("Enter the second value: ");
        int secondValue = intSc.nextInt();

        calculate(firstValue, secondValue, operation);
    }

    public static void calculate(int firstValue, int secondValue, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = firstValue + secondValue;
                System.out.printf("%d + %d = %d", firstValue, secondValue, result);
                break;

            case "-":
                result = firstValue - secondValue;
                System.out.printf("%d - %d = %d", firstValue, secondValue, result);
                break;

            case "*":
                result = firstValue * secondValue;
                System.out.printf("%d * %d = %d", firstValue, secondValue, result);
                break;

            case "/":
                result = firstValue / secondValue;
                System.out.printf("%d / %d = %d", firstValue, secondValue, result);
                break;

            default:
                System.out.println("You entered the wrong operation!");
        }
    }
}