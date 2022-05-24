package Homework.Lesson5.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Muradov", 25, 100000, "It");
        Employee employee2 = new Employee(2, "Ivanov", 28, 200000, "factory");

        System.out.println("Увеличение зп в два раза: " + increaseSalary(employee1.salary));
        System.out.println("Увеличение зп в два раза: " + increaseSalary(employee2.salary));
    }

    static int increaseSalary(int salary) {
        return salary * 2;
    }
}
