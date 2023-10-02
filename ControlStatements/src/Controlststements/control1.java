package Controlststements;

public class control1 {
    public static int sumoftwonumbers(int n){ // n=11
        if (n <10)
            return n;
        int lastDigit = n % 10;  ////11%10= 1       ld=1

        int firstDigit;
        while (n >= 10) {
            n = n / 10; //// n= 11/10=      fd=n=1
        }

        firstDigit = n;
        return firstDigit + lastDigit;
    }



    public static int sumofallthedigitsinthegivennumber(int i){ // i=47
        int event =0;
        while(i!=0){ // 475!=0 is true     47!=0      4!=0=== (0!=0)---false----
            int digit = i%10;    //digit = 475 % 10 = 5      digit=5------- digit = 47%10= 7 ------digit =7  digit= 4%10= 4   digit=4
            event = event + digit;    // sum =0+5=5       sum=5    ----sum= 5+7=12  -----sum=12   sum=12+4=16   sum=16

            i=i/10; // i= 475/10= 47.5= 47                  i=47 ////    i=47/10=4.7===4 --i=4 i=4/10= 0.4==0
        }
        return event;
    }


    public static int revervalueofthegivennumber(int k){ ///256
        int reversenumber = 0;
        while(k!=0){ //k=25  k=2
            int digit = k%10;      //  digit = 256%10           digit=6   d=25%10= 5  d=2%10= 2

            reversenumber = reversenumber*10 + digit;      //rn = 0*10+6= 6     rn=6    rn=6*10+5=65 rn= 650+2=652

            k=k/10;  // k= 256/10=25.6===   k=25   k=25/10=2.5=   2  k=2/10=0.2==0
        }
        return reversenumber;
    }
}

