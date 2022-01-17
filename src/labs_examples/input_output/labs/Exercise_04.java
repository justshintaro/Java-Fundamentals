package labs_examples.input_output.labs;

import com.sun.javafx.image.IntPixelGetter;

import java.io.*;
import java.util.ArrayList;
import java.io.FileWriter;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

class Exercise04{
    public static void main(String[] args) {

        ArrayList<FantasyLeader> fantasyLeaders = new ArrayList<>();

        String filePath = "src/labs_examples/input_output/labs/fantasyLeaders.csv";

        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(filePath))){

            String line;

            while ((line = bufferedReader.readLine()) != null){
                String[] values = line.split(",");
                fantasyLeaders.add(mapValuesToFantasyObject(values));
            }

        } catch (IOException e)  {
            e.printStackTrace();
        }

        for(FantasyLeader fantasyLeader : fantasyLeaders){
            System.out.println(fantasyLeader.toString());
        }


        // write back to a newly created csv file
        System.out.println();
        String filePathWrite = new  String("src/labs_examples/input_output/labs/fantasyLeaders_copy.csv");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePathWrite))){
            for(FantasyLeader fantasyLeader : fantasyLeaders){
                System.out.println(fantasyLeader);
                bufferedWriter.write(fantasyLeader.getRank()+","+fantasyLeader.getFirstName()+","+
                        fantasyLeader.getLastName()+","+fantasyLeader.getTeam()+","+fantasyLeader.getPosition()+","+
                        fantasyLeader.getPoints()+","+fantasyLeader.getGames()+","+fantasyLeader.getAvg());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static FantasyLeader mapValuesToFantasyObject(String[] values){
        FantasyLeader fantasyLeader = new FantasyLeader();

        fantasyLeader.setRank(Integer.parseInt(values[0]));
        fantasyLeader.setFirstName(values[1]);
        fantasyLeader.setLastName(values[2]);
        fantasyLeader.setTeam(values[3]);
        fantasyLeader.setPosition(values[4]);
        fantasyLeader.setPoints(Double.parseDouble(values[5]));
        fantasyLeader.setGames(Integer.parseInt(values[6]));
        fantasyLeader.setAvg(Double.parseDouble(values[7]));

        return fantasyLeader;
    }
}