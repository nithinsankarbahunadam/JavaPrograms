//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends NumberNoLikeException {

    public static void main(String[] args)  {

        int a=10;

        if (a == 10){
            try {
                throw new NumberNoLikeException("Hey dude I dont like number 10 ",new NumberFormatException());
            } catch (NumberNoLikeException e) {
                throw new RuntimeException(e);
            }

        }else{
            System.out.println("This number is ok");
        }


    }


}