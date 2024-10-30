package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

    public static int divide(int numerator, int denominator) {

        return numerator / denominator;

    }

    public static void divideUserInputs() {
        while (true) {
                int[] userInputs = getUserInputs();
                int result = divide(userInputs[0], userInputs[1]);
                System.out.println(result);
                break;
            }
        }


    private static InputResult getUserInputs() throws NegativeIntegerInputException {
        Scanner userInputs = new Scanner(System.in);
        InputResult inputResult = new InputResult();
        int[] inputs = new int[2];
        try {
            System.out.print("Enter divisor: ");
            inputs[0] = userInputs.nextInt();
        } catch (InputMismatchException e){
            inputResult.success = false;
            inputResult.message = "Should be an integer";
            return inputResult;
            }
        try {
            System.out.print("Enter dividend: ");
            inputs[1] = userInputs.nextInt();
        }catch (InputMismatchException e) {
            inputResult.success = false;
            inputResult.message = "Should be an integer";
            return inputResult;
        }


            if (inputs[1] == 0) {
                throw new ArithmeticException("Cannot divide by zero, please try again.");
            }
            if (inputs[0] < 0 && inputs[1] < 0) {
                throw new NegativeIntegerInputException(inputs[0], inputs[1]);
            }
            if (inputs[0] < 0 || inputs[1] < 0) {
                throw new NegativeIntegerInputException(inputs[0] < 0 ? inputs[0] : inputs[1]);
            }
        }catch (Exception e){
            return new InputResult();
        }
        return new InputResult();

    }
}
