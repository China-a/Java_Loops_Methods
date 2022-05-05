package Lesson;
import java.util.Scanner;

// The 3 parts that make a WHILE loop
// 1. Variable creation and assignment
// 2. Condition of the loop
// 3. Functionality to be executed
// This WHILE loop will print 0-4
// public class WhileLoops {
//     public static void main(String[] args) {
//         int i = 0; // 1
// while (i < 5) { // 2
//   System.out.println(i); // 3
//   i++;
// }
//     }
// }

// An example of how to use the BREAK statement to stop the execution of the WHILE loop
// This while loop will print 2-7
// public class WhileLoops {
//     public static void main(String[] args) {
//         int potatoes = 2;

//         while (true) {
//             System.out.println(potatoes);
//             if (potatoes >= 7) {
//                 break;
//             }
        
//             potatoes = potatoes + 1;
//         }
        
//         System.out.println("Too many taters. Time to take a break!");
//     }
// }

// An example of how incorporate user feedback into the WHILE Loop 
// Note - Variables that are routinely used in loops (such as Scanner readers) are declared before the loop, but variables that are special to the loop (such as the value received from the user) are defined inside it
// public class WhileLoops {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.println("Do you want to leave? (if yes, enter 'y')");
//             String userInput = scanner.nextLine();
//             if (userInput.equals("y")) {
//                 break;
//             }
        
//             System.out.println("Thanks for staying!");
//         }
        
//         System.out.println("See ya later!");
//     }
// }

// An example of how to use integers for taking user feedback 
// public class WhileLoops {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         while (true) {
//             System.out.println("Enter a number (enter 0 if you'd like to quit)");
//             int number = Integer.valueOf(scanner.nextLine());
//             if (number == 0) {
//                 break;
//             }
        
//             System.out.println("You entered " + number);
//         }
        
//         System.out.println("See ya later!");
    
//     }
// }

// This is an example of how to use CONTINUE statement 
//  Continue statements may also be used to return to the beginning from somewhere other than the end. When the computer performs the command statement, the program returns to the start of the loop to begin executing the loop again
// Note - using a while loop that only contains a continue statement will infinitely loop! Your while loops will still require a break statement in order to exit
public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter any number.");
            int number = Integer.valueOf(scanner.nextLine());
        
            if (number == 0) {

                break;
            }
        
            if (number < 0) {
                System.out.println("Numbers must be positive!");
                continue;
            }
        
            // loop will stop here if the number is not positive
        
            System.out.println("Your number was " + number);
            scanner.close();
        }
    
    }
}