//Software entities (e.g., classes, modules, functions) should be open for an extension, but closed for modification.
import java.security.InvalidParameterException;

interface CalculatorOperation {
    void perform();
}
 class Addition implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    // constructor, getters and setters

    @Override
    public void perform() {
        result = left + right;
    }
}
 class Division implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    // constructor, getters and setters
    @Override
    public void perform() {
        if (right != 0) {
            result = left / right;
        }
    }
}
//Here we can easily add other class like multiplication easily without breaking rule
public class OpenClosedPrinciple {

    public void OpenClosedPrinciple(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.perform();
    }
}
