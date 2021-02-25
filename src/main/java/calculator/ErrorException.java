package calculator;

import java.util.InputMismatchException;

public class ErrorException {
    Message message = new Message();
    public int NumericalError(String number) {
        int numberConverted = 0;
        try {
            numberConverted = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            message.exceptionResult("INVALID_EQUATION");
            Calculator calculator = new Calculator();
            calculator.init();
        }
        return numberConverted;
    }
}
