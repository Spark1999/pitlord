package lessons.books;

import java.io.*;
import java.util.Scanner;

public class Adventures {
//    public Adventures() throws IOException {
//    }

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\AndU\\Projects\\pitlord\\src\\main\\java\\lessons.books\\magic-tales.txt");
        Scanner yourSkanner = new Scanner(file);
        while (yourSkanner.hasNextLine()) {
            System.out.println(yourSkanner.nextLine());
        }
        yourSkanner.close();

        String way = "C:\\Users\\AndU\\Projects\\pitlord\\src\\main\\java\\lessons.books\\useless.txt";
        String dich = "I am dangerous";

        BufferedWriter mywriter = new BufferedWriter(new FileWriter(way, true));

        mywriter.append("Why?");
        mywriter.append(dich);

        mywriter.close();


        for(int i = 0; i < 10;i++){
            String filePath = String.format("C:\\Users\\AndU\\Projects\\pitlord\\src\\main\\java\\lessons.books\\useless-%d.txt", i);
            String message = String.format("Hello. This is message number %d", i);
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.append(message);
            writer.close();
        }

    }
}
