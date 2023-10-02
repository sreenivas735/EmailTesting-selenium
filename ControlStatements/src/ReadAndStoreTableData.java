import java.io.File;
import java.io.IOException;
import java.util.*;

public class ReadAndStoreTableData {

    public static void main(String[] args) throws IOException {
        readAfile();
    }

    public static void readandwriteafile() {
        Map<String, String> rowData1 = new LinkedHashMap<>();
        rowData1.put("Student_Name", "Saleem");
        rowData1.put("Qualification", "B.tech");
        rowData1.put("Experience", "3");
        rowData1.put("SkillSet", "QA Full stack");
        rowData1.put("MobileNo", "83759367236");
        rowData1.put("EmailId", "saleemBsc@gmai.com");
        rowData1.put("PAN", "AHINI8972J");

        Map<String, String> rowData2 = new LinkedHashMap<>();
        rowData2.put("Student_Name", "Sekar");
        rowData2.put("Qualification", "BSC");
        rowData2.put("Experience", "2");
        rowData2.put("SkillSet", "Java Full stack");
        rowData2.put("MobileNo", "8163752352");
        rowData2.put("EmailId", "sekarBsc@gmai.com");
        rowData2.put("PAN", "AHINH3472J");


        List<Map<String, String>> tablesData = new ArrayList<>();
        tablesData.add(rowData1);
        tablesData.add(rowData2);

        for (Map<String, String> rowData : tablesData) {
            for (String key : rowData.keySet()) {
                System.out.print(key + " - " + rowData.get(key) + "\t");
            }
            System.out.println();
        }
    }

    public static void readAfile() throws IOException {
        File file = new File("D:\\TESTING\\mosam.txt");

        file.createNewFile();
    }
}
