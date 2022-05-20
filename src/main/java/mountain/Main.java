package mountain;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        makeFruits();
        makeGreeting();

        String userName = "";
        Integer age = 0;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?");

        userName = myScanner.nextLine();

        System.out.println("Ok, that's good. And what is your age?");
        age = myScanner.nextInt();

        if (age >= 21) {
            System.out.printf("Welcome, %s, you are a great hero. You can pass.", userName);
        } else {
            System.out.printf("Sorry, %s, you are too young.", userName);
        }

        // System.out.printf("Information gathered. Your name is %s and your age is %d", userName, age);
        myScanner.close();
    }

    public static void makeFruits() {
        Apple myApple=new Apple();
        System.out.println(myApple);

        Apple premiumApple = new Apple("Gold", 15, "bitter sweet");
        System.out.println(premiumApple);
    }

    public static void makeGreeting() {
                String heroClass = "barbarian";
        String heroName = "Hlodwig";
        Integer heroGold = 0;

        String message = String.format("Good day, hero. It's rare to meet a %s in the rogue camp nowadays. Your name is %s. Your gold is %d",
                heroClass, heroName, heroGold);

        System.out.println(message);
    }

}
