import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String operation = "";

        while (!operation.equalsIgnoreCase("exit")) {
            System.out.println("Enter the operation you want to do: add , sub , pro , div (or type 'exit' to quit)");
            operation = scanner.next();

            if (operation.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the number of inputs you want to calculate (2/3): ");
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

            double result = 0;
            boolean validOperation = true;

            switch (operation) {
                case "add":
                    result = (numinput == 2) ? calculator.add(num1, num2) : calculator.add(num1, num2, num3);
                    break;

                case "sub":
                    result = (numinput == 2) ? calculator.sub(num1, num2) : calculator.sub(num1, num2, num3);
                    break;

                case "mul":
                    result = (numinput == 2) ? calculator.mul(num1, num2) : calculator.mul(num1, num2, num3);
                    break;

                case "div":
                    result = (numinput == 2) ? calculator.div(num1, num2) : calculator.div(num1, num2, num3);
                    break;

                case "pro":
                    result = (numinput == 2) ? calculator.mul(num1, num2) : calculator.mul(num1, num2, num3);
                    break;

                default:
                    validOperation = false;
                    System.out.println("Invalid Operation");
                    break;
            }

            if (validOperation) {
                if (result == (long) result) {
                    System.out.println("Result: " + (long) result);
                } else {
                    System.out.println("Result: " + result);
                }
            }
            System.out.println("Calculator closed.");

        }
    }
}
