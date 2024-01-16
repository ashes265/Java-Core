package collection.obj;

import java.util.Date;

public class Item {
    private String name;
    private double price;
    private Date createDate;

    public Item(String name, double price, Date createDate) {
        this.name = name;
        this.price = price;
        this.createDate = createDate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", createDate=" + createDate.getTime() +
                '}';
    }
}