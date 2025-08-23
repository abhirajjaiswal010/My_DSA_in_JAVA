public class insertion {
    public static void main(String[] args) {

        // Initial array with one extra space (for insertion)
        int[] arr = {1, 2, 3, 4, 0}; // size = 5
        int n = 4; // Current number of elements (excluding last extra space)

        int newElem = 40; // Element to be inserted

        // ============================
        // 1️⃣ Insertion at the Beginning
        // ============================
        /*
        // Shift elements to the right to make space at index 0
        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        // Place new element at the beginning
        arr[0] = newElem;

        // Display updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        */


        // ============================
        // 2️⃣ Insertion at the End
        // ============================
        /*
        int newElem1 = 10; // Element to insert at the end

        if (n < arr.length) {
            arr[n] = newElem1; // Insert at the next available index
            n++; // Increase size
        } else {
            System.out.println("Array is full");
        }

        // Display updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        */


        // ============================
        // 3️⃣ Insertion at a Given Position
        // ============================

        int newElem2 = 45; // Element to insert
        int pos = 3;       // Desired position (0-based index)

        // Shift elements to the right starting from position
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }

        // Insert the element at the given position
        arr[pos] = newElem2;

        // Display updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
