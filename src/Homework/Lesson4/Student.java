package Homework.Lesson4;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverageGrade;
    double englishAverageGrade;

    public Student(int studentId, String name, String surname, int course, double mathAverageGrade, double economicsAverageGrade, double englishAverageGrade) {
        this(studentId,name,surname,course);
        this.mathAverageGrade = mathAverageGrade;
        this.economicsAverageGrade = economicsAverageGrade;
        this.englishAverageGrade = englishAverageGrade;
    }

    public Student(int studentId, String name, String surname, int course) {
        this.studentId = studentId;
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    public Student() {
    }
}



