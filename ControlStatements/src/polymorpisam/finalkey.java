package polymorpisam;

public class finalkey {

    public static void main(String[] args) {

        finalkey obj = new finalkey();
       // obj.method1();
        obj.method45();
    }

    public void method1() {
        int a = 1050;  // given value is blue or red or black or white

        if (a < 20) { // blue
            System.out.println("the value is below 20");
        } else if (a > 20 && a < 100) {
            //red
            System.out.println("the value is above 20");
        } else if (a > 100 || a < 1000) {
            System.out.println("the value is above 100");
        } else
            System.out.println("the value is above 1000");
    }

    public void method45() {

        int i=1;
        while(i<10){
            System.out.print(i);
            i++;

        }

        do{
            System.out.print(i);
            i++;
        }while(i<10);
    }
}


