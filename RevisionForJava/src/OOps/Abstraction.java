package OOps;

public interface Abstraction {

    void method();

    public void method1();

    public void method2();
}

interface ab1{
    void method();

    public void method1();

    public void method2();
}

class info implements Abstraction, ab1{


    @Override
    public void method() {

    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
