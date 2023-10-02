package polymorpisam;

public class polymorphisam {

    public static void main(String[] args) {
        poly2 obj = new poly2(25, "pass", 25, "A+", 89, "sreenivas");


    }

}
 class poly{

    int marks;
    String name;

    poly(int marks, String name){
        this.marks=marks;
        this.name=name;
        System.out.println("name is "+ name+" " + "marks are "+ marks);
    }
    public void m1(){
        System.out.println("name is "+ name+" " + "marks are "+ marks);

    }

}

class polymer extends poly{
    int age;
    String BG;
    polymer(int age, String BG, int marks, String name){
        super(marks, name);
       // this.age=age;
       // this.BG =BG;
    }
    public void m3(){
        this.age=age;
        this.BG =BG;
    }
    public void m2(){
        System.out.println("age is  "+age +" "+"BG is "+ BG);

    }
}
class poly2 extends polymer{
    int rollno;
    String status;
    poly2(int rollno, String status,int age, String BG, int marks, String name){
        super(age, BG, marks, name   );
        this.rollno=rollno;
        this.status=status;
        System.out.println("rollno is  "+ rollno + "and status of the student is " + status);
    }
    public void method(){
        System.out.println("rollno is  "+ rollno + "and status of the student is " + status);

    }
}