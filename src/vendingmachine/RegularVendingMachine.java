package vendingmachine;

/**
 * The RegularVendingMachine class represents a regular vending machine created by
 * the vending machine factory. It contains attributes associated with both its
 * vending features and maintenance features.
 */
public class RegularVendingMachine {

    /**
     * an array of 'Item' objects representing the slots in the vending machine
     */
    private Item[] itemSlots; 
    
    /**
     * an array of integers containing the denominations accepted by the machine
     */
    private int[] banknote;

    /**
     * an array that tracks the available quantity of each denomination
     */
    private int[] banknoteCounter; 
    
    /**
     * an array that stores the starting inventory of each regular item
     */
    private int[] startingInventory; 
    
    /**
     * an array that stores temporary inventory data of regular items 
     * during maintenance tasks
     */
    private int[] tempInventory; 

    /**
     * an array that tracks the number of sales for each regular item
     */
    private int[] salesTracker;

    /**
     * an array that stores temporary sales data of regular items
     *  during maintenance tasks
     */
    private int[] tempSalesTracker; 

    /**
     * a double variable holding the total amount collected from sales
     */
    private double totalAmountCollected;

    /**
     * a double variable that stores temporary sales amount during maintenance
     */
    private double tempAmountCollected;

    /**
     * an array that stores the quantity of each denomination inserted into the machine during
    //                         purchases
     */
    private int[] earnings;

    /**
     * the item slot selected by the user during transaction
     */
    private int selectedSlot = -1;

    /**
     * Creates a regular vending machine with slots for 8 different items.
     * @param slotCapacity the number of item slots in the vending machine
     */
    public RegularVendingMachine(int slotCapacity) {
        this.itemSlots = new Item[slotCapacity];
        this.banknote = new int[] { 1, 5, 10, 20, 50, 100, 200, 500, 1000};
        this.banknoteCounter = new int[]{5,5,5,5,5,5,5,5,5};
        this.startingInventory = new int[] {7, 4, 10, 2, 1, 7, 0, 0};
        this.tempInventory = new int[slotCapacity];
        this.salesTracker = new int[slotCapacity];
        this.tempSalesTracker = new int[slotCapacity];
        this.totalAmountCollected = 0;
        this.tempAmountCollected = 0;
        this.earnings = new int[9];
        this.selectedSlot = -1;
    }

    //getters and setters

    /**
     * gets the item slots in the vending machine
     * @return the item slots
     */
    public Item[] getItemSlots(){
        return itemSlots;
    }

    /**
     * gets the array of denominations accepted by the machine
     * @return the banknotes accepted
     */
    public int[] getBanknote(){
        return banknote;
    }

    /**
     * gets the count of each banknote denomination in the machine
     * @return the count of each banknote
     */
    public int[] getBanknoteCounter(){
        return banknoteCounter;
    }

    /**
     * gets the starting inventory of regular items in the machine
     * @return the starting inventory
     */
    public int[] getStartingInventory(){
        return startingInventory;
    }

    /**
     * gets the temporary inventory of regular items and is 
     * used during restocking
     * @return the temporary inventory 
     */
    public int[] getTempInventory(){
        return tempInventory;
    }

    /**
     * gets the sales tracker of regular items in the machine
     * @return the sales tracker
     */
    public int[] getSalesTracker(){
        return salesTracker;
    }

    /**
     * gets the temporary sales tracker of regular items and is 
     * used during restocking
     * @return the temporary sales tracker
     */
    public int[] getTempSalesTracker(){
        return tempSalesTracker;
    }

    /**
     * gets the total amount collected in sales
     * @return the total sales
     */
    public double getTotalCollected(){
        return totalAmountCollected;
    }

    /**
     * updates the total amount collected in sales 
     * @param totalAmountCollected the new total sales
     */
    public void setTotalCollected(double totalAmountCollected){
        this.totalAmountCollected = totalAmountCollected;
    }

    /**
     * gets the temporary total sales and is used during restocking
     * @return the temporary total sales
     */
    public double getTempCollected(){
        return tempAmountCollected;
    }

    /**
     * gets the quantity of each denomination recevied during purchases
     * @return the earnings based on each denomination
     */
    public int[] getEarnings(){
        return earnings;
    }

    /**
     * gets the selected item slot in the vending machine
     * @return the selected slot
     */
    public int getSelectedSlot(){
        return selectedSlot;
    }

    /**
     * sets the selected item slot in the vending machine
     * @param selectedSlot the index of the slot to set
     */
    public void setSelectedSlot(int selectedSlot){
        this.selectedSlot = selectedSlot;
    }
}
