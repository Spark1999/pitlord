package lessons.mountain;

public class Vegetable {
    String plantDate;

    public Vegetable() {
        this.plantDate = "08.03.2022";
    }

    public String getPlantDate() {
        return this.plantDate;
    }

    public void setPlantDate(String newDate) {
        this.plantDate = newDate;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "plantDate='" + plantDate + '\'' +
                '}';
    }
}
