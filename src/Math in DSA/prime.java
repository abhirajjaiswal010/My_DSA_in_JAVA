class Prime {
    public static void main(String[] args) {
        int n = 13;
        if (n == 1) {
            System.out.println("No. 1 is not a prime number");
            return; // stop execution
        }
        for (int i = 2; i<n ; i++) {
            if(n%i==0){
                System.out.println("no. is not prime");
            }
        }
        System.out.println("no. is prime");
    }
}
