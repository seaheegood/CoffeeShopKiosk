package domain;

public class Item extends Menu {
    private final int price;

    public Item(String name, String description, int price) {
        super(name, description);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
