public class deletion {
    public static void main(String[] args) {

      /*  int [] arr = {10,20,30,40,50};
        int n=5; //valid element
        int elem=30;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==elem)
            {
                for (int j = i; j <n-1 ; j++) {
                    arr[j]=arr[j+1];
                }
                n--;
                break;
            }
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }*/

        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        System.out.println(arr.length);
        int n=arr.length;

        int elem =2;

        int occur=0;

        for (int i = 0; i<n ; i++) {
            if(arr[i]==elem)
            {
                for (int j = i; j <n-1 ; j++) {
                    arr[j]=arr[j+1];
                }
                n--;
                occur+=1;
                i--;

            }
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("occurence "+occur);
    }
}
