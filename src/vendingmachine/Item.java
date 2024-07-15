package vendingmachine;

/**
 * An item object represents an item being sold by the Vending Machine. Each item
 * contains properties such as a name, price, available quantity, and the amount 
 * of calories.
 */

public class Item {
    private String name;
    private double price;
    private int quantity;
    private int calories;
    /**
     * creates an Item object by specifying the name, price, quantity, and calories
     * @param name the name of the Item
     * @param price the price of the Item
     * @param quantity  the quantity (in stock) of the Item
     * @param calories the amount of calories in the Item
     */
    
    public Item(String name, double price, int quantity, int calories) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.calories = calories;
    }

    /**
     * returns the name of this item
     * @return name of the item
     */
    public String getName() {
        return name;
    }

    /**
     * returns the price of this item
     * @return price of the item
     */
    public double getPrice() {
        return price;
    }

    /**
     * returns the available quantity of this item
     * @return available quantity of the item
     */
    public int getQuantity(){
        return quantity;
    }

    /**
     * returns the amount of calories found in this item
     * @return number of calories of the item
     */
    public int getCalories() {
        return calories;
    }

    /**
     * sets the price of this item
     * @param price new price of the item
     */
    public void setPrice(double price){
        this.price = price;
    }

    /**
     * sets the quantity of this item
     * @param quantity new quantity of the item
     */
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
