package Homework.Lesson25_Incapsulation.Homework25_1;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public Student() {
    }

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() < 3)
            System.out.println("Incorrect name!");
        else
            this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4)
            this.course = course;
        else
            System.out.println("Incorrect course value");
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10)
            this.grade = grade;
        else
            System.out.println("Incorrect grade value!");
    }

    public void showInfo() {
        if (getName() != null)
            System.out.println("Student name: " + getName());
        if (getCourse() != 0)
            System.out.println("Course: " + getCourse());
        if (getGrade() != 0)
            System.out.println("Grade: " + getGrade());
    }
}
