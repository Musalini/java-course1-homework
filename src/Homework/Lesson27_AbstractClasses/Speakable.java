package Homework.Lesson27_AbstractClasses;

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks!");
    }
}
