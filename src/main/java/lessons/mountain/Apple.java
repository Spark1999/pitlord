package lessons.mountain;

public class Apple extends Fruit implements Sellable, Storageble {
    String taste;

    public Apple(){
        super();
        this.taste="sweet";
    }

    public Apple(String name, Integer price, String taste){
        super(name, price);
        this.taste=taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }


    public String sell(String buyer, Integer price) {
        return "Fruit was send to " + buyer + " at price " + price;
    }

    public Double makeDiscount(Integer price) {
        return price * 0.1;
    }

    public String startStoring(String startDate) {
        return "Started storing at date: " + startDate;
    }

    @Override
    public void notifyEndOfStoring() {
        System.out.println("I ended storing");
    }

    @Override
    public void consumeFruit(String fruitName) {

    }


    @Override
    public String toString() {
        return "Apple{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
