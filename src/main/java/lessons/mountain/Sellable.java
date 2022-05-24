package lessons.mountain;

public interface Sellable {

    public String sell(String buyer, Integer price);

    public Double makeDiscount(Integer price);
}
