package Homework.Lesson27_AbstractClasses;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}
