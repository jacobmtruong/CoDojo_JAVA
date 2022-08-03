public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 

    //   and sets them accordingly

    public Item (String name, double price){
        this.name = name;
        this.price = price;
    }

    

    
    // GETTERS & SETTERS  - for name and price

    //getter for NAME
    public String getName() {
        return this.name;
    }
    //setter for NAME
    public void setName(String name) {
        this.name = name;
    } 

    //getter for PRICE
    public double getPrice(){
        return this.price;
    }
    //setter for PRICE
    public void getPrice(double price){
        this.price = price;
    }
}
