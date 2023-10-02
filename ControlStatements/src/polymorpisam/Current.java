package polymorpisam;

public class Current{
    public static void main(String[] args) {
        // Example usages of the 'this' keyword

        // Person
        Person person = new Person();
        System.out.println("Person name: " + person.name);

        // Rectangle
        Rectangle rectangle = new Rectangle(5);
        rectangle.printWidth(10);

        // Calculator
        Calculator calculator = new Calculator();
        calculator.add(5);
        System.out.println("Calculator result: " + calculator.result);

        // Car
        Car car = new Car();
        car.drive();

        // Student
        Student student = new Student();
        System.out.println("Student name: " + student.name);

        // Button
        Button button = new Button();
        button.onClick(new ClickListener() {
            @Override
            public void onClick(Button button) {
                System.out.println("Button clicked.");
            }
        });
    }

}

class Person {
    String name;
    int age;

    Person() {
        this("John");  // Call another constructor
    }

    Person(String name) {
        this.name = name;
        this.age = 30;
       // System.out.println("Person name: " + person.name);
    }
}

class Rectangle {
    int width;

    Rectangle(int width) {
        this.width = width;  // Assigning instance variable
    }

    void printWidth(int width) {
        System.out.println("Instance variable width: " + this.width);//5
        System.out.println("Method parameter width: " + width);//10
    }
}

class Calculator {
    int result;// 1

    Calculator add(int num) { //10
        this.result += num;
        return this;  // Return current instance for chaining
    }
}

class Car {
    void startEngine() {
        // Code to start engine
    }

    void drive() {
        this.startEngine();
        System.out.println("Car is driving.");
    }
}

class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 18);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Button {
    void onClick(ClickListener listener) {
        // Pass the current instance to the listener
        listener.onClick(this);
    }
}

interface ClickListener {
    void onClick(Button button);
}


