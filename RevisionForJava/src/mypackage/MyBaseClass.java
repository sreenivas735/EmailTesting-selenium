package mypackage;

public class MyBaseClass {
    public static void main(String[] args) {
        method1();
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    public static void method1() {
        try {
            int a = 10;
            int b = 5;

//            throw new sreenivasException("sreenivas exception will occure");
            System.out.println(a/b);
        } catch (ArithmeticException s) {
            System.out.println("exception occure");
        }

    }
}

class sreenivasException extends Exception {

    public sreenivasException(String str) {
//        super(String);
    }
}

