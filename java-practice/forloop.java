//print 1 to 100 values

// public class forloop {
//     public static void main(String[] args) {
//         for(int i=1;i<=100;i++)
//         {
//             System.out.println(i);
//         }
//     }
    
// }

//print even  numbers between 200 to 500

// public class forloop {
//     public static void main(String[] args) {
//         for(int i=200;i<=500;i++)
//         {
//             if(i%2==0)
//             {
//                 System.out.println(i);
//             }
//         }
//     }

    
// }


//print the numbers which are divisible by 7 for range of  150 to 200

// public class forloop{
//     public static void main(String[] args) {
//         for(int i=150;i<=200;i++)
//         {
//             if(i%7==0)
//             {
//                 System.out.println(i);
//             }
//         }
//     }
// }


//prime numbers between 50 to 150
public class forloop { 
    public static void main(String[] args) {
        for (int num = 50; num <= 150; num++) {
            boolean isPrime = true;
            
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        
    }
}


//sum of the even numbers between 40 to 80


// public class forloop {
//     public static void main(String[] args) {
//         int sum=0;
//         for(int i=40;i<=80;i++)
//         {
//             if(i%2==0){
//             sum=sum+i;
//             }
//         }
//         System.out.println(sum);
        
        
//     }
// }


//odd numbers between 200 to 25(reverse order)

// public class forloop {

//     public static void main(String[] args) {
//         for(int i=200;i>=25;i--)
//         {
//             if(i%2==1)
//             {
//                 System.out.println(i);
//             }
//         }
//     }
// }