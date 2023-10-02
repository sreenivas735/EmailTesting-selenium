package Exception;

public class Catchesmultiple {
    public static void main(String[] args) throws sreenivasException {
        Catchesmultiple obj = new Catchesmultiple();
         Catches obj1 = new Catches();
         obj1.cathces();
    }
}

class Catches{
    public void cathces() throws sreenivasException {
        int a =10;  int b=0;
        try {
            int toatal = a / b;
        }catch (ArithmeticException ar){
            System.out.println("arthemetic");
//            ar.printStackTrace();
//            ar.getMessage();
//            throw new NullPointerException("there is a null pointer exception please check it once");
            throw new sreenivasException("this is my own Exception means i have created");
        }finally {
            System.out.println("finally");

        }
    }
}

class sreenivasException extends Exception {
    public sreenivasException(String s){
        super(s);
    }

}