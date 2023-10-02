package polymorpisam;

public class practice {
    public static void main(String[] args) {
        polymer1 obj = new polymer1(20, "A+");
        obj.m3(25, "B-");
        obj.m2();
    }

}
class polymer1 {
    int age;
    String BG;
    public polymer1(int age, String BG){

       // this.age=age;
       // this.BG =BG;
        System.out.println("age is  "+age +" "+"BG is "+ BG);

    }
   public void m3(int age, String BG){
       this.age=age;
       this.BG =BG;
   }
    public void m2(){
        System.out.println("age is  "+age +" "+"BG is "+ BG);

    }
}
