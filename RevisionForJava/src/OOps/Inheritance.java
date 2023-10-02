package OOps;

public class Inheritance {
    public  void method1() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }
}

class inherit1 extends Inheritance {

    public  void method1() {
        int a = 15;
        int b = 20;
        System.out.println(a + b);
    }
}

class inherit2 extends Inheritance{
    public  void method2() {
        int a = 15;
        int b = 200;
        System.out.println(a + b);
    }

}

class inheritxyz{

    public static void main(String[] args) {
        int n = 121;
        int k=n;
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = (rev *10) + d;
            n = n / 10;
        }
        if (rev == k) {
            System.out.println("is done");
        } else {
            System.out.println("is not done");
        }


    }
//    public static void method1() {
//        int a = 100;
//        int b = 20;
//        System.out.println(a + b);
//    }
}
