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

        FileInputStream fin = null;
        FileOutputStream fout = null;

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            fin = new FileInputStream(fileReadPath);
            fout = new FileOutputStream(fileWritePath);
            bufferedInputStream = new BufferedInputStream(fin);
            bufferedOutputStream = new BufferedOutputStream(fout);


            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                fout.write(buffer);
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            try {
                if(fin != null){
                    fin.close();
                    bufferedInputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            try {
                if(fout != null) {
                    fout.close();
                    bufferedOutputStream.close();
                }
            } catch(IOException exc){
                System.out.println("Error Closing Output File");
            }
        }
    }
}