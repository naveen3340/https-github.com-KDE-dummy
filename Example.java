import java.util.Scanner;

public class Example {
  public static void main(String[] args)
    {
      //Scanner in = new Scanner(System.in);
      
      System.out.print("Input first number: ");
      //int x = in.nextInt();
      int x=1;
      System.out.print("Input second number: ");
      //int y = in.nextInt();
      int y = 2;
      System.out.print("Input third number: ");
      //int z = in.nextInt();
      int z = 3;
      
      if (x == y && x == z)
      {
          System.out.println("All numbers are equal");
      }
      else if ((x == y) || (x == z) || (z == y))
      {
          System.out.println("Neither all are equal or different");
      }
      else
      {
          System.out.println("All numbers are different");
      }

      //in.close();
    }
}