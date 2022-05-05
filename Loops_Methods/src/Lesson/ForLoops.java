package Lesson;

// The 4 parts that makes a FOR loop 
// 1. A variable for counting the number of times the loop needs to execute
// 2. The loop's condition
// 3. The counter variable
// 4. And the functionality that will execute when the loop occurs
// public class ForLoops {
//     public static void main(String[] arg) {
//         for (*variable assignment*; *condition*; *counter variable*) {
//             // Functionality to be executed
//         }
//     }
// }


// This example prints 0-4 
// public class ForLoops {
//     public static void main(String[] arg) {
//         for (int i = 0; i < 5; i++) {
//             System.out.println(i);
//     }  
//     }
// }


// An example of assigning initial variable and number in the condition to variables
public class ForLoops {
    public static void main(String[] arg) {
        int start = 1;
        int end = 8;
        for (int i = start; i < end; i++) {
                System.out.println(i);
        }
    }
}
