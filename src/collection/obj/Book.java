package collection.obj;

public class Book {
    private String name;
    private float price;

    public Book() {
    }

    public Book(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }
}
