//import java.util.*;
// Solid Rectangle
// public class Pattern {
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//         for(int i = 1; i<=n; i++){ // for row --> outer loop 
//             for (int j = 1; j<=m; j++){ // for column --> inner loop 
//                     System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

// // Output 
// * * * * *
// * * * * *
// * * * * *
// * * * * *


// public class Pattern{
//     // Hollow Rectangle
//     public static void main(String[] args) {
//         int n = 4;
//         int m = 5;
//         for(int i = 1; i<=n; i++){
//             for (int j = 1; j<=5; j++){
//                 if(i == 1 || j== 1 || i==n || j==m){
//                     System.out.print("*");
//                 }else {
//                     System.out.print(" ");
//                 }
                
//             }System.out.println();
//         } 
//     }
// }
// Output
// *****
// *   *
// *   *
// *****


// public class Pattern{
//     // Half Pyramid
//     public static void main(String[] args) {
    
//         for(int i = 1; i<=4; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

// Output
//  *
//  * *
//  * * *
//  * * * *


// public class Pattern{
//         // Inverted Half Pyramid
//         public static void main(String[] args) {
        
//             for(int i = 4; i>=1; i--){
//                 for(int j = 1; j <= i; j++){
//                     System.out.print(" *");
//                 }
//                 System.out.println();
//             }
//         }
//     }


//     Output
//     * * * *
//     * * *
//     * *
//     *


// public class Pattern{
//             // Inverted Half Pyramid(rotated  by 180 deg)
//             public static void main(String[] args) {
//             int n = 4;
//                 for(int i = 1; i<=n; i++){
//                     for(int j = 1; j <= n-i; j++){
//                         System.out.print(" ");
//                     }
//                     for(int j = 1; j <= i; j++){
//                         System.out.print("*");
//                     }
//                     System.out.println();
//                 }
//             }
//         }
//          *
//         **
//        ***
//       ****

//Half Pyramid With no.
// public class Pattern{
//     public static void main(String[] args) {
//        for(int i = 1; i<=5; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j+" ");
                
//             }
//             System.out.println();   
//        } 
//     }
// }


// Output
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 

// Inverted Half Pyramid With no.
// public class Pattern{
//         public static void main(String[] args) {
//            for(int i = 5; i>=1; i--){
//                 for(int j = 1; j<=i; j++){
//                     System.out.print(j+" ");
                    
//                 }
//                 System.out.println();   
//            } 
//         }
//     }

//     Output
//      1 2 3 4 5 
//      1 2 3 4 
//      1 2 3 
//      1 2 
//      1 



// Floyd's Triangle
// public class Pattern{
//     public static void main(String[] args) {
//         int n = 5;
//         int number = 1;
//         for(int i = 1; i <= n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

// Output
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 



// 0 & 1 Triangle
public class Pattern{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
               }else {
                System.out.print("0 ");
               }
            }System.out.println();
        }
    }
} 

// Output
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 

