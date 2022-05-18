package inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class Birds {
    public static void main(String[] args) {


        ArrayList<String> birds = new ArrayList<>();
        birds.add("owl");
        birds.add("crow");
        birds.add("lark");

        birds = new ArrayList<>(
                Arrays.asList("crow", "sparrow", "duck", "hen")
        );

        for (int i = 0; i < birds.size(); i++) {
            System.out.println(birds.get(i));
        }

        birds.set(0, "turkey");

        System.out.println("bird number one is "+ birds.get(0));

        System.out.println("we have " + birds.size()+ " birds");

        System.out.println("crow has number " + birds.indexOf("duck"));

        birds.remove(birds.size()-1);

        System.out.println("now we have "+birds.size()+ " birds");

    }
}