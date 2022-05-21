package lessons.inheritance;

public class Dog extends Animal {

    String voice;

    public Dog(){
        super();

        this.voice = "bark";


    }
    public Dog(String name, Integer legs,String voice){
        super(name, legs);
        this.voice = voice;

    }
    public String getVoice(){
        return this.voice;
    }
    public void setVoice(String newVoice) {
        this.voice = newVoice;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "animalName='" + animalName + '\'' +
                ", legsNumber=" + legsNumber +
                ", voice='" + voice + '\'' +
                '}';
    }
}

