public class factorOfNum01 {

    public static void main(String[] args) {
        int num = 20;
        factor(num);
    }

    static  void factor(int n ){
        for(int i = 1; i <= n; i++) {
            {
                if(n%i==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
