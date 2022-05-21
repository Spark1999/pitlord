package lessons.books;

public class Resourses {

    String name;

    public Resourses(){
        this.name = "iron";
    }
    public Resourses(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Resourses{" +
                "name='" + name + '\'' +
                '}';
    }
}
