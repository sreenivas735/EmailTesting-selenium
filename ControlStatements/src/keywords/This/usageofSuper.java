package keywords.This;

public class usageofSuper {

    public static void main(String[] args) {
        iknow obj = new iknow();

        obj.subject();

    }


    int a =10;
    String name= "sree";
//    usageofSuper(String name){
//        System.out.println("this is a no-pera constructor " + name);
//    }

    public void subject(){
        System.out.println("this is a method " + name);
    }
}

class iknow extends usageofSuper{

    String name = "vasu";
//    iknow(){
//        super("sreenivas");
//         // Super key is used to the time of inherit pass the constructor argument values in the child class
//        System.out.println("this is a iknow constructor");
//    }

    public void subject(){

        super.subject();

        String name = "Vasudev";
         /* Super key is used to the time of inheritance and same methods we have in parent and child that, we call the method
                           parent method is overridden by child method and child method is print, I want parent method
                           that time we will use super keyword
                           */
        System.out.println("this re return method in iknow class it will be overriden  "+ name);

        System.out.println("this re return method in iknow class it will be overriden  "+ this.name);

        System.out.println("this re return method in iknow class it will be overriden  "+ super.name);
                         /* Super key is used to the time of inheritance, we have global variables in the parent and child classes as well
                         that time I want to use the parent class variable in child class, that time we are using super keyword
                          */
    }
}
