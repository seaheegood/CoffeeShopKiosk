package data;

import domain.Item;

import java.util.ArrayList;

public class Order {
    private final ArrayList<Item> itemList = new ArrayList<>();

    public void addList(ArrayList<Item> itemList) {
        this.itemList.addAll(itemList);
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public int getPrice(String str) {
        int orderPrice = 0;

        for (Item item : itemList) {
            if (item.getName().equals(str.trim())) {
                orderPrice += item.getPrice();
            }
        }

        return orderPrice;
    }
}
