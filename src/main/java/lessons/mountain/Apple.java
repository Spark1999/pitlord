package lessons.mountain;

public class Apple extends Fruit{
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


    @Override
    public String toString() {
        return "Apple{" +
                "taste='" + taste + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
