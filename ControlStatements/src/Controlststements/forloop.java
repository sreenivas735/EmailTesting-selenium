package Controlststements;

public class forloop {
    public static void main(String[] args) {
         int sum =0;
        for(int a=568942; a!=0; a=a/10){
             int digit=a%10; // d=9
             sum = sum+digit;  //0+9  sum=9
        }
        System.out.println("the value of sum of digits"+ "  "+ sum);
    }
}