package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Purchase {
    private final ArrayList<Map<String, Integer>> purchasedList = new ArrayList<>();

    public ArrayList<Map<String, Integer>> getPurchasedList() {
        return purchasedList;
    }

    public int getTotalBill(Order order) {
        int totalBillPrice = 0;

        for (Map<String, Integer> map : getPurchasedList()) {
            for (String str : map.keySet()) {
                totalBillPrice += order.getPrice(str) * map.get(str);
            }
        }

        return totalBillPrice;
    }

    public void emptyTheCart(Cart cart) {
        Map<String, Integer> temp = new HashMap<>(cart.getCartList());

        this.getPurchasedList().add(temp);
        cart.clearCartList();
    }
}
