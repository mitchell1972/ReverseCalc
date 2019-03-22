import java.util.Scanner;

public class Main {

    float result = 0;
    float firstValue = 0;
    float nextValue = 0;
    String operator = "";
    String continueRunning = null;
    String equals = "=";

    Scanner scanner = new Scanner(System.in);

    public void calculator() {
        try {
                System.out.println("Enter first value: ");
                firstValue = scanner.nextInt();

                System.out.println("Enter next value: ");
                nextValue = scanner.nextInt();

                System.out.println("Enter operator: ");
                operator = scanner.next();


                switch (operator) {
                    case "/":
                        result += firstValue / nextValue;
                        break;

                    case "*":
                        result += firstValue * nextValue;
                        break;

                    case "+":
                        result += firstValue + nextValue;
                        break;

                    case "-":
                        result += firstValue - nextValue;
                        break;

                    default:
                        result += firstValue;
                        break;
                }

        } catch (Exception e) {
        }
    }

    public void calcExtention() {

        try {
            do {

                System.out.println("Enter next value: ");
                nextValue = scanner.nextInt();

                System.out.println("Enter operator: ");
                operator = scanner.next();


                switch (operator) {
                    case "/":
                        result = result / nextValue;
                        break;

                    case "*":
                        result = result * nextValue;
                        break;

                    case "+":
                        result = result + nextValue;
                        break;

                    case "-":
                        result = result - nextValue;
                        break;
                }
                System.out.println("Enter Y to continue or N to stop");
                continueRunning = scanner.next();

            } while (!continueRunning.equals("N".toLowerCase()));
            System.out.println("Result is: " + result);

        } catch (Exception e) {

        }
    }

        public static void main (String[] args){
            Main mn = new Main();
            mn.calculator();
            mn.calcExtention();
        }

}
