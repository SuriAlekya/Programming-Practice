//print the sum of the integers in an integer array


// import java.util.Arrays;
// import java.util.Scanner;
// public class arrays {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("please enter the array size");
//         int arrSize=scanner.nextInt();
        
//         int[] arr=new int[arrSize];
//         System.out.println("please enter the array values");
//         for(int i=0;i<arrSize;i++){
//             arr[i]=scanner.nextInt();
//         }
//         System.out.println(Arrays.toString(arr));
//         int sum=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             sum+=arr[i];
//         }
//         System.out.println(sum);
//         scanner.close();       
//     }   
// }


//print the average of the integers in an integer array

// import java.util.Arrays;
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args)
//     {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("please enter the array size");
//         int arrSize=scanner.nextInt();
//         int[] arr=new int[arrSize];
//         System.out.println("please enter the array values");
//         for(int i=0;i<arrSize;i++){
//             arr[i]=scanner.nextInt();
//         }
//         System.out.println(Arrays.toString(arr));
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum +=arr[i];
//         }
//         System.out.println(sum/arr.length);
//         scanner.close();
//     }
// }


//merge two arrays and print the output in the console

//  import java.util.Arrays;
//  import java.util.Scanner;
//  public class arrays{
//    public static void main(String[] args)
//     {
//          Scanner scanner=new Scanner(System.in);
//          System.out.println("please enter the array1 size");
//          int arr1Size=scanner.nextInt();
//          String[] arr1=new String[arr1Size];   
//          System.out.println("please enter the array1 values");
//          for(int i=0;i<arr1Size;i++){
//              arr1[i]=scanner.next();
//         }
//         System.out.println("please enter the array2 size");
//          int arr2Size=scanner.nextInt();
//          String[] arr2=new String[arr2Size];
//          System.out.println("please enter the array2 values");
//         for(int i=0;i<arr2Size;i++){
//              arr2[i]=scanner.next();
//          }
//         System.out.println(Arrays.toString(arr1));
//          System.out.println(Arrays.toString(arr2));

//             String[] arr3=new String[arr1.length+arr2.length];
//             for(int i=0;i<arr1.length;i++)
//             {
//                 arr3[i]=arr1[i];
//             }
//             for(int i=0;i<arr2.length;i++)
//             {
//                 arr3[i+arr1.length]=arr2[i];
//             }
//             System.out.println(Arrays.toString(arr3));

//          scanner.close();
//      }
//  }


//find the max number from an array and print it along with its index


//import java.util.Arrays;
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args)
//     {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("please enter the array size");
//         int arrSize=scanner.nextInt();
//         int[] arr=new int[arrSize];
//         System.out.println("please enter the array values");
//         for(int i=0;i<arrSize;i++){
//             arr[i]=scanner.nextInt();
//         }
//         System.out.println(Arrays.toString(arr));
//         int large=arr[0];
//         int index=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(large<arr[i])
//             {
//                 large=arr[i];
//                 index=i;
//             }

//         }
//         System.out.println(large);
//         System.out.println(index);      
//         scanner.close();
//     }
// }

 

//find the min word from an array and print it along with its index


// import java.util.Arrays;
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args)
//     {
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("please enter the array size");
//         int arrSize=scanner.nextInt();
//         String[] arr=new String[arrSize];
//         System.out.println("please enter the array values");
//         for(int i=0;i<arrSize;i++){
//             arr[i]=scanner.next();
//         }
//         System.out.println(Arrays.toString(arr));
//         String minLengthWord=arr[0];
//         int minLengthWordIndex=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i].length()<minLengthWord.length()){
//                 minLengthWord=arr[i];
//                 minLengthWordIndex=i;

//             }
//         }
//         System.out.println(minLengthWord);
//         System.out.println(minLengthWordIndex);


            
//         scanner.close();
//     }
// }



//reverse the array and print it in console
import java.util.Arrays;
import java.util.Scanner;
public class arrays{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the array size");
        int arrSize=scanner.nextInt();
        boolean[] arr=new boolean[arrSize];
        System.out.println("please enter the array values");
        for(int i=0;i<arrSize;i++){
            arr[i]=scanner.nextBoolean();
        }
        System.out.println(Arrays.toString(arr));
        boolean[] revArr=new boolean[arr.length];

    
        for(int i=0;i<arr.length;i++){
            revArr[arr.length-i-1]=arr[i];
        
        }
        System.out.println(Arrays.toString(revArr));
        scanner.close();
    }
}
