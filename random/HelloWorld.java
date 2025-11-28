import java.util.*;


public class HelloWorld {
    public static void main(String[] args)  {
        // Clear the screen
        

        Scanner sc = new Scanner(System.in);

        // Example of Scanner usage
        System.out.println("Enter something: ");
        String input = sc.nextLine();
        System.out.println("You entered: " + input);

        sc.close(); // Close the Scanner to avoid resource leak
        
       
    }
}