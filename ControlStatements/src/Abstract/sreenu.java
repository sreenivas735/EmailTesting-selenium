package Abstract;

public abstract class sreenu {
    abstract void biriyani();
    abstract void chiken();
    public abstract void idli();
    public abstract void egg();

    private void newstar(){
        System.out.println("this is new star method");
    }

    protected void something(){

    }
    sreenu(String name, int id){
        newstar();
        System.out.println("this is a perameter constructor " + name +" "+ id);
    }

}

class koti extends sreenu{

    koti(){
        super("meghana", 23);
        System.out.println("this is koti perameter");
    }
    void biriyani(){
        System.out.println("fry piece biriyani");
    }
     void chiken(){
         System.out.println("chiken lollypop");
     }
    public  void idli(){
        System.out.println("ravva idli");
    }
    public  void egg(){
        System.out.println("boiled egg");
    }

}
class sathis extends sreenu{
    sathis(){
        super("meghana", 23);
        System.out.println("this is sathis perameter");
    }
    void biriyani(){
        System.out.println("dum biriyani");
    }
    void chiken(){
        System.out.println("chiken 65");
    }
    public  void idli(){
        System.out.println("jonna idli");
    }
    public  void egg(){
        System.out.println("half boiled egg");
    }
    public void method(){
        System.out.println("this is method");
    }

}
class method{
    public static void main(String[] args) {
        koti obj = new koti();
        obj.biriyani();
        obj.chiken();
        obj.egg();
        obj.idli();



        sreenu obj1 = new sathis();
        obj1.biriyani();
        obj1.chiken();
        obj1.egg();
        obj1.idli();



    }
}