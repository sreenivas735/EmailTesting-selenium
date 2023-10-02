package keywords.This;

class zomato{

}

public class flipcart {
//    public  void main(String[] args) {
//        flipcart obj = new flipcart(this);
//    }

    flipcart(flipcart h){
        this(25);
        System.out.println("this is no-pera constructor");
    }

    flipcart(int a){                                         // classname obj = new classname();
        swiggy obj1 = new swiggy();            //  classname obj = this   = new classname();
        System.out.println("this pere constructor");          //       int    a   =   10
    }
}

class swiggy{
    public static void main(String[] args) {
        swiggy obj =new swiggy();
        obj.meghana("29");
    }

   String Biriyani= "10";

   String chikenItems = "15";

   String Mutton = "50";

    public void ambhur(){
     System.out.println("the mutton "+Mutton);
     }

    public void meghana(String Mutton){

        System.out.println("the  mutton "+ Mutton);
    }
}

