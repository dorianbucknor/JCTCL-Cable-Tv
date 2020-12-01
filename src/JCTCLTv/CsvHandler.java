package JCTCLTv;

import com.opencsv.*;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class CsvHandler {

    public static void toFile(File _file, List<String[][]> chData) {
        try {
            List<List<String[]>> _data = new ArrayList<>();
            for(int i = 0; i < 7; i++) {
               _data.add(Arrays.asList(chData.get(i)));
            }
            // create FileWriter object with file as parameter
            FileWriter outFile = new FileWriter(_file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outFile);

            // create a List which contains String array
            for(int i = 0; i < 7; i++) {
                writer.writeAll(_data.get(i));
            }

            // closing writer connection
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static List<String[][]> fromFile(File file) {

        List<String[][]> AllData = new ArrayList<>();
        String[] line;

        try {
            CSVReader csvReader = new CSVReader(new FileReader(file));
            while ((line = csvReader.readNext()) != null ){
                if (line != csvReader.readNext()) {
                    List<String[]> data = new ArrayList<>();
                    data.add(line);
                    if (data.size() == 6) {
                        AllData.add(data.toArray(new String[1][6]));
                        data.clear();
                    } else {
                        data.add(line);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("File Read");
        return AllData;
    }

    public static List<String[]> fromFile2(File file) {

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

    public static void toFile2(List<String[]> data, File file){
        // create FileWriter object with file as parameter
        FileWriter outFile = null;
        try {
            outFile = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // create CSVWriter object filewriter object as parameter
        CSVWriter writer = new CSVWriter(outFile);

        writer.writeAll(data);
    }
    public static void toFile2(String[] data, File file){
        // create FileWriter object with file as parameter
        FileWriter outFile = null;
        try {
            outFile = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // create CSVWriter object filewriter object as parameter
        CSVWriter writer = new CSVWriter(outFile);

        writer.writeNext(data);
    }
}
