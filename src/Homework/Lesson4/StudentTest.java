package Homework.Lesson4;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(3, 4, 5);
        Student student2 = new Student(3, 5, 7);
        Student student3 = new Student(5, 3, 7);
        Student student4 = new Student(4, "Musa", "Muradov", 7);

        System.out.println("Средняя оценка студента student1: " + averageGrade(student1));
        System.out.println("Средняя оценка студента student1: " + averageGrade(student2));
        System.out.println("Средняя оценка студента student1: " + averageGrade(student3));
        System.out.println(averageGrade(student4));

    }

    static double averageGrade(Student student) {
        return (student.economicsAverageGrade + student.englishAverageGrade + student.mathAverageGrade) / 3;
    }

}
