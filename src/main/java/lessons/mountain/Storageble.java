package lessons.mountain;

public interface Storageble {

    public String startStoring(String startDate);

    public void notifyEndOfStoring();

    public void consumeFruit(String fruitName);
}
