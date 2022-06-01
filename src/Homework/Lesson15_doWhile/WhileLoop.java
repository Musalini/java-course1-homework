package Homework.Lesson15_doWhile;

public class WhileLoop {
    public static void main(String[] args) {
        showTime();
    }

    static void showTime() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minutes = -1;
            MIDDLE:
            do {
                minutes++;
                if (hour > 1 && minutes % 10 == 0) {
                    break OUTER;
                }
                int seconds = 0;
                INNER:
                while (seconds < 60) {
                    if (hour * seconds > minutes) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minutes + ":" + seconds);
                    seconds++;
                }
            } while (minutes < 59);
            hour++;

        }
    }
}
