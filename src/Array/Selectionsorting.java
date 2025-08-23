public class Selectionsorting {

  public static void main(String[] args) {
    int[] arr = { 10, 8, 2, 3, 1, 4 };
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      int small = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[small]) {
          small = j;

        }
      }
      int temp = arr[i];
      arr[i] = arr[small];
      arr[small] = temp;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

  }

}
