package Homework.Lesson29_Polymorphism;

public interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks!");
    }
}
