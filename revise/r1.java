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

// package revise;

// public class r1 {
//     public static void main(String[] args) {
//         int r = 5;

//         for (int i = 1; i <= r; i++) {
//             for(int j=1; j<=i ; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
// }


// package revise;

// public class r1 {
//     public static void main(String[] args) {
//         int r = 5;


//         for(int i=r ; i>=0 ; i--){
//             for(int j=1; j<=i ; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
// }

// Q . Palindrome 121

//     1
//    121
//   12321
//  1234321
// 123454321

// public class r1{
//     public static void main(String args[]) {
//         int r= 5;

//         for(int i = 1 ; i<= r ; i++){
//             //space
//             for(int j = 1 ; j<=r-i ; j++){
//                 System.out.print(" ");
//             }
//             //left
//             for(int j = 1 ; j<=i ; j++ ){
//                 System.out.print(j);
//             }
//             //palindrome no
//             for(int j = i-1; j>0 ;j-- ){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
// }



// Q.  Palindrome Pattern

//     1
//    212
//   32123
//  4321234
// 543212345

// public class r1 {
//     public static void main(String args[]) {
//         int r =5;
//         for(int i = 1 ; i<=r ; i++){
//             //space
//             for(int j = 1 ; j<=r-i ; j++){
//                 System.out.print(" ");
//             }
//             //left
//             for(int j = i ; j>0 ; j--){
//                 System.out.print(j);
//             }
//             //right
//             for(int j = 2 ; j<=i ; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
    
// }






