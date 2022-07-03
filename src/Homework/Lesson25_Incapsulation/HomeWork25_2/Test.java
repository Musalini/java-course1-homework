package Homework.Lesson25_Incapsulation.HomeWork25_2;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Cesar");
        System.out.println("----------------------------------");
        Dog dog2 = new Dog("Tom");
        System.out.println("----------------------------------");
        Cat cat = new Cat("Napoleon");
        cat.sleep();
    }
}
