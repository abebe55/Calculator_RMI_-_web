import java.rmi.Naming;
import java.util.Scanner;

public class
Calculator_Client {
    public static void main(String[] args) {
        try {
            Calculator calc = (Calculator) Naming.lookup("//localhost/CalculatorService");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter first number: ");
            int x= scanner.nextInt();

            System.out.println("Choose operation: +, -, *, /");
            String operation = scanner.next();

            System.out.println("Enter second number: ");
            int y= scanner.nextInt();



            int result = 0;
            switch (operation) {
                case "+":
                    result = calc.add(x, y);
                    break;
                case "-":
                    result = calc.subtract(x, y);
                    break;
                case "*":
                    result = calc.multiply(x, y);
                    break;
                case "/":
                    result = calc.divide(x, y);
                    break;
                default:
                    System.out.println("Invalid operation");
                    System.exit(1);
            }

            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Calculator Client failed: " + e);
        }
    }
}