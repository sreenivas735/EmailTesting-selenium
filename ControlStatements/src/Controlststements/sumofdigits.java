package Controlststements;

public class sumofdigits {
    public static int sumofthedigits(int k) { ///493
        int sum=0;
        while(k!=0){  //k=49 k=4 k=0

            int abc= k%10; ///// abc%10= 493%10==  3    abc=3 abc=49%10==   abc=9    abc=4%10==    abc=4

            sum = sum +abc;  ///sum= 0+3= 3     sum=3  sum= 3+9=12    sum=12  sum=12+4=16   sum=16

            k=k/10; //// k=493/10=49.3===    k=49    k=49/10= 4.9== k=4   k=4/10=== 0.4==   k=0

        }
        return sum;
    }

    public static int printevennumbers(){
        int z=21;
        while(z<=100 && z%2==1){
            System.out.println(z); // 0,2 z=100

            z=++z+1;   //z= 1+1=2  z=2 =4 z=100 z=102
        }
        return z;
    }
}
