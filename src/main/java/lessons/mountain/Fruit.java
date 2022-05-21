package lessons.mountain;

public class Fruit {
    String name;
    Integer price;

   public Fruit(){
       this.name="fruit";
       this.price=0;
   }
   public Fruit(String name, Integer price){
       this.name=name;
       this.price=price;
   }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

