// // package lv.rvt;

// public class Stars {

//     public static void printStars(int number){

//         for  (int i = 0; i < number; i++) {
            
//             System.out.print("*");
            


            
            
//         }
//         System.out.println("");

      
//     }
//     public static void printSquare(int size){
//         for  (int i = 0; i < size; i++){
//             printStars(size);
//         }
//     }
//     public static void printRectangle(int width, int height){
//         while (height>0) {
            
//             for  (int i = 0; i < width; i++){
//                 System.out.print("*");
//                 }
//             System.out.println("");
//             height=height-1;
//         }
//     }
//     public static void printTriangle(int size){
//         int number4=1; //    output=
//         // int number4=1;    output=*
//         // int number4=2;    output=**
//         // int number4=3;    output=***
//         // int number4=size; output=****
//         while (number4!=size+1 ) {
            
//                 printStars(number4);
//             number4=number4+1;
//         }

//     }
//     public static void printSpaces(int number){
//         for  (int i = 0; i < number; i++) {
            
//             System.out.print(" ");
            
//         }
//     }
//         public static void printRighLeaningTriangle(int size){
//             int number4=1;
//             int number5=size-1; //    output=
//             // int number4=1;    output=   *    3
//             // int number4=2;    output=  **    2
//             // int number4=3;    output= ***    1
//             // int number4=size; output=****
//             while (number4!=size+1 ) {
//                     printSpaces(number5);
//                     printStars(number4);
//                 number4=number4+1;
//                 number5=number5-1;
//             }
//     }
//     public static void christmasTree(int height){

//                                 //height 4  
//     //      *                   space 3 stars 1
//     //     ***                  space 2 stars 3
//     //    *****                 space 1 stars 5
//                                     //space 0 stars 7


//     //     ***                  space  2 stars 3
//     //     ***                  space  2 stars 3

//         for (int i = 0; i < height; i++) { //0 1 2 3 
//             printSpaces(height-i);
//             printStars(i*2+1);//0*2+1=
//             //3*2+1=7
        
            
//         }
//         printSpaces(height-1);
//         printStars(3);
//         printSpaces(height-1);
//         printStars(3);
        
        
        
       
//     }   
// }


    

