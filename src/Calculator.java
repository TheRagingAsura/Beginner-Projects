import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select 1 for addition");
        System.out.println("Select 2 for subtraction");
        System.out.println("Select 3 for multiplication");
        System.out.println("Select 4 for division");
        System.out.print("User Selection: ");

        int selection = scanner.nextInt();
        while (selection != 5){

            if (selection == 1) {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt();
                System.out.println("the total is " + (a + b));
            } else if (selection == 2) {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt();
                System.out.println("the total is " + (a - b));
            } else if (selection == 3) {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt();
                System.out.println("the total is " + (a * b));
            } else if (selection == 4) {
                System.out.print("Enter first number: ");
                int a = scanner.nextInt();
                System.out.print("Enter second number: ");
                int b = scanner.nextInt();
                System.out.println("the total is " + (a / b));
            }

            System.out.println("Select the next option or 5 to exit the program");
            selection = scanner.nextInt();

        }



    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }


}
