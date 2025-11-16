package exceptionhandling;
import java.util.Scanner;
public class Try_catch {
	
	public static long factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        try {
   
            System.out.print("Enter a number to find its factorial: ");
            int num = scanner.nextInt();

            long fact = factorial(num);

            System.out.println("The factorial of " + num + " is " + fact + ".");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            scanner.close();
        }
	  
	}

}
