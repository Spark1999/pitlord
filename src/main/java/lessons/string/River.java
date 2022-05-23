package lessons.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class River {

    public static void main(String[] args) {

        makeText();
    }

    public static void makeText() {

        StringBuffer buffer = new StringBuffer();
        String finalText;

        buffer.append("Magic");
        buffer.append(" moments...");

        finalText = buffer.toString();
        System.out.println(finalText);

        String message = String.format("Hello, %s. You have %d gold", "John", 14);
        System.out.println(message);

        int myTextLength = message.length();
        System.out.println("My message is " + myTextLength + " letters long.");

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jack", "John", "Joe", "Bob", "Sam", "Samuel"));

        for(String name : names){
            if (name.startsWith("J")) {
                System.out.println("Name " + name + " starts with \"J\"");
            }
        }

        String title = "new york";
        System.out.println(title.toUpperCase());

        String bigName = "I AM ABSOLUTELY NORMAL!!";
        System.out.println(bigName.toLowerCase());

        String someMessageFromUser = "    I am tired. Game is not good            ";
        System.out.println(someMessageFromUser.trim());
        someMessageFromUser = someMessageFromUser.trim();

        int positionOfPoint = someMessageFromUser.indexOf('.');

        String firstSentence = someMessageFromUser.substring(0, positionOfPoint+1);
        System.out.println(firstSentence);

        String myGoods = "socks, cola, chips, potato, beer";
        ArrayList<String> goodsList = new ArrayList<>(Arrays.asList(myGoods.split(", ")));
        System.out.println(goodsList);
    }
}
