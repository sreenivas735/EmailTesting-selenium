package keywords.This;

public class myusageofTHis {

    public static void main(String[] args) {
       myusageofTHis obj = new myusageofTHis();

    }

    public void method(){
        System.out.println("this is no-pera method");
    }

    public void method(myusageofTHis a){
        System.out.println("this is pera method");
    }

    myusageofTHis(){
        this(25);
        method(this);
        method();
        System.out.println("this is no-pera constructor");
    }
    myusageofTHis(int a){
        myown obj1 = new myown(this);
        System.out.println("this is pera constructor");
    }
}
class myown{
    myown(myusageofTHis s){
        System.out.println("this is with myown non-pera constructor");
    }
}

