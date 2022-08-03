import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {

//Cafe Java wants to implement a reward system for customers who always buy more drinks than they did the week before. To calculate how many drinks they need after 10 weeks, write a method that sums together every consecutive integer from 1 to 10 and returns the sum. In other words, add 1 + 2 + 3.. and so on up to 10 and return the result.

//Ninja Bonus:  Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.

    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 0; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

//Given an array of item prices from an order, sum all of the prices in the array and return the total. 

    public double getOrderTotal(double[] prices){
        double total = 0;
        for (int i = 0; i < prices.length; i++){
            total += prices[i];
        }
    return total;
    }

//Given an ArrayList of menu items (strings), print out each index and menu item.  

    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++){
            System.out.println (i + " " + menuItems.get(i));
        }
    }

/*
Inside this method:

    1. Print this string to the console: "Please enter your name:"
    2. Then add this line of code to get user input from the terminal and store it in the variable  userName: 
            String userName = System.console().readLine();copy
    3. Next print the userName to the console, saying "Hello, [user name here]!"
    4. Next print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array)
    5. Then, add the customer's name to the given customers list. And print the list.
    6. No need to return anything.
*/

    public void addCustomer(ArrayList<String> customers){
        System.out.println ("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println ("Hello, " + userName);
        System.out.println ("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }


        /*
        Given a product, price and a maxQuantity, create a method that prints the cost for buying 1, then the price for buying 2, then for 3.. and so on, up to the max. For example, if the product is "Columbian Coffee Grounds" with a price of 15.0 and maxQuantity of 3, you should print:
        */

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.printf (product);
        for (int i = 0; i < maxQuantity; i++){
            System.out.println((i+1) + " " + (price * (i+1)));
        }
    }
        
}