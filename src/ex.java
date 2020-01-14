public class Ex {
  public static void main(String[] args) {
    int x = 1;
    int y = 2;
    int z = 3;

    System.out.print("Input first number: " + x);
    
    System.out.print("Input second number: " + y);
    
    System.out.print("Input third number: " + );
    

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