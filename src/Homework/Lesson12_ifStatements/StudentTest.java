package Homework.Lesson12_ifStatements;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Musa", 3);
        Student student2 = new Student("Ivan", 3);
        studentsChecking(student1, student2);
        studentsArgumentsChecking(student1, student2);

    }

    static void studentsChecking(Student student1, Student student2) {
        if (student1.name.equals(student2.name) && student1.course == student2.course) {
            System.out.println("Students are equal!");
        } else System.out.println("Students aren't equal!");
    }

    static void studentsArgumentsChecking(Student student1, Student student2) {
        if (student1.name.equals(student2.name)) {
            if (student1.course == student2.course) {
                System.out.println("Names and courses are equals!");
            } else System.out.println("Names are equals, courses aren't");
        } else
            System.out.println("Names aren't equals");
    }

}
