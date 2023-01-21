package TarunChallange;

import java.lang.reflect.Array;
import java.util.Arrays;

public class t3 {

  // 1 2 3 4 == 4 3 2 1

  public static void main(String[] args) {
    // int a = 10, b = 20;
    // int temp;

    // temp = a;
    // a = b;
    // b = temp;
    // System.out.println(a + " "  + b);

    int[] arr = { 1, 2, 3, 4 };

    System.out.println(Arrays.toString(arr));

    int i = 0;
    int j = arr.length - 1;

    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    
    System.out.println(Arrays.toString(arr));
  }
}
