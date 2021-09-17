package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> full = new ArrayList<>();
    //itemsInHistory is the number of items that have been added to the menu. I made this counter so old objects
    //don't become new again because full.size() decreases when removing items.
    private int itemsInHistory = 0;

    public void addItem(MenuItem itemToAdd) {

        if (full.contains(itemToAdd)) {
            System.out.println("Tried to add duplicate item.");
        } else {
            full.add(itemToAdd);
            lastUpdated = new Date();
            itemsInHistory ++;
        }
    }

    public void updateNew() {
        for (MenuItem item : full) {
            if (itemsInHistory - item.getItemNumber() >= 2) {
                item.setNew(false);
            }
        }
    }


    public void printMenu() {

        updateNew();

        ArrayList<MenuItem> apps = new ArrayList<>();
        ArrayList<MenuItem> entrees = new ArrayList<>();
        ArrayList<MenuItem> desserts = new ArrayList<>();

        for (MenuItem item : full) {
            switch (item.getType()) {
                case "appetizer":
                    apps.add(item);
                    break;
                case "entree":
                    entrees.add(item);
                    break;
                case "dessert":
                    desserts.add(item);
                    break;
            }
        }

        System.out.println("\n" + "APPETIZERS");
        for (MenuItem a : apps) {
            System.out.println(a);
        }
        System.out.println("\n" + "ENTREES");
        for (MenuItem e : entrees) {
            System.out.println(e);
        }
        System.out.println("\n" + "DESSERTS");
        for (MenuItem d : desserts) {
            System.out.println(d);
        }
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "\n" + "Menu Last Updated:", lastUpdated);
        System.out.println();

    }

    public void printItem(MenuItem name) {
        //System.out.println(full.get(full.indexOf(name)));
        System.out.println(name);
    }

    public void removeItem(MenuItem name) {
        full.remove(name);
    }




}
