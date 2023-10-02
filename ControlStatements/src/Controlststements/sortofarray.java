package Controlststements;

import java.util.Arrays;

public class sortofarray {


    public static void main(String[] args) {
        String text = "Hello world! How are you doing today?";
        sortofarray obj = new sortofarray();
        String output = obj.splitted(text);
        System.out.println(output.trim());
        obj.uniqueChar("abcabcabcfgabcfgdach");
    }

    public String splitted(String text) {
//        String text = "Hello world! How are you doing today?";
        String out = "";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            String s = words[i];
            char[] c = s.toCharArray();
            String reve = "";
            for (int j = s.length() - 1; j >= 0; j--) {
                reve = reve + c[j];

            }
            out = out + " "+reve;
        }
        return out;
    }

//    public String reverse(String s) {
//        char[] c = s.toCharArray();
//        String reve = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            reve = reve + c[i];
//
//        }
//        return reve;
//    }


    public void uniqueChar(String s) { /// abacddfgdc
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (s.indexOf(current) == s.lastIndexOf(current))
                System.out.println(current);

        }
    }
}