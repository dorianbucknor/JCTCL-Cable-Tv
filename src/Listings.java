import Tv.JCTCL.*;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Listings {

    public static void ListingFiles(){

        String basePath = "ListingFiles/";
        String fileName = "listing";
        String ext = ".csv";


        for (int fCounter = 1; fCounter < 8; fCounter++ )
        {
            String filelPath = basePath+fileName+fCounter+ext;
            File listingFile = new File(filelPath);

            try {
                if (listingFile.createNewFile()){
                    System.out.println("File has been created successfully");
                }
                else {System.out.println("File Error...not created");}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        List<String[]> l1data = new ArrayList<String[]>();
        List<String[]> l2data = new ArrayList<String[]>();
        List<String[]> l3data = new ArrayList<String[]>();
        List<String[]> l4data = new ArrayList<String[]>();
        List<String[]> l5data = new ArrayList<String[]>();
        List<String[]> l6data = new ArrayList<String[]>();
        List<String[]> l7data = new ArrayList<String[]>();

    }

    public static void main(String[] args) {

        Listings.ListingFiles();

        //TvDisplay tv = new TvDisplay(listing1, listing2, listing3, listing4, listing5, listing6, listing7);

        //TvDisplay.fromFile(listing1);

    }
}

