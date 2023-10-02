package flipcart;

import Assignments.S;

import java.util.*;

public class Homepage {
    public static void main(String[] args) {
//  stringsmethods();
//        methos1();
//        methodtech();
        table();
    }

    public static void stringsmethods() {
        String s = new String();
        String s1 = "hello vasudev how are you and where are you";
        String s2 = s1.trim().toLowerCase();
        char[] c = s2.toCharArray();
        String k = "";
        int countchar = 0;
        int vovwel = 0;
        int word = 1;
        for (int j = 0; j < s1.length(); j++) {
            countchar++;
            if (c[j] == ' ') {
                word++;
            }
            if (c[j] == 'a' || c[j] == 'e' || c[j] == 'i' || c[j] == 'o' || c[j] == 'u') {
                vovwel++;
                k = k + c[j];

            } else {
                k = k + c[j];
            }

        }

        System.out.println(k);
        System.out.println("vovwels count --" + vovwel);
        System.out.println("charector count --" + countchar);
        System.out.println("words count --" + word);
    }


    public static void methos() {
        HashMap<Integer, String> m = new HashMap<>();

        m.put(1, "vasu");
        m.put(2, "sree");
        m.put(3, "vasudev");


//        System.out.println(m);
//        m.replace(3, "yash");
//        System.out.println(m);

        Set<String> s = new TreeSet<>();
        Set<String> s1 = new TreeSet<>();
        Set<String> s2 = new TreeSet<>();

        s.add("vasu");
        s.add("dev");
        s.add("deva");
        s.add("yash");

        s1.add("vasu1");
        s1.add("dev1");
        s1.add("deva1");
        s1.add("yash1");

        s2.add("vasu2");
        s2.add("dev2");
        s2.add("deva2");
        s2.add("yash2");

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        List<Set<String>> l = new ArrayList<>();
        l.add(s);
        l.add(s1);
        l.add(s2);

        System.out.println(l);

    }

    public static void methos1() {
        int n = 5;
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        l.add(1);
        l.add(4);
        l.add(7);
        l.add(8);
        l.add(9);
        l1.add(9);
        l1.add(17);
        l1.add(-8);
        l1.add(5);
        l1.add(4);
        l2.add(19);
        l2.add(27);
        l2.add(-18);
        l2.add(5);
        l2.add(24);

        System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);


        Set<List<Integer>> s = new HashSet<>();
        s.add(l);
        s.add(l1);
        s.add(l2);
//        System.out.println(s);
//        for (int i = 0; i < s.size(); i++) {
//            for (int j=0; j<a.length; j++) {
//                if(a[j]==n){
//                    System.out.println(a);
//                }
//            }
//        }


    }

    public static void methodtech() {
        List<Integer> li1 = Arrays.asList(1, 5, 6, 9, 20);
        List<Integer> li2 = Arrays.asList(2, 6, 7, 29);
        List<Integer> li3 = Arrays.asList(12, 15, 61, 5, 2);
        List<Integer> li4 = Arrays.asList(11, 51, 9, 21);
        Set<List<Integer>> rows = new HashSet<>();
        rows.add(li1);
        rows.add(li2);
        rows.add(li3);
        rows.add(li4);

        Set<List<Integer>> rowsToRemove = new HashSet<>();

        for (List<Integer> row : rows) {
            if (row.contains(5)) {
                rowsToRemove.add(row);
            }
        }

        // Remove the lists containing element 5
        rows.removeAll(rowsToRemove);

        // Print the updated set
        System.out.println(rows);

    }

    public static void table() {
        List<String> li1 = Arrays.asList("name", "age", "dept", "salry");
        List<String> li2 = Arrays.asList("sreenu", "25", "QA", "22000");
        List<String> li3 = Arrays.asList("sathis", "26", "OPs", "25000");
        List<String> li4 = Arrays.asList("koti", "25", "DEV", "22000");


        Map<String, String> m = new HashMap<>();
        m.put("name", "vasu");
        m.put("age", "25");
        m.put("dept","QA");
        m.put("sal", "1000");

        Map<String, String> n = new HashMap<>();
        n.put("name", "dev");
        n.put("age", "26");
        n.put("dept","DEV");
        n.put("sal", "5000");

        Set<String> l = new HashSet<>();
        l.add(m.toString());
        l.add(n.toString());

        for(String v : l){
            System.out.println(v);
        }

        String s = new String();


    }
}
