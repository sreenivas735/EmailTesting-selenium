package polymorpisam;

public class methodoverriding {
    public static void main(String[] args) {
        methodoverriding obj = new methodoverriding();
        obj.m6();

    }

    int a=10;
    String name = "sree";

    public  void m6(){
                System.out.println("the variables are static   "+  this.a+  name );
    }

    public  void m2(){

        System.out.println("the variables are static   "+  a+  name );
    }

    public  void m2(int a){

        System.out.println("the variables are static   "+  a+  name );
    }
}
