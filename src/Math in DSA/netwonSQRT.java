class newtonSQRT {
    public static void main(String[] args) {
        double n = 40;  // number to find sqrt of
        double root = sqrt(n);
        System.out.println("Square root of " + n + " is " + root);
    }

    // Function to compute square root using Newton-Raphson
    static double sqrt(double n) {
        // Step 1: Start with an initial guess (we take the number itself)
        double x = n;

        // Step 2: Define the tolerance (when to stop iterating)
        // Smaller epsilon = more accuracy
        double epsilon = 1e-6;

        // Step 3: Repeat until the difference is small enough
        // |x^2 - n| < epsilon means we are close enough to sqrt(n)
        while (Math.abs(x * x - n) > epsilon) {
            // Newton-Raphson update formula:
            // x_new = (x + n/x) / 2
            x = (x + n / x) / 2;
        }

        // Step 4: Return the computed square root
        return x;
    }
}
