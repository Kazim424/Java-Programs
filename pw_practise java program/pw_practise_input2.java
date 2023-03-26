// Q-1 Input name, roll number and field of interest from user and 
//print in the foramat below: Name:xyz, Roll number: xyz, Field 
// of interest: xyz

// Input : Single line format 
// Aman Gupta 4053 Physics
// Output : 
// Name: Aman Gupta 
// Roll number : 4053
// Field of interest : Physics

// import java.util.Scanner;
// public class pw_practise_input2 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first name : " );
//         String first_name = sc.next();
//         System.out.print("Enter the last name : " );
//         String last_name = sc.next();
//         System.out.print("Enter the roll number : " );
//         int roll_number = sc.nextInt();
//         System.out.print("Enter the field of interest : " );
//         String field_of_interest = sc.next();
//         System.out.println("Name: " +first_name+ " " +last_name);
//         System.out.println("Roll Number : " +roll_number);
//         System.out.println("Field of interest: " +field_of_interest);
//     }
// }


// Q-2 Input two different string and print them in same line.

// Input : 
// Level 
// Up
// Output : 
// LevelUp

// import java.util.Scanner;
// public class pw_practise_input2 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first string value s1 : " );
//         String s1 = sc.nextLine();
//         System.out.print("Enter the second string value s2 : " );
//         String s2 = sc.nextLine();
//         System.out.print("The Output is : " +s1 + s2 );
//     }
// }


// Q-3 If the marks of Robert in three subjects are entered 
// through keyboard (each out of 100), write a program
// to calculate his total marks and percentage marks.

// Input : 
// 78
// 89
// 95
// Output : Total marks : 262
// percentage marks : 87% 


// import java.util.Scanner;
// public class pw_practise_input2 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the  marks1 : " );
//         int  marks1 = sc.nextInt();
//         System.out.print("Enter the  marks2 : " );
//         int marks2 = sc.nextInt();
//         System.out.print("Enter the  marks3 : " );
//         int marks3 = sc.nextInt();
//         int total_marks_gain = marks1 + marks2 + marks3;
//         System.out.println("Total marks : " +total_marks_gain );
//         float percentage = (total_marks_gain/3.f);
//         System.out.println("Percentage marks : " +percentage+ "%" );

//     }
// }


// Q-4 Given two  numbers, return their sum in the following format:
// Int t representing number of test cases
// T lines of Two integer representing the nmbers to be added. 

// Input : 
// 3
// 4 5
// 18 20
// 49 27
// Output : 
//   9 
//   38
//   76

// import java.util.Scanner;
// public class pw_practise_input2 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of time test cases use :");
//         int t = sc.nextInt();
//         for(int i = 1; i<= t; i++){
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             System.out.println(a+b);
//         }   
//     }
// }


// Q-5 Given few lines f input(number of lines unknown) where each
// line has two string, concatenate the strings. 

// Input : 
// Hello World
// Happy Faces
// Sunny Day
// Good Morning
// Output : 
// HelloWorld
// HappyFaces
// SunnyDay
// GoodMorning

import java.util.Scanner;
public class pw_practise_input2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String a = sc.next();
            String b = sc.next();
            System.out.println(a+b);
        }   
    }
}