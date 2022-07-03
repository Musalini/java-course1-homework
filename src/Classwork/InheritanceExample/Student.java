package Classwork.InheritanceExample;

import Classwork.Incapsulation_Inheritance.Human;

public class Student extends Human {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(Student.salary);
        student.work();
        Student.rest();
    }
}

class Test extends Human {
    public static void main(String[] args) {
        //Student student = new Student();
        Test test = new Test();
        System.out.println(test.name);
        System.out.println(Student.salary);
        test.work();
        Student.rest();
    }
}
