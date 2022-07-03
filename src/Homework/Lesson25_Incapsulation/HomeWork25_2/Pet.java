package Homework.Lesson25_Incapsulation.HomeWork25_2;

public class Pet extends Animal {
    String name;
    int tail = 1;
    int paw = 4;

    public Pet() {
        System.out.println("I'm pet");
        eyes = 2;
    }

    void run(){
        System.out.println("Pet runs!");
    }

    void jump(){
        System.out.println("Pet jumps!");
    }
}
