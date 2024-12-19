class Calculator {
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

    double pow(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    double pow(double num1, double num2, double num3) {
        return Math.pow(Math.pow(num1, num2), num3);
    }

    double mod(double num1, double num2) {
        return num1 % num2;
    }

    double mod(double num1, double num2, double num3) {
        return (num1 % num2) % num3;
    }

    double sqrt(double num) {
        return Math.sqrt(num);
    }

    double log(double num) {
        return Math.log(num);
    }
}
