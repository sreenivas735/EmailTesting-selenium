package Controlststements;

class GFG
{
    public static void main (String[] args)
    {
               int a=20;

               int d = 0;
        try
        {
            a++;
            int total = a/d; // exception occurs

            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
        catch( Exception s) //campus
        {
            System.out.println("Exception caught in Catch block");
        }
        finally{
            int sum = a+d;
            System.out.println("finally execution will be started");
        }

        System.out.println("Outside try-catch clause");
    }
}
 class TestFinallyBlock1{
    public static void main(String args[]){
      TestFinallyBlock1.meth();

    }


    public static void meth() throws ArithmeticException {

        throw new ArithmeticException("Arthemetic ecseption will occure");


    }
}




