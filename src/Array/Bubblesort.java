import java.util.Scanner;

public class Bubblesort {
  public static void main(String[] args) {
    int[] arr = new int[500];
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the size of the array:");
    int n = in.nextInt();

    if (n > 500 || n < 0) {
      System.out.println("Invalid size. Size must be between 0 and 500.");
      return;
    }

    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    // Bubble sort logic with line 10 fixed as per your rule
    for (int i = n - 2; i >= 1; i--) {
      boolean swap = false;
      for (int j = 0; j <i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swap = true;
        }
      }
      if (!swap)
        break;
    }

    // Print the sorted array
    System.out.println("Sorted array:");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    in.close();
  }
}
