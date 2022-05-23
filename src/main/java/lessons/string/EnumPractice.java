package lessons.string;

public class EnumPractice {

    public static void main(String[] args) {

        System.out.println(HeroClass.BARBARIAN.name());
        System.out.println(HeroClass.BARBARIAN);

        System.out.println(HeroClass.DRUID);
        System.out.println(HeroClass.PALADIN);

        System.out.println(DaysOfWeek.MONDAY.getName());
    }
}
