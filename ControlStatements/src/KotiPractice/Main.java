package KotiPractice;

import Assignments.S;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
      Main.method1();
    }

    public static Boolean endswith() {  //vasu --4
        String s = "vasu sai";
        String name = "sai";
        boolean B = true;
        int l = name.length();
        int L = s.length() - l;
        char[] c = s.toCharArray();
        char[] d = name.toCharArray();

        int i;
        int j=0;
        for (i = L; i < s.length(); i++) {
            if (c[i] == d[j]) {
                j++;
                continue;
            } else
                B=false;
            break;
        }
        System.out.println("the given String "+ name +" is matched with "+ s+"   :"+B);
        return B;
    }

    public static String meth() {
        String k = "    ";
        String y = "";
        String[] m = k.split("\\.", 2);
        for (int i = 0; i < m.length; i++) {
//            System.out.println(m[i]);
            y = y + " " + m[i];
        }
        return y.trim();
    }

    public static void methodstart() {
        String[] str = {"JAVA 3+ exp", "java 3+ EXP", "JaVa 3+ Exp", "JAva 3+ EXp"};
        for (int i = 0; i < str.length; i++) {
            if (str[i].toUpperCase().startsWith("JAVA".toUpperCase())) {
                System.out.println(str[i]);
            }

        }
    }

    public static void meth1(){
        Vector obj = new Vector();

        obj.add("sree");
        obj.add("vasu");
        obj.add("dev");

        obj.add("sree");
        obj.add("vasu");
        obj.add("dev");

        Vector obj1 = new Vector();

        obj1.add("sree");
        obj1.add("vasu");
        obj1.add("dev");

        obj1.add("sree");


         obj.addAll(obj1);

        obj1.indexOf("vasu");

        System.out.println(obj.size());
        System.out.println(obj.capacity());
        System.out.println(obj1.indexOf("dev"));
        System.out.println(obj.containsAll(obj1));
        System.out.println(obj1);
    }

    public static void method1(){
        Integer[] arr = {1,2,3,4,45,5,6,7,0};
        ArrayList  obj = new ArrayList<>(Arrays.asList(arr));

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add("sree");
        obj.add("sree");
        obj.add("vasu");
        obj.add("dev");
//        System.out.println(obj);

        Integer[] arr1 = {1,2,3,4,45,5,6,7,0};
        ArrayList obj1 = new ArrayList(Arrays.asList(arr1));


        obj1.add("vasu");
        obj1.add("dev");
        obj1.add('s');

        obj1.set(1,"vasu");
        obj1.contains("vasu");

    obj.retainAll(Arrays.asList(1,2,3,4,5,6));
//        System.out.println(obj1.contains("vasu"));

        String s = "vasudev";

        System.out.println(obj1.retainAll(Arrays.asList(1,2,3,4,5,6)));
    }
}

