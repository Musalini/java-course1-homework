package Homework.Lesson27_AbstractClasses;

public abstract class Fish extends Animal {

    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("It's always interesting to watch the fish sleep!");
    }

    abstract void swim();
}
