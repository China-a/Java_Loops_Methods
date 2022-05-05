package Methods_Practice;
import java.util.Scanner;


public class AverageMethod {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());
    
        System.out.println("Enter the second number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());
    
        System.out.println("Enter the third number: ");
        int thirdNum = Integer.valueOf(scanner.nextLine());

        double average = Average(firstNum, secondNum, thirdNum);
        
        System.out.println("The average is: " + average);

        scanner.close();
    }

    public static double Sum(double num1, double num2, Double num3){
      return num1 + num2 + num3; 
    }

    public static double Average(double num1, double num2, double num3){
        double average = Sum(num1, num2, num3)/ 3; 
        return average; 
    }
}