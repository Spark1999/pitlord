package lessons.holidays;

import lessons.mountain.Apple;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collector;

public class Runner {

    public static void main(String[] args) {
        // scheduleHolidays();
        makeMap();
        Apple apple = new Apple();
        apple.notifyEndOfStoring();
    }

    public static void scheduleHolidays() {
        LocalDate currentDate = LocalDate.now();

        System.out.println("Now we have: " + currentDate);

        LocalDateTime myDateAndTime = LocalDateTime.now();
        System.out.println("Date and time raw: " + myDateAndTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String beautifulDate = dateTimeFormatter.format(myDateAndTime);
        System.out.println(beautifulDate);

        myDateAndTime = myDateAndTime.minusYears(20);

        System.out.println(myDateAndTime);

        myDateAndTime = myDateAndTime.plusDays(100);
        System.out.println(dateTimeFormatter.format(myDateAndTime));

        DateTimeFormatter beatifulFormatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");
        System.out.println(beatifulFormatter.format(myDateAndTime));
    }

    public static void makeMap() {
        HashMap<String, String> users = new HashMap<>();

        users.put("111", "Bob");
        users.put("2222", "Jack");
        users.put("7324", "Harry");
        users.put("9842", "Charles");
        users.put("9034", "James");

        System.out.println(users);

        String userWithId111 = users.get("111");
        System.out.println(userWithId111);

        String userWithNameBob = users.get("Bob");
        System.out.println(userWithNameBob);

        // update:
        users.put("2222", "Samuel");
        System.out.println(users);

        // delete:
        users.remove("9034");
        System.out.println(users);

        Set<String> myKeys = users.keySet();
        System.out.println("Set of keys of a map:");
        System.out.println(myKeys);

        ArrayList<String> names = new ArrayList<>();

        users.forEach((key, value) -> {
            System.out.println("HELLO: My key is " + key + " and value is: " + value);
            names.add(value);
        });

        System.out.println("Names of users are: " + names);

        for (Map.Entry<String, String> entry : users.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key is " + key + " and value is " + value);
        }

        users.clear();
    }
}
