package Homework.Lesson27_AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Swordsman swordsman = new Swordsman("Musa");
        System.out.println(swordsman.name);
        swordsman.swim();
        swordsman.eat();
        swordsman.sleep();

        Speakable penquin = new Penguin("Misha");
        penquin.speak();

        Animal lion =  new Lion("Andrew");
        System.out.println(lion.name);
        lion.sleep();
        lion.eat();

        Mammal lion1 = new Lion("John");
        lion1.run();
        lion1.speak();
        lion1.eat();
        lion1.sleep();
        System.out.println(lion1.name);
    }
}
