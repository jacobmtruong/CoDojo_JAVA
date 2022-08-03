import java.util.ArrayList;


public class TestOrders {
    public static void main(String[] args) {
    
        // Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2 etc. 

        // Menu items

        Item item1 = new Item();
        item1.name = "Latte";
        item1.price = 3.75;

        Item item2 = new Item();
        item2.name = "Matcha";
        item2.price = 3;

        Item item3 = new Item();
        item3.name = "Peppermint Tea";
        item3.price = 2.75;

        Item item4 = new Item();
        item4.name = "Americano";
        item4.price = 2;
    
        // Create 4 order variables of type Order and instantiate each as an Order object. Name them order1, order2 etc.

        // Order variables -- order1, order2 etc.

        Order order1 = new Order();
        order1.name = "Jake";
        order1.total = item1.price + item2.price + item4.price;
        order1.ready = false;
        order1.items.add(item1.name);
        order1.items.add(item2.name);
        order1.items.add(item4.name);
        

        Order order2 = new Order();
        order2.name = "Jennie";
        order2.total = item1.price + item4.price;
        order2.ready = true;
        order2.items.add(item1.name);
        order2.items.add(item4.name);

        Order order3 = new Order();
        order3.name = "Lisa";
        order3.total = item2.price + item3.price;
        order3.ready = true;
        order3.items.add(item2.name);
        order3.items.add(item3.name);

        // Application Simulations

        // Print the order1 variable to the console to see what happens.

        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Your order has: %s\n\n", order1.items);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Your order has: %s\n\n", order2.items);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("Your order has: %s\n\n", order3.items);
    }
}
