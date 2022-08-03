import java.util.ArrayList;
import java.util.Set;

public class CoffeeKiosk{
    ArrayList<Item> menu = new ArrayList<Item>();
    ArrayList<Order> orders = new ArrayList<Order>();


// Constructor - no params, initializes items and orders to empty arrays.

public CoffeeKiosk(){}

// Methods

    // The addMenuItem method should create a new item object with the given name and price.
    public void addMenuItem (String name, double price){
        Item newItem = new Item(name, price);
        // Add the new Item object to the menu items array.
        menu.add(newItem);
        // The new menu item itself will also need to be assigned an index property. The value should be its position, its index, in the menu array.
        int index = menu.indexOf(newItem);
        newItem.setIndex(index);
    }

    public void displayMenu(){
        for(Item i: this.menu){
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
    }

    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order newOrder = new Order(name);
        displayMenu();

        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order

        
            // Ask them to enter a new item index or q again, and take their input
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        
    }

}