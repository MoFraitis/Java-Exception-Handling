package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

    public static int divide(int numorator, int denominator) {

        return numorator / denominator;

    }

    public static void divideUserInputs() throws NegativeIntegerInputException {
        while (true) {
            try {
                int[] userInputs = getUserInputs();
                int result = divide(userInputs[0], userInputs[1]);
                System.out.println(result);
                break;
            }catch (InputMismatchException e) {
              System.out.println("Invalid input. Please try again.");
            }
            catch (ArithmeticException e) {
                System.out.println("cannot divide by zero, please try again.");
            }
        }
    }

    private static int[] getUserInputs() throws NegativeIntegerInputException {
        Scanner userInputs = new Scanner(System.in);

        int[] inputs = new int[2];
        System.out.print("Enter divisor: ");
        inputs[0] = userInputs.nextInt();
        System.out.print("Enter dividend: ");
        inputs[1] = userInputs.nextInt();
        if(inputs[0]<0 || inputs[1]<0){
            throw new NegativeIntegerInputException(inputs[0]<0? inputs[0] :inputs[1]);
        }
        return inputs;

    }
}
