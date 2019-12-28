package hw6;

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static void main(String[] args) {
        Elements.getElement();
    }

    public static void getElement() {
        List<Integer> myFirstList = new ArrayList<>();
        List<Integer> mySecondList = new ArrayList<>();

        myFirstList.add(1);
        myFirstList.add(2);
        myFirstList.add(3);

        mySecondList.add(3);
        mySecondList.add(4);
        mySecondList.add(5);

        myFirstList.retainAll(mySecondList);
        System.out.println(myFirstList);
    }
}


