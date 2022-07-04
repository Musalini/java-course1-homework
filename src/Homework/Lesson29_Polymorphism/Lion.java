package Homework.Lesson29_Polymorphism;

class Lion extends Mammal{

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
