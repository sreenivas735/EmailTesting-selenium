package Assignments;
import KotiPractice.Main;
import org.jetbrains.annotations.NotNull;

public class S {
    public static void main(String[] args) {
        String[] str = {"xy", "abc", "mnop", "ijklm", "abcdefg", "abcdefg"};
        String vasu = S.Assignment(str);
        System.out.println(vasu);
    }

    public static String Assignment(String[] str) {
//        String[] str = {"ab", "xy", "xyz", "abcdfghj"}; // fo r
        int l = str.length;
        String s = "";
        int j = 0;
        for (int i = 0; i < l; ) {
            String s1 = str[i];  //xy

            char[] c = s1.toCharArray(); // x,y
//            char[] c = s.toCharArray();

            if (j < c.length) {   //
                s = s + c[j] +" "; // "a"
                i++;

            } else if (j >= c.length) {
                i++;
                continue;
            }
            if (i == l) {
                i = 0;
                j++;
            }
        }
        return s;
    }


    public static boolean onlyCharectorsornot(String s) {
        // String s = "1234vasu1234";
        boolean b = true;
        char[] c = s.toCharArray();
        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 58 & 47 < s.charAt(i)) {  //if(s.charAt(i)<58 & 47<s.charAt(i))
                b = false;
                break;
            }
        }
        return b;
    }

    public static boolean onlyDegitsorsornot(String s) {
        // String s = "1234vasu1234";
        boolean b = true;
        char[] c = s.toCharArray();
        int i;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                continue;
            }
            if (s.charAt(i) > 58 || 47 > s.charAt(i)) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static String splitting(String s, char C) {
//        String s = "i am a engeneering student", //"$"
        String m = "";
        int length = 0;
        char[] c = s.toCharArray();
        int i;
        for (i = 0; i < c.length; i++) {
            if (c[i] == C) {
                m = m + " ";
                length++;
            } else {
                m = m + c[i];
            }
        }
        System.out.println("length of the splitted string is  " + length);
        return m;
    }


    public static String Uppercases(String s) {
//        String s ="ABcDEFGH";
        String k = "";
        int i;
        char[] c = s.toCharArray();
        for (i = 0; i < s.length(); i++) {
            if (c[i] < 95) {
                k = k + c[i];
            } else /*if(c[i]>95)*/ {
                String m = String.valueOf(s.charAt(i) - 32);
                int intValue = Integer.parseInt(m);  // Convert the string to an integer
                char character = (char) intValue;
                k = k + character;
            }
        }
        return k;
    }

    public static String Lowercases(String s) {
//        String s ="ABcDEFGH";
        String k = "";
        int i;
        char[] c = s.toCharArray();
        for (i = 0; i < s.length(); i++) {
            if (c[i] > 95) {
                k = k + c[i];
            } else /*if(c[i]<95)*/ {
                String m = String.valueOf(s.charAt(i) + 32);
                int intValue = Integer.parseInt(m);  // Convert the string to an integer
                char character = (char) intValue;
                k = k + character;
            }
        }
        return k;
    }


    public static int slength(String s) {  // sreenu
        char[] c = s.toCharArray();         //012345
        int length = -1;
        for (int i = 0; i < c.length; i++) {
            length++;
        }
        return length;
    }

    public static String SubStringMethod(String str, int Begin, int End) {
        String s = "";
        char[] c = str.toCharArray();
        for (int i = Begin; i <= End - 1; i++) {
            s = s + c[i];
        }
        return s;
    }

    public static String SubStringBeginIndex(String str, int Begin) {
        String s = "";
        char[] c = str.toCharArray();
        for (int i = Begin; i < str.length(); i++) {
            s = s + c[i];
        }
        return s;
    }

    public static String SubStringEndIndex(String str, int End) {
        String s = "";
        char[] c = str.toCharArray();
        for (int i = 0; i < End; i++) {
            s = s + c[i];
        }
        return s;
    }
}


