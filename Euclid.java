public class Euclid {  // Here Euclid is a class
    
    // Recursive method to find GCD
    public static int gcd(int p, int q) {
        if (q == 0) return Math.abs(p);  // If q is 0, return p (absolute value to avoid negatives)
        return gcd(q, p % q);  // Recursive call with (q, remainder of p/q)
    }

    // Iterative (non-recursive) method to find GCD
    public static int gcd2(int p, int q) {
        p = Math.abs(p);  // Ensure positive values
        q = Math.abs(q);
        while (q != 0) {  // Repeat until remainder is 0
            int temp = q;
            q = p % q;  // Update q with remainder
            p = temp;   // Update p with previous q
        }
        return p;  // Return the final GCD
    }
    
    public static void main(String[] args) {
        // Check if two numbers are provided
        if (args.length < 2) {
            System.out.println("Usage: java Euclid <integer1> <integer2>");
            return;  // Exit if arguments are missing
        }

        try {
            // Convert input strings to integers
            int p = Integer.parseInt(args[0]);
            int q = Integer.parseInt(args[1]);

            // Compute GCD using both methods
            int d  = gcd(p, q);  // Recursive method
            int d2 = gcd2(p, q); // Iterative method

            // Display results
            System.out.println("gcd(" + p + ", " + q + ") = " + d);
            System.out.println("gcd(" + p + ", " + q + ") = " + d2);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");  // Handle invalid input
        }
    }
}