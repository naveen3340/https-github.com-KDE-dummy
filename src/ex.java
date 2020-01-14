import java.util.Scanner;

public class Ex {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int x = 1;
    System.out.print("Input first number: ");
    
    System.out.print("Input second number: ");
    int y = 2;
    System.out.print("Input third number: ");
    int z = 3;

    if(x == y && x == z) {
      System.out.println("All numbers are equal");
    }
    else if ((x == y) || (x == z) || (z == y)) {
      System.out.println("Neither all are equal or different");
    }
    else {
      System.out.println("All numbers are different");
    }
  }
}