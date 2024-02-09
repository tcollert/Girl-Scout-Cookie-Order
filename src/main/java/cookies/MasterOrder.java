package cookies;

import java.util.ArrayList;

public class MasterOrder {

    ArrayList<CookieOrder> orders = new ArrayList<CookieOrder>();

    public ArrayList<CookieOrder> getOrders() {
        return orders;

    }

    public void setOrders(ArrayList<CookieOrder> orders) {
        this.orders = orders;
    }

    public MasterOrder() {

    }

    public void removeVariety(String varietyToRemove) {
        int counter = 0;
        while (counter < orders.size()) {
            CookieOrder orderAtThisIndex = orders.get(counter);
            String thisOrdersVariety = orderAtThisIndex.getVarietyOfCookie();
            if (thisOrdersVariety.equals(varietyToRemove)) {
                orders.remove(counter);
                counter--;
            }
            counter++;
        }

    }

    public void addOrder(CookieOrder theOrder) {
        this.orders.add(theOrder);
    }

    public int getTotalBoxes() {
        int totalBoxesSold = 0;
        for (int orderIncrementor = 0; orderIncrementor < orders.size(); orderIncrementor++) {
            CookieOrder orderAtThisIndex = orders.get(orderIncrementor);
            totalBoxesSold += orderAtThisIndex.getNumBoxes();
        }
        return totalBoxesSold;
    }

    public void showOrder() {

    }

    int countVarietyBoxes;

    public int getVarietyBoxes(String variety) {
        for (CookieOrder order : orders) {
            if (order.getVarietyOfCookie().equals(variety)) {
                countVarietyBoxes += order.getNumBoxes();
            }
        }
        return 5;
    }
}
