package Controlststements;

public class AverageOfArray {
    public boolean findGivenNumberInArray(int n, int[] arr) {
        boolean isNumPresent = false;
        //task 1
        for(int index = 0; index < arr.length; index++) {
            System.out.println("array index: " + index);
            //task 2
            if(arr[index] == n) {
                System.out.println("value is matched with " + arr[index]);
                isNumPresent = true;
                /**
                 * Whenever we use break statement,
                 *      it will stop the iteration of that loop. and move the next statement which after the loop.
                 */
                break;
            }
        }
        return isNumPresent;
    }
}
