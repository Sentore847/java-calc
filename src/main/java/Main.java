import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть перше число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введіть друге число: ");
            double num2 = scanner.nextDouble();

            System.out.print("Введіть операцію (+, -, *, /, sqrt): ");
            String operation = scanner.next();

            double result = 0;

            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    break;
                case "sqrt":
                    System.out.print("Виберіть число для квадратного кореня (1 - перше, 2 - друге): ");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        result = calculator.sqrt(num1);
                    } else if (choice == 2) {
                        result = calculator.sqrt(num2);
                    } else {
                        throw new InvalidInputException("Невірний вибір для квадратного кореня!");
                    }
                    break;
                default:
                    throw new InvalidInputException("Невірна операція!");
            }
            System.out.println("Результат: " + result);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Помилка: введено некоректні дані! Будь ласка, введіть число.");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Виникла помилка: " + e.getMessage());
        } finally {
            System.out.println("Обробка запиту завершена.");
        }

        scanner.close();
    }
}
