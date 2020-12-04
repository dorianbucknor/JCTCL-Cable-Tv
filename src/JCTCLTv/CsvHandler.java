package JCTCLTv;
/**This class wascreated to handle all file operations withint the document including deleting, creating and adding information to files**/
import com.opencsv.*;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CsvHandler {

    public static void toFile(File _file, List<String[][]> chData, String[] head) {
        try {
            //convert List of two dimensional array to a list of a list of string arrays
            List<List<String[]>> _data = new ArrayList<>();
            for(int i = 0; i < 7; i++) {
               _data.add(Arrays.asList(chData.get(i)));
            }
            // create FileWriter object with file as parameter
            FileWriter outFile = new FileWriter(_file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outFile);

            //add heading
            writer.writeNext(head);
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


    public static String[] getData(String srchval, String _file) {
        File file = new File(_file);
        String[] data = null;

        if(file.exists()){
            System.out.println("heresr");
        }

    try {
            CSVReader csvReader = new CSVReader(new FileReader(file));
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                if (line != null) {
                    for (String n: line
                         ) {
                        if (n.equals(srchval)) {
                            data = line;
                        }
                    }
                }
            }
            if(data == null){
                System.out.println("Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Exit");
            return data;
    }

    public static void addMultipleRecords(List<String[]> data, File file){
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

    public static void addRecord(String[] data, File file){
        // create FileWriter object with file as parameter
        FileWriter outFile = null;
        try {
            outFile = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // create CSVWriter object filewriter object as parameter
        CSVWriter writer = new CSVWriter(outFile);

        writer.writeNext(data);
        try {
            writer.close();
            outFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<String[]> readAllData(String _file){
        File file = new File(_file);
        List<String[]> data = null;

        try {
            CSVReader csvReader = new CSVReader(new FileReader(file));
            data = csvReader.readAll();
            csvReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvException e) {
            e.printStackTrace();
        }

        return data;
    }

    public static void removeData(String srchval, String _file) {
        File file = new File(_file);
        String[] data = null;
        List<String[]> alldata = null;
        int idx = 0;

        if(file.exists()){
            System.out.println("heresr");
        }

        try {
            CSVReader csvReader = new CSVReader(new FileReader(file));
            String[] line;
            while ((line = csvReader.readNext()) != null) {
                if (line != null) {
                    for (String n: line
                    ) {
                        if (n.equals(srchval)) {
                           break;
                        }
                    }
                }
                idx++;
            }
            if(data == null){
                System.out.println("Not Found");
            }
            alldata = CsvHandler.readAllData(file.getPath());
            if(alldata != null){
                alldata.remove(idx-1);
            }
            CsvHandler.addMultipleRecords(alldata, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Exit");

    }
}
