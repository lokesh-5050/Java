// package revise;

// public class r1 {
//     public static void main(String[] args) {
//         int r= 4;
//         int c =5;

//         for(int i=1 ; i<=r ; i++){
//             for(int j=1; j<=c ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// package revise;

// public class r1 {
//     public static void main(String[] args) {
//         int r = 4;
//         int c = 5;

//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=c ; j++){
//                 if(i==1 || j==c || i==r || j==1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();

//         }

//     }
// }

// package revise;

// public class r1 {
//     public static void main(String[] args) {
//         int r = 4;

//         for(int i =1 ; i<=r; i++){
//             for(int j=1 ; j<=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// package revise;

// public class r1 {
//     public static void main(String[] args) {
//         int r = 4;

//         for(int i=4 ; i>=0 ; i--){
//             for(int j=1 ; j<=i ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// package revise;

// public class r1 {
//     public static void main(String[] args) {
//         int r = 4;

//         //outer loop for rows aka height 
//         for(int i =1; i<=r ; i++){
//             //frist iner loop for space
//             for(int j=1 ; j<=r-i ; j++){
//                 System.out.print(" ");
//             }

//             //second inner loop for star
//             for(int k=1 ; k<=i; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

package revise;

public class r1 {
    public static void main(String[] args) {
        int r = 5;

        for (int i = 1; i <= r; i++) {
            for(int j=1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}