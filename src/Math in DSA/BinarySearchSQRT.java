public class BinarySearchSQRT {
    public static void main(String[] args) {

        int num = 40;
        int pre = 3; //taking precision decimal value
        System.out.println(sqrt(num, pre));
    }

    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;
        double root = 0.0;

        while(s <= e) {
            int mid = s + (e - s) / 2;
            if(mid * mid == n) {
                root = mid;
                break;
            }
            if(mid * mid > n) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        // Assign integer part if exact square not found
        if(root == 0.0) {
            root = e;
        }

        double incre = 0.1;
        for(int i = 0; i < p; i++) {
            while(root * root <= n) {
                root += incre;
            }
            root -= incre;
            incre /= 10;
        }

        return root;
    }

}
