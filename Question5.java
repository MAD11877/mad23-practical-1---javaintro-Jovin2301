import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> numList = new ArrayList<Integer>();
    //int maxcount = 0;
    //int mode = numList.get(0);

    //System.out.print("> ");
    int num = in.nextInt();

    for (int i = 0; i < num; i ++){
      System.out.print("> ");
      
      int num2 = in.nextInt();
      numList.add(num2);
    }

    int maxcount = 0;
    int mode = numList.get(0);
    for (int i = 0; i < numList.size(); i ++){
      int count = 1;
      int value = numList.get(i);
      
      for (int j = 0; j < numList.size(); j++){
        if (numList.get(j) == value){
          count ++;
        }
        if (count > maxcount){
          mode = value;
          maxcount = count;
        }
      }
    }

    //System.out.print("Mode from the integer: ");
    System.out.println(mode);
  }
}
