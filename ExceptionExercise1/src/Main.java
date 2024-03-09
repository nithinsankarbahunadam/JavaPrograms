import java.util.Scanner;
public class Main extends AgeLessThanZeroException {
    public static void main(String[] args)throws NullPointerException, NumberFormatException {
        try {
            System.out.print("Enter the age : ");
            Scanner scanner = new Scanner(System.in);
            int valuein = scanner.nextInt();
            System.out.println(AgeCheck.ageValidate(valuein));
        }catch(InputMismatchException ime){
            new InputMismatchException("The given input is not valid");
        }
    }

}