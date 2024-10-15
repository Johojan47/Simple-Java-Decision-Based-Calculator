import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();


        while (true)
        {
        System.out.println("Welcome To My Java Calculator!!\n");
        
        System.out.print("Enter an operation (+,-,*,/, or exit): ");
        String operationInput = scanner.nextLine();
       
        if (operationInput.equalsIgnoreCase("exit"))
        {
            System.out.println();
            System.out.println("Stopping Calculator. Thank You.");
            break;
        }

        if (!operationInput.equals("+") && !operationInput.equals("-") && !operationInput.equals("*") 
        && !operationInput.equals("/"))
        {
            System.out.println("Error: Invalid Operation. Please Choose One Of The Listed.");
            System.out.println();
            continue;
            
        }

        double firstNumber = 0;
        double secondNumber = 0;
        boolean validInput =  false;
        
        while (!validInput)
        {
            System.out.println("Enter the first number: ");
            try
            {
                firstNumber = Double.parseDouble(scanner.nextLine());
                validInput = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Error: That's Not A Valid Number. Please Try Again");
            }
        }

        validInput = false;

        while (!validInput)
        {
            System.out.println("Enter the second number: ");
            try
            {
                secondNumber = Double.parseDouble(scanner.nextLine());
                validInput = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Error: That's Not A Valid Number. Please Try Again");
            }
        }

        if (operationInput.equals("+"))
        {
            System.out.println();
            System.out.print("The result of " + firstNumber + " + " + secondNumber + " = ");
            calculator.addition(firstNumber, secondNumber);
            System.out.println();
        }
        else if (operationInput.equals("-"))
        {
            System.out.println();
            System.out.print("The result of " + firstNumber + " - " + secondNumber + " = ");
            calculator.subtraction(firstNumber, secondNumber);
            System.out.println();
        }
        else if (operationInput.equals("*"))
        {
            System.out.println();
            System.out.print("The result of " + firstNumber + " * " + secondNumber + " = ");
            calculator.multiplication(firstNumber, secondNumber);
            System.out.println();
        }
        else if (operationInput.equals("/"))
        {
            if (secondNumber != 0)
            {
            System.out.println();
            System.out.print("The result of " + firstNumber + " / " + secondNumber + " = ");
            calculator.division(firstNumber, secondNumber);
            System.out.println();
            }
            else
            {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }

        System.out.println("Would you like to perform another operation (yes/no)?");
        String repeatOperation = scanner.nextLine();
        if (!repeatOperation.equalsIgnoreCase("yes"))
        {
            System.out.println("Thank you for using the Java Calculator! Goodbye!");
            break;
        }
        

        }
        
        scanner.close();

    }
}