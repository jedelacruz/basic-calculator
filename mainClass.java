import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1,num2,operator;
        while (true) {
            System.out.println("Select an operator: ");
            System.out.println("(1) Addition");
            System.out.println("(2) Subtraction");
            System.out.println("(3) Multiplication");
            System.out.println("(4) Division");

            operator = s.nextInt();

            if (operator > 4 || operator <= 0) {
                System.out.println("Invalid number, please try again");
                continue;
            }
            System.out.println("Enter two numbers");

            num1 = s.nextInt();
            num2 = s.nextInt();

            if (operator == 1) {
                System.out.print(num1 + num2);
            } else if (operator == 2) {
                System.out.print(num1 - num2);
            } else if (operator == 3) {
                System.out.print(num1 * num2);
            } else if (operator == 4) {
                if (num2 == 0) {
                    System.out.println("Invalid number, Division by zero is not allowed");
                    continue;
                } else
                    System.out.print(num1 / num2);
            }
            System.out.println("\nDo you want to try again? y/n");
            String repeat = s.next();
            if (!repeat.equalsIgnoreCase("y"))
                break;
        }
    }

}
