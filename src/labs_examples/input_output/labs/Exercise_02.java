package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */
class Example02 {
    public static void main(String[] args) {

        int i;

        String fileReadPath = new String("C:/Users/shin2/Documents/Shintaro/00_CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/files/char_data.txt");
        String fileWritePath = new String("C:/Users/shin2/Documents/Shintaro/00_CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/labs/char_data_encrypted.txt");

        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream(fileReadPath);
            fout = new FileOutputStream(fileWritePath);

            do {
                i = fin.read();
                if(i != -1)
                    if((char) i == 'a')
                        i = '-';
                    fout.write(i);
                    if((char) i == 'e')
                        i = '~';
                    fout.write(i);
                    if((char) i == 'u')
                        i = '&';
                    fout.write(i);
                    if((char) i == 'o')
                        i = '%';
                    fout.write(i);
                    if((char) i == 'i')
                        i = '$';
                    fout.write(i);
            } while(i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fin != null){
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("I/O Error: " + e);
            }
            finally {
            try {
                if(fin != null){
                    fin.close();
                }
            }catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(fout != null){
                    fout.close();
                }
            } catch(IOException exc){
                System.out.println("Error Closing Output FIle");
            }
        }
    }
}