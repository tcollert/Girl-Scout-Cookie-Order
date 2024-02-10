package cookies;

import java.util.Scanner;

public class OrderApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CookieOrder alvinsOrder = new CookieOrder("Thin Mints", 5);
        CookieOrder simonsOrder = new CookieOrder("Somoas", 2);
        CookieOrder theodoresOrder = new CookieOrder("Tagalongs", 1);
        CookieOrder davesOrder = new CookieOrder("Lemonades", 3);

        MasterOrder myOrder = new MasterOrder();

        myOrder.addOrder(alvinsOrder);
        myOrder.addOrder(simonsOrder);
        myOrder.addOrder(theodoresOrder);
        myOrder.addOrder(davesOrder);

        System.out.println("Current Order");
        myOrder.showOrder();
        System.out.println();
        System.out.println("You have ordered " + myOrder.getTotalBoxes() + " boxes");
        System.out.println("What would you like to remove? (specify a variety or none)");

        String varietyToRemove = input.nextLine();

        System.out.println("You are removing " + myOrder.getVarietyBoxes(varietyToRemove) + " " + varietyToRemove);
        myOrder.removeVariety(varietyToRemove);
        System.out.println("Current Order");
        myOrder.showOrder();
        int somoaCount = myOrder.getVarietyBoxes("Somoas");
        System.out.println(somoaCount);
        int tagalongsCount = myOrder.getVarietyBoxes("Tagalongs");
        System.out.println(tagalongsCount);
        input.close();
    }
}