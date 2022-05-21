package lessons.books;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Chuckcha {
    public static void main(String[] args) throws IOException {


        for (int i = 0; i<5; i++){
//            String manuscript=String.format("C:\\Users\\AndU\\Projects\\pitlord\\src\\main\\java\\lessons.books\\Her+%d.xlsx", i);
//            String content=String.format("Noob %d", i);
//
//            BufferedWriter mmm = new BufferedWriter(new FileWriter(manuscript, true));
//            mmm.append(content);
//            mmm.close();
        }

        File file = new File("C:\\Users\\AndU\\Projects\\pitlord\\src\\main\\java\\lessons.books\\magic-tales.txt");
        Scanner skan = new Scanner(file);

        String message = "sdfsdafasdf";
        int i = 55;

        //while (skan.hasNextLine()){
            // System.out.println(skan.nextLine());
       // }


        skan.close();
        makeResourses();
        makeFood();
        calculate();
    }
    public static void makeResourses (){
        Resourses gem = new Resourses();
        //System.out.println(gem);

        Resourses gold = new Resourses("metal");
       // System.out.println(gold);
    }

    public static void makeFood(){

        ArrayList<String> food = new ArrayList<>();
        food = new ArrayList<>(Arrays.asList("meat", "beer", "lemon"));

        for (int i=0; i< food.size(); i++){
            //System.out.println(food.get(i));
        }

        food.set(2,"orange");
        //System.out.println(food);

        System.out.println("Position of beer is: " + food.indexOf("beer"));

        food.remove(1);
        //System.out.println(food);

        String message= String.format("My favorite food is %s", food.get(0));
       // System.out.println(message);
    }


    public static void calculate(){
        double res =Math.sqrt(9);
        double myMax=Math.max(55, 66);
        double nnn=Math.floor(15.36);
        int res2=39%7;
        System.out.println(res2);


        int money = -10;
        int ticketPrice = 100;

        if (money>=ticketPrice){
            System.out.println("you bought a ticket");
        } else if ((money-ticketPrice)<(0-ticketPrice)){
            System.out.println("you cannot buy a ticket");
        } else if ((money-ticketPrice)>=(0-ticketPrice)){
            System.out.println("you can buy a ticket in credit");
        }

        for (int i=0; i<10; i++){
            roll();
        }

        }
        public static void roll(){
            int randomDiceRoll = 1 + (int)(Math.random() * ((6 - 1) + 1));

            System.out.println("you result is " + randomDiceRoll);
        }


}
