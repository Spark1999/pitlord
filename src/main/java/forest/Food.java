package forest;

public class Food {
    String type;
    String name;
    Integer weight;

    public Food() {
        this.type = "simple";
        this.name = "unknown";
        this.weight = 0;
    }


    public Food(String type, String name, Integer weight) {
        this.type= type;
        this.name=name;
        this.weight=weight;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type=type;
    }

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Integer getWeight(){
        return this.weight;
    }
    public void setWeight(Integer weight){
        this.weight=weight;
    }



    @Override
    public String toString() {
        return "Food{" +
                "type=" + type  +
                ", name=" + name  +
                ", weight=" + weight +
                '}';
    }
}
