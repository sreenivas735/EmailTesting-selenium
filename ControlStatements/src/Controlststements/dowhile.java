package Controlststements;

public class dowhile {
//    public static void main(String[] args) {
//        int a=200;
//        do{
//            System.out.println(a);
//            a++;
//        }while(a<=100);
//        System.out.println("method ended");
//    }
}



// this: to invoke current class method

class A{
    void m(){
        System.out.println("hello m");
    }
    void n(){
        System.out.println("hello n");
//m();

        this.m();
        m();
    }
}
class TestThis4{
//    public static void main(String args[]){
//        A a=new A();
//        a.n();
//    }
}

// this() : to invoke current class constructor

class D{
    D(){
        System.out.println("hello a");
    }
    D(String name){
        System.out.println("thid is perameter " + name);
    }
    D(int x){
        this("sree");
        System.out.println(x);
    }
}
class TestThis5{
//    public static void main(String args[]){
//        D a=new D(10);
//    }
}


// this: to pass as an argument in the method

class S2{
    void m(S2 obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
    }
    public static void main(String args[]){
        S2 s1 = new S2();
        s1.p();
    }
}




