package Homework.Lesson18_StringBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("abe");
        StringBuilder stringBuilder2 = new StringBuilder("abc");
        System.out.println(equality(stringBuilder1, stringBuilder2));

    }

    static boolean equality(StringBuilder stringBuilder1, StringBuilder stringBuilder2) {
        boolean result = true;
        if (stringBuilder1.length() == stringBuilder2.length()) {
            for (int i = 0; i < stringBuilder2.length(); i++) {
                if (stringBuilder1.charAt(i) != stringBuilder2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else result = false;
        return result;
    }

}
