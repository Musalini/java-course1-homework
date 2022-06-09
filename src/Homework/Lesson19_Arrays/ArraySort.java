package Homework.Lesson19_Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 5, 4};
        sort(array);
    }

    static void sort(int[] array) {
        int min = array[0];
        int index;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
               // array[index]
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(min);

    }

}
