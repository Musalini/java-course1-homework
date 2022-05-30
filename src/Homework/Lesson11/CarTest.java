package Homework.Lesson11;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("black", "v6", 5);
        Car car2 = new Car("red", "v8", 3);

        changeDoorsNumber(car1, 6);
       // changeDoorsNumber(car2, 8);
        changeColor(car1, car2);

        System.out.println("car1 color: " + car1.color);
        System.out.println("car2 color: " + car2.color);

        System.out.println("car1 doors number: " + car1.doorsNumber);
        System.out.println("car2 doors number: " + car2.doorsNumber);

    }

    static void changeDoorsNumber(Car car, int number) {
        car.doorsNumber = number;
    }

    static void changeColor(Car car1, Car car2) {
        String temp = car1.color;
        car1.color = car2.color;
        car2.color = temp;
    }

}
