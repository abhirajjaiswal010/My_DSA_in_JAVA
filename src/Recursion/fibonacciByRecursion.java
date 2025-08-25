// find nth Fibonacci No.
public class fibonacciByRecursion {
    //function declare
    static int fibo(int n)
    {
        if (n == 0) return 0;   // base case 1
        if (n == 1) return 1;   // base case 2
        return fibo(n - 1) + fibo(n - 2);  // recursive relation
    }
    public static void main(String[] args) {

        int n = 10; // print first 10 Fibonacci numbers

        System.out.println("Fibonacci Series (using recursion):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
 