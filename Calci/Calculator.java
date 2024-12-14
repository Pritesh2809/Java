public class Calculator {
    double add(double num1, double num2) {
        return num1 + num2;
    }

    double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    double sub(double num1, double num2) {
        return num1 - num2;
    }

    double sub(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }

    double mul(double num1, double num2) {
        return num1 * num2;
    }

    double mul(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    double div(double num1, double num2) {
        return num1 / num2;
    }

    double div(double num1, double num2, double num3) {
        return (num1 / num2) / num3;
    }
}