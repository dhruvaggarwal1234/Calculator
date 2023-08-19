import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        // ask form users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        // ask form users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask form users to enter numbers
        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            //  addition operator
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            //  subtraction operator
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            //  multiplication operator
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            //  division operator
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }


    }
}
