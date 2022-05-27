package Homework.Lesson1_8;

public class SecondClass {
    public static void main(String[] args) {
        System.out.println(FirstClass.firstMethod(3, 4, 2));
        FirstClass.secondMethod(9, 2);

        FirstClass firstClass = new FirstClass();

        firstClass.showInfo(1);
    }
}
