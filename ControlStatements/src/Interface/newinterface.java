package Interface;

public class newinterface {

    public static void main(String[] args) {


    }
}

interface swiggy{

    void biriyani();

    void chiken();

    void  m1();

    default void sweet(){
        giftpack();
        System.out.println("this is a default sweet cova");
    }

    private void giftpack(){
        System.out.println("it is a private gift for every user");
    }

}

interface meghana {

    void m1();


}
interface zomato extends swiggy, meghana{ // 3 abstracts + 3 abstracts   = 6
  // 4
}



