import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] names={"daddy" , "Nithin" , "Chandhini" , "Gowtham" , "Neethu" , "Mani" , "Mummy"};

        try {
            FileWriter fiwr = new FileWriter("output.txt");
            BufferedWriter bufwt = new BufferedWriter(fiwr);
            bufwt.write("Writing to file");
            bufwt.write("\nWriting to file again"); //we need to put "/n" so that the new line that was created will be saved onto new line
            bufwt.write("\nWriting to file again for the third time");

            for (String name : names){
                bufwt.write("\n"+ name);
            }
            bufwt.close(); //remember to close the writer othewise everything that is written wont be saved.
        } catch (IOException e) {
            System.err.println(e.fillInStackTrace());
        }


        try {
            BufferedReader bufrd = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line =bufrd.readLine()) != null ){
                System.out.println(line);
            }
            bufrd.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }
}