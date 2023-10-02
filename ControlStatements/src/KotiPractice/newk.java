package KotiPractice;

import Assignments.S;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class newk {
//    public static void main(String[] args) {
//
////        newk obj = new newk();
////        try {
////            obj.excep();
////        }catch (NullPointerException a){
////            System.out.println("resolved");
////        }catch (mynewException k){
////            System.out.println("my exception also fine");
////        }
//
//        practice obj = new practice();
//        obj.meth233();
//    }


    public void excep() {
        int a = 10;
        int[] d = {0, 1};

        try {
            int result = d[3];
        } catch (ArithmeticException as) {
            as.printStackTrace();
            System.out.println("airthemetic or array exception will occeure");
        } catch (ArrayIndexOutOfBoundsException dc) {
            System.out.println("Array bound");
        } catch (NullPointerException an) {
            System.out.println("Null point ");
        } catch (RuntimeException s) {
            System.out.println("run time exception ");
        } finally {
            System.out.println("finally program is executed");
        }
        System.out.println(" value is ");
    }
}


class mynewException extends RuntimeException {
    mynewException(String message) {
        super(message);
    }
}


class array {
//    public static void main(String[] args) {
//        array m = new array();
//        duplicate obj = new duplicate();
//        obj.duplicate();
//
//    }

    public void sort() {
        int i;
        int k = 1;
        int[] a = {2, 1, 2, 5, 5, 1, 2, 6, 9, 7, 5, 4, 8, 8, 1, 2};

        for (i = 0; i < a.length; i++) {
            for (k = 0; k < a.length; k++) {
                if (a[i] < a[k]) {
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}

class duplicate {
    public void duplicate() {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 6, 7, 7, 8, 8, 9, 9};
        int m;
        int n = 0;
        for (m = 0; m < arr.length; m++) {
            if (arr[n] != arr[m]) {
                n++; // 1
                arr[n] = arr[m];

            }   ///arr.length = 6     //n+1 = 5
        }
        for (m = 0; m < n + 1; m++) {
            System.out.print(arr[m] + ",");
        }

    }
}


class strings {
    public void practice() {
        String s = "this this";

        System.out.println("the length of the string is " + s.length());
    }

    public void maxandmin() {
        int a[] = {1, 3, 4, 5, 8, 2};
        int fmax = a[0];
        int smax = a[0];
        int tmax = a[0];
        // 1<9
        for (int index = 0; index < a.length; index++) {                                 // {1,2, 3}
            if (fmax < a[index]) {    //1<4  15<=3
                tmax = smax;
                smax = fmax;       //  smax=2                                    //  a[0] = 1 , a[1]=2  ,  a[2]= 3
                fmax = a[index];   // fmax=15
            } else if (smax < a[index]) {        // 2<3                                        //
                tmax = smax;
                smax = a[index];
            } else if (tmax < a[index]) {
                tmax = a[index];
            }
        }
        System.out.println(fmax);
        System.out.println(smax);
        System.out.println(tmax);
    }


}

class ClassA {
    public void methodA() {
        ClassB.methodB();
        System.out.println("Method A from ClassA");
    }

    public void callMethodB() {
        ClassB.methodB(); // Calling a static method from another class
    }
}

class ClassB {
    public static void methodB() {

        System.out.println("Method B from ClassB");
    }

    public void callMethodA(ClassA instanceA) {
        instanceA.methodA(); // Calling a non-static method using an instance
    }
}

class practice {
    public void meth1() {
        String s = "Vasudev";
        String s1 = s.concat(" sreenivas");
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }

        System.out.println(c);

        System.out.println(s.length());// 6
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.isEmpty());//false
        System.out.println(s.indexOf("e")); //u
        System.out.println(s.lastIndexOf("v")); //6
        System.out.println(s.compareTo("Vasude"));//true
        System.out.println(s.contains("dev"));//tru
        System.out.println(s == s1);//true
        System.out.println(s1.equals("sreenivas"));
        System.out.println(s.equalsIgnoreCase("vASUdev"));


    }

    public void meth3() {
        Vector v = new Vector();

        v.add("s");
        v.add("r");
        v.add(1);
        v.add("s");

        Vector v1 = new Vector();
        v1.add(1);
        v1.add(2);
        v1.add(3);


//        System.out.println(v);
//
//        System.out.println(v.retainAll(v1));
//        System.out.println(v);

        int[] a = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> obj = new ArrayList();
        obj.add(2);
        obj.addAll(v1);
        System.out.println(obj);

        List<String> o = Arrays.asList("vasu", "dev");


        Stack<Integer> s = new Stack<>();

        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        s.push(3);
        System.out.println(s.push(5));


    }

    public void meth233() {
        List<Integer> m = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        Set<Integer> uniwue = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        int sum = 0;
        int evensum = 0;
        for (Integer value : m) {
            sum = sum + value;
            if (value < m.get(value)) {
//              duplicate.add(value);

            } else
                duplicate.add(value);

            if (value % 2 == 0) {

                evensum = evensum + value;
            }
        }
//      uniwue.removeAll(duplicate);
        System.out.println(duplicate);
        System.out.println(uniwue);
        System.out.println(sum);
        System.out.println(evensum);
    }


    public static void methes() {
        int[] a = {1, 1, 2, 2, 2, 3};

        int i;
        for (i = 1; i < a.length; i++) {


        }


    }

}

class CountDuplicates {

//    public static void main(String[] args) {
//        int[] array = { 1,1,1,1,1, 2, 2 ,3};
//
//        Map<Integer, Integer> elementCount = new HashMap<>();
//
//        for (int num : array) {
//            if (elementCount.containsKey(num)) {
//                elementCount.put(num, elementCount.get(num) + 1);
//            } else {
//                elementCount.put(num, 1);
//            }
//        }
//
//        System.out.println("Duplicate elements and their counts:");
//        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
//            if (entry.getValue() > 0) {
//                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
//            }
//        }
//    }
}


class setcollection {
//    public static void main(String[] args) {
//        setcollection obj = new setcollection();
//        obj.method41();
//
//
//    }

    public void method41() {
        Set<Integer> s = new HashSet<>();

        s.add(1);
        s.add(2);
        s.add(5);
        s.add(45);
        s.add(56);
        s.add(89);
        s.add(23);
        s.add(10);

        LinkedHashSet<Integer> s1 = new LinkedHashSet<>();

        s1.add(1);
        s1.add(2);
        s1.add(5);
        s1.add(45);
        s1.add(56);
        s1.add(89);
        s1.add(23);
        s1.add(10);

        TreeSet<Integer> s2 = new TreeSet<>();

        s2.add(1);
        s2.addAll(s1);
        s2.contains(56);
        s2.comparator();


//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s2.descendingSet());
//        System.out.println(s2);

        Stack m = new Stack<>();

        m.add(1);
        m.add(2);
        m.add(5);
        m.add(45);
        m.add(56);

        m.add(89);
        m.add(23);
        m.add(10);
        System.out.println(m.pop());
        System.out.println(m);

    }

    public static void mduplimethod() {
        int less = 0;
        int eqaul = 0;
        int k = 21;
        int[] a = {2, 6, 12, 18, 21, 26, 3, 42, 21};   //21
        for (int i = 0; i < a.length; i++) {
            if (k == a[i]) {
                eqaul++;
            } else if (k > a[i]) {
                less++;
            }
        }
        System.out.println("lesser values of " + k + " is " + less + "  and the eqaual values is " + eqaul);
    }

    public static void pairnumbers() {
        int i;
        int j;
        int k = 8;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 0};

        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == k) {
                    System.out.println("pair  {" + a[i] + " , " + a[j] + "}");
                }
            }

        }

    }

    public static void matchednumbers() {
        int i;
        int j;
        int l;
        int k = 8;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        int[] b = {1, 2, 3, 4, 5, 0, 8};
        int[] c = {3, 4, 5, 6, 7, 8, 0};

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < b.length; j++) {
                for (l = 0; l < c.length; l++) {
                    if (b[j] == c[l]) {
                        if (b[j] == a[i]) {
                            System.out.print(a[i] + ",");
                        }
                    }
                }
            }

        }

    }

    public static int[] sortingosandis(int[] a) {
//        int[] a = {0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1};
        int i;
        for (i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static Map<Integer, Integer> removedupeunsort() {
        int[] a = {1, 2, 1, 2, 4, 5, 7, 8, 45, 1, 2, 6, 7};
        Map<Integer, Integer> k = new HashMap<>();
//        k.put(1, 101);
//        k.put(2, 102);
//        k.put(3, 5012);
//        k.putIfAbsent(3, 501);
//        System.out.println(k.get(2));

        for (int i = 0; i < a.length; i++) {
            if (k.containsKey(a[i])) {
                k.put(a[i], k.get(a[i]) + 1);
            } else {
                k.put(a[i], 1);
            }
        }
        return k;
    }


    public static int[] addthearrayintoanother() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 4, 7, 8, 9, 10, 11, 12, 15, 19};
        int[] c = new int[a.length + b.length];
        int k = 0;
        int i = 0;
        int j;

        for (j = 0; j < b.length; ) {
            if (i == a.length) {
                c[k] = b[j];
                k++;
                j++;
                continue;
            } else if (j == b.length) {
                c[k] = a[i];
                k++;
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                c[k] = a[i];
                k++;
                i++;

            } else {
                c[k] = b[j];
                k++;
                j++;
            }

        }

        return c;
    }

    public static void printduplicates(int[] a) {
//        int[] a = {1, 2, 4, 5, 1, 4, 5, 1, 2, 1, 4, 7, 1, 21};
        int maxl = 0;
        TreeSet<Integer> t = new TreeSet<>();
        int i;
        for (i = 0; i < a.length; i++) {
            t.add(a[i]);
        }
        int maxlenth = t.last() - t.first();
        System.out.println(maxlenth + "     ");

        for (i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((a[i] - a[j]) > maxl) {
                    maxl = a[i] - a[j];
                } else if ((a[j] - a[i]) > maxl) {
                    maxl = a[j] - a[i];
                }

            }

        }
        System.out.println(maxl);
    }


    public static void maxelementaftersortandreverse(int[] a) {
        int i;
        for (i = 0; i < a.length; i++) {
            for (int j = 1 + i; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println(a[a.length - 1]);


    }


    public static void onlyonetimepresent(int[] a) {
        Map<Integer, Integer> M = new HashMap<>();
        int i;
        int j = 0;
        for (i = 0; i < a.length; i++) {
            if (M.containsKey(a[i])) {
                M.put(a[i], M.get(a[i]) + 1);
            } else {
                M.put(a[i], 1);
            }
        }
        System.out.println(M.entrySet());
        System.out.println();

        for (Map.Entry<Integer, Integer> k : M.entrySet()) {


            if (k.getValue() == 1) {
                System.out.println(k.getKey());
                continue;
            }

        }

    }

    public static void peakelementintheaarray(int[] a) {
        int i;
        int peak;
        for (i = 0; i < a.length; i++) {
            if (i == 0) {
                if (a[i] > a[i + 1]) {
                    System.out.println(a[i]);
                }
            } else if (i == a.length - 1) {
                if (a[i] > a[i - 1]) {
                    System.out.println(a[i]);
                }
            } else if
            (a[i] > a[i - 1] & a[i] > a[i + 1] & !(a[i] == a.length - 1)) {
                System.out.println(a[i]);
            }
        }
    }

    public static void mejorityelement(int[] a) {
        int len = a.length / 2;
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (m.containsKey(a[i])) {
                m.put(a[i], m.get(a[i]) + 1);
            } else {
                m.put(a[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> k : m.entrySet()) {

            if (k.getValue() > len) {
                System.out.println(k.getKey());
                continue;
            }

        }
    }

//    public static void main(String[] args) {
////        mduplimethod();
////        pairnumbers();
////        matchednumbers();
////        int[] a = {0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1};
////        int[] b = sortingosandis(a);
////        for(int i=0; i<a.length; i++){
////            System.out.print(b[i]+",");
////        }
////        Map<Integer, Integer> j = removedupeunsort();
////        System.out.println(j.keySet());
//
////        int[] d = addthearrayintoanother();
////        for (int i = 0; i < d.length; i++) {
////            System.out.print(d[i] + ",");
////        }
////        int[] a = {1, 2, 1, 2, 1, 2, 2, 1, 2, 2, 1, 2};
////////        printduplicates(a);
////////        maxelementaftersortandreverse(a);
//////        peakelementintheaarray(a);
//////        mejorityelement(a););
////          Arrays.sort(a);
////        for(int i =0; i<a.length; i++){
////            System.out.print(a[i]+",");
////        }
////        int[] a = {1,4,2,5,7,8,4,5,1,2,3,6,9};
////         int[] k= meth(a);
////         for(int i=0; i<k.length; i++){
////             System.out.print(k[i]+",");
////         }
////        meth1();
//
//        methodsforcounting();
//    }

    public static void meth() {
        int[] a = {1, 4, 2, 5, 7, 100, 4, 5, 1, -25, 3, 6, 9};
//       Arrays.sort(a);

        TreeSet<Integer> m = new TreeSet<>();
        for (Integer value : a) {
            m.add(value);
        }

//        Arrays.sort(a);
        System.out.println(m);

////        int max = Collections.max(m);
////        int min = Collections.min(m);
//
//        System.out.println(m.first());
//        System.out.println(m.last());
    }


    public static void meth1() {
        String s = "v@a#s%u!d*e^v";
        String k = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(k);
    }


    public static void methodsforcounting() {
        String s = "automation engineer";
        char[] c = s.toCharArray();
        Map<Character, Integer> m = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(c[i])) {
                m.put((c[i]), m.get(c[i]) + 1);
            } else
                m.put(c[i], 1);

            System.out.println(m.get(c[i]) + "--" + c[i]);
        }

        System.out.println(m);
    }
}

class iteratorsmethods {
    public static void main(String[] args) {
        enumarationmethod();
    }

    public static void enumarationmethod() {

        ArrayList<Integer> l = new ArrayList<>();

        TreeSet<Integer> m = new TreeSet<>();

        l.add(2);
        l.add(1);
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(4);
        m.addAll(l);
//        System.out.println(l);
//        System.out.println(m.last());
//        System.out.println(m.first());
//        System.out.println(m);
//        System.out.println(m.pollLast());
//        System.out.println(m.pollFirst());
//        System.out.println(m);

        int[] a = {1,2,3,4,5,6,47,5,4,1,2,3,4,5,8,9,7,5};
        TreeSet<Integer> q = new TreeSet<>();
        for(Integer k : a){
            q.add(k);
        }

//        System.out.println(q);
//        System.out.println(q.last());
//        System.out.println(q.first());
//        System.out.println(q.pollFirst());
//        System.out.println(q.pollLast());
//        System.out.println(q);

        Map<Integer, String> mike = new HashMap<>();
        mike.put(1, "vasu");
        mike.put(2, "sathis");
        mike.put(3, "koti");
        mike.put(4, "vasudev");

        System.out.println(mike);

        Iterator<String> ite = mike.values().iterator();
        while(ite.hasNext()){
            ite.next();
            System.out.println(ite.next());
        }
    }

}



