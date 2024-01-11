package data;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final Map<String, Integer> cartList = new HashMap<>();

    public Map<String, Integer> getCartList() {
        return cartList;
    }

    public void addToCart(String productName) {

    }

    public int getBill(Order order) {
        int totalPrice = 0;

        for (String str : cartList.keySet()) {
            totalPrice += order.getPrice(str) * cartList.get(str);
        }
    }

    public void clearCartList() {
        cartList.clear();
    }
}
