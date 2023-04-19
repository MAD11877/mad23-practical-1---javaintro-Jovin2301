import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in); //creating a Scanner object
    System.out.println("Enter height : ");
    double height = in.nextDouble(); //Read user input

    System.out.println("Enter weight : ");
    double weight = in.nextDouble(); //Read user input 

    double BMI = weight / (height * height);
    System.out.println("BMI of the user: " + BMI);
  }
}
