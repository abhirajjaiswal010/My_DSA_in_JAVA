public class binarySearchByRecursion_02 {
    static int binarySearch(int[] arr, int key, int s, int e) {
        if (s > e) {
            return -1; // element not found
        }

        int mid = s + (e - s) / 2; // safer way to calculate mid

        if (arr[mid] == key) {
            return mid;  // element found
        } else if (arr[mid] > key) {
            return binarySearch(arr, key, s, mid - 1); // search in left half
        } else {
            return binarySearch(arr, key, mid + 1, e); // search in right half
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 45, 67};
        int key = 3;

        int result = binarySearch(arr, key, 0, arr.length - 1);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
