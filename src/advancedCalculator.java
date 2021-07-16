import java.util.Scanner;

public class advancedCalculator {
    public static void main(String[] args) {

        // Task 3 Advanced Calculator
        //Write a program to do multiple calculation options with two numbers

        //Create two numerical variables with initial values
//        int varA = 5;
//        int varB = 5;

        //Create an char type variable which represents the user option (please use the switch control)
//        char operator = 'v';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first variable: ");
        int varA = scanner.nextInt();

        System.out.println("Choose and enter an operator ('+', '-', '/', '*', '%', 'p', 'b' or 's'): ");
        String str = scanner.next();
        char operator = str.charAt(0);

        System.out.println("Enter the second variable: ");
        int varB = scanner.nextInt();


        switch (operator) {
            case '+':
                System.out.println("The sum of both variables is: " + (varA+varB));
                break;
            case '-':
                System.out.println("The result of subtraction is: " + (varA-varB));
                break;
            case '/':
                double result = ((double)varA/varB);
                System.out.println("The result of division is: " + result);
                break;
            case '*':
                System.out.println("The result of multiplication is: " + (varA*varB));
                break;
            case '%':
                System.out.println("The remainder of division is: " + (varA%varB));
                break;
            case 'p':
                System.out.println("Entered variables are: " + varA + " and " + varB);
                break;
            case 'b':
                if (varA>varB) {
                    System.out.println(varA + " is the bigger variable");
                } else if (varA<varB) {
                    System.out.println(varB + " is the bigger variable");
                } else {
                    System.out.println("Both variables are equal!");
                }
                break;
            case 's':
                if (varA<varB) {
                    System.out.println(varA + " is the smaller variable");
                } else if (varA>varB) {
                    System.out.println(varB + " is the smaller variable");
                } else {
                    System.out.println("Both variables are equal!");
                }
                break;
            default:
                System.out.println("Such operator doesn't exist!");
                break;

        }


    }

}
