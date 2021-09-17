package restaurant;

public class Restaurant {

    public static void main (String[] args) {

        Menu myRestaurant = new Menu();

        MenuItem wings = new MenuItem("Chicken Wings", "8 wings fried in Buffalo sauce", "appetizer", 10.99);
        MenuItem steak = new MenuItem("Steak", "12oz Steak cooked to order + Baked Potato + Seasonal Vegetable", "entree", 18.99);
        MenuItem pretzel = new MenuItem("Pretzel", "Large pretzel with cheese", "appetizer", 5.99);
        MenuItem brownie = new MenuItem("Brownie a La Mode", "Warm brownie topped with scoop of vanilla ice cream", "dessert", 7.99);
        MenuItem steak2 = new MenuItem("Steak", "12oz Steak cooked to order + Baked Potato + Seasonal Vegetable", "entree", 18.99);
        myRestaurant.addItem(wings);
        myRestaurant.addItem(steak);
        myRestaurant.addItem(pretzel);
        myRestaurant.addItem(brownie);
        myRestaurant.addItem(steak2);

        myRestaurant.printMenu();

        myRestaurant.removeItem(wings);

        MenuItem salmon = new MenuItem("Salmon", "Wood Grilled 8 oz salmon with rice", "entree", 14.99);
        myRestaurant.addItem(salmon);
        MenuItem cheesecake = new MenuItem("Cheesecake", "Slice of New York style cheesecake", "dessert", 6.99);
        myRestaurant.addItem(cheesecake);

        myRestaurant.printMenu();

        myRestaurant.printItem(steak);
    }
}
