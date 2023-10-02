import javax.annotation.processing.Filer;
import java.io.*;
import java.util.Scanner;

public class readAfile {
    public static void main(String[] args) throws IOException {
        readAfiles();
    }

    public static void readAfiles() throws IOException {
        File file = new File("D:\\TESTING\\mosam.txt");
        if (file.exists()) {
            file.delete();
            boolean b = file.createNewFile();
            System.out.println(b);
        }
        file.createNewFile();


        String s = "i am sreenivas how are you";
        FileWriter fw = new FileWriter(file);
        fw.write(s);
        fw.close();

//        FileReader fr = new FileReader(file);
//        int ch ;
//        while(!((ch =fr.read()) ==-1)){
//            System.out.print((char) ch);
//
//        }
//        Scanner sc = new Scanner(file);
//        while (sc.hasNextLine()) {
//            System.out.print(sc.nextLine());
//        }
//
        String s1 = " i am very intresting";
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(s+s1);
        bw.flush();

//        BufferedReader rd = new BufferedReader(new FileReader(file));
//        int mn;
//        while(!((mn =rd.read()) ==-1)){
//            System.out.print((char)mn);
//        }
        Scanner sc1 = new Scanner(file);
        while (sc1.hasNextLine()) {
            System.out.print(sc1.nextLine());
        }

    }
}
