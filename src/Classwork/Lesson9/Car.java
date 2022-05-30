package Classwork.Lesson9;

public class Car {

    int a;
    String color;
    String engine;
    static int count;


    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

//    public void showColor() {
//        int y = a;
//        System.out.println("Auto color: " + color);
//    }
//
//    public void changeColor(String color) {
//        System.out.println("Auto color changed!!");
//        this.color = color;
//        int price = 0;
//        price += 1000;
//    }


    void changeColor(String color) {
        this.color = color;
        System.out.println(color);
    }

    public static void main(String[] args) {
        Car car = new Car("red", "v6");
        System.out.println(car.color);
        car.changeColor("black");
        System.out.println(car.color);
    }
}
