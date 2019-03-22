import java.util.Scanner;

public class Main {

    public void calculator() {
        Scanner scanner = new Scanner(System.in);

        float firstValue = 0;
        float nextValue = 0;
        String operator = "";
        String continueRunning = null;
        float result = 0;
        String equals = "=";
        int count = 1;
        try {
            do {
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
                System.out.println("Do you want to enter more values? Enter Y to continue or N to stop");
                continueRunning = scanner.next();
                count++;

            } while (!continueRunning.equals("N".toLowerCase()));

            System.out.println("Result is: " + result);

        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        Main mn = new Main();
        mn.calculator();
    }
}
