package polymorpisam;

public class methodoverloading {
    public static void main(String[] args) {
        elephant obj = new elephant();
        obj.eyes();
        obj.tusk();
        obj.height();
        obj.legs();
        obj.colour();
    }
}

class animal{
    public void eyes(){
        System.out.println("two eyes");

    }
    public void legs(){
        System.out.println("four legs");
    }

    public void colour(){
        System.out.println("colour ");
    }
    public void height(){
        System.out.println("narmal height");
    }
}

class elephant extends animal{
    public void tusk(){
        System.out.println("it have one tusk");
    }
    public void height(){
        System.out.println("size of the elephant is big");
    }
    public void colour(){
        System.out.println("the colour is black");
    }

}

class lion{

}
