package Exception;
//class A {
//  class B {
//  }
//
//  static class C {
//  }
//
//  void run() {
//    D t = new D() {
//      int helpMethod() {
//        return 2;
//      }
//    };
//  }
//}
//abstract class D {
//  abstract int helpMethod();
//  }
//
//  public class quiz{
//    public static void main(String[] args) {
//      A obj = new A();
//      obj.run();
//    }
//  }


class A{
  int i = m1();
  A(){
    System.out.println("construvctor");
  }
  int m1(){
    System.out.println("mi-method");
    return i;
  }
  {
    System.out.println("instance-block");
  }

  public static void main(String[] args) {
    A obj = new A();
  }

}





