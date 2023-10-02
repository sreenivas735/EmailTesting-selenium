package encapsilation;

public class student {
    int d= 10;
   private String name = "sreenivas";

   public void Setname(int d){
        this.d=d;
   }

   public int getname(){
       return d;
   }

//   public void method(){
//       System.out.println("the name is "+ name);
//   }
//
//   public void method(String fame){
//           name = fame;
//   } 

}

class techer{
    public static void main(String[] args) {
        student obj = new student();
//        obj.method("vasu");
//        obj.method();
        obj.Setname(1200);
        System.out.println(" updated value of the given integer "+obj.getname());

    }
}