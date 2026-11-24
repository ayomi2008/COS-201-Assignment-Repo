import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        int count = 100;
        
        // Initialize the first two numbers of the sequence
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        
        System.out.println("First " + count + " numbers of the Fibonacci sequence:");
        System.out.println("------------------------------------------------------");
        
        for (int i = 0; i < count; i++) {
            // Print the current number
            System.out.println("F(" + i + ") = " + a);
            
            // Calculate the next number
            BigInteger next = a.add(b);
            
            // Update a and b for the next iteration
            a = b;
            b = next;
        }
    }
}