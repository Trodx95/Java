import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {
    
    public int getStreakGoal(int num) {
        int number = 0;
        for (int i = 0; i <= num; i++) {
            number+=i;
        }
        return number;
    }
    
    }
    // Given an array of item prices from an order, sum all of the prices in the array and return the total. 
    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }
        
        
        
    
    public void displayMenu(ArrayList<String> menuItems) {
        // YOUR CODE HERE
        int index = 0;
        for (String string : menuItems) {
            System.out.println((index++)+" "+ string); 
    }
    
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Enter your name:");
        String userName = System.console().readLine();
        System.out.println(String.format("Hello! %s",userName));
        System.out.println("There are "+ customers.size()+ " people ahead of you");
        customers.add(userName);
        System.out.println(Arrays.toString(customers.toArray()));
    }
        
        
    }
