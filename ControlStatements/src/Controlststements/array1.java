package Controlststements;

public class array1 {
    public static void main(String[]args) {
        int noOfRows = 5;
        //task 1 - print number of starts for particular line.
//        int row = 1;
//        for(int i = 1;i<=row;i++ ) {
//            System.out.print("*");
//        }
        //task 2 -
        //row = 1, run above code.
        //row = 2, run above code
        //row = 3, run above code
        //row = 4, run above code.
        // and so on.. till how many rows i want.
        for (int row = 1; row <= noOfRows; row++) {
            //below for loop is used to print the number of stars in one line.
            for (int i = 1; i <= row; i++) {
                System.out.print("*");
            }
            System.out.println();//output will start from new line.
        }
    }
}