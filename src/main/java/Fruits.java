import java.util.ArrayList;
import java.util.Arrays;

public class Fruits {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("lemon");
        fruits.add("cherry");

        fruits.clear();

        fruits = new ArrayList<>(
                Arrays.asList("lemon", "kiwi", "orange", "ananas")
        );
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        fruits.set(0, "granat");

        for (int i = 0; i < fruits.size(); i = i+1){
            System.out.println("new fruit is: " + fruits.get(i) + " has number " + i);
        }

        System.out.println("kiwi has number "+ fruits.indexOf("kiwi"));

        System.out.println("we have "+ fruits.size() + " fruits ");
        fruits.remove(fruits.size()-1);

        for(String fruit : fruits) {
            System.out.println("My fruit is: " + fruit);
        }
    }
}
