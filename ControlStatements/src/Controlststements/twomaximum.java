package Controlststements;

public class twomaximum {
    public static void main(String[] args) {
        twomaximum salar = new twomaximum();


//        threemultiarray kgf = new threemultiarray();
//        kgf.multiofthree();
    }

    public void twomaximum() {
        int[] a = {8, 4, 2, 9, 6, -20, -5, -8};  // 8                                           //{2,15,3}
        System.out.println("the length of the given array is  " + a.length);
        // f=15,  s=2
        int fmax = a[0];
        int smax = a[1];

        // 1<9
        for (int index = 1; index < a.length; index++) {
            if (fmax < a[index]) {
                smax = fmax;

                fmax = a[index];
            } else if (smax < a[index]) {
                smax = a[index];
            }
        }
        System.out.println("the first max number is " + fmax);
        System.out.println("the second max number is " + smax);

        int fmin = a[0];
        int smin = a[1];

        for (int index = 1; index < a.length; index++) {      //{2,1, 8, 7,6};                             // {1,2, 3}
            if (fmin > a[index]) {    //1<4  15<=3
                smin = fmin;       //  smax=2                                    //  a[0] = 1 , a[1]=2  ,  a[2]= 3
                fmin = a[index];   // fmax=15
            } else if (smin > a[index]) {        // 2<3                                        //
                smin = a[index];
            }
        }
        System.out.println("the first min number is " + fmin);
        System.out.println("the second min number is " + smin);

        int Min = fmin * smin;
        int Max = fmax * smax;

        if (Max > Min) {
            System.out.println("highest value of two numbers multiplication in the given array is  " + Max);
        } else
            System.out.println("highest value of two numbers mulytiplication in the given array is  " + Min);
    }
}

class threemaxmum {
    public void threemax() {

        int a[] = {8, 7, 15, 25, 75, 8, 4, 2, 9, 6};
        int fmax = a[0];
        int smax = a[1];
        int tmax = a[2];

        int fmin = a[0];
        int smin = a[1];
        int tmin = a[2];
        // 1<9
        for (int index = 1; index < a.length; index++) {                                 // {1,2, 3}
            if (fmax < a[index]) {    //1<4  15<=3
                tmax = smax;
                smax = fmax;       //  smax=2                                    //  a[0] = 1 , a[1]=2  ,  a[2]= 3
                fmax = a[index];   // fmax=15
            } else if (smax < a[index]) {        // 2<3               //
                tmax = smax;
                smax = a[index];
            } else if (tmax < a[index]) {
                tmax = a[index];
            }
        }
        System.out.println("first max value of the given array  " + fmax);
        System.out.println("second max value of the given array  " + smax);
        System.out.println("third max value of the given array  " + tmax);

        int TotalMax = fmax * smax * tmax;

        // {8, 3, 4, 5, 8, 2}
        for (int index = 1; index < a.length; index++) {
            if (fmin > a[index]) {
                tmin = smin;
                smin = fmin;
                fmin = a[index];
            } else if (smin > a[index]) {
                tmin = smin;
                smin = a[index];
            } else if (tmin > a[index]) {
                tmin = a[index];
            }

        }
        System.out.println("first min value of the given array  " + fmin);
        System.out.println("second main value of the given array  " + smin);
        System.out.println("third min value of the given array  " + tmin);

        int TotalMin = fmin * smin * tmin;


        if (TotalMin > TotalMax) {
            System.out.println("multiplication of three number's heighst value is  " + TotalMin);
        } else

            System.out.println("multiplication of three number's heighst value is  " + TotalMax);

    }

}