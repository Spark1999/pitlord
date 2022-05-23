package lessons.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Love {
    public static void main(String[] args) {
       dead();
    }

    private static void dead() {
        StringBuffer robots = new StringBuffer();
        String endless;

        robots.append("nice fighter ");
        robots.append("mutant");

        endless=robots.toString();
        System.out.println(endless);

        String dich = String.format("%d robot never die in the %s", 177, "Kyiv");
        System.out.println(dich);

        int textlong = dich.length();
        System.out.println(textlong);

        ArrayList<String> robot = new ArrayList<>(Arrays.asList("spy ", "spoon ", "sparrow ", "tree ", "apple"));
        for(String news : robot){
            if (news.startsWith("s")){
                System.out.println(news);
            }
        }
        String str1="hitler";
        System.out.println(str1.toUpperCase());

        String str2="JAMES";
        System.out.println(str2.toLowerCase());

        String str3=" Hit  the bodies in   the floor    ";
        System.out.println(str3.trim());
         int obrizka= str3.indexOf('f');

         String fistLetters = str3.substring(0, (obrizka+1));
        System.out.println(fistLetters);

        String someThings = "knife, folk, spoon, polonyk";
        ArrayList<String> someList = new ArrayList<>(Arrays.asList(someThings.split(", ")));
        System.out.println(someList);






    }


}
