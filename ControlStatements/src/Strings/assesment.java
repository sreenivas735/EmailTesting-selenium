package Strings;

public class assesment {

    public static void main(String[] args) {
        assesment obj = new assesment();
//        obj.reversesting();
        obj.palendrom("moon");

    }

    public void reversesting() {
        String s = "sreenivas";
        int i;
        for (i = s.length() - 1; i > -1; i--) {
            System.out.print(s.charAt(i));

        }
    }

    public void palendrom(String s) {
        String revrse = "";
        char c[] = s.toCharArray();
        int i;
        for (i = s.length() - 1; i > -1; i--) {
            revrse += c[i];
        }
        System.out.println("given string is a palendrom  : "+s.equals(revrse));
    }

    public void contain(String s1){
        String s ="arjun vasudev krishna sreenivas vasu";

        System.out.println(s.contains(s1));
    }

}
