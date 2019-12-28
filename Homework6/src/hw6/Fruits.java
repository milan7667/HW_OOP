package hw6;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    public static void main(String[] args) {
        Fruits.changeFruits();
    }

    public static void changeFruits() {
        List<String> myFruits = new ArrayList<>();
        myFruits.add("Kiwi");
        myFruits.add("Orange");
        myFruits.add("Grapefruit");
        myFruits.add("Mandarin");
        myFruits.add("Avocado");

        for (int i = 0; i < myFruits.size(); i++) {
            if (myFruits.get(i).equals("Orange")) {
                myFruits.set(i, "Grapefruit");
            }
        }
        System.out.println(myFruits);
    }
}
