package keywords.This;

public class usageofthis {



    int i = 10;

    usageofthis() {


        this("sree"); // This is used to calling a constructor

        int i = 25;
        System.out.println("this is no -pera constructor" + this.i); // This is used to calling variables
    }


    public void method1(usageofthis k) {
        System.out.println("this is first method m1");
    }

    usageofthis meth() {
        this.method1(this); // This is used to passing method parameters    && method call
        return this; // This is used to passing return value
    }

    usageofthis(String name) {
       // This is used to  passing as constructor parameter
        meth();
        System.out.println("this is pere constructor  " + name);
    }
}

