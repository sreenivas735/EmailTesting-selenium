package inheritance;

public class inheritance {
    public static void main(String[] args) {
        // k1, k5, k2, k7

       child koti = new child(101, "koti");

    }
}

class parent{
    int d;
    parent(String name){

         System.out.println("this is a m1 method in parent constructor,   " +name);
    }
    public  void k1(){

            System.out.println("this is a m1 method in parent class" +" " );
    }
}

class child extends parent{
   child(int d, String name) {
       super(name);

        System.out.println("this is a m2 method in c1 constructor,   " +   d);
   }
    public  void k1(){

       System.out.println("this is a m2 method in parent class" +" class c1     koti");
    }
    public  void k5(){
        System.out.println("this is a m2 method in parent class"  );
    }

}

class grandson {
    grandson(int a){
       //super(85);
        System.out.println("the m1 is a contractor in m1 class"+ a);
    }
    public void k1(){
        System.out.println("the method k5 present in the m1 class");
    }
}


