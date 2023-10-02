package KotiPractice;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

class gettabledata1 {
//    public static void main(String[] args) {
//        tabledatagetting();
//    }

    public static void tabledatagetting() {
        Map<String, String> table = new HashMap<>();
        table.put("Student_Name", "Saleem");
        table.put("Qualification", "B.tech");
        table.put("Experience", "3");
        table.put("SkillSet", "QA Full stack");
        table.put("MobileNo", "83759367236");
        table.put("EmailId", "saleemBsc@gmai.com");
        table.put("PAN", "AHINI8972J");

        Map<String, String> table1 = new HashMap<>();
        table1.put("Student_Name", "Sekar");
        table1.put("Qualification", "BSC");
        table1.put("Experience", "2");
        table1.put("SkillSet", "Java Full stack");
        table1.put("MobileNo", "8163752352");
        table1.put("EmailId", "sekarBsc@gmai.com");
        table1.put("PAN", "AHINH3472J");

        Map<String, String> table2 = new HashMap<>();
        table2.put("Student_Name", "Sekar");
        table2.put("Qualification", "BSC");
        table2.put("Experience", "2");
        table2.put("SkillSet", "Java Full stack");
        table2.put("MobileNo", "8163752352");
        table2.put("EmailId", "sekarBsc@gmai.com");
        table2.put("PAN", "AHINH3472J");


        Map<String, String> table3 = new HashMap<>();
        table3.put("Student_Name", "Sekar");
        table3.put("Qualification", "BSC");
        table3.put("Experience", "2");
        table3.put("SkillSet", "Java Full stack");
        table3.put("MobileNo", "8163752352");
        table3.put("EmailId", "sekarBsc@gmai.com");
        table3.put("PAN", "AHINH3472J");


        List<Map<String, String>> alltabledata = new LinkedList<>();
        alltabledata.add(table);
        alltabledata.add(table1);
        alltabledata.add(table2);
        alltabledata.add(table3);


        for (Map<String, String> listes : alltabledata) {

            System.out.println(listes);
        }

        for (Map<String, String> listes : alltabledata) {
            for (String key : listes.keySet()) {
                if (key == "Experience") {

                }

            }
        }


    }
}


public class gettabledata {
    public static void main(String[] args) throws IOException {
//        tableofdata(3, "Java");

    }

    public static void tableofdata(int exp, String skillll) {

        // Create employee data using HashMaps
        HashMap<String, String> employee1 = new HashMap<>();
        employee1.put("Student_Name", "Sekar");
        employee1.put("Experience", "5");
        employee1.put("Skill", "Java");

        HashMap<String, String> employee2 = new HashMap<>();
        employee2.put("Student_Name", "John");
        employee2.put("Experience", "5");
        employee2.put("Skill", "QA");

        HashMap<String, String> employee3 = new HashMap<>();
        employee3.put("Student_Name", "Alice");
        employee3.put("Experience", "4");
        employee3.put("Skill", "Java Devoloper");

        // Create a list to store the employee data
        List<HashMap<String, String>> employeeDataList = new ArrayList<>();
        employeeDataList.add(employee1);
        employeeDataList.add(employee2);
        employeeDataList.add(employee3);

        // Find the employee(s) with the highest experience
        int Exp = exp;
        String Skill = skillll;
        List<String> topEmployees = new ArrayList<>();

        for (HashMap<String, String> employeeData : employeeDataList) {
            int experience = Integer.parseInt(employeeData.get("Experience")); // "4"  4
            String skills = employeeData.get("Skill");
            if (experience > Exp & skills.contains(Skill)) { //  4 >
                topEmployees.add(employeeData.get("Student_Name"));
            }
        }
        // Print the names of employees with the highest experience
        System.out.println("Employees with above experience (" + Exp + " years):");
        for (String employeeName : topEmployees) {
            System.out.println(employeeName);
        }
    }

}

