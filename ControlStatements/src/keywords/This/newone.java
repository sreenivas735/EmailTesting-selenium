package keywords.This;

public class newone {
    public static void main(String[] args) {
        int n = 123;
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = (rev * 10) + d;
            n = n / 10;
        }
        if (rev == n) {
            System.out.println("is done");
        } else {
            System.out.println("is not done");
        }


    }

}
