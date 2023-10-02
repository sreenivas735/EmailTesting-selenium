package Controlststements;

import org.jetbrains.annotations.NotNull;

public class arraymaximum {

    int d;
    String name;

    public static void main(String[] args) {
        arraymaximum obj = new arraymaximum();
        int[] a = {1, 2, 3, 4, 5, 4, 3, 45, 34, 67, 87};
//        int[] Max = obj.maximum(a);
        System.out.println("the max value is "+ obj.maximum(a));

    }
    public int[] maximum(int[] a) {
        System.out.println("length of the array is" + " " + a.length);
        int Max = a[0]; //max=5
        for (int index = 1; index < a.length; index++) { //1<7 true
            if (Max < a[index]) {  //   74<1
                Max = a[index]; //  max=74
            }
        }
       // System.out.println("the max value is"+" "+ Max);
        return a;
    }
    public void arrayma() {
        this.d = 10;
        String name ="vasu";
        int a =10;
        int b=20;
        int total = a+b;

        System.out.println("the sum of two numbers"+" " +total + d+ ""+name);


    }



}

// <acces modifier> <variable> <retruntype> <methodname> <peranthasis(with perametors)