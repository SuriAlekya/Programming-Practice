//print numbers 1 to 100


// public class whileloop {
//     public static void main(String[] args) {
//         int i=1;
//         while(i<=100)
//         {
//             System.out.println(i);
//             i++;
//         }
//     }
    
// }

//print even numbers  between 200 ton 500

// public class whileloop{
//     public static void main(String[] args){
//         int i=200;
//         while(i<=500)
//         {
//             System.out.println(i);
//             i +=2;
//         }
//     }
// }

//print the numbers which are divisible by 7 range from 150 to 200


// public class whileloop{
//     public static void main(String[] args){
//         int i=150;
//         while(i<=200)
//         {
//             if(i%7==0){
//             System.out.println(i);
//             }
//             i++;
        
//         }
//     }
// }

//print prime numbers between 50 to 100


// public class whileloop{
//     public static void main(String[] args){
//         int i=50;
//         while(i<=100)
//         {
//             int j=2,isPrime=1;
//             while(j*j<=i){
//             if(i%j==0)
//             {
//                 isPrime=0;
//                 break;
//             }
//             j++;
//         }
//         if(isPrime==1 && i>1)
        
//             System.out.println(i);
//             i++;
//     }
// }
// }
        
//print the sum of even  numbers between 40 to 80


// public class whileloop{
//     public static void main(String[] args)
//     {
//         int i=40;
//         int sum=0;
//         while(i<=80)
//         {
//             if(i%2==0)
//             {
//                 sum=sum+i;
            
//             }
//             i++;
//         }
//         System.out.println(sum);

//     }
// } 
    
//odd numbers between 200 to 250(reverse order)
public class whileloop{
    public static void main(String[] args){
        int i=200;
        while(i>=25)
        {
            if(i%2==1) 
                System.out.println(i);
                i--;
        }

    }
}