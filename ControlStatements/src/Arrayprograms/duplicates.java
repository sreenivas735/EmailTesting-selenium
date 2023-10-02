package Arrayprograms;

public class duplicates {
//    public static void main(String[] args) {
//        duplicates obj = new duplicates();
//
//        mwhile.countduplicates();
//    }

    public static void duplicates() {
        int i;
        int[] a = {6, 6, 8, 8, 9, 7, 7, 7, 9};
        int j;
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");

        }
        System.out.println("            --sorted array of the given array");


        int m;
        int n = 0;

        for (m = 1; m < a.length; m++) {
            if (a[n] != a[m]) {
                n++;
                a[n] = a[m];
            }
        }
        for (m = 0; m < n + 1; m++) {
            System.out.print(a[m] + ",");
        }
        System.out.println("         ------after removal of duplicates");

        for (m = n + 1; m < a.length; m++) {
            System.out.print(a[m] + ",");
        }
        System.out.println("         ---- duplicates");
    }
}


class mwhile {
    public static void duplicates1() {
        int i;
        int[] a = {6, 6, 8, 8, 9, 7, 7, 9,6,8};
        int j;
        for (i = 0; i < a.length; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i] + ",");
                }
            }
        }
    }

    public static void countduplicates() {
        int i = 1;
        int a[] = {1, 1, 1, 2, 2, 2, 2, 2, 4, 4, 5};
        int freq = 1;
        while (i < a.length) {
            while (i < a.length && a[i] == a[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(a[i - 1] + "  ----" + freq);
            freq = 1;
            i++;
        }
        if (a.length == 1 || a[i - 1] != a[i - 2]) {
            System.out.println(a[i - 1] + "  ----" + freq);
        }
    }
}

//class CountDuplicatesUsingForLoop {
//    public static void main(String[] args) {
//        int[] arr = {9, 9, 9, 9, 9, 9, 9, 9, 9 };
//        int duplicateCount = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    duplicateCount++;
//                    break; // Once a duplicate is found, move to the next element
//                }
//            }
//        }
//
//        System.out.println("Count of duplicates: " + duplicateCount);
//    }
//}
class method {


    public static void main(String[] args) {

    }

    public void revers() {
        String s = "Geeks";

        String R = "";
        char[] c = s.toCharArray();
        int i;

        for (i = s.length() - 1; i > -1; i--) {

            R += c[i];

        }

        System.out.print(R);
    }
}


