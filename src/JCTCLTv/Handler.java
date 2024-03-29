/*package JCTCLTv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.*;

public class Handler {

    public static void main(String[] args) {
        try {
            // file content is "ABCDEFGH"
            String filePath = "/Users/pankaj/Downloads/source.txt";

            System.out.println(new String(readCharsFromFile(filePath, 1, 5)));

            writeData(filePath, "Data", 5);
            //now file content is "ABCDEData"

            appendData(filePath, "pankaj");
            //now file content is "ABCDEDatapankaj"
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void appendData(String filePath, String data) throws IOException {
        RandomAccessFile raFile = new RandomAccessFile(filePath, "rw");
        raFile.seek(raFile.length());
        System.out.println("current pointer = "+raFile.getFilePointer());
        raFile.write(data.getBytes());
        raFile.close();

    }

    private static void writeData(String filePath, String data, int seek) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        file.seek(seek);
        file.write(data.getBytes());
        file.close();
    }

    private static String[] readLineFromFile(String filePath, int seek, int chars) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "r");
        file.seek(seek);
        byte[] bytes = new byte[chars];
        file.read(bytes);
        file.close();
        return null;
    }

}*/