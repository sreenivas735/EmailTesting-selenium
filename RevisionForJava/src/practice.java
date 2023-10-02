import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class practice {
    public static void palendrom() {
        int n = 123;
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = (rev * 10) + d;
            n = n / 10;
        }
        if (rev == n) {
            System.out.println("is done");
        } else {
            System.out.println("is not done");
        }
    }

    public static String methodFiles() throws IOException {
        File f = new File("D:\\sree\\mvn install.txt");

        FileReader fr = new FileReader(f);
        int s;
        String read1="";
        char read;
        while (!((s = fr.read()) == -1)) {
            read =((char) s);
            read1 = read1 + read;

        }
        return read1;
    }

    public static void main(String[] args) throws IOException {
        String m = methodFiles();

        File f = new File("D:\\TESTING\\Files\\Devops_Document.txt");
        FileWriter fw = new FileWriter(f);
        fw.write(m);
        fw.flush();
    }
}


