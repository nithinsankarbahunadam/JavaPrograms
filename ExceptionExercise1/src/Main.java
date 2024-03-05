import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws AgeNotValidException, NullPointerException {

        System.out.print("Enter the age: ");

        Scanner valuein = null;

        int valueage = 0;
        try {
            valuein = new Scanner(System.in);
            valueage = valuein.nextInt();


        } catch (InputMismatchException ime) {
            System.out.println("Enter a valid Input");
        } finally {
            System.out.println(AgeCheck.ageValidate(valueage));
        }


    }
}