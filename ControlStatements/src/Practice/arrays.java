package Practice;

import java.io.*;
import java.util.Arrays;

public class arrays {

    public static void main(String[] args) throws IOException {
        String s = "";
        File file = new File("D:\\TESTING\\Files\\ABC.txt");
        FileReader fr = new FileReader(file);
        int abc;
        while (!((abc = fr.read()) == -1)) {
            s = s + String.valueOf((char) abc);

        }

        File newreadfile = new File("D:\\TESTING\\Files\\newwritefile.txt");
        newreadfile.createNewFile();

        FileWriter fw = new FileWriter(newreadfile);
        fw.write(s);
        fw.flush();

    }
}
