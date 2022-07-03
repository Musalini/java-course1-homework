package Homework.Lesson27_AbstractClasses;

public class Lion extends Mammal{

    public Lion(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Lions likes meat");
    }

    @Override
    void sleep() {
        System.out.println("All day lions sleep");
    }

    @Override
    void run() {
        System.out.println("Lion not fast cat");
    }
}
