package Homework.Lesson29_Polymorphism;

 abstract class Fish extends Animal {

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
