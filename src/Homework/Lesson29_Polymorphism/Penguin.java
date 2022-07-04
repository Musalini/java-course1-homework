package Homework.Lesson29_Polymorphism;

class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Penguin like fish!");
    }

    @Override
    void sleep() {
        System.out.println("Penguins sleep!");
    }

    @Override
    void fly() {
        System.out.println("Penguins can't fly!");
    }

    @Override
    public void speak() {
        System.out.println("Penguins don't sings like birds!");
    }
}
