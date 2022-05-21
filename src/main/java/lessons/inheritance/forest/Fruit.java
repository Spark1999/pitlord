package lessons.inheritance.forest;

public class Fruit extends Food {
    Integer sweetness;


    public Fruit(){
        super();
        this.sweetness=0;
    }
    public Fruit(String type, String name, Integer weight, Integer sweetness){
        super(type, name, weight);
        this.sweetness=sweetness;
    }
    public Integer getSweetness(){
        return this.sweetness;
    }
    public void setSweetness(Integer sweetness){
        this.sweetness=sweetness;
    }



}
