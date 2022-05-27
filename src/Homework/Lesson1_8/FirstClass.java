package Homework.Lesson1_8;

public class FirstClass {
    static final double Pi = 3.14;

    static int firstMethod(int a, int b, int c) {
        return a * b * c;
    }

    static void secondMethod(double a, double b) {
        System.out.println("Частное от деления: " + a / b);
        System.out.println("Остаток от деления: " + a % b);
    }


    double circleSquare(int radius) {

        return (Pi * radius * radius);
    }

    static double dlina(int radius) {
        return Pi * 2 * radius;
    }

    void showInfo(int radius) {
        System.out.println("Площадь круга: " + circleSquare(radius));
        System.out.println("Радиус круга: " + radius);
        System.out.println("Диаметр круга: " + dlina(radius));
    }
}
