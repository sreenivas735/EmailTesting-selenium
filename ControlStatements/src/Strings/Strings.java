package Strings;

public class Strings {
    public static void main(String[] args) {
        Strings obj = new Strings();
//        obj.length();
//        obj.isEmpty();
//        obj.concate("   vasu");
//        obj.equal();
//        obj.compare();
//        obj.eaulignore();
//        obj.compareto();
//        obj.contain();
//        obj.uppercase();
//        obj.tochararray();
//        obj.chatat();
//        obj.trim();
//        obj.indexes();
//        obj.indexes();
//        obj.uniquechar("abcabcdadrgg");
//        obj.sortstring("vasudev");
        obj.maximunstingvalue();
    }

    public void length() {
        String s = "sreenivas";

        System.out.println("the length of the given array is " + s.length());
    }

    public void isEmpty() {
        String s = "";
//        String s = "sreenivas";

        System.out.println("given String is " + s.isEmpty());
    }

    public void concate(String s) {

        s = s.concat("  sree");
        s = s.concat("  sathis");

        System.out.println(s);
    }

    public void equal() {
        String s = "sreenivas";

        System.out.println(s.equals("sreenivas"));
    }

    public void compare() {
        String s3 = "sreenivas";
        String s4 = "sreenivas";// string pool

        System.out.println(s3 == s4);
//        if(s3==s4){
//            System.out.println("your details are matched");
//        }else
//            System.out.println("not mached");
    }

    public void eaulignore() {
        String s = "VasuDev";

        System.out.println(s.equalsIgnoreCase("vasudev"));
    }

    public void compareto() {
        String s = "sreenu";

        System.out.println(s.compareTo("Sreenu"));
    }

    public void contain() {
        String s = "sreenivas vasu";

        System.out.println(s.contains("as v"));
    }

    public void uppercase() {
        String s = "Arjun Vasudev Krishna";
        String s1 = "ARJUN";

        System.out.println(s1.toUpperCase());
        System.out.println(s.toLowerCase());
    }

    public void tochararray() {
        String s = "Sreenivas";
        char a[] = s.toCharArray();
        int i = 0;
        while (i < a.length) {

            System.out.print(a[i] + ",");
            i++;
        }
    }

    public void chatat() {
        String s = "sreenivas)";

        System.out.print(s.charAt(0) + ",");
        System.out.print(s.charAt(1) + ",");
        System.out.print(s.charAt(2) + ",");
        System.out.print(s.charAt(3) + ",");
        System.out.print(s.charAt(4) + ",");
        System.out.print(s.charAt(5) + ",");
        System.out.print(s.charAt(6) + ",");
        System.out.print(s.charAt(7) + ",");
    }

    public void trim() {
        String s = "    sreenivas vasudev krishna     ";

        System.out.println(s.trim());
    }

    public void indexes() {
        String s = "vasudevkrishna";
        System.out.println(s.indexOf('s'));
        System.out.println(s.lastIndexOf('k', 11));
    }

    public void uniquechar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean ischardup = false;

            for (int j = 0; j < s.length(); j++) {
                if (i == j)
                    continue;
                char ch1 = s.charAt(j);
                if (ch == ch1) {
                    ischardup = true;
                    break;
                }
            }
            if (!ischardup)
                System.out.println(ch);

        }
    }

    public void sortstring(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = 1 + i; j < c.length; j++) {
                if (c[i] > c[j]) {
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
            System.out.print(c[i]);
        }
    }

    public void maximunstingvalue() {
        String n = "aaggyyl";
        char[] c = n.toCharArray();
        char max = c[0];  // 1,2,5,1,7
        char max1 = c[1];
        for (int i = 1; i < c.length; i++) {
            if(max==c[i])
                continue;
            if (max < c[i]) {
                max1 = max;
                max = c[i];
            }else if(max1<c[i]){
                max1 = c[i];
            }

        }
        System.out.println(max);
        System.out.println(max1);

    }
}
