//Q-1 Write a program which takes the value of length and 
// breadth from uer and check if it is a square or not.
// Input:
// Enter length :
// 5
// Enter breadth: 
// 4

// import java.util.Scanner;
// public class pw_practise_condition4 {
//     public static void main(String [] args){
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the length : ");
// int length = sc.nextInt();
// System.out.print("Enter the breadth : ");
// int breadth = sc.nextInt();
// if(length == breadth){
//     System.out.println("It is a Square");
// }else{
//     System.out.println("It is not a square");
// }
//     }
// }


// Q-2 Write a pogram to print absolute value of a 
// number entered by the user.
//Sample Input : -1
//Sample Output : 1


// import java.util.Scanner;
// public class pw_practise_condition4 {
//     public static void main(String [] args){
//         String yn;
//         do{
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number : ");
// int number = sc.nextInt();
// if(number<0){
//     number = number*-1;
// }
// System.out.println("The absolute value is : " +number);
        
// System.out.println("Do you want to continue Press y for Yes and n for No");
// yn=sc.next();
// }while(yn.equals("y") || (yn.equals("Y")));
//     }
// }


// Q-3 Write a pogram to take input from user for Cost Price(C.P) 
// and calculate Profit or Loss
//  Explatition : Formula for profit and loss 
//  Profit: SP -CP
//  Loss: CP - SP
//(S.P is Selling Price and C.P is Cost Price)
//Sample Input :
// Enter cost price : 4000
// Enter selling price : 9560
//Sample Output :
// Profit: 5560

// import java.util.Scanner;
// public class pw_practise_condition4 {
//     public static void main(String [] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the cost price :");
//         int Costprice =sc.nextInt();
//         System.out.print("Enter the selling price :");
//         int Sellingprice =sc.nextInt();
//        int Profit = Sellingprice - Costprice;
//        int Loss = Costprice - Sellingprice;
//        if(Costprice<Sellingprice){
//         System.out.println("The profit is :" +Profit);
//        }else if(Costprice>Sellingprice){
//         System.out.println("The loss is :" +Loss);

//        }else{
//         System.out.println("No profit no loss");
//        } 

//     }
// }


// Q-4 Write a pogram to print positive number entered by
 // the user , if user enters a negative number,it is skipped.
//Sample Input : Enter an integer -6
//Sample Output : The number is negative and skipped


// import java.util.Scanner;
// public class pw_practise_condition4 {
//     public static void main(String [] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the integer :");
//         int x=sc.nextInt();
//         if(x>=0){
//             System.out.print("Entered number is positive :" ); 
//         }else{
//             System.out.print("The number is negative  and skipped");
//         }
//     }
// } 

// Q-5 Create a calculator using switch statement to perform addition,
// subtractin ,multiplication and division.
//Sample Input : Enter an operator(+,-,*,/):-
// Enter two numbers:
// 6
// 8

//Sample Output : 6-8= -2


// import java.util.Scanner;
// public class pw_practise_condition4 {
//     public static void main(String [] args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter an operator:(+,-,*,/): "); 
//         char operator =sc.next().charAt(0);
//         System.out.print("Enter the num1 :");
//         double num1=sc.nextDouble();
//         System.out.print("Enter the num2 :");
//         double num2=sc.nextDouble();
//         double result;
//         switch(operator){
//           case '+' :
//              result = num1 + num2;
//              System.out.print(num1 + " + " + num2 + " = " +result);
//              break;
//           case '-' :
//              result = num1 - num2;
//              System.out.print(num1 + " - " + num2 + " = " +result);
//              break;
//           case '*' :
//              result = num1 * num2;
//              System.out.print(num1 + " * " + num2 + " = " +result);
//              break;
//           case '/' :
//              result = num1 / num2;
//              System.out.print(num1 + " / " + num2 + " = " +result);
//              break;
//              default:
//              System.out.print("Error! The operator is not correct");
//              break;
//         }    
//     }
// }


// Q-6 Write a program to caculates marks to grades. Follow the 
// conversion rule as given below :
// 100 - 90  = A+ 
// 90 - 80  = A
// 80 - 70  = B+ 
// 70 - 60  = B 
// 60 - 50  = C 
// 50 - 40  = D 
// 40 - 30  = E 
// 30 - 0  = F 

//Sample Input : Enter your marks: 98

//Sample Output : Your Grade is A+


import java.util.Scanner;
public class pw_practise_condition4 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Your Grade is A+");
        }
        else if(marks>=80){
            System.out.println("Your Grade is A");
        }
       else if(marks>=70){
            System.out.println("Your Grade is B+");
        }
       else if(marks>=60){
            System.out.println("Your Grade is B");
        }
       else if(marks>=50){
            System.out.println("Your Grade is C");
        }
       else if(marks>=40){
            System.out.println("Your Grade is D");
        }
       else if(marks>=30){
            System.out.println("Your Grade is E");
        }
       else if(marks<30){
            System.out.println("Your Grade is F");
        }else{
            System.out.println(" Enter the valid marks ");
        }
    }
} 