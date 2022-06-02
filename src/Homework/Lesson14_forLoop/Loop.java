package Homework.Lesson14_forLoop;

public class Loop {
    public static void main(String[] args) {
        String string = new String("Musa");
        showTime();
    }

    static void showTime() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int minutes = 0; minutes < 60; minutes++) {
                if (hour > 1 && minutes % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int seconds = 0; seconds < 60; seconds++) {
                    if (hour * seconds > minutes) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minutes + ":" + seconds);
                }
            }
        }
    }
}
