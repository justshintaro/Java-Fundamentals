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

        try (BufferedReader bufferedInputStream = new BufferedReader(new FileReader(fileReadPath));
        BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(fileWritePath))){

            do {
                i = bufferedInputStream.read();
                if (i != -1) {
                    if ((char) i == 'a') i = '-';
                    if ((char) i == 'e') i = '~';
                    if ((char) i == 'u') i = '&';
                    if ((char) i == 'o') i = '%';
                    if ((char) i == 'i') i = '$';
                    bufferedOutputStream.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileWritePath))){
            do {
                i = bufferedReader.read();
                if(i != -1) {
                    if ((char) i == '-') i = 'a';
                    if ((char) i == '~') i = 'e';
                    if ((char) i == '&') i = 'u';
                    if ((char) i == '%') i = 'o';
                    if ((char) i == '$') i = 'i';
                    System.out.print((char) i);
                }
            } while(i != -1);
        } catch(IOException exc){
            System.out.println(exc);
        }
    }
}