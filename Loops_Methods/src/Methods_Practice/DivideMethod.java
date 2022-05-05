package Methods_Practice;
import java.util.Scanner;

// Not sure if the question is asking for user input or not, so I put both hard coded and user input solutions

// public class DivideMethod {
//     public static void main(String[] args) {
//                 divide(1, 3);
                      
//             }
           
//             public static void divide(int num1, int num2) {
//                 System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / (double)num2) );
//             }
// }

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
    
        System.out.println("Enter the second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());
         
        divide(firstNum, secondNum); 
        scanner.close();     
            }
           
            public static void divide(int num1, int num2) {
                System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / (double)num2) );
            }
}
