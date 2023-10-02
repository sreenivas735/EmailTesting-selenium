import java.io.*;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        methodforwriting();
    }

    public static void methodforrading() throws IOException {
        File file = new File("D:\\TESTING\\mosam.txt");
//        if (file.exists()) {
//            file.delete();
//            file.createNewFile();
//        }
//        file.createNewFile();

        /** FileInputStream
         * Scanner
         * Filereader
         * Buffered reader
         */

//        FileInputStream fis = new FileInputStream(file);
//        int ch;
//        while (!((ch = fis.read()) == -1)) {  // ch = 65
//            char n = (char) ch;
//            System.out.print(n);
//        }
//        Scanner sc = new Scanner(file);
//        while ((sc.hasNext())){
//            System.out.print(sc.next()+ " ");
//        }

//        FileReader fr = new FileReader(file);
//        int ch;
//        while (!((ch = fr.read()) == -1)) {  // ch = 65
//            char n = (char) ch;
//            System.out.print(n);
//        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        int ch;
        while (!((ch = br.read()) == -1)) {  // ch = 65
            char n = (char) ch;
            System.out.print(n);
        }

    }

    public static void methodforwriting() throws IOException {
        File file = new File("D:\\TESTING\\mosam.txt");
        if(file.exists()){
            file.delete();
            file.createNewFile();
        }
        file.createNewFile();


        String s = "i am sathis i am in nellore";
////        FileOutputStream fos = new FileOutputStream(file);
//        FileWriter fw = new FileWriter(file);
//        fw.write(s);
//        fw.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(s);
        bw.flush();



        String s1 = "i have learned testing";
        BufferedWriter bw1 = new BufferedWriter(new FileWriter(file));
        bw1.write(s+"\n"+s1);
        bw1.flush();

        File file1 = new File("D:\\TESTING\\mosam1.txt");

    }

}
