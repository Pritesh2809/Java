import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String operation;

        while (true) {
            System.out.println("Enter the operation you want to do: add, sub, mul, div, pow, mod, sqrt, log (or type 'exit' to quit): ");
            operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                break;
            }

            if (operation.equalsIgnoreCase("sqrt") || operation.equalsIgnoreCase("log")) {
                System.out.println("Enter the number: ");
                double num = scanner.nextDouble();
                double result = performSingleInputOperation(operation, num, calculator);
                System.out.println("Result: " + formatResult(result));
            } else {
                System.out.println("Enter the number of inputs you want to calculate (2 or 3): ");
                int numinput = scanner.nextInt();

                double num1, num2, num3 = 0;
                System.out.println("Enter the first number: ");
                num1 = scanner.nextDouble();
                System.out.println("Enter the second number: ");
                num2 = scanner.nextDouble();
                if (numinput == 3) {
                    System.out.println("Enter the third number: ");
                    num3 = scanner.nextDouble();
                }

                double result = performOperation(operation, num1, num2, num3, numinput, calculator);
                System.out.println("Result: " + formatResult(result));
            }
        }
        System.out.println("Calculator closed.");
        scanner.close();
    }

    private static double performSingleInputOperation(String operation, double num, Calculator calculator) {
        return switch (operation.toLowerCase()) {
            case "sqrt" -> calculator.sqrt(num);
            case "log" -> calculator.log(num);
            default -> {
                System.out.println("Invalid Operation");
                yield 0;
            }
        };
    }

    private static double performOperation(String operation, double num1, double num2, double num3, int numinput, Calculator calculator) {
        return switch (operation.toLowerCase()) {
            case "add" -> (numinput == 2) ? calculator.add(num1, num2) : calculator.add(num1, num2, num3);
            case "sub" -> (numinput == 2) ? calculator.sub(num1, num2) : calculator.sub(num1, num2, num3);
            case "mul" -> (numinput == 2) ? calculator.mul(num1, num2) : calculator.mul(num1, num2, num3);
            case "div" -> (numinput == 2) ? calculator.div(num1, num2) : calculator.div(num1, num2, num3);
            case "pow" -> (numinput == 2) ? calculator.pow(num1, num2) : calculator.pow(num1, num2, num3);
            case "mod" -> (numinput == 2) ? calculator.mod(num1, num2) : calculator.mod(num1, num2, num3);
            default -> {
                System.out.println("Invalid Operation");
                yield 0;
            }
        };
    }

    private static String formatResult(double result) {
        return (result == (long) result) ? String.valueOf((long) result) : String.valueOf(result);
    }
}
