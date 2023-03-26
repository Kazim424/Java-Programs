// Q-1 Write a java program to add 8 to the number x and
// then divide it by 3. Now the
// modules of the quotient is take with 5 and then multiply the 
// resultant value by 5. Display the final result.

// Input:
//  2345
// Output : 
//   20

// import java.util.Scanner;
// public class pw_practise_operator {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int x = sc.nextInt();
//     System.out.println((((x + 8) / 3 ) % 5 ) * 5);
//    } 
// }


// Q-2 Swap two numbers without the use of third variable.

// Input:
//  5 10
// Output : 
//   10 5

// import java.util.Scanner;
// public class pw_practise_operator {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the 1st number :");
//     int x = sc.nextInt();
//     System.out.print("Enter the 2nd number :");
//     int y = sc.nextInt();
//     x = x + y;
//     y = x - y;
//     x = x - y;
//     System.out.println("After swap x value is: "+x);
//     System.out.println("After swap y value is: "+y);
//     }
// }

// Q-3 Write a program to calculate the sum of the 
// digit of a 3-digit number

// Input:
//  132
// Output : 
//   6

// import java.util.Scanner;
// public class pw_practise_operator {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the three digit number number :");
//     int x = sc.nextInt();
//     int sum = 0;
//     while(x>0){
//         sum += x % 10;
//         x /= 10; 
//     }
//     System.out.println(sum);

//     }
// }


// Q-4 Assign valuesof variables 'a' and 'b' as 55 and 70 respectively
// and then check if: 
// i) both the condition 'a< 50' and 'a<b' are true.
// ii) at least one of the condition 'a<50' or 'a<b' is true.

// public class pw_practise_operator {
//     public static void main(String[] args) {
//         int a = 55;
//         int b = 70;
//         System.out.println(a<50 && a<b);
//         System.out.println(a<50 || a<b);
//     }
//     }


// Q-5 Find the total number of bits needed to be 
// flipped  to cover x to y.

// Input:
//  65 80
// Output : 
//   2

import java.util.Scanner;
public class pw_practise_operator {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter x :");
    int x = sc.nextInt();
    System.out.print("Enter y :");
    int y = sc.nextInt();
    int n = x ^ y;
    int count = 0;
    while(n != 0){
     n = n & (n-1);
     count++;
    }
    System.out.println(count);
    }
}