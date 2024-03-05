import java.util.InputMismatchException;

public class AgeCheck extends AgeLessThanZeroException {

    public static String ageValidate(Integer age) throws NullPointerException, AgeNotValidException {
        if (age == null) {
            throw new NullPointerException("Age cannot be null");
        } else if (age <= 0) {
            throw new AgeLessThanZeroException("Age cannot be zero or lessthan zero");
        } else if (age > 0 && age <= 18) {
            throw new AgeNotValidException("Age should be greater than 18 ");
        }

        return null;
    }
}