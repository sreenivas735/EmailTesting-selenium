package Controlststements;

public class sumofarray {
    public static double avgofarray(int[] a) {
        double avg = 0;
        System.out.println("the length of the given array"+" "+ a.length);
        int sum = 0;
        for(int i=0; i<a.length; i++){
             sum = sum+a[i];
        }
        System.out.println("the sum of the given integer array is " + " "+ sum);

        avg = (double)sum/a.length;
        System.out.println("the average value of the given array is " +" "+ avg );
        return avg;
    }
}