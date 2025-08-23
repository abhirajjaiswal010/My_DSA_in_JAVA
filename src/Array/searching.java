
public class searching {
    public static int binarySearch(int n, int[] arr, int key) {
        int s = 0;
        int e = n - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            
            if (arr[mid] == key) {
                System.out.println("found " + arr[mid]);
                return mid;
            } else if (arr[mid] > key) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // binary searching

        int[] arr = { 20, 34, 45, 65, 78, 90 };
        int n = arr.length;
        int key = 78;

        int result = binarySearch(n, arr, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
