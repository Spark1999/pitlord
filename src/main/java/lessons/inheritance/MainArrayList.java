package lessons.inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class MainArrayList {

    public static void main(String[] args) {

        ArrayList<String> heroes=new ArrayList<>();
        heroes.add("Mirana");
        heroes.add("Naix");
        heroes.add("Viper");

        ArrayList<String> items=new ArrayList<>(
                Arrays.asList("dominator", "vanguard", "butterfly")
        );

        for (int i=0; i < heroes.size(); i++) {
            System.out.println(heroes.get(i));
        }

        heroes.set(0,"riki");

        System.out.println(heroes.get(0));

        heroes.remove(2);

        for (int i=0; i < heroes.size(); i++) {
            System.out.println("new heroes are: " + heroes.get(i) + " and number is " + i);
        }

        heroes.add("Doom");
        heroes.add("Bane");

        System.out.println("Position of Doom is: " + heroes.indexOf("Doom"));
    }
}
