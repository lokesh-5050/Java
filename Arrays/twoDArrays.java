import java.util.*;

// public class twoDArrays {

//   public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);

//     int rows = sc.nextInt();

//     int cols = sc.nextInt();

//     int[][] numbers = new int[rows][cols];
//     // for setting rows values

//     for (int i = 0; i < rows; i++) {
//       //inner loop for cols
//       for (int j = 0; j < cols; j++) {
//         //   System.out.println("Enter the numbers for " +"[]"+i +"[]"+j );
//         numbers[i][j] = sc.nextInt();
//       }
//       System.out.println();
//     }

//     //print all the values of 2d array
//     for(int i = 0 ;i<rows ;i++){
//         for(int j = 0 ; j<cols ;j++){
//             System.out.print(numbers[i][j]+ " ");
//         }
//         System.out.println();
//     }
//   }
// }

// Q2. Take a matrix by user and serach for indices(index) of x in that matrix
// public class twoDArrays {

//   public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int row = sc.nextInt();
//     int cols = sc.nextInt();

//     int numbers[][] = new int[row][cols];

//     //creating a matrix/2d array
//     for (int i = 0; i < row; i++) {
//       for (int j = 0; j < cols; j++) {
//         numbers[i][j] = sc.nextInt();
//       }
//       System.out.println();
//     }

//     //printing the created matrix
//     for (int i = 0; i < row; i++) {
//       for (int j = 0; j < cols; j++) {
//         System.out.print(numbers[i][j] + " ");
//       }
//       System.out.println();
//     }

//     //lets suppose the number is x = 8;

//     int x= 8;

//     for (int i = 0; i < row; i++) {
//       for (int j = 0; j < cols; j++) {
//         if(numbers[i][j] == x){
//             System.out.println("The "+ x +" in this array is at "+ i+" "+j+" index");
//         }
//       }
//     }
//   }
// }

public class twoDArrays {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();

    int number[][] = new int[r][c];
    //inserting values at [i][j]
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        number[i][j] = sc.nextInt();
      }
      System.out.println();
    }
    //printing values at [i][j]
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(number[i][j] + " ");
      }
      System.out.println();
    }

    //now we have to print all  the valeus of array as numbers
    //         1  5  7  9 10 11
    //        6 10 12 13 20 21
    //         9 25 29 30 32 41
    //        15 55 59 63 68 70
    //        40 70 79 81 95 105

    // for (int i = 0; i < r; i++) {
    //   for (int j = 0; j < c; j++) {
    //     System.out.print(number[i][j] + " ");
    //   }
    //   System.out.print("");
    // }

    int last_row = r - 1;
    int last_col = c - 1;

    //1
    for (int i = 0; i < r - last_row; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(number[i][j] + " ");
      }
      System.out.print("");
    }

    //2nd
    for (int i = 1; i < r; i++) {
      for (int j = last_col; j < c; j++) {
        System.out.print(number[i][j] + " ");
      }
      System.out.print("");
    }

    //3rd
    for (int i = last_row; i < r; i++) {
      for (int j = last_col - 1; j >= 0; j--) {
        System.out.print(number[i][j] + " ");
      }
      System.out.print("");
    }

    //4th
    for (int i = last_row - 1; i > 0; i--) {
      for (int j = 0; j < c - last_col; j++) {
        System.out.print(number[i][j] + " ");
      }
      System.out.print("");
    }

    //5th
    for (int i = 1; i < last_row - 2; i++) {
      for (int j = c - last_col; j < last_col; j++) {
        System.out.print(number[i][j] + " ");
      }
      System.out.print("");
    }

    //6th
    for (int i = 2; i < last_row; i++) {
      for (int j = last_col - 1; j < last_col; j++) {
        System.out.print(number[i][j] + " ");
      }
      System.out.print("");
    }

    //7th
    for (int i = last_row - 1; i > 0; i--) {
      for (int j = last_col - 2; j > 0; j--) {
        System.out.print(number[i][j] + " ");
      }
      System.out.print("");
    }

    //8th
    for (int i = 2; i < last_row - 1; i++) {
      for (int j = 1; j < last_col - 1; j++) {
        System.out.print(number[i][j] + " ");
      }
      System.out.print("");
    }
    // //9th
    // for (int i = 2; i < last_row - 1; i++) {
    //   for (int j = last_col - 3; j < last_col - 1; j++) {
    //     System.out.print(number[i][j] + " ");
    //   }
    //   System.out.print(" ");
    // }
  }
}
