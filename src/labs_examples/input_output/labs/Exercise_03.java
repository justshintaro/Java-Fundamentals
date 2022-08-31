package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */
class Exercise03{
    public static void main(String[] args) {

        String fileReadPathByte = new  String("src/labs_examples/input_output/files/byte_data");
        String fileWritePathByte = new  String("src/labs_examples/input_output/labs/byte_data_ex3");

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileReadPathByte));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileWritePathByte))){

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1){
                bufferedOutputStream.write(buffer);
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }



        String fileReadPathChar = new  String("src/labs_examples/input_output/files/char_data.txt");
        String fileWritePathChar = new  String("src/labs_examples/input_output/labs/char_data_ex3.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileReadPathChar));
             PrintWriter printWriter = new PrintWriter(new FileWriter(fileWritePathChar))){

            String l;

            while ((l = bufferedReader.readLine()) != null){

                printWriter.println(l);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }



        char x = 'H';
        String y = "This is String";
        boolean z = true;
        double a = 121.1234567;
        String filePath = "src/labs_examples/input_output/labs/readWriteData.txt";

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(filePath))) {

            System.out.println("Writing " + x);
            dataOut.writeChar(x);

            System.out.println("Writing " + y);
            dataOut.writeChars(y);

            System.out.println("Writing " + z);
            dataOut.writeBoolean(z);

            System.out.println("Writing " + a);
            dataOut.writeDouble(a);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}