package lessons.inheritance;

public class Lizard extends Animal {
    Integer tailLength;

    public Lizard() {
        super();
        this.tailLength = 0;
    }

    public Lizard(String name, Integer legs) {
        super(name, legs);
        this.tailLength = 0;
    }

    public Lizard(String name, Integer legs, Integer tailLength) {
        super(name, legs);
        this.tailLength = tailLength;
    }
    public Integer getTailLength() {
        return this.tailLength;


    }

    public void setTailLength(Integer newLength) {
        this.tailLength = newLength;
    }

    @Override
    public String toString() {
        return "Lizard{" +
                "animalName='" + animalName + '\'' +
                ", legsNumber=" + legsNumber +
                ", tailLength=" + tailLength +
                '}';
    }
}
