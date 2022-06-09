package Homework.Lesson21_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    public static void main(String[] args) {
        System.out.println(abc("H", "C", "A","B","B"));
    }

    static ArrayList<String> abc(String... strings) {

        ArrayList<String> arrayList = new ArrayList<>();
        for (String s: strings) {
            if (!arrayList.contains(s)) {
                arrayList.add(s);
            }
        }

        Collections.sort(arrayList);
        return arrayList;
    }
}
