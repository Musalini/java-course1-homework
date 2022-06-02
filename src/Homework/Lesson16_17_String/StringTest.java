package Homework.Lesson16_17_String;

public class StringTest {
    public static void main(String[] args) {
        String string = "ya@yahoo.com; on@mail.ru;  ona@gmail.com;";
        String[] strings = string.split(" ");
        for (String s : strings) {
            email(s);
        }
    }

    static void email(String string) {
        System.out.println(string.substring(string.indexOf('@') + 1, string.indexOf('.')));
    }

}
