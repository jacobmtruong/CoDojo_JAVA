import java.util.ArrayList;
import java.util.Set;

public class TestOrders {
    public static void main(String[] args) {
    
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk ();

        coffeeKiosk.addMenuItem("Milk Tea", 6.25);
        coffeeKiosk.addMenuItem("Ube Frap", 7.0);
        coffeeKiosk.addMenuItem("Whole lemon blended", 6.6);
        coffeeKiosk.addMenuItem("Green Tea Frap", 7.25);
        coffeeKiosk.addMenuItem("Mocha", 5.5);

        

        coffeeKiosk.displayMenu();
    }
}
