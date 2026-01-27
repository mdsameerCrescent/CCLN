import java.util.Scanner; // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read from keyboard (standard input)
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Read full line of text
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Read integer
        
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        
        sc.close(); // Recommended practice to close to free resources
    }
}
