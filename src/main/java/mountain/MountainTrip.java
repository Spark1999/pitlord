package mountain;

import java.util.Scanner;

public class MountainTrip {
    public static void main(String[] args) {

        Integer age = 0;
        Integer bugdet = 0;

        // менше 14, менше 100 бюджет - Не можна
        // від 14 до 21, від 100 до 1000 бюджет - Юніор економ
        // від 14 до 21, бюджет 1000-9000 - Юніор стандарт
        // від 14 до 21, бюджет більше 9000 - Юніор преміум
        // від 21 до 45, бюджет 100-1000 - Дорослий економ
        // від 21 до 45, бюджет 1000-9000 - Дорослий стандарт
        // від 21 до 45, бюджет більше 9000 - Дорослий преміум
        // більше 45, бюджет 100-1000 - Пенсіонер економ
        // більше 45, бюджет 1000-9000 - Пенсіонер стандарт
        // більше 45, бюджет більше 9000 - Пенсіонер преміум

        // Зчитати інфо юзера через сканер
        // Сформувати рядок, який буде говорити, який пакет подорожі в гори залежно від інфо через String.format()


        Scanner yourSkanner=new Scanner(System.in);
        System.out.println("How old are you?");
        age= yourSkanner.nextInt();

        System.out.println("How much money you can spend?");
        bugdet= yourSkanner.nextInt();

        if (age<14 && bugdet<100){
            System.out.printf("you cannot enter");
        } else if (age>=14 && age<21 && bugdet>=100 && bugdet<1000) {
            System.out.printf("You are is %d. Your budget is %d.  your trip is junior econom", age, bugdet);
        } else if (age>=14 && age<21 && bugdet>=1000 && bugdet<9000){
            System.out.printf("You are is %d. Your budget is %d.  your trip is junior standart", age, bugdet);
        } else if (age>=14 && age<21 && bugdet>=9000){
            System.out.printf("You are is %d. Your budget is %d.  your trip is junior premium", age, bugdet);
        } else {
            System.out.printf("give us %d money and go away", bugdet);
        }

        yourSkanner.close();
    }

}
