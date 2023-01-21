package TarunChallange;

public class minMAx {

  public static void main(String[] args) {
    int arr[] = { -100000, -2, -3, -4, -5 };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println(sum);

    int max_num = Integer.MIN_VALUE;
    int min_num = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (max_num < arr[i]) {
        max_num = arr[i];
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (min_num > arr[i]) {
        min_num = arr[i];
      }
    }
    System.out.println(max_num + " max_num");
    System.out.println(min_num + " min_num");
  }
}
