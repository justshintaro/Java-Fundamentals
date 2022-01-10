package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example01 {
    public static void main(String[] args) {

        String fileReadPath = new  String("C:/Users/shin2/Documents/Shintaro/00_CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/byte_data");
        String fileWritePath = new  String("C:/Users/shin2/Documents/Shintaro/00_CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/labs/byte_data_copy");

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileReadPath));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileWritePath))){

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                bufferedOutputStream.write(buffer);
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}