package Homework.Lesson27_AbstractClasses;

public interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks!");
    }
}
