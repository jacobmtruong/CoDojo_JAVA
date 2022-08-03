import java.util.ArrayList;
import java.util.Arrays;
public class TestCafe {
    
    public static void main(String[] args) {
    /* 
    You will need add 1 line to this file to create an instance 
    of the CafeUtil class. 
    
    Hint: it will need to correspond with the variable name used below..
    */  	
    CafeUtil methods = new CafeUtil();


        // /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", methods.getStreakGoal(10));
    


        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n", methods.getOrderTotal(lineItems));
        

        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        methods.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            methods.addCustomer(customers);
            System.out.println("\n");
        }

        /*
        Given a product, price and a maxQuantity, create a method that prints the cost for buying 1, then the price for buying 2, then for 3.. and so on, up to the max. For example, if the product is "Columbian Coffee Grounds" with a price of 15.0 and maxQuantity of 3, you should print:
        */
        System.out.println("\n----- Price Chart Test -----");
        methods.printPriceChart("Matcha Powder\n", 12, 4);
    }
        
}
