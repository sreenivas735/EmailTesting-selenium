package Abstract;

public abstract class manual {

    abstract void smoke();
//    {
//        System.out.println("smoke testing will be done");
//    }

     abstract void unit();
//     {
//        System.out.println("unit testing is performed");
//    }

     public abstract void integration();
//    {
//        System.out.println("intigration testing will be performed");
//    }

    public void system()
    {
        System.out.println("system testing will be performed");
    }

}

class flipcart extends manual{


    public void smoke(){
        System.out.println("smoke testing will be done");
    }

    void unit() {
        System.out.println("unit testing is performed");
    }

    public void integration(){
        System.out.println("intigration testing will be performed");
    }

    public void regression(){
        System.out.println("regression testing will be done");
    }

    public void sanity(){
        System.out.println("sanity testing will be performed");
    }
}

class amazone extends flipcart{

    public static void main(String[] args) {
        flipcart obj = new flipcart();
        obj.smoke();
        obj.integration();
        obj.unit();
        obj.sanity();
       obj.system();
       obj.regression();
    }
    public  void  alpa(){
        System.out.println("alpha testing will be performed");
    }

    public void  acceptance(){
        System.out.println("acceptencing testing will be performed");
    }
}
