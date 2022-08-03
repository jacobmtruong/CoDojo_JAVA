import java.util.ArrayList;


public class TestOrders {
    public static void main(String[] args) {
    
        // Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2 etc. 

        // Menu items

        Item item1 = new Item("Latte", 3.75);
        // item1.name = "Latte";
        // item1.price = 3.75;

        Item item2 = new Item("Matcha", 3);
        // item2.name = "Matcha";
        // item2.price = 3;

        Item item3 = new Item("Peppermint Tea", 2.75);
        // item3.name = "Peppermint Tea";
        // item3.price = 2.75;

        Item item4 = new Item("Americano", 2);
        // item4.name = "Americano";
        // item4.price = 2;
    

        // Order variables -- order1, order2 etc.

        //Create 2 orders for unspecified guests (without specifying a name);

        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders using the overloaded constructor to give each a name for the order.

        Order order3 = new Order ("Jennie");
        Order order4 = new Order ("Jisoo");
        Order order5 = new Order ("Rose");

        // Application Simulations

        // Print the order1 variable to the console to see what happens.

        // Use this example code to test various orders' updates

        //Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);

        order1.addItem(item1);
        order2.addItem(item4);

        // Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());

        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        order1.setReady(false);
        System.out.println(order1.getStatusMessage());


        //Test the total by printing the return value like so: 

        System.out.println(order1.getOrderTotal());


        //Finally, call the display method on all of your orders, like so: order3.display();
        order1.displayMenu();
    }
}
