package restaurant;


import java.util.Objects;

public class MenuItem {
    private static int nextItemNumber = 1;
    private String name;
    private String description;
    private String type;
    private double price;
    private boolean isNew;
    private int itemNumber;

    public MenuItem(String name, String description, String type, double price, int itemNumber, boolean isNew) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.price = price;
        this.itemNumber = itemNumber;
        this.isNew = isNew;

    }

    public MenuItem(String name, String description, String type, double price) {
        this(name, description, type, price, nextItemNumber, true);
        nextItemNumber++;
    }


    @Override
    public String toString() {
        if (isNew) {
            return "\n" + name + " " + price + " " + "NEW ITEM" + "\n" + description;
        } else {
            return "\n" + name + " " + price + "\n" + description;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public static int getNextItemNumber() {
        return nextItemNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isNew() {
        return isNew;
    }
}
