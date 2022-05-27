package Classwork;

public class Car {
    String color;
    String engine;
    static int count;

    public Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor() {
        System.out.println("Auto color: " + color);
    }

    public void changeColor(String color) {
        System.out.println("Auto color changed!!");
        this.color = color;
        int price = 0;
        price += 1000;
    }
}
