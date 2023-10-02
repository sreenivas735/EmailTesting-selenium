package OOps;

public class encapsulation {
    private static int a = 20;
    private static String s = "vasudev";

//    public void method(String s1) {
//        s = s1;
//        System.out.println("the given value is  :" + s);
//    }
//
//    public void method1() {
//        System.out.println(s);
//    }

    public static String getS() {
        return s;
    }

    public static void setS(String s) {
        encapsulation.s = s;
    }
}


class encap {
    public static void main(String[] args) {
        encapsulation.setS("abhimanyu");
        String sb = encapsulation.getS();
        System.out.println(sb);
    }
}