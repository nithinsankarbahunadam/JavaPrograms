import java.util.InputMismatchException;

public class AgeCheck extends AgeLessThanZeroException {

    public static String ageValidate(Integer age) {
        if (age == null) {
           new NullPointerException("Age cannot be null");
        } else if (age <= 0) {
            new AgeLessThanZeroException("Age cannot be zero or lessthan zero");
        } else if (age > 0 && age <= 18) {
            new AgeNotValidException("Age should be greater than 18 ");
        } else if (age>=18) {
            return "The age is Valid";
        }else {
            new NumberFormatException("Age cannot be a string");
        }
        return null;
    }
}