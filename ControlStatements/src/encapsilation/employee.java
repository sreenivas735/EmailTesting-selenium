package encapsilation;

public class employee {

  int a =10;

  private String name = "vasudev";

  public void setName( String name1){
        name = name1;
  }

  public String getname(){
    return name;
  }
//
//  public void method1(String name1){
//    name= name1;
//  }
//
//   public void method(){
//     System.out.println("name of the given student is  "+ name);
//   }

}

class manager{
  public static void main(String[] args) {
     employee obj = new employee();
     obj.setName("Abhimanyu");
    System.out.println("the name of the hero is "+ obj.getname());

//     obj.method1("sreenivas");
//     obj.method();
  }
}

