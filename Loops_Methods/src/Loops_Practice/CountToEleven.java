package Loops_Practice;
import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any number less than 11");
        int userInput = Integer.valueOf(scanner.nextLine());
       
        int i = userInput;
            while (i < 12) { 

            if (userInput > 11) {
                break;
            }
            System.out.println(userInput++);
        }
        scanner.close();
    }
}

