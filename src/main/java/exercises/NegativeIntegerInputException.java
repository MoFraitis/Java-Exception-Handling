package exercises;

import java.util.Arrays;

public class NegativeIntegerInputException extends Exception{
    public NegativeIntegerInputException(int... negatives){
        super("The following negative integer(s) are not allowed in this operation:"+ Arrays.toString(negatives));
    }
}
