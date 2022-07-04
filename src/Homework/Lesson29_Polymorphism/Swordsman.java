package Homework.Lesson29_Polymorphism;

 class Swordsman extends Fish {

    public Swordsman(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Swordsman eats regular food!");
    }

    @Override
    void swim() {
        System.out.println("Swordsman swims fast!");
    }
}
