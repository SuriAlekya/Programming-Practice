//print the sum of the elements of a multidimensional array.

// import java.util.Scanner;
// import java.util.Arrays;
// public class multiarrays {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("please enter the number of rows:");
//         int rowSize=scanner.nextInt();
//         int[][] arr=new int[rowSize][];
//         for(int i=0;i<rowSize;i++)
//         {
//             System.out.println("please enter the column size in row number"+i);
//             int colSize=scanner.nextInt();
//             arr[i]=new int[colSize];
//             System.out.println("please enter the column values for the row number"+i);
//             for(int j=0;j<colSize;j++){
//                arr[i][j]=scanner.nextInt(); 
//             }
//         }
//         System.out.println("input");
//         for(int i=0;i<arr.length;i++){
//              System.out.println(Arrays.toString(arr[i]));
//         }
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {  
//                 sum += arr[i][j];
//             }
//         }

       
//         System.out.println("output"+sum);
//         scanner.close();       
//     }    
// }


//add the elements in an array and print it in the console


// import java.util.Arrays;
// import java.util.Scanner;

// public class multiarrays{
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("please enter the number of rows in array1:");
//         int rowSize_arr1=scanner.nextInt();
//         int[][] arr1=new int[rowSize_arr1][];
//         for(int i=0;i<rowSize_arr1;i++)
//         {
//             System.out.println("please enter the column size in row number"+i);
//             int colSize=scanner.nextInt();
//             arr1[i]=new int[colSize];
//             System.out.println("please enter the column values for the row number"+i);
//             for(int j=0;j<colSize;j++){
//                arr1[i][j]=scanner.nextInt(); 
//             }
//         }
//         System.out.println("please enter the number of rows in array2:");
//         int rowSize_arr2=scanner.nextInt();
//         int[][] arr2=new int[rowSize_arr2][];
//         for(int i=0;i<rowSize_arr2;i++)
//         {
//             System.out.println("please enter the column size in row number"+i);
//             int colSize=scanner.nextInt();
//             arr2[i]=new int[colSize];
//             System.out.println("please enter the column values for the row number"+i);
//             for(int j=0;j<colSize;j++){
//                arr2[i][j]=scanner.nextInt(); 
//             }
//         }
//         System.out.println("input1");
//          for(int i=0;i<arr1.length;i++){
//              System.out.println(Arrays.toString(arr1[i]));
//          }
//          System.out.println("input2");
//             for(int i=0;i<arr2.length;i++){
//                  System.out.println(Arrays.toString(arr2[i]));
//            }
//          int[][] arr3=new int[arr1.length][];
//          for (int i = 0; i < arr1.length; i++) {
//            arr3[i]=new int[arr1[i].length];
//          for (int j = 0; j < arr1[i].length; j++) { 
//            arr3[i][j]=arr1[i][j]+arr2[i][j]; 
//              }
//          }
//          System.out.println("output:");
//          for(int i=0;i<arr3.length;i++){
//             System.out.println(Arrays.toString(arr3[i]));
//          }

//         scanner.close();           
//     }
// }


//create an array with squares of the existing array elements


// import java.util.Scanner;
// import java.util.Arrays;
// public class multiarrays {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("please enter the number of rows:");
//         int rowSize=scanner.nextInt();
//         int[][] arr=new int[rowSize][];
//         for(int i=0;i<rowSize;i++)
//         {
//             System.out.println("please enter the column size in row number"+i);
//             int colSize=scanner.nextInt();
//             arr[i]=new int[colSize];
//             System.out.println("please enter the column values for the row number"+i);
//             for(int j=0;j<colSize;j++){
//                arr[i][j]=scanner.nextInt(); 
//             }
//         }
//         System.out.println("input");
//         for(int i=0;i<arr.length;i++){
//              System.out.println(Arrays.toString(arr[i]));
//         }

//         int[][] outputArr=new int[arr.length][];
//         for (int i = 0; i < arr.length; i++) {
//             outputArr [i]=new int[arr[i].length];
//            for (int j = 0; j < arr[i].length; j++) {
//            outputArr[i][j]=(int) Math.pow(arr[i][j],2);
//            }
//         }
//         System.out.println("output:");
//         for(int i=0;i<outputArr.length;i++){
//             System.out.println(Arrays.toString(outputArr[i]));
//         }
//         scanner.close();
//     }
// }



// print the common elements between two arrays

import java.util.Arrays;
import java.util.Scanner;

public class multiarrays{
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        // System.out.println("please enter the number of rows in array1:");
        // int rowSize_arr1=scanner.nextInt();
        // int[][] arr1=new int[rowSize_arr1][];
        // for(int i=0;i<rowSize_arr1;i++)
        // {
        //     System.out.println("please enter the column size in row number"+i);
        //     int colSize=scanner.nextInt();
        //     arr1[i]=new int[colSize];
        //     System.out.println("please enter the column values for the row number"+i);
        //     for(int j=0;j<colSize;j++){
        //        arr1[i][j]=scanner.nextInt(); 
        //     }
        // }
        // System.out.println("please enter the number of rows in array2:");
        // int rowSize_arr2=scanner.nextInt();
        // int[][] arr2=new int[rowSize_arr2][];
        // for(int i=0;i<rowSize_arr2;i++)
        // {
        //     System.out.println("please enter the column size in row number"+i);
        //     int colSize=scanner.nextInt();
        //     arr2[i]=new int[colSize];
        //     System.out.println("please enter the column values for the row number"+i);
        //     for(int j=0;j<colSize;j++){
        //        arr2[i][j]=scanner.nextInt(); 
        //     }
        // }
int [][] arr1=new int[][]{
    {1,2,1},
    {9,7,2},
    {7,6,4}    
};

int[][] arr2=new int[][]{
    {2,6,8,6},
    {0,1,3,9,7},
    {7,2,0},
    {0,1,2,2,3,4,5,6}
};


        System.out.println("input1");
         for(int i=0;i<arr1.length;i++){
             System.out.println(Arrays.toString(arr1[i]));
         }
         System.out.println("input2");
            for(int i=0;i<arr2.length;i++){
                 System.out.println(Arrays.toString(arr2[i]));
           }
           boolean isFound;
           for (int i = 0; i < arr1.length; i++) {
               for (int j = 0; j < arr1[i].length; j++) {
                   int targetElement = arr1[i][j];
                   isFound = false;  // Reset isFound before checking
   
                   for (int k = 0; k < arr2.length; k++) {
                       for (int l = 0; l < arr2[k].length; l++) {
                           if (targetElement == arr2[k][l]) {
                               System.out.println(targetElement);
                               isFound = true;
                               break; 
                           }
                       }
                       if (isFound) break; 
                   }
               }
           }
           scanner.close();
       }
   }
   


        




//create an array on the mentioned conditions and print it in the console


// import java.util.Arrays;
// import java.util.Scanner;

// public class multiarrays{
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("please enter the number of rows in array1:");
//         int rowSize_arr1=scanner.nextInt();
//         int[][] arr1=new int[rowSize_arr1][];
//         for(int i=0;i<rowSize_arr1;i++)
//         {
//             System.out.println("please enter the column size in row number"+i);
//             int colSize=scanner.nextInt();
//             arr1[i]=new int[colSize];
//             System.out.println("please enter the column values for the row number"+i);
//             for(int j=0;j<colSize;j++){
//                arr1[i][j]=scanner.nextInt(); 
//             }
//         }
//         System.out.println("please enter the number of rows in array2:");
//         int rowSize_arr2=scanner.nextInt();
//         int[][] arr2=new int[rowSize_arr2][];
//         for(int i=0;i<rowSize_arr2;i++)
//         {
//             System.out.println("please enter the column size in row number"+i);
//             int colSize=scanner.nextInt();
//             arr2[i]=new int[colSize];
//             System.out.println("please enter the column values for the row number"+i);
//             for(int j=0;j<colSize;j++){
//                arr2[i][j]=scanner.nextInt(); 
//             }
//         }
//         System.out.println("input1");
//          for(int i=0;i<arr1.length;i++){
//              System.out.println(Arrays.toString(arr1[i]));
//          }
//          System.out.println("input2");
//             for(int i=0;i<arr2.length;i++){
//                  System.out.println(Arrays.toString(arr2[i]));
//            }
//          int[][] arr3=new int[arr1.length][];
//          for (int i = 0; i < arr1.length; i++) {
//            arr3[i]=new int[arr1[i].length];
//          for (int j = 0; j < arr1[i].length; j++) { 
//            if(arr1[i][j]==arr2[i][j])
//            arr3[i][j]=1;
//            else
//            arr3[i][j]=0;
//              }
//          }
//          System.out.println("output:");
//          for(int i=0;i<arr3.length;i++){
//             System.out.println(Arrays.toString(arr3[i]));
//          }

//         scanner.close();           
//     }
// }




//interchange the values of array by transposing the index values


// import java.util.Scanner;
// import java.util.Arrays;
// public class multiarrays {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("please enter the number of rows:");
//         int rowSize=scanner.nextInt();
//         int[][] arr=new int[rowSize][];
//         for(int i=0;i<rowSize;i++)
//         {
//             System.out.println("please enter the column size in row number"+i);
//             int colSize=scanner.nextInt();
//             arr[i]=new int[colSize];
//             System.out.println("please enter the column values for the row number"+i);
//             for(int j=0;j<colSize;j++){
//                arr[i][j]=scanner.nextInt(); 
//             }
//         }
//         System.out.println("input");
//                 for(int i=0;i<arr.length;i++){
//                      System.out.println(Arrays.toString(arr[i]));
//                 }
//                 int[][] outputArr=new int[arr.length][];
//                 for (int i = 0; i < arr.length; i++) {
//                     outputArr [i]=new int[arr[i].length];
//                     for (int j = 0; j < arr[i].length; j++) {  
//                         outputArr[i][j]= arr[j][i];
//                     }
//                 }
//                 System.out.println("output:");
//                         for(int i=0;i<outputArr.length;i++){
//                             System.out.println(Arrays.toString(outputArr[i]));
//                         } 
                
//                 scanner.close();       
//             }    
//         }
