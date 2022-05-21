package lessons.inheritance.adventures;

public class Hero {
    String name;
    Integer strength;
    Integer agility;
    Integer intellegence;


    public Hero() {
        this.name="Hero";
        this.strength=0;
        this.agility=0;
        this.intellegence=0;
    }

    public Hero(String name, Integer strength, Integer agility, Integer intellegence) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
        this.intellegence = intellegence;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intellegence=" + intellegence +
                '}';
    }

    public Integer getAgility() {
        return this.agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }
    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public Integer getStrength(){
        return this.strength;
    }

    public void setStrength(Integer strength){
        this.strength = strength;
    }
    public Integer getIntellegence(){
        return this.intellegence;
    }
    public void setIntellegence(Integer intellegence){
        this.intellegence = intellegence;
    }

}
