import java.io.*;

public class BufferedOutputStreamExample {

    public static void main(String[] args) {
        // Specify the file path
        String filePath = "output.txt";

        try {
            // Create a FileOutputStream for the specified file path
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);

            // Wrap the FileOutputStream with a BufferedOutputStream
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            // Sample data to be written to the file
            String data = "Hello, this is an example of using a buffer with FileOutputStream.\nand also an example of using a buffer to display this text";

            // Convert the string to bytes
            byte[] byteArray = data.getBytes();

            // Write the data to the buffered output stream
            bufferedOutputStream.write(byteArray);

            // Flush the buffered output stream to ensure immediate writing of buffered data
            bufferedOutputStream.flush();

            // Close the buffered output stream
            bufferedOutputStream.close();

            System.out.println("Data has been written to the file successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            FileInputStream readfil = new FileInputStream(filePath);
            BufferedInputStream buread= new BufferedInputStream(readfil);
            // Read the bytes into a byte array
            byte[] byteArray = buread.readAllBytes();

            // Convert the byte array to a string
            String data = new String(byteArray);

            // Print the read data
            System.out.println("Data read from the file: " + data);

            // Close the buffered input stream
            buread.close();
        } catch (IOException  e) {
            throw new RuntimeException(e);
        }
    }
}
