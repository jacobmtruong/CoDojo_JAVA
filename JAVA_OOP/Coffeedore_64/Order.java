import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
        this.ready = false;
    }
    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order (String name){
        this.name = name;
        this.ready = false;
    }


    // ORDER METHODS

    // Implement the addItem method within the Order class

    public void addItem (Item item){
        this.items.add (item);
    }

    // Create a method called getStatusMessage that returns a String message. If the order is ready, return "Your order is ready.", if not, return "Thank you for waiting. Your order will be ready soon."

    public String getStatusMessage(){
        if (this.ready == true){
            return "Your order is ready.";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    //Similar to the getOrderTotal method from the Cafe Business Logic assignment, create a method called getOrderTotal that sums together each of the item's prices, and returns the total amount. 
    
    public double getOrderTotal(){
        double total = 0;
        for (Item i: this.items){
            total += i.getPrice();
        }
        return total;
    }

    //Similar to the displayMenu function from the Cafe Business Logic assignment, create a method called display that prints out the order information like so:

    public void displayMenu(){
        System.out.printf("Customer name: %s\n", this.name);
        for (Item i: this.items){
            System.out.printf (i.getName() + " - " + i.getPrice());
        }
        System.out.printf("\nTotal: %s", this.getOrderTotal());
    }
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    
    // GETTERS & SETTERS

    // GETTERS & SETTERS for name
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    // GETTERS & SETTERS for ready
    public boolean getReady(){
        return this.ready;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }


    // GETTERS & SETTERS for arraylist items
    public ArrayList<Item> getItems(){
        return this.items;
    }

    public void setItems (ArrayList<Item> items){
        this.items = items;
    }

}

