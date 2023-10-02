package OOps;

public class polymorphisam {
    public void method1(int z) {
        int a = 10;
        int d = 30;
        System.out.println(a + d);

    }

    public void method1(String s) {
        int a = 10;
        int d = 30;
        System.out.println(a + d);

    }

}

class polymorphisam1 {
    public void method1(int z) {
        int a = 500;
        int d = 30;
        System.out.println(a + d);

    }

    public void method1(String s) {
        int a = 1000;
        int d = 30;
        System.out.println(a + d);

    }

}

class abc {
    public static void main(String[] args) {
        String mon = "June";
        String s = "June 2021";
        String m = s.split(" ")[0];
        String y = s.split(" ")[1];

        System.out.println(m.equals(mon));
        System.out.println(y);
    }
}
