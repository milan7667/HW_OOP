package hw6;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(9);
        myList.add(11);
        myList.add(18);
        myList.add(20);
        myList.add(22);

        for (int i : myList) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

    }
}





