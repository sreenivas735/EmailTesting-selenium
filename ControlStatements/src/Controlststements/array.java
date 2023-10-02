package Controlststements;
public class array {
    public static void main(String[] args) {
        int[] a = new int[4];

        System.out.println("length of the a value is  "+ a.length);
       for(int value =0; value<=a.length-1; value++) {   //
           System.out.println("the value of a[0] is   " + a[value]);
       }

       a =new int[3];

        System.out.println("the value of a[0] is   " + a[0]);
        System.out.println("the value of a[0] is   " + a[1]);
        System.out.println("the value of a[0] is   " + a[2]);


        System.out.println("the value of a series ended");
       int[] b =a;
        System.out.println("the value of b[0] is   " + b[0]);
        System.out.println("the value of b[0] is   " + b[1]);
        System.out.println("the value of b[0] is   " + b[2]);


    }
}