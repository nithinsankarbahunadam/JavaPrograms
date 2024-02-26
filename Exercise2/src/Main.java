//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle cir1 = new Circle();

        System.out.println(cir1.toString());

        Circle cir2 = new Circle(20,45,7);

        System.out.println(cir2.toString());

        ScalableCircle cir3 = new ScalableCircle(20,45,23);

        System.out.println(cir3.toString());

        cir3.scale(45);

        System.out.println(cir3.toString());




    }
}