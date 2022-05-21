package lessons.inheritance.forest;

import java.util.ArrayList;
import java.util.Arrays;

public class BigForest {
    public static void main(String[] args) {
    makeBreakfast();
    }


    public static void makeBreakfast() {
        ArrayList<String> food= new ArrayList<>();
        food=new ArrayList<>(Arrays.asList("whisky", "meat", "onion"));
        food.add("potato");

        for (int i=0; i < food.size(); i++){
            //System.out.println(food.get(i) + " position is:" +i);
        }

        food.set(0, "milk");
        food.remove(food.size()-1);
//        System.out.println(food);
        int position=food.indexOf("meat");
        //System.out.println("meat has position "+ position);



        Food tasty = new Food();
        Food burger= new Food("healthy", "big mac", 140);
        System.out.println(tasty);
        System.out.println(burger);
    }



}
