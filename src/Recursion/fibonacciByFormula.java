import java.util.Scanner;

public class fibonacciByFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the nth value of fibonacci: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println(fiboFormula(i));
        }

        sc.close();
    }

    static int fiboFormula(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double psi = (1 - Math.sqrt(5)) / 2;

        return (int)Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / Math.sqrt(5));
    }
}
