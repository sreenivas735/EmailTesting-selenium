package keywords.This;

public class teacher {

    public static void main(String[] args) {
       priciple obj = new priciple();
    }
     int a=10;
    String name = "vasudev";
    teacher (){
        int a =20;
        String name = "sathis";

    }
}
class priciple extends teacher{
    int a =30;
    String name = "koti";
    priciple(){
        int a =40;
        String name = "sreenivas";


        System.out.println("the name "+ name);// sreenivas
        System.out.println("the name "+ this.name); // koti
        System.out.println("the name "+ super.name);//vasudev
    }

}
