public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Помилка: ділення на нуль!");
        }
        return a / b;
    }

    public double sqrt(double a) throws InvalidInputException {
        if(a < 0) {
            throw  new InvalidInputException("Помилка: число для квадратного кореню має бути більше або довірнювати нулю!");
        }
        return Math.sqrt(a);
    }
}
