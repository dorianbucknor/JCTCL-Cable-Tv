package JCTCLTv;

import com.opencsv.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvHandler {

    public static void toFile(File _file, List<String[]> chData) {
        try {
            // create FileWriter object with file as parameter
            FileWriter outFile = new FileWriter(_file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outFile);

            // create a List which contains String array
            writer.writeAll(chData);

            // closing writer connection
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static List<String[]> fromFile(File file) {

        List<String[]> AllData = new ArrayList<String[]>();

        try {
            CSVReader csvReader = new CSVReader(new FileReader(file));
            AllData = csvReader.readAll();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("File Read");
        return AllData;
    }
}
