package Lesson;
import java.util.Scanner;

// An example on creating and calling methods 
// public class Methods {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Hello custom method!");
//         hello();

//         System.out.println("Hello again!");
//         hello();
//         hello();
//     }

//     public static void hello() {
//         System.out.println("Hello!");
//     }
// }

// This an example of using a WHILE loop and inserting parameters into the method 
// public class Methods {
//     public static void main(String[] args) {
//         System.out.println("Hello custom method!");
//         hello(1);

//         System.out.println("Hello again!");
//         hello(2);
//     }

//     public static void hello(int number) {
//         int i = 0;
//         while (i < number) {
//             System.out.println("Hello!");
//             i++;
//         }
// }
// }

// An example of using multiple parameters 
// public class Methods {
//     public static void main(String[] args) {
//         sum(6, 8);
       
//         int num1 = 4;
//         int num2 = 15;
       
//         sum(num1, num2);       
//     }
   
//     public static void sum(int numOne, int numTwo) {
//         System.out.println("" + numOne + " + " + numTwo + " = " + (numOne + numTwo));
//     }
// }

// An example of method return value 
// public class Methods {
//     public static void main(String[] args) {
//         int num = returnThree();

//         System.out.println("Method returns the number " + num);
// }
// public static int returnThree() {
//     return 3;
// }
// }

// An example of using expressions with methods that have return values 
// public class Methods {
//     public static void main(String[] args) {
//         double num = 3.14 * returnThree() + (returnThree() / 1.5) - 5.04;

//         System.out.println("The result of the calculation is " + num);
// }
// public static int returnThree() {
//     return 3;
// }
// }

//  Method execution can be stopped by using the return value inside of a method with the void return value
// Note - This expression will throw all the errors it has when changing void 
// public class Methods {
//     public static void main(String[] args) {
 
// }
// public static void divideNumbers(int num1, int num2) {
//     if (num2 == 0) {
//         System.out.println("Do not divide the number by 0!");
//         return;
//     }

//     // multiple num1 by 1.0 so it will display the decimals of the number
//     System.out.println(num1 + " / " + num2 + " = " + (num1 * 1.0 / num2));
// }
// }

// An example of defining variables inside of methods 
// public class Methods {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the first number: ");
//         int firstNum = Integer.valueOf(scanner.nextLine());
    
//         System.out.println("Enter the second number: ");
//         int secondNum = Integer.valueOf(scanner.nextLine());
    
//         System.out.println("Enter the third number: ");
//         int thirdNum = Integer.valueOf(scanner.nextLine());
    
//         double average = averageOfNums(firstNum, secondNum, thirdNum);
    
//         System.out.println("The average of the numbers you have entered is: " + average);
    
// }
// public static double averageOfNums(int num1, int num2, int num3) {
//     int sum = num1 + num2 + num3;
//     double average = sum / 3.0;

//     return average;
// }
// }

// An example of refactoring code above 
public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter the first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
    
        System.out.println("Enter the second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());
    
        System.out.println("Enter the third number: ");
        int thirdNum = Integer.valueOf(scanner.nextLine());
    
        double average = averageOfNums(firstNum, secondNum, thirdNum);
    
        System.out.println("The average of the numbers you have entered is: " + average);
        scanner.close();
    }
    
    public static double averageOfNums(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }
}
