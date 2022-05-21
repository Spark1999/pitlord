package lessons.books;

import java.io.*;
import java.util.Scanner;

public class University {

    public static void main(String[] args) throws IOException {


        // read file:
        File file = new File("C:\\Users\\AndU\\Projects\\pitlord\\src\\main\\java\\lessons.books\\magic-tales.txt");

        Scanner myScanner = new Scanner(file);

        while (myScanner.hasNextLine()) {
            System.out.println(myScanner.nextLine());
        }

        myScanner.close();


        // write new file:
        String myNewFile = "C:\\Users\\AndU\\Projects\\pitlord\\src\\main\\java\\lessons.books\\geography.txt";

        String myStory = "It was a great journey. We sailed to Jamaica.";

        BufferedWriter writer = new BufferedWriter(new FileWriter(myNewFile, true));

        writer.append("Hello. ");
        writer.append(myStory);

        writer.close();
    }

}
