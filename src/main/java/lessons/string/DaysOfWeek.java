package lessons.string;

public enum DaysOfWeek {
    MONDAY ("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday");

    String name;

    public String getName() {
        return this.name;
    }

    DaysOfWeek(String dayOfWeek) {
        this.name = dayOfWeek;
    }
}
