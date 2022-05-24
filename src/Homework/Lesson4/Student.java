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
        this(mathAverageGrade,economicsAverageGrade,englishAverageGrade);
    }

    public Student(double mathAverageGrade, double economicsAverageGrade, double englishAverageGrade) {
        this.mathAverageGrade = mathAverageGrade;
        this.economicsAverageGrade = economicsAverageGrade;
        this.englishAverageGrade = englishAverageGrade;
    }

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    public Student(){}

}


