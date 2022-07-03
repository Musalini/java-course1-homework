package Homework.Lesson25_Incapsulation.Homework25_1;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        StringBuilder sb = new StringBuilder("Musa");
        student.setName(sb);
        student.setCourse(4);
        student.showInfo();
    }

}
