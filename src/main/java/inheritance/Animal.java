package inheritance;

public class Animal {
    String animalName;
    Integer legsNumber;

    public Animal() {
        this.animalName = "Organism";
        this.legsNumber = 0;
    }

    public Animal(String name) {
        this.animalName = name;
        this.legsNumber = 0;
    }

    public Animal(String name, Integer legs) {
        this.animalName = name;
        this.legsNumber = legs;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public void setAnimalName(String name) {
        this.animalName = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName=\"" + animalName + "\", legsNumber=" + legsNumber + '}';
    }
}
