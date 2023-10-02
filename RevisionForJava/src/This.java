public class This {
    static int a = 10;
    static String s = "dev";

    This() {
    }

    This(This k) {

    }

    This messy(){
        return this;
    }

    public void method(This z) {

        int a = 10;
        String s = "dev";
        System.out.println(this.s + "," + this.a);
    }

    public void method1() {
        methods obj = new methods(this);
        this.method(this);
    }

}

class methods {
    methods(This n){

    }
}
