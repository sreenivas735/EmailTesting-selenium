package inheritance;

public class inheritanceproject {
    public static void main(String[] args) {
      multilevel obj =new multilevel(101, "ssc", 25, "Sathis",26,"Active" );

    }
}


class single{

    single(int age, String status) {
        System.out.println("this ia a single constructor"+" "+ age + " "+ status);
    }
    public void m1(){
        System.out.println("this ia a single inheritance");
    }
}

class multiple extends single{
    multiple(String name, int age, String status){
        super(age,status);
        System.out.println("this ia a multi constructor"+name);
    }
    public void m2(){
        System.out.println("this ia a multi inheritance");
    }
}

class multilevel extends multiple {
    multilevel(int ID, String cls, int d, String name, int age, String status){
        super( name, age, status);
        System.out.println("this ia a multilevel constructor"+ ID +" " + cls + " "+d);
    }
    public void m3(){
        System.out.println("this ia a multilevel inheritance");
    }
}
