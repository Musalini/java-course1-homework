package Classwork.Incapsulation_Inheritance;

public class Human {

    protected String name = "Musa";

    protected static int salary = 10000;

    protected void work() {
        System.out.println("Working!");
    }

    protected static void rest() {
        System.out.println("Resting!");
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(Student.salary);
        student.work();
        Student.rest();
    }
}
