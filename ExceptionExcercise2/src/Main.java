import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US); //use this to change the local currency


        //NumberFormat format = NumberFormat.getCurrencyInstance(); //use this if already the local currency in set to mentioned  country

        String s;
        Number num;

        s="$45.89";


        try{
            num=format.parse(s);
            System.out.println(num);
        }catch(ParseException pe){
            System.err.println("Hey you got a exception");
        }finally{
            System.out.println("Orginal string is " + s);
        }
    }
}