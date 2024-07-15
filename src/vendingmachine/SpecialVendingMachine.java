package vendingmachine;

/**
 * The SpecialVendingMachine class represents a special vending machine created by 
 * the vending machine factory. It is a subclass of the RegularVendingMachine and allows
 * the preparation of a customized pizza.
 */
public class SpecialVendingMachine extends RegularVendingMachine {
    /**
     * an array that contains the ingredients of the pizza that are not
     * individually sold.
     */
    private Item[] ingredients;
    
    /**
     * an array that stores whether any of the regular items were selected by the user
     * If an item from 'itemSlots' is selected, then its corresponding index in this array
     * is marked as 1. Otherwise it is marked as 0.
     */
    private int[] selectedRegularItems;

    /**
     * an array that stores whether any of the special; items were selected by the user
     * If an item from 'ingredients' is selected, then its corresponding index in this array
     * is marked as 1. Otherwise it is marked as 0.
     */
    private int[] selectedIngredients;

    /**
     * an array that assigns all crusts, cheese, and toppings a particular index
     * If any item was selected, then its index is assigned a value of 1. 
     * Otherwise it is marked as 0.
     * This array is used in preparing the instructions of the customized pizza.
     */
    private int[] allSelectedItems;

    /**
     * an array that stores the initial inventory of the special products
     */
    private int[] specialItemsInventory;

    /**
     * an array that stores temporary inventory data of the special items during 
     * maintenance tasks
     */
    private int[] tempSpecialItemsInventory;

    /**
     * an array that stores the number of sales for each special items during 
     * maintenance tasks
     */
    private int[] specialItemsTracker;

    /**
     * an array that stores temporary sales of the special items during 
     * maintenance tasks
     */
    private int[] tempSpecialItemsTracker;


    /**
     * Creates a special vending machine with slots for 8 different items.
     * @param slotCapacity the number of item slots in the machine
     */
	public SpecialVendingMachine(int slotCapacity) {
		super(slotCapacity);
        this.ingredients = new Item[7];
         this.selectedRegularItems = new int[8];
        this.selectedIngredients = new int[7];
        this.allSelectedItems = new int[12];
        this.specialItemsInventory = new int[]{7,4,7,3,2,7,6};
        this.tempSpecialItemsInventory = new int[7];
        this.specialItemsTracker = new int[7];
        this.tempSpecialItemsTracker = new int[7];
	}

    /**
     * gets the array of ingredients used to prepare the pizza
     * @return the array of ingredients
     */
    public Item[] getIngredients(){
        return ingredients;
    }

     /**
     * gets the indices of the regular items that were added to the customer's 
     * pizza
     * @return the indices of the regular items used
     */
    public int[] getSelectedRegularItems(){
        return selectedRegularItems;
    }

     /**
     * gets the indices of the special items that were added to the customer's 
     * pizza
     * @return the indices of the special items used
     */ 
    public int[] getSelectedIngredients(){
        return selectedIngredients;
    }

    /**
     * gets the array that stores the entire ingredient list of the 
     * customized pizza
     * @return the entire ingredient list of the customized pizza
     */
    public int[] getAllSelectedItems(){
        return allSelectedItems;
    }

    /**
     * gets the starting inventory of special items in the machine
     * @return the starting inventory of special items
     */
    public int[] getSpecialItemsInventory(){
        return specialItemsInventory;
    }

    /**
     * gets the temporary inventory of special items in the machine and
     * is used during restocking
     * @return the temporary inventory of special items
     */
    public int[] getTempSpecialItemsInventory(){
        return tempSpecialItemsInventory;
    }

    /**
     * gets the sales tracker of special items in the machine
     * @return the sales tracker of special items
     */
    public int[] getSpecialItemsTracker(){
        return specialItemsTracker;
    }

    /**
     * gets the temporary sales tracker of special items in the machine
     * @return the temporary sales tracker of special items
     */
    public int[] getTempSpecialItemsTracker(){
        return tempSpecialItemsTracker;
    }
}
