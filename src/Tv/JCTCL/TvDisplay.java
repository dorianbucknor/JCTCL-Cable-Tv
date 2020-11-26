package Tv.JCTCL;
import com.opencsv.*;
import com.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TvDisplay {

    private List<String[]> chan1List;
    private String[] ch1;
    private String[] ch1P1;
    private String[] ch1P2;
    private String[] ch1P3;
    private String[] ch1P4;
    private String[] ch1P5;

    private List<String[]> chan2List;
    private String[] ch2;
    private String[] ch2P1;
    private String[] ch2P2;
    private String[] ch2P3;
    private String[] ch2P4;
    private String[] ch2P5;

    private List<String[]> chan3List;
    private String[] ch3;
    private String[] ch3P1;
    private String[] ch3P2;
    private String[] ch3P3;
    private String[] ch3P4;
    private String[] ch3P5;

    private List<String[]> chan4List;
    private String[] ch4;
    private String[] ch4P1;
    private String[] ch4P2;
    private String[] ch4P3;
    private String[] ch4P4;
    private String[] ch4P5;

    private List<String[]> chan5List;
    private String[] ch5;
    private String[] ch5P1;
    private String[] ch5P2;
    private String[] ch5P3;
    private String[] ch5P4;
    private String[] ch5P5;

    private List<String[]> chan6List;
    private String[] ch6;
    private String[] ch6P1;
    private String[] ch6P2;
    private String[] ch6P3;
    private String[] ch6P4;
    private String[] ch6P5;

    private List<String[]> chan7List;
    private String[] ch7;
    private String[] ch7P1;
    private String[] ch7P2;
    private String[] ch7P3;
    private String[] ch7P4;
    private String[] ch7P5;

    public TvDisplay(File file1, File file2, File file3, File file4, File file5, File file6, File file7) throws Exception {

        chan1List = fromFile(file1);
        ch1 = chan1List.get(0);
        ch1P1 = chan1List.get(1);
        ch1P2 = chan1List.get(2);
        ch1P3 = chan1List.get(3);
        ch1P4 = chan1List.get(4);
        ch1P5 = chan1List.get(5);

        chan2List = fromFile(file2);
        ch2P1 = chan1List.get(1);
        ch2P2 = chan1List.get(2);
        ch2P3 = chan1List.get(3);
        ch2P4 = chan1List.get(4);
        ch2P5 = chan1List.get(5);

        chan3List = fromFile(file3);
        ch3P1 = chan1List.get(1);
        ch3P2 = chan1List.get(2);
        ch3P3 = chan1List.get(3);
        ch3P4 = chan1List.get(4);
        ch3P5 = chan1List.get(5);

        chan4List = fromFile(file4);
        ch4P1 = chan1List.get(1);
        ch4P2 = chan1List.get(2);
        ch4P3 = chan1List.get(3);
        ch4P4 = chan1List.get(4);
        ch4P5 = chan1List.get(5);

        chan5List = fromFile(file5);
        ch5P1 = chan1List.get(1);
        ch5P2 = chan1List.get(2);
        ch5P3 = chan1List.get(3);
        ch5P4 = chan1List.get(4);
        ch5P5 = chan1List.get(5);

        chan6List = fromFile(file6);
        ch6P1 = chan1List.get(1);
        ch6P2 = chan1List.get(2);
        ch6P3 = chan1List.get(3);
        ch6P4 = chan1List.get(4);
        ch6P5 = chan1List.get(5);

        chan7List = fromFile(file7);
        ch7P1 = chan1List.get(1);
        ch7P2 = chan1List.get(2);
        ch7P3 = chan1List.get(3);
        ch7P4 = chan1List.get(4);
        ch7P5 = chan1List.get(5);

        //System.out.println(Arrays.toString(chan1List) );
    }

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