/*package JCTCLTv;

import java.io.*;
import java.util.RandomAccess;
import java.util.Scanner;

public class Filehandler {

    public static void f (int deleteId, File file) throws IOException {

        Scanner sInFile = new Scanner(new File(file));
        FileWriter sOutFile = new FileWriter("tempEmp.sq2", false);
        int empId;
        String firstName, lastName;

        while (sInFile.hasNext()) {
            empId = sInFile.nextInt();
            firstName = sInFile.next();
            lastName = sInFile.next();
            if (empId != deleteId) {
                sOutFile.write(empId + "\t" + firstName + "\t"+lastName + "\n");
            }
        }
        sInFile.close();
        sOutFile.close();
    }
}
*/