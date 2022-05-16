import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // create and populate:
        ArrayList<String> animals = new ArrayList<>();
        animals.add("bear");
        animals.add("wolf");
        animals.add("fox");
        animals.add("rabbit");

        //System.out.println(animals);


        ArrayList<String> birds = new ArrayList<>(
                Arrays.asList("sparrow", "swallow", "crow")
        );

        //System.out.println(birds);

        // iterate:
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Animal is: " + animals.get(i) + " and has number: " + i);
        }

        // get:
        System.out.println(animals.get(0));

        // update:
        animals.set(0, "squirrel");

        System.out.println(animals.get(0));

        // delete:
        animals.remove(1);

        for (int i = 0; i < animals.size(); i++) {
            System.out.println("New animal is " + animals.get(i) + " and it has a number: " + i);
        }

        animals.clear();

        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Animal after clearing is: " + animals.get(i));
        }

        System.out.println("List has " + animals.size() + " animals");
    }




    public static void makeAnimals() {

    }
}